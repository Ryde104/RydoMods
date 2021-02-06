package com.ryde104.extraenchants.init;

import com.ryde104.extraenchants.ExtraEnchants;
import com.ryde104.extraenchants.ExtraEnchants.ExtraEnchantsTab;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit 
{
	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS,
			ExtraEnchants.MODID);
	
	public static final RegistryObject<Item> BOOK = ITEMS.register("book",
			() -> new Item(new Item.Properties().group(ExtraEnchantsTab.instance)));

}
