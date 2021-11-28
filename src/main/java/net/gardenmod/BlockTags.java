package net.gardenmod;

import net.fabricmc.fabric.api.tag.TagFactory;
import net.minecraft.block.Block;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;

public class BlockTags {
	public static final Tag<Block> MYTHRIL_ORES = TagFactory.BLOCK.create(new Identifier("c", "mythril_ores"));
	public static final Tag<Block> ORICHALCUM_ORES = TagFactory.BLOCK.create(new Identifier("c", "orichalcum_ores"));
}