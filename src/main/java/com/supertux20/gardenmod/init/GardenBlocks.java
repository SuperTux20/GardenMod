package com.supertux20.gardenmod.init;

import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

import com.supertux20.gardenmod.GardenMod;
import com.supertux20.gardenmod.blocks.CandyCaneBlock;
import com.supertux20.gardenmod.blocks.CandyCaneLog;
import com.supertux20.gardenmod.blocks.ChocolateGravel;
import com.supertux20.gardenmod.blocks.PeppermintBlock;
import com.supertux20.gardenmod.blocks.TentacleBlock;
import com.supertux20.gardenmod.blocks.minerals.CrystalBase;
import com.supertux20.gardenmod.blocks.minerals.DeepslateMythrilOre;
import com.supertux20.gardenmod.blocks.minerals.DeepslateOrichalcumOre;
import com.supertux20.gardenmod.blocks.minerals.GemBase;
import com.supertux20.gardenmod.blocks.minerals.MythrilOre;
import com.supertux20.gardenmod.blocks.minerals.OrichalcumOre;
import com.supertux20.gardenmod.blocks.minerals.RawGemBase;
import com.supertux20.gardenmod.blocks.minerals.raw.RawMythrilBlock;
import com.supertux20.gardenmod.blocks.minerals.raw.RawOrichalcumBlock;
import com.supertux20.gardenmod.blocks.minerals.refined.MythrilBlock;
import com.supertux20.gardenmod.blocks.minerals.refined.OrichalcumBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;

public class GardenBlocks {
	public static void newItem(String itemName, Block item, RegistryKey<ItemGroup> group, ItemConvertible sortItem, Object... sortBefore) {
		Registry.register(Registries.BLOCK, new Identifier(GardenMod.ID, itemName), item);
		GardenItems.newItem(itemName, new BlockItem(item, new QuiltItemSettings()).asItem(), group, sortItem, sortBefore);
	}

	public static final Block MYTHRIL_ORE				= new MythrilOre();
	public static final Block DEEPSLATE_MYTHRIL_ORE		= new DeepslateMythrilOre();
	public static final Block RAW_MYTHRIL_BLOCK			= new RawMythrilBlock();
	public static final Block MYTHRIL_BLOCK				= new MythrilBlock();
	public static final Block ORICHALCUM_ORE			= new OrichalcumOre();
	public static final Block DEEPSLATE_ORICHALCUM_ORE	= new DeepslateOrichalcumOre();
	public static final Block RAW_ORICHALCUM_BLOCK		= new RawOrichalcumBlock();
	public static final Block ORICHALCUM_BLOCK			= new OrichalcumBlock();

	public static final Block RAW_AMBER_BLOCK		= new RawGemBase();
	public static final Block RAW_AQUAMARINE_BLOCK	= new RawGemBase();
	public static final Block RAW_DIAMOND_BLOCK		= new RawGemBase();
	public static final Block RAW_EMERALD_BLOCK		= new RawGemBase();
	public static final Block RAW_LAPIS_BLOCK		= new RawGemBase();
	public static final Block RAW_MOONSTONE_BLOCK	= new RawGemBase();
	public static final Block RAW_OLIVINE_BLOCK		= new RawGemBase();
	public static final Block RAW_ONYX_BLOCK		= new RawGemBase();
	public static final Block RAW_QUARTZ_BLOCK		= new RawGemBase();
	public static final Block RAW_ROSE_QUARTZ_BLOCK	= new RawGemBase();
	public static final Block RAW_RUBY_BLOCK		= new RawGemBase();
	public static final Block RAW_SMOKY_QUARTZ_BLOCK= new RawGemBase();
	public static final Block RAW_TIGER_EYE_BLOCK	= new RawGemBase();
	public static final Block RAW_TOPAZ_BLOCK		= new RawGemBase();
	public static final Block RAW_TOURMALINE_BLOCK	= new RawGemBase();

