package com.supertux20.gardenmod.blocks.minerals;

import org.quiltmc.qsl.block.extensions.api.QuiltBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.sound.BlockSoundGroup;

public class DeepslateMythrilOre extends Block {
	public DeepslateMythrilOre() {
		super(QuiltBlockSettings.create().sounds(BlockSoundGroup.STONE).strength(4.5F, 3F).requiresTool());
	}
}
