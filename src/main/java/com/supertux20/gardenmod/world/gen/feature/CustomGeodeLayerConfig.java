package com.supertux20.gardenmod.world.gen.feature;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;

public class CustomGeodeLayerConfig {
	public final BlockStateProvider fillingProvider;
	public final BlockStateProvider innerLayerProvider;
	public final BlockStateProvider alternateInnerLayerProvider;
	public final BlockStateProvider middleLayerProvider;
	public final BlockStateProvider outerLayerProvider;
	public final TagKey<Block> cannotReplace;
	public final TagKey<Block> invalidBlocks;
	public static final Codec<CustomGeodeLayerConfig> CODEC = RecordCodecBuilder.create(
		instance -> instance.group(
					BlockStateProvider.TYPE_CODEC.fieldOf("filling_provider").forGetter(config -> config.fillingProvider),
					BlockStateProvider.TYPE_CODEC.fieldOf("inner_layer_provider").forGetter(config -> config.innerLayerProvider),
					BlockStateProvider.TYPE_CODEC.fieldOf("alternate_inner_layer_provider").forGetter(config -> config.alternateInnerLayerProvider),
					BlockStateProvider.TYPE_CODEC.fieldOf("middle_layer_provider").forGetter(config -> config.middleLayerProvider),
					BlockStateProvider.TYPE_CODEC.fieldOf("outer_layer_provider").forGetter(config -> config.outerLayerProvider),
					TagKey.createHashedCodec(RegistryKeys.BLOCK).fieldOf("cannot_replace").forGetter(config -> config.cannotReplace),
					TagKey.createHashedCodec(RegistryKeys.BLOCK).fieldOf("invalid_blocks").forGetter(config -> config.invalidBlocks)
				)
				.apply(instance, CustomGeodeLayerConfig::new)
	);

	public CustomGeodeLayerConfig(
		BlockStateProvider fillingProvider,
		BlockStateProvider innerLayerProvider,
		BlockStateProvider alternateInnerLayerProvider,
		BlockStateProvider middleLayerProvider,
		BlockStateProvider outerLayerProvider,
		TagKey<Block> cannotReplace,
		TagKey<Block> invalidBlocks
	) {
		this.fillingProvider = fillingProvider;
		this.innerLayerProvider = innerLayerProvider;
		this.alternateInnerLayerProvider = alternateInnerLayerProvider;
		this.middleLayerProvider = middleLayerProvider;
		this.outerLayerProvider = outerLayerProvider;
		this.cannotReplace = cannotReplace;
		this.invalidBlocks = invalidBlocks;
	}
}
