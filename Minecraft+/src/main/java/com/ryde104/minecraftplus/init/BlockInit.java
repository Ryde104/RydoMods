package com.ryde104.minecraftplus.init;

import com.ryde104.minecraftplus.MinecraftPlus;
import com.ryde104.minecraftplus.objects.blocks.ModTorchBlock;
import com.ryde104.minecraftplus.objects.blocks.ModWallTorchBlock;
import com.ryde104.minecraftplus.objects.blocks.SpecialBlock;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit  
{
	public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, MinecraftPlus.MODID);
	
	//Blocks
	
	public static final RegistryObject<Block> POOL_TABLE = BLOCKS.register("pool_table",
			() -> new SpecialBlock(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 10.0f)
					.harvestLevel(2).harvestTool(ToolType.PICKAXE).sound(SoundType.METAL).lightValue(1)));
	
	public static final RegistryObject<Block> POOL_TABLE_RED = BLOCKS.register("pool_table_red",
			() -> new SpecialBlock(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 10.0f)
					.harvestLevel(2).harvestTool(ToolType.PICKAXE).sound(SoundType.METAL).lightValue(1)));
	
	public static final RegistryObject<Block> POOL_TABLE_LBLUE = BLOCKS.register("pool_table_lblue",
			() -> new SpecialBlock(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 10.0f)
					.harvestLevel(2).harvestTool(ToolType.PICKAXE).sound(SoundType.METAL).lightValue(1)));
	
	
	//Torch Blocks
	public static final RegistryObject<ModTorchBlock> BIRCH_TORCH = BLOCKS.register("birch_torch",
			() -> new ModTorchBlock(Block.Properties.from(Blocks.TORCH)));

	public static final RegistryObject<ModWallTorchBlock> BIRCH_WALL_TORCH = BLOCKS.register("birch_wall_torch",
			() -> new ModWallTorchBlock(Block.Properties.from(Blocks.WALL_TORCH)));

}
