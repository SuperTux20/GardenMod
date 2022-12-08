package com.supertux20.gardenmod.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.FallingBlock;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class ChocolateGravel extends FallingBlock {
	public ChocolateGravel() {
		super(FabricBlockSettings.of(Material.SOLID_ORGANIC).sounds(BlockSoundGroup.GRAVEL).strength(0.6F, 0.6F));
	}
}
