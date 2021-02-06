package com.ryde104.extraenchants.init;

import com.ryde104.extraenchants.ExtraEnchants;
import com.ryde104.extraenchants.enchantments.UpstepEnchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantment.Rarity;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class EnchantmentInit 
{

	public static final DeferredRegister<Enchantment> ENCHANTMENTS = new DeferredRegister<>(
			ForgeRegistries.ENCHANTMENTS, ExtraEnchants.MODID);

	public static final RegistryObject<Enchantment> UPSTEP = ENCHANTMENTS.register("upstep",
			() -> new UpstepEnchantment(Rarity.RARE, EnchantmentType.ARMOR_FEET,
					new EquipmentSlotType[] { EquipmentSlotType.FEET }));
	
	public static final RegistryObject<Enchantment> TRACKING = ENCHANTMENTS.register("tracking",
			() -> new UpstepEnchantment(Rarity.RARE, EnchantmentType.ARMOR_FEET,
					new EquipmentSlotType[] { EquipmentSlotType.HEAD }));
}
