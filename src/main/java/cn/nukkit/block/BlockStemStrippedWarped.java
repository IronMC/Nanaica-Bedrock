package cn.nukkit.block;

import cn.nukkit.api.PowerNukkitOnly;
import cn.nukkit.api.Since;

@PowerNukkitOnly
@Since("1.4.0.0-PN")
public class BlockStemStrippedWarped extends BlockStemStripped {
    @PowerNukkitOnly
    @Since("1.4.0.0-PN")
    public BlockStemStrippedWarped() {
        this(0);
    }

    @PowerNukkitOnly
    @Since("1.4.0.0-PN")
    public BlockStemStrippedWarped(int meta) {
        super(meta);
    }
    
    @Override
    public int getId() {
        return STRIPPED_WARPED_STEM;
    }
    
    @Override
    public String getName() {
        return "Stripped Warped Stem";
    }
    
    @Override
    public int getBurnChance() {
        return 0;
    }
    
    @Override
    public int getBurnAbility() {
        return 0;
    }

}
