package cn.nukkit.network.session;

import cn.nukkit.Player;
import cn.nukkit.Server;
import cn.nukkit.api.PowerNukkitXDifference;
import cn.nukkit.api.PowerNukkitXOnly;
import cn.nukkit.api.Since;
import cn.nukkit.network.CompressionProvider;
import cn.nukkit.network.Network;
import cn.nukkit.network.RakNetInterface;
import cn.nukkit.network.protocol.BatchPacket;
import cn.nukkit.network.protocol.DataPacket;
import cn.nukkit.network.protocol.ProtocolInfo;
import cn.nukkit.utils.BinaryStream;
import cn.nukkit.utils.SnappyCompression;
import com.nukkitx.natives.sha256.Sha256;
import com.nukkitx.natives.util.Natives;
import com.nukkitx.network.raknet.EncapsulatedPacket;
import com.nukkitx.network.raknet.RakNetServerSession;
import com.nukkitx.network.raknet.RakNetSessionListener;
import com.nukkitx.network.raknet.RakNetState;
import com.nukkitx.network.util.DisconnectReason;
import com.nukkitx.network.util.Preconditions;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.buffer.Unpooled;
import io.netty.util.internal.PlatformDependent;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import lombok.extern.log4j.Log4j2;
import org.apache.logging.log4j.message.FormattedMessage;
import org.jetbrains.annotations.NotNull;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import java.net.ProtocolException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

@Since("1.19.30-r1")
@PowerNukkitXOnly
@Log4j2
public class RakNetPlayerSession implements NetworkPlayerSession, RakNetSessionListener {

    private static final ThreadLocal<Sha256> HASH_LOCAL = ThreadLocal.withInitial(Natives.SHA_256);

    private final RakNetInterface server;
    private final RakNetServerSession session;

    @PowerNukkitXDifference(since = "1.20.0-r3", info = "change to mpsc queue since mutli-thread decoding")
    private final Queue<DataPacket> inbound = PlatformDependent.newMpscQueue();
    private final Queue<DataPacket> outbound = PlatformDependent.newMpscQueue();
    private final ScheduledFuture<?> tickFuture;

    private Player player;
    private String disconnectReason = null;

    private CompressionProvider compression = CompressionProvider.NONE;

    private SecretKey agreedKey;
    private Cipher encryptionCipher;
    private Cipher decryptionCipher;

    private final AtomicLong sendEncryptedPacketCount = new AtomicLong();

    public RakNetPlayerSession(RakNetInterface server, RakNetServerSession session) {
        this.server = server;
        this.session = session;
        this.tickFuture = session.getEventLoop().scheduleAtFixedRate(this::networkTick, 0, 50, TimeUnit.MILLISECONDS);

        this.agreedKey = null;
        this.encryptionCipher = null;
        this.decryptionCipher = null;
    }

    @Since("1.20.0-r3")
    @PowerNukkitXOnly
    public @NotNull Executor getPacketProcessingExecutor() {
        return this.server.getPacketProcessingThreadPool();
    }

    @Override
    public void setEncryption(SecretKey agreedKey, Cipher encryptionCipher, Cipher decryptionCipher) {
        this.agreedKey = agreedKey;
        this.encryptionCipher = encryptionCipher;
        this.decryptionCipher = decryptionCipher;
    }

    @Override
    public void onEncapsulated(EncapsulatedPacket packet) {
        ByteBuf buffer = packet.getBuffer();
        short packetId = buffer.readUnsignedByte();
        if (packetId == 0xfe) {
            byte[] packetBuffer;
            if (this.decryptionCipher != null) {
                try {
                    ByteBuffer inBuffer = buffer.nioBuffer();
                    ByteBuffer outBuffer = inBuffer.duplicate();
                    this.decryptionCipher.update(inBuffer, outBuffer);
                } catch (Exception e) {
                    throw new RuntimeException("Unable to decrypt packet", e);
                }
                packetBuffer = new byte[buffer.readableBytes() - 8];
            } else {
                packetBuffer = new byte[buffer.readableBytes()];
            }

            buffer.readBytes(packetBuffer);

            try {
                this.server.getNetwork().processBatch(packetBuffer, this.inbound, this.getCompression());
            } catch (ProtocolException e) {
                this.disconnect("Sent malformed packet");
                log.error("Unable to process batch packet", e);
            }
        }
    }

    @Override
    public void onDirect(ByteBuf byteBuf) {
        // We don't allow any direct packets so ignore.
    }

    @Override
    public void onSessionChangeState(RakNetState rakNetState) {
    }

