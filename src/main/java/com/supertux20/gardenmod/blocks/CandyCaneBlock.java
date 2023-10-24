package com.supertux20.gardenmod.blocks;

import org.quiltmc.qsl.block.extensions.api.QuiltBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.sound.BlockSoundGroup;

public class CandyCaneBlock extends Block {
	public CandyCaneBlock() {
		super(QuiltBlockSettings.create().sounds(BlockSoundGroup.STONE).strength(2F, 2F));
	}
}
