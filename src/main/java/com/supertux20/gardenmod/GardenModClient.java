package com.supertux20.gardenmod;

import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.client.ClientModInitializer;
import org.quiltmc.qsl.block.extensions.api.client.BlockRenderLayerMap;

import net.minecraft.client.render.RenderLayer;

import com.supertux20.gardenmod.init.GardenBlocks;

public class GardenModClient implements ClientModInitializer {
	public void onInitializeClient(ModContainer mod) {
		BlockRenderLayerMap.put(RenderLayer.getTranslucent(), GardenBlocks.WHITE_CRYSTAL);
		BlockRenderLayerMap.put(RenderLayer.getTranslucent(), GardenBlocks.LIGHT_GRAY_CRYSTAL);
		BlockRenderLayerMap.put(RenderLayer.getTranslucent(), GardenBlocks.GRAY_CRYSTAL);
		BlockRenderLayerMap.put(RenderLayer.getTranslucent(), GardenBlocks.BLACK_CRYSTAL);
		BlockRenderLayerMap.put(RenderLayer.getTranslucent(), GardenBlocks.BROWN_CRYSTAL);
		BlockRenderLayerMap.put(RenderLayer.getTranslucent(), GardenBlocks.RED_CRYSTAL);
		BlockRenderLayerMap.put(RenderLayer.getTranslucent(), GardenBlocks.ORANGE_CRYSTAL);
		BlockRenderLayerMap.put(RenderLayer.getTranslucent(), GardenBlocks.YELLOW_CRYSTAL);
		BlockRenderLayerMap.put(RenderLayer.getTranslucent(), GardenBlocks.LIME_CRYSTAL);
		BlockRenderLayerMap.put(RenderLayer.getTranslucent(), GardenBlocks.GREEN_CRYSTAL);
		BlockRenderLayerMap.put(RenderLayer.getTranslucent(), GardenBlocks.CYAN_CRYSTAL);
		BlockRenderLayerMap.put(RenderLayer.getTranslucent(), GardenBlocks.LIGHT_BLUE_CRYSTAL);
		BlockRenderLayerMap.put(RenderLayer.getTranslucent(), GardenBlocks.BLUE_CRYSTAL);
		BlockRenderLayerMap.put(RenderLayer.getTranslucent(), GardenBlocks.PURPLE_CRYSTAL);
		BlockRenderLayerMap.put(RenderLayer.getTranslucent(), GardenBlocks.MAGENTA_CRYSTAL);
		BlockRenderLayerMap.put(RenderLayer.getTranslucent(), GardenBlocks.PINK_CRYSTAL);
	}
}