package de.meycs.unknowntechnology.blocks.machines;

import de.meycs.unknowntechnology.utils.UnknownTechnologyCreativeTab;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;


public class BlockMachineBlock extends Block {

	public BlockMachineBlock() {
		super(Material.IRON);
		setCreativeTab(UnknownTechnologyCreativeTab.tab);
		setHardness(3.0F);
		setResistance(5.0F);
		setSoundType(SoundType.METAL);
		setHarvestLevel("pickaxe", 1);
		
		
	}

}
