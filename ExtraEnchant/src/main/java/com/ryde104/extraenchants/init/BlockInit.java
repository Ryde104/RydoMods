package com.ryde104.extraenchants.init;

import com.ryde104.extraenchants.ExtraEnchants;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit  
{

	public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, ExtraEnchants.MODID);

	public static final RegistryObject<Block> BLOCK = BLOCKS.register("block", () -> new Block(Block.Properties.create(Material.CACTUS)));

}
