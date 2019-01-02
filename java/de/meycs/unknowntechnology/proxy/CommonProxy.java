package de.meycs.unknowntechnology.proxy;

import de.meycs.unknowntechnology.UnknownTechnologyBlocks;
import de.meycs.unknowntechnology.UnknownTechnologyItems;
import de.meycs.unknowntechnology.utils.UnknownTechnologySmelting;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {

	public void preinit(FMLPreInitializationEvent event) {
		UnknownTechnologyItems.init();
		UnknownTechnologyBlocks.init();
		
		MinecraftForge.EVENT_BUS.register(UnknownTechnologyItems.class);
		MinecraftForge.EVENT_BUS.register(UnknownTechnologyBlocks.class);
		
		//Hohes Gras
		
		MinecraftForge.addGrassSeed(new ItemStack(UnknownTechnologyItems.lidirium_shard), 5);
		
		
	}
	

	public void init(FMLInitializationEvent event) {
		
		UnknownTechnologySmelting.init();
		
		
	}

	public void postinit(FMLPostInitializationEvent event) {
		
		
	}

}
