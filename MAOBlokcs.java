package com.kidokenji.mineartonline.init;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.kidokenji.mineartonline.MineArtOnlineMod;
import com.kidokenji.mineartonline.Refrence;
import com.kidokenji.mineartonline.blocks.BlockMAO;

public class MAOBlocks {
	
	public static Block red_flames_ore;
	public static Block crust_ore;
	public static Block sharp_edge_ore;
	public static Block windy_flower_ore;
	public static Block white_grey_ore;
	public static Block kongo_ore;
	public static Block stream_ore;
	
	public static void init()
	{
		red_flames_ore = new BlockMAO(Material.rock).setUnlocalizedName("red_flames_ore").setCreativeTab(MineArtOnlineMod.tabmao);
		crust_ore = new BlockMAO(Material.rock).setUnlocalizedName("crust_ore").setCreativeTab(MineArtOnlineMod.tabmao);
		sharp_edge_ore = new BlockMAO(Material.rock).setUnlocalizedName("sharp_edge_ore").setCreativeTab(MineArtOnlineMod.tabmao);
		windy_flower_ore = new BlockMAO(Material.rock).setUnlocalizedName("windy_flower_ore").setCreativeTab(MineArtOnlineMod.tabmao);
		white_grey_ore = new BlockMAO(Material.rock).setUnlocalizedName("white_grey_ore").setCreativeTab(MineArtOnlineMod.tabmao);
		kongo_ore = new BlockMAO(Material.rock).setUnlocalizedName("kongo_ore").setCreativeTab(MineArtOnlineMod.tabmao);
		stream_ore = new BlockMAO(Material.rock).setUnlocalizedName("stream_ore").setCreativeTab(MineArtOnlineMod.tabmao);
	}
	
	public static void register()
	{
		GameRegistry.registerBlock(red_flames_ore, red_flames_ore.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(crust_ore, crust_ore.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(sharp_edge_ore, sharp_edge_ore.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(windy_flower_ore, windy_flower_ore.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(white_grey_ore, white_grey_ore.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(kongo_ore, kongo_ore.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(stream_ore, stream_ore.getUnlocalizedName().substring(5));
	}
	
	public static void registerRenders()
	{
		registerRender(red_flames_ore);
		registerRender(crust_ore);
		registerRender(sharp_edge_ore);
		registerRender(windy_flower_ore);
		registerRender(white_grey_ore);
		registerRender(kongo_ore);
		registerRender(stream_ore);
	}
	
	public static void registerRender(Block block)
	{
		Item item = Item.getItemFromBlock(block);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Refrence.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
