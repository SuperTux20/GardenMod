package net.gardenmod;

import net.minecraft.block.AmethystBlock;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;

public class RawRubyBlock extends AmethystBlock { public RawRubyBlock() { super(FabricBlockSettings.of(Material.AMETHYST).sounds(BlockSoundGroup.AMETHYST_BLOCK).strength(1.5f, 1.5f)); } }