    @Override
    public void onDisconnect(DisconnectReason reason) {
        if (reason == DisconnectReason.TIMED_OUT) {
            this.disconnect("Timed out");
        } else {
            this.disconnect("Disconnected from Server");
        }
    }

    @Override
    public void disconnect(String reason) {
        if (this.disconnectReason != null) {
            return;
        }

        this.disconnectReason = reason;
        if (this.tickFuture != null) {
            this.tickFuture.cancel(false);
        }

        // Give it a short time to make sure cancel message is delivered
        this.session.getEventLoop().schedule(() -> this.session.close(), 10, TimeUnit.MILLISECONDS);
    }

    @Override
    public void sendPacket(DataPacket packet) {
        if (!this.session.isClosed()) {
            getPacketProcessingExecutor().execute(() -> {
                packet.tryEncode();
                this.outbound.offer(packet);
            });
        }
    }

    @Override
    public void sendImmediatePacket(DataPacket packet, Runnable callback) {
        if (this.session.isClosed()) {
            return;
        }

        this.sendPacket(packet);
        this.session.getEventLoop().execute(() -> {
            this.networkTick();
            callback.run();
        });
    }

    @Override
    public void sendImmediatePacket(DataPacket packet) {
        if (this.session.isClosed()) {
            return;
        }
        packet.tryEncode();
        BinaryStream batched = new BinaryStream();
        Preconditions.checkArgument(!(packet instanceof BatchPacket), "Cannot batch BatchPacket");
        Preconditions.checkState(packet.isEncoded, "Packet should have already been encoded");
        byte[] buf = packet.getBuffer();
        batched.putUnsignedVarInt(buf.length);
        batched.put(buf);
        try {
            byte[] payload;
            if (Server.getInstance().isEnableSnappy()) {
                payload = SnappyCompression.compress(batched.getBuffer());
            } else {
                payload = Network.deflateRaw(batched.getBuffer(), server.getNetwork().getServer().networkCompressionLevel);
            }
            ByteBuf byteBuf = ByteBufAllocator.DEFAULT.ioBuffer(1 + payload.length + 8);
            byteBuf.writeByte(0xfe);
            if (this.encryptionCipher != null) {
                try {
                    ByteBuf originalByteBuf = Unpooled.wrappedBuffer(payload);
                    ByteBuffer trailer = ByteBuffer.wrap(this.generateTrailer(originalByteBuf));
                    ByteBuffer outBuffer = byteBuf.internalNioBuffer(1, originalByteBuf.readableBytes() + 8);
                    ByteBuffer inBuffer = originalByteBuf.internalNioBuffer(originalByteBuf.readerIndex(), originalByteBuf.readableBytes());
                    this.encryptionCipher.update(inBuffer, outBuffer);
                    this.encryptionCipher.update(trailer, outBuffer);
                    byteBuf.writerIndex(byteBuf.writerIndex() + originalByteBuf.readableBytes() + 8);
                } catch (Exception e) {
                    log.error("Unable to encrypt packet", e);
                }
            } else {
                byteBuf.writeBytes(payload);
            }
            this.session.sendImmediate(byteBuf);
        } catch (Exception e) {
            log.error("Error occured while sending a packet immediately", e);
        }
    }

    private void networkTick() {
        if (this.session.isClosed()) {
            return;
        }

        List<DataPacket> toBatch = new ObjectArrayList<>();
        DataPacket packet;
        while ((packet = this.outbound.poll()) != null) {
            if (packet.packetId() == ProtocolInfo.toNewProtocolID(ProtocolInfo.BATCH_PACKET)) {
                if (!toBatch.isEmpty()) {
                    this.sendPackets(toBatch);
                    toBatch.clear();
                }

                this.sendPacket(((BatchPacket) packet).payload);
            } else {
                toBatch.add(packet);
            }
        }

        if (!toBatch.isEmpty()) {
            this.sendPackets(toBatch);
        }
    }

    public void serverTick() {
        DataPacket packet;
        while ((packet = this.inbound.poll()) != null) {
            try {
                this.player.handleDataPacket(packet);
            } catch (Exception e) {
                log.error(new FormattedMessage("An error occurred whilst handling {} for {}",
                        new Object[]{packet.getClass().getSimpleName(), this.player.getName()}, e));
            }
        }
    }

    private void sendPackets(Collection<DataPacket> packets) {
        BinaryStream batched = new BinaryStream();
        for (DataPacket packet : packets) {
            Preconditions.checkArgument(!(packet instanceof BatchPacket), "Cannot batch BatchPacket");
            Preconditions.checkState(packet.isEncoded, "Packet should have already been encoded");
            byte[] buf = packet.getBuffer();
            batched.putUnsignedVarInt(buf.length);
            batched.put(buf);
        }

        try {
            this.sendPacket(this.compression.compress(batched, Server.getInstance().networkCompressionLevel));
        } catch (Exception e) {
            log.error("Unable to compress batched packets", e);
        }
    }

