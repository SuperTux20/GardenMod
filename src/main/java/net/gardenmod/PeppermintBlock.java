package net.gardenmod;

import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;

public class PeppermintBlock extends Block { public PeppermintBlock() { super(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE).strength(0.5F, 0.5F)); } }
