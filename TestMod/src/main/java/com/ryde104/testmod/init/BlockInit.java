package com.ryde104.testmod.init;

import com.ryde104.testmod.TestMod;
import com.ryde104.testmod.TestMod.BlockTab;
import com.ryde104.testmod.TestMod.TestItemTab;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(TestMod.MODID)
@Mod.EventBusSubscriber(modid = TestMod.MODID, bus = Bus.MOD)
public class BlockInit 
{
	
	public static final Block gif_block = null;
	public static final Block trippy = null;
	public static final Block orange_ore = null;

	@SubscribeEvent
	public static void registerBlocks(final RegistryEvent.Register<Block> event)
	{
		//add new Block by copying one of these
		event.getRegistry().register(new Block(Block.Properties.create(Material.CAKE).hardnessAndResistance(0.7f, 15f).sound(SoundType.CLOTH).speedFactor(100)).setRegistryName("gif_block"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.CAKE).hardnessAndResistance(0.7f, 15f).sound(SoundType.CLOTH).speedFactor(100)).setRegistryName("trippy"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(0.7f, 15f).sound(SoundType.STONE)).setRegistryName("orange_ore"));
	}
	
	@SubscribeEvent
	public static void registerBlockItems(final RegistryEvent.Register<Item> event) 
	{
		//add new Block by copying one of these
		event.getRegistry().register(new BlockItem(gif_block, new Item.Properties().maxStackSize(64).group(BlockTab.instance)).setRegistryName("gif_block"));
		event.getRegistry().register(new BlockItem(trippy, new Item.Properties().maxStackSize(64).group(BlockTab.instance)).setRegistryName("trippy"));
		event.getRegistry().register(new BlockItem(orange_ore, new Item.Properties().maxStackSize(64).group(BlockTab.instance)).setRegistryName("orange_ore"));
	}
}