	public static final Block AMBER_BLOCK		= new GemBase();
	public static final Block AMETHYST_BLOCK	= new GemBase();
	public static final Block AQUAMARINE_BLOCK	= new GemBase();
	public static final Block MOONSTONE_BLOCK	= new GemBase();
	public static final Block OLIVINE_BLOCK		= new GemBase();
	public static final Block ONYX_BLOCK		= new GemBase();
	public static final Block ROSE_QUARTZ_BLOCK	= new GemBase();
	public static final Block RUBY_BLOCK		= new GemBase();
	public static final Block SMOKY_QUARTZ_BLOCK= new GemBase();
	public static final Block TIGER_EYE_BLOCK	= new GemBase();
	public static final Block TOPAZ_BLOCK		= new GemBase();
	public static final Block TOURMALINE_BLOCK	= new GemBase();

	public static final Block WHITE_CRYSTAL		= new CrystalBase(DyeColor.WHITE);
	public static final Block LIGHT_GRAY_CRYSTAL= new CrystalBase(DyeColor.LIGHT_GRAY);
	public static final Block GRAY_CRYSTAL		= new CrystalBase(DyeColor.GRAY);
	public static final Block BLACK_CRYSTAL		= new CrystalBase(DyeColor.BLACK);
	public static final Block BROWN_CRYSTAL		= new CrystalBase(DyeColor.BROWN);
	public static final Block RED_CRYSTAL		= new CrystalBase(DyeColor.RED);
	public static final Block ORANGE_CRYSTAL	= new CrystalBase(DyeColor.ORANGE);
	public static final Block YELLOW_CRYSTAL	= new CrystalBase(DyeColor.YELLOW);
	public static final Block LIME_CRYSTAL		= new CrystalBase(DyeColor.LIME);
	public static final Block GREEN_CRYSTAL		= new CrystalBase(DyeColor.GREEN);
	public static final Block CYAN_CRYSTAL		= new CrystalBase(DyeColor.CYAN);
	public static final Block LIGHT_BLUE_CRYSTAL= new CrystalBase(DyeColor.LIGHT_BLUE);
	public static final Block BLUE_CRYSTAL		= new CrystalBase(DyeColor.BLUE);
	public static final Block PURPLE_CRYSTAL	= new CrystalBase(DyeColor.PURPLE);
	public static final Block MAGENTA_CRYSTAL	= new CrystalBase(DyeColor.MAGENTA);
	public static final Block PINK_CRYSTAL		= new CrystalBase(DyeColor.PINK);

	public static final Block TENTACLE_BLOCK	= new TentacleBlock();
	public static final Block CHOCOLATE_GRAVEL	= new ChocolateGravel();
	public static final Block PEPPERMINT_BLOCK	= new PeppermintBlock();
	public static final Block CANDY_CANE_BLOCK	= new CandyCaneBlock();
	public static final Block CANDY_CANE_LOG	= new CandyCaneLog();

