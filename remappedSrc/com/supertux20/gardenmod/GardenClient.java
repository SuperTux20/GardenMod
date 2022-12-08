package com.supertux20.gardenmod;

import com.supertux20.gardenmod.init.GardenFluids;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.SimpleFluidRenderHandler;
import net.fabricmc.fabric.api.event.client.ClientSpriteRegistryCallback;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.screen.PlayerScreenHandler;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class GardenClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register((atlasTexture, registry) -> {
		    registry.register(new Identifier("gardenmod:block/honey_still"));
		    registry.register(new Identifier("gardenmod:block/honey_flowing"));
		});
		FluidRenderHandlerRegistry.INSTANCE.register(GardenFluids.STILL_HONEY, GardenFluids.FLOWING_HONEY, new SimpleFluidRenderHandler(
				new Identifier("gardenmod:block/honey_still"),
				new Identifier("gardenmod:block/honey_flowing"),
				0x4CC248
		));

		BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), GardenFluids.STILL_HONEY, GardenFluids.FLOWING_HONEY);
	}
}