    private void sendPacket(byte[] payload) {
        ByteBuf byteBuf = ByteBufAllocator.DEFAULT.ioBuffer(1 + payload.length + 8);
        byteBuf.writeByte(0xfe);

        if (this.encryptionCipher != null) {
            try {
                ByteBuf originalByteBuf = Unpooled.wrappedBuffer(payload);
                ByteBuffer trailer = ByteBuffer.wrap(this.generateTrailer(originalByteBuf));
                ByteBuffer outBuffer = byteBuf.internalNioBuffer(1, originalByteBuf.readableBytes() + 8);
                ByteBuffer inBuffer = originalByteBuf.internalNioBuffer(originalByteBuf.readerIndex(), originalByteBuf.readableBytes());
                this.encryptionCipher.update(inBuffer, outBuffer);
                this.encryptionCipher.update(trailer, outBuffer);
                byteBuf.writerIndex(byteBuf.writerIndex() + originalByteBuf.readableBytes() + 8);
            } catch (Exception e) {
                log.error("Unable to encrypt packet", e);
            }
        } else {
            byteBuf.writeBytes(payload);
        }

        this.session.send(byteBuf);
    }

    @Override
    public void setCompression(CompressionProvider compression) {
        Preconditions.checkNotNull(compression);
        this.compression = compression;
    }

    @Override
    public CompressionProvider getCompression() {
        return this.compression;
    }

    public void setPlayer(Player player) {
        Preconditions.checkArgument(this.player == null && player != null);
        this.player = player;
    }

    @Override
    public Player getPlayer() {
        return this.player;
    }

    public RakNetServerSession getRakNetSession() {
        return this.session;
    }

    public String getDisconnectReason() {
        return this.disconnectReason;
    }

    public void sendResourcePacket(DataPacket packet) {
        BinaryStream batched = new BinaryStream();
        Preconditions.checkArgument(!(packet instanceof BatchPacket), "Cannot batch BatchPacket");
        Preconditions.checkState(packet.isEncoded, "Packet should have already been encoded");
        byte[] buf = packet.getBuffer();
        batched.putUnsignedVarInt(buf.length);
        batched.put(buf);
        try {
            byte[] payload;
            if (Server.getInstance().isEnableSnappy()) {
                payload = SnappyCompression.compress(batched.getBuffer());
            } else {
                payload = Network.deflateRaw(batched.getBuffer(), server.getNetwork().getServer().networkCompressionLevel);
            }
            ByteBuf byteBuf = ByteBufAllocator.DEFAULT.ioBuffer(1 + payload.length + 8);
            byteBuf.writeByte(0xfe);
            if (this.encryptionCipher != null) {
                try {
                    ByteBuf originalByteBuf = Unpooled.wrappedBuffer(payload);
                    ByteBuffer trailer = ByteBuffer.wrap(this.generateTrailer(originalByteBuf));
                    ByteBuffer outBuffer = byteBuf.internalNioBuffer(1, originalByteBuf.readableBytes() + 8);
                    ByteBuffer inBuffer = originalByteBuf.internalNioBuffer(originalByteBuf.readerIndex(), originalByteBuf.readableBytes());
                    this.encryptionCipher.update(inBuffer, outBuffer);
                    this.encryptionCipher.update(trailer, outBuffer);
                    byteBuf.writerIndex(byteBuf.writerIndex() + originalByteBuf.readableBytes() + 8);
                } catch (Exception e) {
                    log.error("Unable to encrypt packet", e);
                }
            } else {
                byteBuf.writeBytes(payload);
            }
            this.session.send(byteBuf);
        } catch (Exception e) {
            log.error("Error occured while sending a packet immediately", e);
        }
    }

    private byte[] generateTrailer(ByteBuf buf) {
        Sha256 hash = HASH_LOCAL.get();
        ByteBuf counterBuf = ByteBufAllocator.DEFAULT.directBuffer(8);
        try {
            counterBuf.writeLongLE(this.sendEncryptedPacketCount.getAndIncrement());
            ByteBuffer keyBuffer = ByteBuffer.wrap(this.agreedKey.getEncoded());

            hash.update(counterBuf.internalNioBuffer(0, 8));
            hash.update(buf.internalNioBuffer(buf.readerIndex(), buf.readableBytes()));
            hash.update(keyBuffer);
            byte[] digested = hash.digest();
            return Arrays.copyOf(digested, 8);
        } finally {
            counterBuf.release();
            hash.reset();
        }
    }
}
