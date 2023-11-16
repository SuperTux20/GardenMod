package com.supertux20.gardenmod.blocks.minerals.refined;

import org.quiltmc.qsl.block.extensions.api.QuiltBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.sound.BlockSoundGroup;

public class OrichalcumBlock extends Block {
	public OrichalcumBlock() {
		super(QuiltBlockSettings.create().sounds(BlockSoundGroup.METAL).strength(5F, 6F));
	}
}
