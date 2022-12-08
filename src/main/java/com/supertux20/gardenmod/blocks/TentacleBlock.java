package com.supertux20.gardenmod.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class TentacleBlock extends Block {
	public TentacleBlock() {
		super(FabricBlockSettings.of(Material.ORGANIC_PRODUCT).sounds(BlockSoundGroup.WET_GRASS).strength(1F, 1F));
	}
}
