package com.supertux20.gardenmod.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class OrichalcumBlock extends Block {
	public OrichalcumBlock() {
		super(FabricBlockSettings.of(Material.METAL).sounds(BlockSoundGroup.METAL).strength(5F, 6F));
	}
}
