package com.supertux20.gardenmod.blocks;

import org.quiltmc.qsl.block.extensions.api.QuiltBlockSettings;

import net.minecraft.block.GravelBlock;
import net.minecraft.sound.BlockSoundGroup;

public class ChocolateGravel extends GravelBlock {
	public ChocolateGravel() {
		super(QuiltBlockSettings.create().sounds(BlockSoundGroup.GRAVEL).strength(0.5F, 0.5F));
	}
}
