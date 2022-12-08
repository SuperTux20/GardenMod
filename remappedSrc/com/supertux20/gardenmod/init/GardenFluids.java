package com.supertux20.gardenmod.init;

import com.supertux20.gardenmod.GardenMod;
import com.supertux20.gardenmod.HoneyFluid;
import com.supertux20.gardenmod.items.HoneyBucket;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FluidBlock;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class GardenFluids {
	public static final FlowableFluid STILL_HONEY = new HoneyFluid.Still();
	public static final FlowableFluid FLOWING_HONEY = new HoneyFluid.Flowing();
	public static final BucketItem HONEY_BUCKET = new HoneyBucket();
	public static final Block HONEY = Registry.register(Registry.BLOCK, new Identifier(GardenMod.ID, "honey"),
			new FluidBlock(STILL_HONEY, FabricBlockSettings.copy(Blocks.WATER)) {
			});

	// registers the fluids so they now exist in the registry
	public static void register() {
		Registry.register(Registry.FLUID, new Identifier(GardenMod.ID, "honey"), STILL_HONEY);
		Registry.register(Registry.FLUID, new Identifier(GardenMod.ID, "flowing_honey"), FLOWING_HONEY);
		Registry.register(Registry.ITEM, new Identifier(GardenMod.ID, "honey_bucket"),
				new BucketItem(STILL_HONEY, new Item.Settings().recipeRemainder(Items.BUCKET).maxCount(1)));
	}
}
