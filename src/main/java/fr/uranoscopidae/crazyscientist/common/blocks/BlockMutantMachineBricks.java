package fr.uranoscopidae.crazyscientist.common.blocks;

import fr.uranoscopidae.crazyscientist.CrazyScientist;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.util.ResourceLocation;

public class BlockMutantMachineBricks extends Block
{
    public BlockMutantMachineBricks()
    {
        super(Material.IRON);
        setRegistryName(new ResourceLocation(CrazyScientist.MODID, "mutant_machine_bricks"));
        setUnlocalizedName("mutant_machine_bricks");
    }
}
