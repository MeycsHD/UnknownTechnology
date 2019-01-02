package de.meycs.unknowntechnology.utils;

import de.meycs.unknowntechnology.UnknownTechnologyBlocks;
import de.meycs.unknowntechnology.UnknownTechnologyItems;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class UnknownTechnologySmelting {
	
	public static void init() {
		
		GameRegistry.addSmelting(UnknownTechnologyItems.lidirium_dust, new ItemStack(UnknownTechnologyItems.lidirium_ingot), 1.5F);
		GameRegistry.addSmelting(UnknownTechnologyBlocks.copperore, new ItemStack(UnknownTechnologyItems.copper_ingot), 1.5F);
		GameRegistry.addSmelting(UnknownTechnologyBlocks.tinore, new ItemStack(UnknownTechnologyItems.tin_ingot), 1.5F);
		GameRegistry.addSmelting(UnknownTechnologyBlocks.osmiumore, new ItemStack(UnknownTechnologyItems.osmium_ingot), 1.5F);
		GameRegistry.addSmelting(UnknownTechnologyItems.steel_dust, new ItemStack(UnknownTechnologyItems.steel_ingot), 2.0F);
	}

}
