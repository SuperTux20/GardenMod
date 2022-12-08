package com.supertux20.gardenmod;

import com.supertux20.gardenmod.init.GardenBlocks;
import com.supertux20.gardenmod.init.GardenItems;

import net.fabricmc.api.ModInitializer;

public class GardenMod implements ModInitializer {
	public static final String ID = "gardenmod";

	@Override
	public void onInitialize() {
		GardenBlocks.register();
		GardenItems.register();
	}
}
