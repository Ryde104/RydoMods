package com.ryde104.testmod.objects.blocks;

import com.ryde104.testmod.init.ModTileEntityTypes;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockReader;

public class BlockQuarry extends Block 
{
	public BlockQuarry(Properties properties) 
	{
		super(properties);
	}
	
	public boolean hasTileEntity(BlockState state) 
	{
		return true;
	}
	
	@Override
	public TileEntity createTileEntity(BlockState state, IBlockReader world) 
	{
		return ModTileEntityTypes.QUARRY.get().create();
	}
}
