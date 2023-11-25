package com.supertux20.gardenmod.init;

import org.quiltmc.qsl.block.extensions.api.QuiltBlockSettings;

import com.supertux20.gardenmod.GardenMod;
import com.supertux20.gardenmod.fluids.HoneyFluid;
import com.supertux20.gardenmod.items.BucketBase;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FluidBlock;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class GardenFluids {
	public static FlowableFluid STILL_HONEY;
	public static FlowableFluid FLOWING_HONEY;
	public static Item HONEY_BUCKET;
	public static Block HONEY;

	public static void register() {
		STILL_HONEY = Registry.register(Registries.FLUID, new Identifier(GardenMod.ID, "honey"), new HoneyFluid.Still());
		FLOWING_HONEY = Registry.register(Registries.FLUID, new Identifier(GardenMod.ID, "flowing_honey"), new HoneyFluid.Flowing());
		HONEY_BUCKET = Registry.register(Registries.ITEM, new Identifier(GardenMod.ID, "honey_bucket"), new BucketBase(STILL_HONEY));
		HONEY = Registry.register(Registries.BLOCK, new Identifier(GardenMod.ID, "honey"), new FluidBlock(STILL_HONEY, QuiltBlockSettings.copyOf(Blocks.LAVA)));
		GardenMod.sortItemIntoCreativeTab("honey_bucket", HONEY_BUCKET, ItemGroups.TOOLS_AND_UTILITIES, Items.MILK_BUCKET);
	}
}