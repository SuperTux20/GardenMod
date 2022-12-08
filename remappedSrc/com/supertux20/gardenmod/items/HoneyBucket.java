package com.supertux20.gardenmod.items;

import com.supertux20.gardenmod.init.GardenFluids;

import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Items;

public class HoneyBucket extends BucketItem {
	public HoneyBucket() {
		super(GardenFluids.STILL_HONEY,
				new Item.Settings().group(ItemGroup.MISC).recipeRemainder(Items.BUCKET).maxCount(1));
	}
}
