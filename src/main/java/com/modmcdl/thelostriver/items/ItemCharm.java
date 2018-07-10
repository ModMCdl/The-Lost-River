package com.modmcdl.thelostriver.items;

import com.modmcdl.thelostriver.Main;
import com.modmcdl.thelostriver.init.ModItems;
import com.modmcdl.thelostriver.utilities.IHasModel;

import net.minecraft.item.Item;

public class ItemCharm extends Item implements IHasModel
{
	public ItemCharm(String name)
	{
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		this.setCreativeTab(Main.river);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels()
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