	// registers the blocks so they now exist in the registry
	public static void register() {
		newItem("mythril_ore",				MYTHRIL_ORE,				ItemGroups.NATURAL_BLOCKS, Items.DEEPSLATE_GOLD_ORE);
		newItem("deepslate_mythril_ore",	DEEPSLATE_MYTHRIL_ORE,		ItemGroups.NATURAL_BLOCKS, MYTHRIL_ORE);
		newItem("raw_mythril_block",		RAW_MYTHRIL_BLOCK,			ItemGroups.NATURAL_BLOCKS, Items.RAW_GOLD_BLOCK);
		newItem("mythril_block",			MYTHRIL_BLOCK,				ItemGroups.BUILDING_BLOCKS, Items.LIGHT_WEIGHTED_PRESSURE_PLATE);
		newItem("orichalcum_ore",			ORICHALCUM_ORE,				ItemGroups.NATURAL_BLOCKS, DEEPSLATE_MYTHRIL_ORE);
		newItem("deepslate_orichalcum_ore",	DEEPSLATE_ORICHALCUM_ORE,	ItemGroups.NATURAL_BLOCKS, ORICHALCUM_ORE);
		newItem("raw_orichalcum_block",		RAW_ORICHALCUM_BLOCK,		ItemGroups.NATURAL_BLOCKS, RAW_MYTHRIL_BLOCK);
		newItem("orichalcum_block",			ORICHALCUM_BLOCK,			ItemGroups.BUILDING_BLOCKS, MYTHRIL_BLOCK);
		
		newItem("raw_amber_block",			RAW_AMBER_BLOCK,		ItemGroups.NATURAL_BLOCKS, Items.AMETHYST_BLOCK, true);
		newItem("raw_aquamarine_block",		RAW_AQUAMARINE_BLOCK,	ItemGroups.NATURAL_BLOCKS, Items.AMETHYST_BLOCK);
		newItem("raw_diamond_block",		RAW_DIAMOND_BLOCK,		ItemGroups.NATURAL_BLOCKS, RAW_AQUAMARINE_BLOCK);
		newItem("raw_emerald_block",		RAW_EMERALD_BLOCK,		ItemGroups.NATURAL_BLOCKS, RAW_DIAMOND_BLOCK);
		newItem("raw_lapis_block",			RAW_LAPIS_BLOCK,		ItemGroups.NATURAL_BLOCKS, RAW_EMERALD_BLOCK);
		newItem("raw_moonstone_block",		RAW_MOONSTONE_BLOCK,	ItemGroups.NATURAL_BLOCKS, RAW_LAPIS_BLOCK);
		newItem("raw_olivine_block",		RAW_OLIVINE_BLOCK,		ItemGroups.NATURAL_BLOCKS, RAW_MOONSTONE_BLOCK);
		newItem("raw_onyx_block",			RAW_ONYX_BLOCK,			ItemGroups.NATURAL_BLOCKS, RAW_OLIVINE_BLOCK);
		newItem("raw_quartz_block",			RAW_QUARTZ_BLOCK,		ItemGroups.NATURAL_BLOCKS, RAW_ONYX_BLOCK);
		newItem("raw_rose_quartz_block",	RAW_ROSE_QUARTZ_BLOCK,	ItemGroups.NATURAL_BLOCKS, RAW_QUARTZ_BLOCK);
		newItem("raw_ruby_block",			RAW_RUBY_BLOCK,			ItemGroups.NATURAL_BLOCKS, RAW_ROSE_QUARTZ_BLOCK);
		newItem("raw_smoky_quartz_block",	RAW_SMOKY_QUARTZ_BLOCK,	ItemGroups.NATURAL_BLOCKS, RAW_RUBY_BLOCK);
		newItem("raw_tiger_eye_block",		RAW_TIGER_EYE_BLOCK,	ItemGroups.NATURAL_BLOCKS, RAW_SMOKY_QUARTZ_BLOCK);
		newItem("raw_topaz_block",			RAW_TOPAZ_BLOCK,		ItemGroups.NATURAL_BLOCKS, RAW_TIGER_EYE_BLOCK);
		newItem("raw_tourmaline_block",		RAW_TOURMALINE_BLOCK,	ItemGroups.NATURAL_BLOCKS, RAW_TOPAZ_BLOCK);
		
		newItem("amber_block",			AMBER_BLOCK,		ItemGroups.BUILDING_BLOCKS, Items.DIAMOND_BLOCK, true);
		newItem("amethyst_block",		AMETHYST_BLOCK,		ItemGroups.BUILDING_BLOCKS, AMBER_BLOCK);
		newItem("aquamarine_block",		AQUAMARINE_BLOCK,	ItemGroups.BUILDING_BLOCKS, AMETHYST_BLOCK);
		newItem("moonstone_block",		MOONSTONE_BLOCK,	ItemGroups.BUILDING_BLOCKS, Items.LAPIS_BLOCK);
		newItem("olivine_block",		OLIVINE_BLOCK,		ItemGroups.BUILDING_BLOCKS, MOONSTONE_BLOCK);
		newItem("onyx_block",			ONYX_BLOCK,			ItemGroups.BUILDING_BLOCKS, OLIVINE_BLOCK);
		newItem("rose_quartz_block",	ROSE_QUARTZ_BLOCK,	ItemGroups.BUILDING_BLOCKS, ONYX_BLOCK);
		newItem("ruby_block",			RUBY_BLOCK,			ItemGroups.BUILDING_BLOCKS, ROSE_QUARTZ_BLOCK);
		newItem("smoky_quartz_block",	SMOKY_QUARTZ_BLOCK,	ItemGroups.BUILDING_BLOCKS, RUBY_BLOCK);
		newItem("tiger_eye_block",		TIGER_EYE_BLOCK,	ItemGroups.BUILDING_BLOCKS, SMOKY_QUARTZ_BLOCK);
		newItem("topaz_block",			TOPAZ_BLOCK,		ItemGroups.BUILDING_BLOCKS, TIGER_EYE_BLOCK);
		newItem("tourmaline_block",		TOURMALINE_BLOCK,	ItemGroups.BUILDING_BLOCKS, TOPAZ_BLOCK);

		newItem("white_crystal",		WHITE_CRYSTAL,		ItemGroups.COLORED_BLOCKS, Items.PINK_BANNER);
		newItem("light_gray_crystal",	LIGHT_GRAY_CRYSTAL,	ItemGroups.COLORED_BLOCKS, WHITE_CRYSTAL);
		newItem("gray_crystal",			GRAY_CRYSTAL,		ItemGroups.COLORED_BLOCKS, LIGHT_GRAY_CRYSTAL);
		newItem("black_crystal",		BLACK_CRYSTAL,		ItemGroups.COLORED_BLOCKS, GRAY_CRYSTAL);
		newItem("brown_crystal",		BROWN_CRYSTAL,		ItemGroups.COLORED_BLOCKS, BLACK_CRYSTAL);
		newItem("red_crystal",			RED_CRYSTAL,		ItemGroups.COLORED_BLOCKS, BROWN_CRYSTAL);
		newItem("orange_crystal",		ORANGE_CRYSTAL,		ItemGroups.COLORED_BLOCKS, RED_CRYSTAL);
		newItem("yellow_crystal",		YELLOW_CRYSTAL,		ItemGroups.COLORED_BLOCKS, ORANGE_CRYSTAL);
		newItem("lime_crystal",			LIME_CRYSTAL,		ItemGroups.COLORED_BLOCKS, YELLOW_CRYSTAL);
		newItem("green_crystal",		GREEN_CRYSTAL,		ItemGroups.COLORED_BLOCKS, LIME_CRYSTAL);
		newItem("cyan_crystal",			CYAN_CRYSTAL,		ItemGroups.COLORED_BLOCKS, GREEN_CRYSTAL);
		newItem("light_blue_crystal",	LIGHT_BLUE_CRYSTAL,	ItemGroups.COLORED_BLOCKS, CYAN_CRYSTAL);
		newItem("blue_crystal",			BLUE_CRYSTAL,		ItemGroups.COLORED_BLOCKS, LIGHT_BLUE_CRYSTAL);
		newItem("purple_crystal",		PURPLE_CRYSTAL,		ItemGroups.COLORED_BLOCKS, BLUE_CRYSTAL);
		newItem("magenta_crystal",		MAGENTA_CRYSTAL,	ItemGroups.COLORED_BLOCKS, PURPLE_CRYSTAL);
		newItem("pink_crystal",			PINK_CRYSTAL,		ItemGroups.COLORED_BLOCKS, MAGENTA_CRYSTAL);

		newItem("tentacle_block",	TENTACLE_BLOCK,		ItemGroups.NATURAL_BLOCKS, Items.BONE_BLOCK, true);
		newItem("chocolate_gravel",	CHOCOLATE_GRAVEL,	ItemGroups.NATURAL_BLOCKS, Items.GRAVEL);
		newItem("candy_cane_log",	CANDY_CANE_LOG,		ItemGroups.BUILDING_BLOCKS, Items.WARPED_BUTTON);
		newItem("candy_cane_block",	CANDY_CANE_BLOCK,	ItemGroups.BUILDING_BLOCKS, CANDY_CANE_LOG);
		newItem("peppermint_block",	PEPPERMINT_BLOCK,	ItemGroups.BUILDING_BLOCKS, CANDY_CANE_BLOCK);
	}
}