package cn.nukkit.block;

import cn.nukkit.api.PowerNukkitOnly;

@PowerNukkitOnly
public class BlockDriedKelpBlock extends BlockSolid {

    @PowerNukkitOnly
    public BlockDriedKelpBlock() {
    }
    
    @Override
    public int getId() {
        return DRIED_KELP_BLOCK;
    }
    
    @Override
    public String getName() {
        return "Dried Kelp Block";
    }
    
    @Override
    public double getHardness() {
        return 0.5F;
    }
    
    @Override
    public double getResistance() {
        return 2.5;
    }

}
