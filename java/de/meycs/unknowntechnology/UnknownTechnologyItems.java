package de.meycs.unknowntechnology;

import akka.io.TcpListener.RegisterIncoming;
import de.meycs.unknowntechnology.items.ItemCopperIngot;
import de.meycs.unknowntechnology.items.ItemDuplizierer;
import de.meycs.unknowntechnology.items.ItemEinfacherSchaltkreis;
import de.meycs.unknowntechnology.items.ItemEliteSchaltkreis;
import de.meycs.unknowntechnology.items.ItemFortgeschrittenerSchaltkreis;
import de.meycs.unknowntechnology.items.ItemLidiriumShard;
import de.meycs.unknowntechnology.items.ItemNengeniumIngot;
import de.meycs.unknowntechnology.items.ItemLidiriumDust;
import de.meycs.unknowntechnology.items.ItemLidiriumIngot;
import de.meycs.unknowntechnology.items.ItemOsmiumIngot;
import de.meycs.unknowntechnology.items.ItemPlatine;
import de.meycs.unknowntechnology.items.ItemSandDust;
import de.meycs.unknowntechnology.items.ItemSteelDust;
import de.meycs.unknowntechnology.items.ItemSteelIngot;
import de.meycs.unknowntechnology.items.ItemSteelPlate;
import de.meycs.unknowntechnology.items.ItemTinIngot;
import de.meycs.unknowntechnology.items.tools.ItemLidiriumSword;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

public class UnknownTechnologyItems {
	
	//Items
	public static final ItemDuplizierer duplizierer = new ItemDuplizierer();
	public static final ItemLidiriumDust lidirium_dust = new ItemLidiriumDust();
	public static final ItemLidiriumShard lidirium_shard = new ItemLidiriumShard();
	public static final ItemLidiriumIngot lidirium_ingot = new ItemLidiriumIngot();
	public static final ItemSandDust sand_dust = new ItemSandDust();
	public static final ItemEinfacherSchaltkreis einfacher_schaltkreis = new ItemEinfacherSchaltkreis();
	public static final ItemFortgeschrittenerSchaltkreis fortgeschrittener_schaltkreis = new ItemFortgeschrittenerSchaltkreis();
	public static final ItemEliteSchaltkreis elite_schaltkreis  = new ItemEliteSchaltkreis();
	public static final ItemCopperIngot copper_ingot = new ItemCopperIngot();
	public static final ItemTinIngot tin_ingot = new ItemTinIngot();
	public static final ItemOsmiumIngot osmium_ingot = new ItemOsmiumIngot();
	public static final ItemPlatine platine = new ItemPlatine();
	public static final ItemSteelIngot steel_ingot = new ItemSteelIngot();
	public static final ItemSteelDust steel_dust = new ItemSteelDust();
	public static final ItemSteelPlate steel_plate = new ItemSteelPlate();
	public static final ItemNengeniumIngot nengenium_ingot = new ItemNengeniumIngot();
	
	//Tools
	public static final ItemLidiriumSword lidirium_sword = new ItemLidiriumSword();
	
	
	public static void init() {
		
		//Items
		setName(duplizierer, "duplizierer");
		setName(lidirium_dust, "lidirium_dust");
		setName(lidirium_shard, "lidirium_shard");
		setName(lidirium_ingot, "lidirium_ingot");
		setName(sand_dust, "sand_dust");
		setName(einfacher_schaltkreis, "einfacher_schaltkreis");
		setName(fortgeschrittener_schaltkreis, "fortgeschrittener_schaltkreis");
		setName(elite_schaltkreis, "elite_schaltkreis");
		setName(copper_ingot, "copper_ingot");
		setName(tin_ingot, "tin_ingot");
		setName(osmium_ingot, "osmium_ingot");
		setName(platine, "platine");
		setName(steel_ingot, "steel_ingot");
		setName(steel_dust, "steel_dust");
		setName(steel_plate, "steel_plate");
		setName(nengenium_ingot, "nengenium_ingot");
		
		//Tools
		setName(lidirium_sword, "lidirium_sword");
	}
	
	@SubscribeEvent
	public static void register(RegistryEvent.Register<Item> event) {
		IForgeRegistry<Item> registry = event.getRegistry();
		
		//Items
		registry.register(lidirium_dust);
		registry.register(duplizierer);
		registry.register(lidirium_shard);
		registry.register(lidirium_ingot);
		registry.register(sand_dust);
		registry.register(einfacher_schaltkreis);
		registry.register(fortgeschrittener_schaltkreis);
		registry.register(elite_schaltkreis);
		registry.register(copper_ingot);
		registry.register(tin_ingot);
		registry.register(osmium_ingot);
		registry.register(platine);
		registry.register(steel_ingot);
		registry.register(steel_dust);
		registry.register(steel_plate);
		registry.register(nengenium_ingot);
		
		//Tools
		registry.register(lidirium_sword);
		
		
		
		
		
	}
	
	public static void setName(Item item, String name) {
		item.setRegistryName(new ResourceLocation(UnknownTechnologyConstants.MODID, name));
		item.setUnlocalizedName(name);
		
	}

}
