package com.ryde104.minecraftplus.init;

import com.ryde104.minecraftplus.MinecraftPlus;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.WallOrFloorItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit 
{
	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS,
			MinecraftPlus.MODID);
	
	//public static final RegistryObject<Item> BOOK = ITEMS.register("book",() -> new Item(new Item.Properties().group(MinecraftPlusTab.instance)));
	
	//Stick
	public static final RegistryObject<Item> BIRCH_STICK = ITEMS.register("birch_stick",
			() -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
	
	public static final RegistryObject<Item> SPRUCE_STICK = ITEMS.register("spruce_stick",
			() -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
	
	public static final RegistryObject<Item> DARK_OAK__STICK = ITEMS.register("dark_oak_stick",
			() -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
	
	public static final RegistryObject<Item> ACACIA_STICK = ITEMS.register("acacia_stick",
			() -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
	
	public static final RegistryObject<Item> JUNGLE_STICK = ITEMS.register("jungle_stick",
			() -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
	//
	
	
	//Torch
	public static final RegistryObject<WallOrFloorItem> BIRCH_TORCH = ITEMS.register("birch_torch",
			() -> new WallOrFloorItem(BlockInit.BIRCH_TORCH.get(), BlockInit.BIRCH_WALL_TORCH.get(),
					new Item.Properties().group(ItemGroup.DECORATIONS)));
	
	public static final RegistryObject<WallOrFloorItem> SPRUCE_TORCH = ITEMS.register("spruce_torch",
			() -> new WallOrFloorItem(BlockInit.SPRUCE_TORCH.get(), BlockInit.SPRUCE_WALL_TORCH.get(),
					new Item.Properties().group(ItemGroup.DECORATIONS)));
	
	public static final RegistryObject<WallOrFloorItem> DARK_OAK_TORCH = ITEMS.register("dark_oak_torch",
			() -> new WallOrFloorItem(BlockInit.DARK_OAK_TORCH.get(), BlockInit.DARK_OAK_WALL_TORCH.get(),
					new Item.Properties().group(ItemGroup.DECORATIONS)));
	
	public static final RegistryObject<WallOrFloorItem> ACACIA_TORCH = ITEMS.register("acacia_torch",
			() -> new WallOrFloorItem(BlockInit.ACACIA_TORCH.get(), BlockInit.ACACIA_WALL_TORCH.get(),
					new Item.Properties().group(ItemGroup.DECORATIONS)));
	
	public static final RegistryObject<WallOrFloorItem> JUNGLE_TORCH = ITEMS.register("jungle_torch",
			() -> new WallOrFloorItem(BlockInit.JUNGLE_TORCH.get(), BlockInit.JUNGLE_WALL_TORCH.get(),
					new Item.Properties().group(ItemGroup.DECORATIONS)));
	//
	

}
