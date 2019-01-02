package de.meycs.unknowntechnology;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import static de.meycs.unknowntechnology.UnknownTechnologyConstants.*;

import org.apache.logging.log4j.Logger;

import de.meycs.unknowntechnology.proxy.CommonProxy;

@Mod(modid = MODID, name = NAME, version = VERSION)
public class UnknownTechnology
{
    
	@Instance
	
	public static UnknownTechnology instance;
		
	public static UnknownTechnology getInstance() {
		return instance;
	}
	
	@SidedProxy(serverSide = "de.meycs.unknowntechnology.proxy.CommonProxy", clientSide = "de.meycs.unknowntechnology.proxy.ClientProxy")
	
	private static CommonProxy proxy;
	
	@EventHandler
	public void preinit(FMLPreInitializationEvent event) {
		proxy.preinit(event);
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init(event);
		
	}
	
	@EventHandler
	public void postinit(FMLPostInitializationEvent event) {
		proxy.postinit(event);
		
	}
	
	
	
	
	
	
	
	
	
   
}
