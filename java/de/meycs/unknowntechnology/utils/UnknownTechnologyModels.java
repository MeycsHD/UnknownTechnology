package de.meycs.unknowntechnology.utils;

import de.meycs.unknowntechnology.UnknownTechnologyBlocks;
import de.meycs.unknowntechnology.UnknownTechnologyItems;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class UnknownTechnologyModels {
	
	@SubscribeEvent
	public static void register(ModelRegistryEvent event) {
		
		//Items
		register(UnknownTechnologyItems.lidirium_dust);
		register(UnknownTechnologyItems.duplizierer);
		register(UnknownTechnologyItems.lidirium_shard);
		register(UnknownTechnologyItems.lidirium_ingot);
		register(UnknownTechnologyItems.sand_dust);
		register(UnknownTechnologyItems.einfacher_schaltkreis);
		register(UnknownTechnologyItems.fortgeschrittener_schaltkreis);
		register(UnknownTechnologyItems.elite_schaltkreis);
		register(UnknownTechnologyItems.copper_ingot);
		register(UnknownTechnologyItems.tin_ingot);
		register(UnknownTechnologyItems.osmium_ingot);
		register(UnknownTechnologyItems.platine);
		register(UnknownTechnologyItems.steel_ingot);
		register(UnknownTechnologyItems.steel_dust);
		register(UnknownTechnologyItems.steel_plate);
		register(UnknownTechnologyItems.nengenium_ingot);
		
		//Tools
		register(UnknownTechnologyItems.lidirium_sword);
		
		//Blocks
		register(UnknownTechnologyBlocks.copperore);
		register(UnknownTechnologyBlocks.tinore);
		register(UnknownTechnologyBlocks.osmiumore);
		
		
		
		register(UnknownTechnologyBlocks.platinendrucker);
		register(UnknownTechnologyBlocks.machine_block);
		register(UnknownTechnologyBlocks.smasher);
		register(UnknownTechnologyBlocks.analyzer);
		
		register(UnknownTechnologyBlocks.object01);
			
	}
	
	private static void register(Item item) {
		
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
		
		
	}
	
	private static void register(Block item) {
		
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(item), 0, new ModelResourceLocation(Item.getItemFromBlock(item).getRegistryName(), "inventory"));
	}

}
