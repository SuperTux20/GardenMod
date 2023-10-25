package com.supertux20.gardenmod.blocks;

import org.quiltmc.qsl.block.extensions.api.QuiltBlockSettings;
import net.minecraft.block.AmethystBlock;
import net.minecraft.sound.BlockSoundGroup;

public class RawOlivineBlock extends AmethystBlock {
	public RawOlivineBlock() {
		super(QuiltBlockSettings.create().sounds(BlockSoundGroup.AMETHYST_BLOCK).strength(1.5f, 1.5f));
	}
}
