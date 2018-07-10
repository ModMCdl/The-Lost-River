package com.modmcdl.thelostriver.tabs;

import com.modmcdl.thelostriver.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class LostRiverTab extends CreativeTabs
{
	public LostRiverTab(String label)
	{
		super("modtab");
	}
	
	@Override
	public ItemStack getTabIconItem()
	{
		return new ItemStack(ModItems.CHARM);
	}
}
