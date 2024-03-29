package com.supertux20.gardenmod;

import com.supertux20.gardenmod.init.*;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.RegistryKey;

import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GardenMod implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod name as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("Jewel's Garden");

	@Override
	public void onInitialize(ModContainer mod) {
		LOGGER.info("I left this line in so that I don't forget how the logger works. Hello World from {}, btw", mod.metadata().name());
		GardenBlocks.register();
		GardenFluids.register();
		GardenItems.register();
		GardenWorldgen.register();
	}

	public static final void sortItemIntoCreativeTab(String itemName, Item item, RegistryKey<ItemGroup> group, ItemConvertible sortItem, Object... sortBefore) {
		if (sortBefore.length != 0) {
			ItemGroupEvents.modifyEntriesEvent(group).register(entries -> {entries.addBefore(sortItem, item);});
		} else {
			ItemGroupEvents.modifyEntriesEvent(group).register(entries -> {entries.addAfter(sortItem, item);});
		}
	}

	public static final String ID = "gardenmod";
}
