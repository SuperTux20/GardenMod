package net.gardenmod.init;

import net.gardenmod.GardenMod;
import net.gardenmod.MythrilOre;
import net.gardenmod.OrichalcumOre;
import net.gardenmod.RawAquamarineBlock;
import net.gardenmod.RawDiamondBlock;
import net.gardenmod.RawEmeraldBlock;
import net.gardenmod.RawOnyxBlock;
import net.gardenmod.RawQuartzBlock;
import net.gardenmod.RawRubyBlock;
import net.gardenmod.RawSapphireBlock;
import net.gardenmod.RawTopazBlock;
import net.gardenmod.RawTourmalineBlock;
import net.gardenmod.AmethystBlock;
import net.gardenmod.AquamarineBlock;
import net.gardenmod.OnyxBlock;
import net.gardenmod.RubyBlock;
import net.gardenmod.SapphireBlock;
import net.gardenmod.TopazBlock;
import net.gardenmod.TourmalineBlock;
import net.gardenmod.TentacleBlock;
import net.gardenmod.ChocolateGravel;
import net.gardenmod.PeppermintBlock;
import net.gardenmod.CandyCaneBlock;
import net.gardenmod.CandyCaneLog;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class GardenBlocks {
	public static void newBlock(String blockName, Block block, ItemGroup group) {
		Registry.register(Registry.ITEM,  new Identifier(GardenMod.MOD_ID, blockName), new BlockItem(block, new Item.Settings().group(group)));
		Registry.register(Registry.BLOCK, new Identifier(GardenMod.MOD_ID, blockName), block);
	}

	public static final Block   MYTHRIL_ORE          = new MythrilOre();
	public static final Block   ORICHALCUM_ORE       = new OrichalcumOre();

	public static final Block   RAW_AQUAMARINE_BLOCK = new RawAquamarineBlock();
	public static final Block   RAW_DIAMOND_BLOCK    = new RawDiamondBlock();
	public static final Block   RAW_EMERALD_BLOCK    = new RawEmeraldBlock();
	public static final Block   RAW_ONYX_BLOCK       = new RawOnyxBlock();
	public static final Block   RAW_QUARTZ_BLOCK     = new RawQuartzBlock();
	public static final Block   RAW_RUBY_BLOCK       = new RawRubyBlock();
	public static final Block   RAW_SAPPHIRE_BLOCK   = new RawSapphireBlock();
	public static final Block   RAW_TOPAZ_BLOCK      = new RawTopazBlock();
	public static final Block   RAW_TOURMALINE_BLOCK = new RawTourmalineBlock();

	public static final Block   AMETHYST_BLOCK       = new AmethystBlock();
	public static final Block   AQUAMARINE_BLOCK     = new AquamarineBlock();
	public static final Block   ONYX_BLOCK           = new OnyxBlock();
	public static final Block   RUBY_BLOCK           = new RubyBlock();
	public static final Block   SAPPHIRE_BLOCK       = new SapphireBlock();
	public static final Block   TOPAZ_BLOCK          = new TopazBlock();
	public static final Block   TOURMALINE_BLOCK     = new TourmalineBlock();

	public static final Block   TENTACLE_BLOCK       = new TentacleBlock();
	public static final Block   CHOCOLATE_GRAVEL     = new ChocolateGravel();
	public static final Block   PEPPERMINT_BLOCK     = new PeppermintBlock();
	public static final Block   CANDY_CANE_BLOCK     = new CandyCaneBlock();
	public static final Block   CANDY_CANE_LOG       = new CandyCaneLog();

	// registers the blocks so they now exist in the registry
	public static void register() {
		newBlock("mythril_ore",          MYTHRIL_ORE,          ItemGroup.BUILDING_BLOCKS);
		newBlock("orichalcum_ore",       ORICHALCUM_ORE,       ItemGroup.BUILDING_BLOCKS);

		newBlock("raw_aquamarine_block", RAW_AQUAMARINE_BLOCK, ItemGroup.BUILDING_BLOCKS);
		newBlock("raw_diamond_block",    RAW_DIAMOND_BLOCK,    ItemGroup.BUILDING_BLOCKS);
		newBlock("raw_emerald_block",    RAW_EMERALD_BLOCK,    ItemGroup.BUILDING_BLOCKS);
		newBlock("raw_onyx_block",       RAW_ONYX_BLOCK,       ItemGroup.BUILDING_BLOCKS);
		newBlock("raw_quartz_block",     RAW_QUARTZ_BLOCK,     ItemGroup.BUILDING_BLOCKS);
		newBlock("raw_ruby_block",       RAW_RUBY_BLOCK,       ItemGroup.BUILDING_BLOCKS);
		newBlock("raw_sapphire_block",   RAW_SAPPHIRE_BLOCK,   ItemGroup.BUILDING_BLOCKS);
		newBlock("raw_topaz_block",      RAW_TOPAZ_BLOCK,      ItemGroup.BUILDING_BLOCKS);
		newBlock("raw_tourmaline_block", RAW_TOURMALINE_BLOCK, ItemGroup.BUILDING_BLOCKS);

		newBlock("amethyst_block",       AMETHYST_BLOCK,       ItemGroup.BUILDING_BLOCKS);
		newBlock("aquamarine_block",     AQUAMARINE_BLOCK,     ItemGroup.BUILDING_BLOCKS);
		newBlock("onyx_block",           ONYX_BLOCK,           ItemGroup.BUILDING_BLOCKS);
		newBlock("ruby_block",           RUBY_BLOCK,           ItemGroup.BUILDING_BLOCKS);
		newBlock("sapphire_block",       SAPPHIRE_BLOCK,       ItemGroup.BUILDING_BLOCKS);
		newBlock("topaz_block",          TOPAZ_BLOCK,          ItemGroup.BUILDING_BLOCKS);
		newBlock("tourmaline_block",     TOURMALINE_BLOCK,     ItemGroup.BUILDING_BLOCKS);

		newBlock("tentacle_block",       TENTACLE_BLOCK,       ItemGroup.BUILDING_BLOCKS);
		newBlock("chocolate_gravel",     CHOCOLATE_GRAVEL,     ItemGroup.BUILDING_BLOCKS);
		newBlock("peppermint_block",     PEPPERMINT_BLOCK,     ItemGroup.BUILDING_BLOCKS);
		newBlock("candy_cane_block",     CANDY_CANE_BLOCK,     ItemGroup.BUILDING_BLOCKS);
		newBlock("candy_cane_log",       CANDY_CANE_LOG,       ItemGroup.BUILDING_BLOCKS);
	}
}