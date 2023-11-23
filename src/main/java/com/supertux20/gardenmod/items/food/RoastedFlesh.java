package com.supertux20.gardenmod.items.food;

import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;

public class RoastedFlesh extends Item {
	public RoastedFlesh() {
		super(new QuiltItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(1).build()));
	}
}
