package com.ryde104.minecraftplus.events;

import com.ryde104.minecraftplus.MinecraftPlus;

import net.minecraft.entity.LivingEntity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingEvent.LivingJumpEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

//@Mod.EventBusSubscriber(modid = MinecraftPlus.MODID, bus = Bus.FORGE)
public class boatEvent 
{

	@SubscribeEvent
	public static void testJumpEvent(LivingJumpEvent event) {
		
		LivingEntity livingEntity = event.getEntityLiving();
		World world = livingEntity.getEntityWorld();
		livingEntity.addPotionEffect(new EffectInstance(Effects.JUMP_BOOST, 600, 255));
		livingEntity.addPotionEffect(new EffectInstance(Effects.RESISTANCE, 5000, 255));
		
	}
}
