package com.modmcdl.thelostriver.blocks;

import com.modmcdl.thelostriver.Main;
import com.modmcdl.thelostriver.init.ModBlocks;
import com.modmcdl.thelostriver.init.ModItems;
import com.modmcdl.thelostriver.utilities.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockRiverstone extends Block implements IHasModel
{

	public BlockRiverstone(String name, Material material) 
	{
		super(material);
		
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		this.setHardness(2.0F);
		this.setCreativeTab(Main.river);
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
		
	}

	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}

}
