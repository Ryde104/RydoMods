package com.ryde104.testmod;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.ryde104.testmod.init.BlockInit;
import com.ryde104.testmod.init.ItemInit;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("testmod")
public class TestMod{
    
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MODID = "testmod";
    public static TestMod instance;

    public TestMod() 
    {
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::setup);   
        modEventBus.addListener(this::doClientStuff);
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
    
    public static class TestItemTab extends ItemGroup 
    {
    	public static final TestItemTab instance = new TestItemTab(ItemGroup.GROUPS.length, "testtab");
    	private TestItemTab(int index, String Label) 
    	{
    		super(index, Label);
    	}
    	
    	@Override
    	public ItemStack createIcon() 
    	{
    		return new ItemStack(ItemInit.cat);
    	}
    }
    public static class BlockTab extends ItemGroup 
    {
    	public static final TestItemTab instance = new TestItemTab(ItemGroup.GROUPS.length, "BlocksTab");
    	private BlockTab(int index, String Label) 
    	{
    		super(index, Label);
    	}
    	
    	@Override
    	public ItemStack createIcon() 
    	{
    		return new ItemStack(BlockInit.orange_ore);
    	}
    }

}
