package net.gardenmod;

import net.fabricmc.api.ModInitializer;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class GardenMod implements ModInitializer {
	public static final String	MOD_NAME	= "gardenmod";

	private void newItem(String itemName, Item item) { Registry.register(Registry.ITEM, new Identifier(MOD_NAME, itemName), item); }

	private void newBlock(String blockName, Block block, ItemGroup group) {
		Registry.register(Registry.ITEM,	new Identifier(MOD_NAME, blockName), new BlockItem(block, new Item.Settings().group(group)));
		Registry.register(Registry.BLOCK,	new Identifier(MOD_NAME, blockName), block);
	}

	@Override
	public void onInitialize() {
		newItem("wind_chimes",	new WindChimes());
		newItem("cinnamon_roll",	new CinnamonRoll());
		newItem("mythril_ingot",	new MythrilIngot());
		newItem("orichalcum_ingot",	new OrichalcumIngot());
		newItem("amethyst",	new Amethyst());
		newItem("aquamarine",	new Aquamarine());
		newItem("diamond",	new Diamond());
		newItem("emerald",	new Emerald());
		newItem("onyx",	new Onyx());
		newItem("quartz",	new Quartz());
		newItem("ruby",	new Ruby());
		newItem("sapphire",	new Sapphire());
		newItem("topaz",	new Topaz());
		newItem("tourmaline",	new Tourmaline());
		newItem("aquamarine_shard",	new AquamarineShard());
		newItem("onyx_shard",	new OnyxShard());
		newItem("ruby_shard",	new RubyShard());
		newItem("sapphire_shard",	new SapphireShard());
		newItem("topaz_shard",	new TopazShard());
		newItem("tourmaline_shard",	new TourmalineShard());
		newBlock("tentacle_block",	new TentacleBlock(),	ItemGroup.BUILDING_BLOCKS);
		newBlock("mythril_ore",	new MythrilOre(),	ItemGroup.BUILDING_BLOCKS);
		newBlock("orichalcum_ore",	new OrichalcumOre(),	ItemGroup.BUILDING_BLOCKS);
		newBlock("raw_aquamarine_block",	new RawAquamarineBlock(),	ItemGroup.BUILDING_BLOCKS);
		newBlock("raw_diamond_block",	new RawDiamondBlock(),	ItemGroup.BUILDING_BLOCKS);
		newBlock("raw_emerald_block",	new RawEmeraldBlock(),	ItemGroup.BUILDING_BLOCKS);
		newBlock("raw_onyx_block",	new RawOnyxBlock(),	ItemGroup.BUILDING_BLOCKS);
		newBlock("raw_quartz_block",	new RawQuartzBlock(),	ItemGroup.BUILDING_BLOCKS);
		newBlock("raw_ruby_block",	new RawRubyBlock(),	ItemGroup.BUILDING_BLOCKS);
		newBlock("raw_sapphire_block",	new RawSapphireBlock(),	ItemGroup.BUILDING_BLOCKS);
		newBlock("raw_topaz_block",	new RawTopazBlock(),	ItemGroup.BUILDING_BLOCKS);
		newBlock("raw_tourmaline_block",	new RawTourmalineBlock(),	ItemGroup.BUILDING_BLOCKS);
		newBlock("amethyst_block",	new AmethystBlock(),	ItemGroup.BUILDING_BLOCKS);
		newBlock("aquamarine_block",	new AquamarineBlock(),	ItemGroup.BUILDING_BLOCKS);
		newBlock("onyx_block",	new OnyxBlock(),	ItemGroup.BUILDING_BLOCKS);
		newBlock("ruby_block",	new RubyBlock(),	ItemGroup.BUILDING_BLOCKS);
		newBlock("sapphire_block",	new SapphireBlock(),	ItemGroup.BUILDING_BLOCKS);
		newBlock("topaz_block",	new TopazBlock(),	ItemGroup.BUILDING_BLOCKS);
		newBlock("tourmaline_block",	new TourmalineBlock(),	ItemGroup.BUILDING_BLOCKS);
		newBlock("chocolate_gravel",	new ChocolateGravel(),	ItemGroup.BUILDING_BLOCKS);
		newBlock("peppermint_block",	new PeppermintBlock(),	ItemGroup.BUILDING_BLOCKS);
		newBlock("candy_cane_block",	new CandyCaneBlock(),	ItemGroup.BUILDING_BLOCKS);
		newBlock("candy_cane_log",	new CandyCaneLog(),	ItemGroup.BUILDING_BLOCKS);
	}
}
