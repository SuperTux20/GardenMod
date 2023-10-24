package com.supertux20.gardenmod.blocks;

import org.quiltmc.qsl.block.extensions.api.QuiltBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.sound.BlockSoundGroup;

public class TopazBlock extends Block {
	public TopazBlock() {
		super(QuiltBlockSettings.create().sounds(BlockSoundGroup.STONE).strength(5F, 6F));
	}
}
