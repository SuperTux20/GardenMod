package net.gardenmod;

import net.minecraft.block.FallingBlock;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;

public class ChocolateGravel extends FallingBlock { public ChocolateGravel() { super(FabricBlockSettings.of(Material.SOLID_ORGANIC).sounds(BlockSoundGroup.GRAVEL).strength(0.6F, 0.6F)); } }
