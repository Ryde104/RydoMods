package com.ryde104.extraenchants;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.ryde104.extraenchants.init.BlockInit;
import com.ryde104.extraenchants.init.EnchantmentInit;
import com.ryde104.extraenchants.init.ItemInit;

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

@Mod("ee104")
@Mod.EventBusSubscriber(modid = ExtraEnchants.MODID, bus = Bus.MOD)
public class ExtraEnchants {

	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MODID = "ee104";
	public static ExtraEnchants instance;

	public ExtraEnchants() {
		final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
		modEventBus.addListener(this::setup);

		EnchantmentInit.ENCHANTMENTS.register(modEventBus);
		ItemInit.ITEMS.register(modEventBus);
		BlockInit.BLOCKS.register(modEventBus);

		instance = this;
		MinecraftForge.EVENT_BUS.register(this);
	}

	 @SubscribeEvent
	    public static void onRegisterItems(final RegistryEvent.Register<Item> event) 
	    {
	    	final IForgeRegistry<Item> registry = event.getRegistry();
	    	BlockInit.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(block -> {
	    		final Item.Properties properties = new Item.Properties().group(ExtraEnchantsTab.instance);
	    		final BlockItem blockItem = new BlockItem(block, properties);
	    		blockItem.setRegistryName(block.getRegistryName());
	    		registry.register(blockItem);
	    		});
	    	 
	    	LOGGER.debug("Registerd BlockItems");
	    	}
		

	private void setup(final FMLCommonSetupEvent event) 
	{// K9#8016
		
	}

	@SubscribeEvent
	public static void onServerStarting(FMLServerStartingEvent event) {

	}

	@SubscribeEvent
	public static void loadCompleteEvent(FMLLoadCompleteEvent event) {
		
	}


	public static class ExtraEnchantsTab extends ItemGroup {
		public static final ItemGroup instance = new ExtraEnchantsTab(ItemGroup.GROUPS.length, "tutorialtab");

		private ExtraEnchantsTab(int index, String label) {
			super(index, label);
		}

		@Override
		public ItemStack createIcon() {
			return new ItemStack(BlockInit.BLOCK.get());
		}
	}
}
