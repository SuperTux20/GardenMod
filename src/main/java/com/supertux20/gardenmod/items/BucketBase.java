package com.supertux20.gardenmod.items;

import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.Fluid;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class BucketBase extends BucketItem {
	public BucketBase(Fluid fluid) {
		super(fluid, new QuiltItemSettings().recipeRemainder(Items.BUCKET).maxCount(1));
	}
}
