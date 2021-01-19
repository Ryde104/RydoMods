package com.ryde104.testmod;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("testmod")
public class TestMod{
    
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MODID = "testmod";
    public static TestMod instance;

    public TestMod() 
    {
        
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);   
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);
        instance = this;
        
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
      
    }
    private void doClientStuff(final FMLClientSetupEvent event) 
    {
    
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) 
    {
        
    }

}
