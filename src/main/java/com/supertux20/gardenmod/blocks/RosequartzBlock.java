package com.supertux20.gardenmod.blocks;

import org.quiltmc.qsl.block.extensions.api.QuiltBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.sound.BlockSoundGroup;

public class RosequartzBlock extends Block {
	public RosequartzBlock() {
		super(QuiltBlockSettings.create().sounds(BlockSoundGroup.STONE).strength(5F, 6F));
	}
}
