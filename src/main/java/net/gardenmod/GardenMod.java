package net.gardenmod;

import net.fabricmc.api.ModInitializer;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class GardenMod implements ModInitializer {

	public static final Item WIND_CHIMES = new WindChimes(new Item.Settings().group(ItemGroup.MISC));
	public static final Block TENTACLE_BLOCK = new TentacleBlock();

	@Override
	public void onInitialize() {
		Registry.register(Registry.ITEM, new Identifier("gardenmod", "wind_chimes"), WIND_CHIMES);
		Registry.register(Registry.ITEM, new Identifier("gardenmod", "tentacle_block"), new BlockItem(TENTACLE_BLOCK, new Item.Settings().group(ItemGroup.DECORATIONS)));
		Registry.register(Registry.BLOCK, new Identifier("gardenmod", "tentacle_block"), TENTACLE_BLOCK);
	}
}