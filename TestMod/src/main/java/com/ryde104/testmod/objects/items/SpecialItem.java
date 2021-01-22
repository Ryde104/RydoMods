package com.ryde104.testmod.objects.items;

import java.util.List;

import com.ryde104.testmod.util.helpers.KeyboardHelper;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

public class SpecialItem extends Item{

	public SpecialItem(Properties properties)
	{
		super(properties);
	}
	
	@Override
	public boolean hasEffect(ItemStack stack) {
		// TODO Auto-generated method stub
		return true;
	}
	
	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		if(KeyboardHelper.isHoldingShift())
		{
			tooltip.add(new StringTextComponent("Test Worked"));
		}else {
			tooltip.add(new StringTextComponent("Hold SHIFT"));
		}
		super.addInformation(stack, worldIn, tooltip, flagIn);
	}
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
		
		return super.onItemRightClick(worldIn, playerIn, handIn);
	}
}
