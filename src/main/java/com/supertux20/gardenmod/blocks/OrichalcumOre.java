package com.supertux20.gardenmod.blocks;

import org.quiltmc.qsl.block.extensions.api.QuiltBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.sound.BlockSoundGroup;

public class OrichalcumOre extends Block {
	public OrichalcumOre() {
		super(QuiltBlockSettings.create().sounds(BlockSoundGroup.STONE).strength(3F, 3F).requiresTool());
	}
}
