package com.ryde104.minecraftplus;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.ryde104.minecraftplus.init.BlockInit;
import com.ryde104.minecraftplus.init.ItemInit;
import com.ryde104.minecraftplus.objects.blocks.ModTorchBlock;
import com.ryde104.minecraftplus.objects.blocks.ModWallTorchBlock;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.IForgeRegistry;

@Mod("mc104")
@Mod.EventBusSubscriber(modid = MinecraftPlus.MODID, bus = Bus.MOD)
public class MinecraftPlus {

	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MODID = "mc104";
	public static MinecraftPlus instance;

	public MinecraftPlus() {
		final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
		modEventBus.addListener(this::setup);

		
		ItemInit.ITEMS.register(modEventBus);
		BlockInit.BLOCKS.register(modEventBus);

		instance = this;
		MinecraftForge.EVENT_BUS.register(this);
	}

	@SubscribeEvent
	public static void onRegisterItems(final RegistryEvent.Register<Item> event) {
		final IForgeRegistry<Item> registry = event.getRegistry();

		BlockInit.BLOCKS.getEntries().stream().map(RegistryObject::get)
				.filter(block -> !(block instanceof ModWallTorchBlock) && !(block instanceof ModTorchBlock))
				.forEach(block -> {
					final Item.Properties properties = new Item.Properties().group(MinecraftPlusTab.instance);
					final BlockItem blockItem = new BlockItem(block, properties);
					blockItem.setRegistryName(block.getRegistryName());
					registry.register(blockItem);
				});

		LOGGER.debug("Registered BlockItems!");
	}

	private void setup(final FMLCommonSetupEvent event) 
	{
		
	}

	@SubscribeEvent
	public static void onServerStarting(FMLServerStartingEvent event) {

	}

	@SubscribeEvent
	public static void loadCompleteEvent(FMLLoadCompleteEvent event) {
		
	}


	public static class MinecraftPlusTab extends ItemGroup {
		public static final ItemGroup instance = new MinecraftPlusTab(ItemGroup.GROUPS.length, "minecraftplustab");

		private MinecraftPlusTab(int index, String label) {
			super(index, label);
		}

		@Override
		public ItemStack createIcon() {
			return new ItemStack(BlockInit.POOL_TABLE.get());
		}
	}
}
