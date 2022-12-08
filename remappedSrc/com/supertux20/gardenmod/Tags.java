package com.supertux20.gardenmod;

import net.fabricmc.fabric.api.tag.TagFactory;
import net.minecraft.block.Block;
import net.minecraft.fluid.Fluid;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;

public class Tags {
	public static final Tag<Block> MYTHRIL_ORES = TagFactory.BLOCK.create(new Identifier("c", "mythril_ores"));
	public static final Tag<Block> ORICHALCUM_ORES = TagFactory.BLOCK.create(new Identifier("c", "orichalcum_ores"));
	public static final Tag<Fluid> HONEY = TagFactory.FLUID.create(new Identifier("c", "honey"));
}