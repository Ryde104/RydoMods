package com.ryde104.minecraftplus.util;

import com.ryde104.minecraftplus.MinecraftPlus;
import com.ryde104.minecraftplus.init.BlockInit;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = MinecraftPlus.MODID, bus = Bus.MOD, value = Dist.CLIENT)
public class ClientEventBusSubscriber {

	@SubscribeEvent
	public static void clientSetup(FMLClientSetupEvent event) {
		//ScreenManager.registerFactory(ModContainerTypes.EXAMPLE_CHEST.get(), ExampleChestScreen::new);
		//ScreenManager.registerFactory(ModContainerTypes.ITEM_PEDESTAL.get(), ItemPedestalScreen::new);
		//ScreenManager.registerFactory(ModContainerTypes.EXAMPLE_FURNACE.get(), ExampleFurnaceScreen::new);

		//RenderTypeLookup.setRenderLayer(BlockInit.JAZZ_SAPLING.get(), RenderType.getCutout());
		//RenderTypeLookup.setRenderLayer(BlockInit.EXAMPLE_CROP.get(), RenderType.getCutout());
		//RenderTypeLookup.setRenderLayer(BlockInit.JAZZ_DOOR.get(), RenderType.getCutout());
		
		
		RenderTypeLookup.setRenderLayer(BlockInit.BIRCH_TORCH.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(BlockInit.SPRUCE_TORCH.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(BlockInit.DARK_OAK_TORCH.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(BlockInit.ACACIA_TORCH.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(BlockInit.JUNGLE_TORCH.get(), RenderType.getCutout());
		
		RenderTypeLookup.setRenderLayer(BlockInit.BIRCH_WALL_TORCH.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(BlockInit.SPRUCE_WALL_TORCH.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(BlockInit.DARK_OAK_WALL_TORCH.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(BlockInit.ACACIA_WALL_TORCH.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(BlockInit.JUNGLE_WALL_TORCH.get(), RenderType.getCutout());
		
		
		//RenderTypeLookup.setRenderLayer(BlockInit.EXAMPLE_LADDER.get(), RenderType.getCutout());

		//RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.EXAMPLE_ENTITY.get(), ExampleEntityRender::new);

		//ClientRegistry.bindTileEntityRenderer(ModTileEntityTypes.ITEM_PEDESTAL.get(), ItemPedestalRenderer::new);

		
	}
}
