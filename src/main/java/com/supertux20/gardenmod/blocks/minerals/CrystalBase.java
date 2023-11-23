package com.supertux20.gardenmod.blocks.minerals;

import org.quiltmc.qsl.block.extensions.api.QuiltBlockSettings;

import net.minecraft.block.Blocks;
import net.minecraft.block.Stainable;
import net.minecraft.block.StainedGlassBlock;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.DyeColor;

public class CrystalBase extends StainedGlassBlock implements Stainable {
	public CrystalBase(DyeColor color) {
		super(color, QuiltBlockSettings.create().mapColor(color).instrument(NoteBlockInstrument.HAT).strength(1F).sounds(BlockSoundGroup.GLASS).nonOpaque().allowsSpawning(Blocks::never).solidBlock(Blocks::never).suffocates(Blocks::never).blockVision(Blocks::never));
	}
}
