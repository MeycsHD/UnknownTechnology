package de.meycs.unknowntechnology;

import de.meycs.unknowntechnology.blocks.BlockCopperOre;
import de.meycs.unknowntechnology.blocks.BlockObject01;
import de.meycs.unknowntechnology.blocks.BlockOsmiumOre;
import de.meycs.unknowntechnology.blocks.BlockTinOre;
import de.meycs.unknowntechnology.blocks.machines.BlockAnalyzer;
import de.meycs.unknowntechnology.blocks.machines.BlockMachineBlock;
import de.meycs.unknowntechnology.blocks.machines.BlockPlatinenDrucker;
import de.meycs.unknowntechnology.blocks.machines.BlockSmasher;
import de.meycs.unknowntechnology.items.ItemCopperIngot;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

public class UnknownTechnologyBlocks {
	
	public static final BlockCopperOre copperore = new BlockCopperOre();
	public static final BlockTinOre tinore = new BlockTinOre();
	public static final BlockOsmiumOre osmiumore = new BlockOsmiumOre();
	public static final BlockPlatinenDrucker platinendrucker = new BlockPlatinenDrucker();
	public static final BlockMachineBlock machine_block = new BlockMachineBlock();
	public static final BlockSmasher smasher = new BlockSmasher();
	public static final BlockAnalyzer analyzer = new BlockAnalyzer();
	
	public static final BlockObject01 object01 = new BlockObject01();


	
	public static void init() {
		
		setName(copperore,  "copperore");
		setName(tinore, "tinore");
		setName(osmiumore, "osmiumore");
			
		
		setName(platinendrucker, "platinendrucker");
		setName(machine_block, "machine_block");
		setName(smasher, "smasher");
		setName(analyzer, "analyzer");
		
		setName(object01, "object01");
		
	}
	
	@SubscribeEvent
	public static void register(RegistryEvent.Register<Block> event) {
		IForgeRegistry<Block> registry = event.getRegistry();
		registry.register(copperore);
		registry.register(tinore);
		registry.register(osmiumore);
		
			
		registry.register(platinendrucker);
		registry.register(machine_block);
		registry.register(smasher);
		registry.register(analyzer);
		
		registry.register(object01);
	}
		
	@SubscribeEvent
	public static void registerItem(RegistryEvent.Register<Item> event) {
		IForgeRegistry<Item> registry = event.getRegistry();
		registry.register(new ItemBlock(copperore).setRegistryName(copperore.getRegistryName()));
		registry.register(new ItemBlock(tinore).setRegistryName(tinore.getRegistryName()));
		registry.register(new ItemBlock(osmiumore).setRegistryName(osmiumore.getRegistryName()));
		registry.register(new ItemBlock(platinendrucker).setRegistryName(platinendrucker.getRegistryName()));
		registry.register(new ItemBlock(machine_block).setRegistryName(machine_block.getRegistryName()));
		registry.register(new ItemBlock(smasher).setRegistryName(smasher.getRegistryName()));
		registry.register(new ItemBlock(analyzer).setRegistryName(analyzer.getRegistryName()));
		registry.register(new ItemBlock(object01).setRegistryName(object01.getRegistryName()));
		
	
		
		
		
		
		
	}
	
	public static void setName(Block block, String name) {
		block.setRegistryName(new ResourceLocation(UnknownTechnologyConstants.MODID, name));
		block.setUnlocalizedName(name);
		
	}

}



