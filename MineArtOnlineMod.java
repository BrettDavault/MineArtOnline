package com.kidokenji.mineartonline;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import com.kidokenji.mineartonline.init.MAOBlocks;
import com.kidokenji.mineartonline.init.MAOItems;
import com.kidokenji.mineartonline.proxy.CommonProxy;

@Mod(modid = Refrence.MOD_ID, name = Refrence.MOD_NAME, version = Refrence.Version)
public class MineArtOnlineMod {
	
	@SidedProxy(clientSide = Refrence.CLIENT_PROXY_CLASS, serverSide = Refrence.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	public static final MaoTab tabmao = new MaoTab("tabmao");
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
	}
	
	
	{
		MAOBlocks.init();
		MAOBlocks.register();
		MAOItems.init();
		MAOItems.register();
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event)
	{
		proxy.registerRenders();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
}
