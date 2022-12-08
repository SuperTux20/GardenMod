package com.supertux20.gardenmod.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class MythrilOre extends Block {
	public MythrilOre() {
		super(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE).strength(3F, 3F).requiresTool());
	}
}
