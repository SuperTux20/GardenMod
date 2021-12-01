package net.gardenmod;

import net.gardenmod.init.*;
import net.fabricmc.api.ModInitializer;

public class GardenMod implements ModInitializer {
	public static final String MOD_ID = "gardenmod";

	@Override
	public void onInitialize() {
		GardenBlocks.register();
		GardenItems.register();
	}
}
