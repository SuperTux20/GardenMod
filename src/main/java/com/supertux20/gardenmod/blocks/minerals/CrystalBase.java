package com.supertux20.gardenmod.blocks.minerals;

import org.quiltmc.qsl.block.extensions.api.QuiltBlockSettings;

import net.minecraft.block.Blocks;
import net.minecraft.block.TransparentBlock;
import net.minecraft.sound.BlockSoundGroup;

public class CrystalBase extends TransparentBlock {
	public CrystalBase() {
		super(QuiltBlockSettings.create().sounds(BlockSoundGroup.GLASS).strength(1F, 1F).luminance(7).nonOpaque().allowsSpawning(Blocks::never).solidBlock(Blocks::never).suffocates(Blocks::never).blockVision(Blocks::never));
	}
}
