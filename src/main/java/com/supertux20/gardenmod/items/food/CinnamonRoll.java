package com.supertux20.gardenmod.items.food;

import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;

public class CinnamonRoll extends Item {
	public CinnamonRoll() {
		super(new QuiltItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(2).build()));
	}
}
