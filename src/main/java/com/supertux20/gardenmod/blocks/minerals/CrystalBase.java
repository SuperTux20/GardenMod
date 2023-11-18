package com.supertux20.gardenmod.blocks.minerals;

import org.quiltmc.qsl.block.extensions.api.QuiltBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.sound.BlockSoundGroup;

public class CrystalBase extends Block {
	public CrystalBase() {
		super(QuiltBlockSettings.create().sounds(BlockSoundGroup.GLASS).strength(1F, 1F).luminance(7).nonOpaque());
	}
}
