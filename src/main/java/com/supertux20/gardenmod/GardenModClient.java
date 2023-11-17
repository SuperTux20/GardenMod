package com.supertux20.gardenmod;

import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.client.ClientModInitializer;
import org.quiltmc.qsl.block.extensions.api.client.BlockRenderLayerMap;

import net.minecraft.block.Block;
import net.minecraft.client.render.RenderLayer;

import com.supertux20.gardenmod.init.GardenBlocks;

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
	}
}