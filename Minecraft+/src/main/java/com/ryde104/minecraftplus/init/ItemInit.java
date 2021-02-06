package com.ryde104.minecraftplus.init;

import com.ryde104.minecraftplus.MinecraftPlus;
import com.ryde104.minecraftplus.MinecraftPlus.MinecraftPlusTab;

import net.minecraft.item.Item;
import net.minecraft.item.WallOrFloorItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit 
{
	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS,
			MinecraftPlus.MODID);
	
	public static final RegistryObject<Item> BOOK = ITEMS.register("book",
			() -> new Item(new Item.Properties().group(MinecraftPlusTab.instance)));
	
	public static final RegistryObject<Item> BIRCH_STICK = ITEMS.register("birch_stick",
			() -> new Item(new Item.Properties().group(MinecraftPlusTab.instance)));
	
	
	
	
	public static final RegistryObject<WallOrFloorItem> BIRCH_TORCH = ITEMS.register("birch_torch",
			() -> new WallOrFloorItem(BlockInit.BIRCH_TORCH.get(), BlockInit.BIRCH_WALL_TORCH.get(),
					new Item.Properties().group(MinecraftPlusTab.instance)));
	
	

}
