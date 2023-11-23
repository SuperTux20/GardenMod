package com.supertux20.gardenmod.init;

import com.supertux20.gardenmod.GardenMod;
import com.supertux20.gardenmod.world.gen.feature.*;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.Feature;

public class GardenWorldgen {
	public static void newFeature(String featureName, Feature<?> feature) {
		Registry.register(Registries.FEATURE, new Identifier(GardenMod.ID, featureName), feature);
	}

	public static final Feature<CustomGeodeFeatureConfig> GEODE = new CustomGeodeFeature(CustomGeodeFeatureConfig.CODEC);
	public static void register() {
		newFeature("custom_geode", GEODE);
	}
}