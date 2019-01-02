package de.meycs.unknowntechnology.tabs;

import de.meycs.unknowntechnology.UnknownTechnologyItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class CreativeTabUnknownTechnology extends CreativeTabs {

	public CreativeTabUnknownTechnology() {
		super("unknowntechnology");
		
	}

	@Override
	public ItemStack getTabIconItem() {
		
		return new ItemStack(UnknownTechnologyItems.duplizierer);
	}

}
