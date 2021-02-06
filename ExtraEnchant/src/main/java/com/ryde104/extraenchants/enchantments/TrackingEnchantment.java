package com.ryde104.extraenchants.enchantments;

import com.ryde104.extraenchants.ExtraEnchants;
import com.ryde104.extraenchants.init.EnchantmentInit;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

public class TrackingEnchantment extends Enchantment {
	
	

	public TrackingEnchantment(Rarity rarityIn, EnchantmentType typeIn, EquipmentSlotType[] slots) {
		super(rarityIn, typeIn, slots);
	}

	@Override
	public int getMaxLevel() {
		return 1;	
	}

	@Override
	public int getMinLevel() {
		return 1;
	}
	
	@Mod.EventBusSubscriber(modid = ExtraEnchants.MODID, bus = Bus.FORGE)
	public static class TrackingEquipped
	{
			

			@SubscribeEvent
			public static void doStuff(PlayerEvent event)
			{
				PlayerEntity playerIn = event.getPlayer();
					if (playerIn.hasItemInSlot(EquipmentSlotType.HEAD)
							&& EnchantmentHelper.getEnchantmentLevel(EnchantmentInit.TRACKING.get(),
									playerIn.getItemStackFromSlot(EquipmentSlotType.HEAD)) > 0)
					{
						playerIn.setFire(5);
						
					
			}
		}
	}
	
}


	
		

        