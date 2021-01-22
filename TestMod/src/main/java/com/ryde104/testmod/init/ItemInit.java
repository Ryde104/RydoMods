package com.ryde104.testmod.init;

import com.ryde104.testmod.TestMod;
import com.ryde104.testmod.TestMod.TestItemTab;
import com.ryde104.testmod.objects.items.SpecialItem;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = TestMod.MODID, bus = Bus.MOD)
@ObjectHolder(TestMod.MODID)
public class ItemInit
{
	public static final Item ruby = null;
	//add new item by copying one of these
	public static final Item cat = null;
	public static final Item specialitem = null;
	
	@SubscribeEvent
	public static void registerItems(final RegistryEvent.Register<Item> event) 
	{
		event.getRegistry().register(new Item(new Item.Properties().group(TestItemTab.instance)).setRegistryName("ruby"));
		//add new item by copying one of these
		event.getRegistry().register(new Item(new Item.Properties().group(TestItemTab.instance)
				.food(new Food.Builder().fastToEat().hunger(10).setAlwaysEdible().effect(new EffectInstance(Effects.BLINDNESS, 300, 5), 0.5f).build())).setRegistryName("cat"));
		
		event.getRegistry().register(new SpecialItem(new Item.Properties().group(TestItemTab.instance)).setRegistryName("specialitem"));
	}
}
