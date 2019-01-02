package de.meycs.unknowntechnology.utils;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class UnknownTechnologyOres extends Block {

	public UnknownTechnologyOres() {
		super(Material.ROCK);
		setCreativeTab(UnknownTechnologyCreativeTab.tab);
		setHardness(3.0F);
		setResistance(5.0F);
		setSoundType(SoundType.STONE);
		
	}
		
	

}
