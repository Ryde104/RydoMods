package com.ryde104.testmod.events;

import com.ryde104.testmod.TestMod;
import com.ryde104.testmod.init.BlockInit;

import net.minecraft.entity.LivingEntity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingEvent.LivingJumpEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = TestMod.MODID, bus = Bus.FORGE)
public class jumpEvent 
{
	@SubscribeEvent
	public static void  jumpEvent(LivingJumpEvent event) 
	{
		TestMod.LOGGER.info("EventFired");
		LivingEntity livingEntity = event.getEntityLiving();
		World world = livingEntity.getEntityWorld();
		world.setBlockState(livingEntity.getPosition().add(0, 5, 0), BlockInit.gif_block.getDefaultState());
		livingEntity.addPotionEffect(new EffectInstance(Effects.GLOWING, 600, 255));
		livingEntity.addPotionEffect(new EffectInstance(Effects.SLOWNESS, 600, 255));
		
	}
}
