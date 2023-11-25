package com.supertux20.gardenmod.blocks;

import org.quiltmc.qsl.block.extensions.api.QuiltBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.sound.BlockSoundGroup;

public class PeppermintBlock extends Block {
	public PeppermintBlock() {
		super(QuiltBlockSettings.create().sounds(BlockSoundGroup.STONE).strength(2F));
	}
}
