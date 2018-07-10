package com.modmcdl.thelostriver;

import com.modmcdl.thelostriver.proxies.CommonProxy;
import com.modmcdl.thelostriver.tabs.LostRiverTab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.ACCEPTED_VERSION)
public class Main 
{
	@Instance
	public static Main instance;
	//Calls Creative Tabs
	public static CreativeTabs river = new LostRiverTab("rivertab");
	//Proxies
	@SidedProxy(clientSide = Reference.PROXY_CLIENTSIDE, serverSide = Reference.PROXY_MAIN)
	public static CommonProxy proxy;
	
	//Initialization Events
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) //Pre-Init
	{
		System.out.println("Searching for The Lost River...");
	}
	@EventHandler
	public void init(FMLInitializationEvent event) //Init
	{
		
	}
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) //Post-Init
	{
		System.out.println("The Lost River has been found...");
	}
	@EventHandler
	public void serverInit(FMLServerStartingEvent event) //Server Init
	{
		System.out.println("The Lost River has been found...");
	}
	
}
