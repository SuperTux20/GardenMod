package net.gardenmod;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.FoodComponent;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.effect.StatusEffectInstance;

public class CinnamonRoll extends Item { public CinnamonRoll() { super(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(2).saturationModifier(6f).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,20*10), 1).alwaysEdible().build())); } }
