package com.supertux20.gardenmod.items;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class AmethystChimes extends Item {
	public AmethystChimes() {
		super(new Item.Settings().group(ItemGroup.MISC));
	}

	@Override
	public TypedActionResult<ItemStack> use(World world, PlayerEntity playerEntity, Hand hand) {
		for (int i = 0; i < 5; i++) playerEntity.playSound(SoundEvents.BLOCK_AMETHYST_BLOCK_CHIME, 2.0f, 1.0f);
		return new TypedActionResult<ItemStack>(ActionResult.SUCCESS, playerEntity.getStackInHand(hand));
	}
}
