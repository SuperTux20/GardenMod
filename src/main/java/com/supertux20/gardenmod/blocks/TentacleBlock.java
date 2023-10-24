package com.supertux20.gardenmod.blocks;

import org.quiltmc.qsl.block.extensions.api.QuiltBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.sound.BlockSoundGroup;

public class TentacleBlock extends Block {
	public TentacleBlock() {
		super(QuiltBlockSettings.create().sounds(BlockSoundGroup.WET_GRASS).strength(1F, 1F));
	}
}
