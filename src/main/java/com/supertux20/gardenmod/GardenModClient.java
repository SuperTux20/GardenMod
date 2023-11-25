package com.supertux20.gardenmod;

import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.client.ClientModInitializer;
import org.quiltmc.qsl.block.extensions.api.client.BlockRenderLayerMap;

import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.SimpleFluidRenderHandler;
import net.minecraft.block.Block;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.screen.PlayerScreenHandler;
import net.minecraft.util.Identifier;

import com.supertux20.gardenmod.init.GardenBlocks;
import com.supertux20.gardenmod.init.GardenFluids;

public class GardenModClient implements ClientModInitializer {
	public void onInitializeClient(ModContainer mod) {
		Block[] transparents = {
				GardenBlocks.WHITE_CRYSTAL,
				GardenBlocks.LIGHT_GRAY_CRYSTAL,
				GardenBlocks.GRAY_CRYSTAL,
				GardenBlocks.BLACK_CRYSTAL,
				GardenBlocks.BROWN_CRYSTAL,
				GardenBlocks.RED_CRYSTAL,
				GardenBlocks.ORANGE_CRYSTAL,
				GardenBlocks.YELLOW_CRYSTAL,
				GardenBlocks.LIME_CRYSTAL,
				GardenBlocks.GREEN_CRYSTAL,
				GardenBlocks.CYAN_CRYSTAL,
				GardenBlocks.LIGHT_BLUE_CRYSTAL,
				GardenBlocks.BLUE_CRYSTAL,
				GardenBlocks.PURPLE_CRYSTAL,
				GardenBlocks.MAGENTA_CRYSTAL,
				GardenBlocks.PINK_CRYSTAL
		}; 
		for (Block block : transparents) BlockRenderLayerMap.put(RenderLayer.getTranslucent(), block);

		FlowableFluid[][] fluids = {
			{
				GardenFluids.STILL_HONEY,
				GardenFluids.FLOWING_HONEY
			}
		};
		for (FlowableFluid[] fluid : fluids) {
			FluidRenderHandlerRegistry.INSTANCE.register(fluid[0], fluid[1], new SimpleFluidRenderHandler(
					new Identifier("minecraft:block/water_still"),
					new Identifier("minecraft:block/water_flow"),
					0x005FBF
				));
			BlockRenderLayerMap.put(RenderLayer.getTranslucent(), fluid[0], fluid[1]);
		}
	}
}