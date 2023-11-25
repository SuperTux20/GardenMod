package com.supertux20.gardenmod.init;

import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

import com.supertux20.gardenmod.GardenMod;
import com.supertux20.gardenmod.blocks.*;
import com.supertux20.gardenmod.blocks.minerals.*;
import com.supertux20.gardenmod.blocks.minerals.raw.*;
import com.supertux20.gardenmod.blocks.minerals.refined.*;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;

public class GardenBlocks {
	public static void newBlock(String blockName, Block block, RegistryKey<ItemGroup> group, ItemConvertible sortItem, Object... sortBefore) {
		Registry.register(Registries.BLOCK, new Identifier(GardenMod.ID, blockName), block);
		GardenItems.newItem(blockName, new BlockItem(block, new QuiltItemSettings()).asItem(), group, sortItem, sortBefore);
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
	public static final Block RAW_PERIDOT_BLOCK		= new RawGemBase();
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
	public static final Block PERIDOT_BLOCK		= new GemBase();
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

	public static final Block TENTACLE_BLOCK			= new TentacleBlock();
	public static final Block CHOCOLATE_GRAVEL			= new ChocolateGravel();
	public static final Block PEPPERMINT_BLOCK			= new PeppermintBlock();
	public static final Block CANDY_CANE_BLOCK			= new LogBase(BlockSoundGroup.STONE);
	public static final Block CANDY_CANE_LOG			= new LogBase(BlockSoundGroup.STONE);
	public static final Block STRIPPED_CANDY_CANE_BLOCK	= new LogBase(BlockSoundGroup.STONE);
	public static final Block STRIPPED_CANDY_CANE_LOG	= new LogBase(BlockSoundGroup.STONE);

	// registers the blocks so they now exist in the registry
	public static void register() {
		newBlock("mythril_ore",				MYTHRIL_ORE,				ItemGroups.NATURAL_BLOCKS, Items.DEEPSLATE_GOLD_ORE);
		newBlock("deepslate_mythril_ore",	DEEPSLATE_MYTHRIL_ORE,		ItemGroups.NATURAL_BLOCKS, MYTHRIL_ORE);
		newBlock("raw_mythril_block",		RAW_MYTHRIL_BLOCK,			ItemGroups.NATURAL_BLOCKS, Items.RAW_GOLD_BLOCK);
		newBlock("mythril_block",			MYTHRIL_BLOCK,				ItemGroups.BUILDING_BLOCKS, Items.LIGHT_WEIGHTED_PRESSURE_PLATE);
		newBlock("orichalcum_ore",			ORICHALCUM_ORE,				ItemGroups.NATURAL_BLOCKS, DEEPSLATE_MYTHRIL_ORE);
		newBlock("deepslate_orichalcum_ore",	DEEPSLATE_ORICHALCUM_ORE,	ItemGroups.NATURAL_BLOCKS, ORICHALCUM_ORE);
		newBlock("raw_orichalcum_block",		RAW_ORICHALCUM_BLOCK,		ItemGroups.NATURAL_BLOCKS, RAW_MYTHRIL_BLOCK);
		newBlock("orichalcum_block",			ORICHALCUM_BLOCK,			ItemGroups.BUILDING_BLOCKS, MYTHRIL_BLOCK);
		
		newBlock("raw_amber_block",			RAW_AMBER_BLOCK,		ItemGroups.NATURAL_BLOCKS, Items.AMETHYST_BLOCK, true);
		newBlock("raw_aquamarine_block",		RAW_AQUAMARINE_BLOCK,	ItemGroups.NATURAL_BLOCKS, Items.AMETHYST_BLOCK);
		newBlock("raw_diamond_block",		RAW_DIAMOND_BLOCK,		ItemGroups.NATURAL_BLOCKS, RAW_AQUAMARINE_BLOCK);
		newBlock("raw_emerald_block",		RAW_EMERALD_BLOCK,		ItemGroups.NATURAL_BLOCKS, RAW_DIAMOND_BLOCK);
		newBlock("raw_lapis_block",			RAW_LAPIS_BLOCK,		ItemGroups.NATURAL_BLOCKS, RAW_EMERALD_BLOCK);
		newBlock("raw_moonstone_block",		RAW_MOONSTONE_BLOCK,	ItemGroups.NATURAL_BLOCKS, RAW_LAPIS_BLOCK);
		newBlock("raw_peridot_block",		RAW_PERIDOT_BLOCK,		ItemGroups.NATURAL_BLOCKS, RAW_MOONSTONE_BLOCK);
		newBlock("raw_onyx_block",			RAW_ONYX_BLOCK,			ItemGroups.NATURAL_BLOCKS, RAW_PERIDOT_BLOCK);
		newBlock("raw_quartz_block",			RAW_QUARTZ_BLOCK,		ItemGroups.NATURAL_BLOCKS, RAW_ONYX_BLOCK);
		newBlock("raw_rose_quartz_block",	RAW_ROSE_QUARTZ_BLOCK,	ItemGroups.NATURAL_BLOCKS, RAW_QUARTZ_BLOCK);
		newBlock("raw_ruby_block",			RAW_RUBY_BLOCK,			ItemGroups.NATURAL_BLOCKS, RAW_ROSE_QUARTZ_BLOCK);
		newBlock("raw_smoky_quartz_block",	RAW_SMOKY_QUARTZ_BLOCK,	ItemGroups.NATURAL_BLOCKS, RAW_RUBY_BLOCK);
		newBlock("raw_tiger_eye_block",		RAW_TIGER_EYE_BLOCK,	ItemGroups.NATURAL_BLOCKS, RAW_SMOKY_QUARTZ_BLOCK);
		newBlock("raw_topaz_block",			RAW_TOPAZ_BLOCK,		ItemGroups.NATURAL_BLOCKS, RAW_TIGER_EYE_BLOCK);
		newBlock("raw_tourmaline_block",		RAW_TOURMALINE_BLOCK,	ItemGroups.NATURAL_BLOCKS, RAW_TOPAZ_BLOCK);
		
		newBlock("amber_block",			AMBER_BLOCK,		ItemGroups.BUILDING_BLOCKS, Items.DIAMOND_BLOCK, true);
		newBlock("amethyst_block",		AMETHYST_BLOCK,		ItemGroups.BUILDING_BLOCKS, AMBER_BLOCK);
		newBlock("aquamarine_block",		AQUAMARINE_BLOCK,	ItemGroups.BUILDING_BLOCKS, AMETHYST_BLOCK);
		newBlock("moonstone_block",		MOONSTONE_BLOCK,	ItemGroups.BUILDING_BLOCKS, Items.LAPIS_BLOCK);
		newBlock("peridot_block",		PERIDOT_BLOCK,		ItemGroups.BUILDING_BLOCKS, MOONSTONE_BLOCK);
		newBlock("onyx_block",			ONYX_BLOCK,			ItemGroups.BUILDING_BLOCKS, PERIDOT_BLOCK);
		newBlock("rose_quartz_block",	ROSE_QUARTZ_BLOCK,	ItemGroups.BUILDING_BLOCKS, ONYX_BLOCK);
		newBlock("ruby_block",			RUBY_BLOCK,			ItemGroups.BUILDING_BLOCKS, ROSE_QUARTZ_BLOCK);
		newBlock("smoky_quartz_block",	SMOKY_QUARTZ_BLOCK,	ItemGroups.BUILDING_BLOCKS, RUBY_BLOCK);
		newBlock("tiger_eye_block",		TIGER_EYE_BLOCK,	ItemGroups.BUILDING_BLOCKS, SMOKY_QUARTZ_BLOCK);
		newBlock("topaz_block",			TOPAZ_BLOCK,		ItemGroups.BUILDING_BLOCKS, TIGER_EYE_BLOCK);
		newBlock("tourmaline_block",		TOURMALINE_BLOCK,	ItemGroups.BUILDING_BLOCKS, TOPAZ_BLOCK);

		newBlock("white_crystal",		WHITE_CRYSTAL,		ItemGroups.COLORED_BLOCKS, Items.PINK_BANNER);
		newBlock("light_gray_crystal",	LIGHT_GRAY_CRYSTAL,	ItemGroups.COLORED_BLOCKS, WHITE_CRYSTAL);
		newBlock("gray_crystal",			GRAY_CRYSTAL,		ItemGroups.COLORED_BLOCKS, LIGHT_GRAY_CRYSTAL);
		newBlock("black_crystal",		BLACK_CRYSTAL,		ItemGroups.COLORED_BLOCKS, GRAY_CRYSTAL);
		newBlock("brown_crystal",		BROWN_CRYSTAL,		ItemGroups.COLORED_BLOCKS, BLACK_CRYSTAL);
		newBlock("red_crystal",			RED_CRYSTAL,		ItemGroups.COLORED_BLOCKS, BROWN_CRYSTAL);
		newBlock("orange_crystal",		ORANGE_CRYSTAL,		ItemGroups.COLORED_BLOCKS, RED_CRYSTAL);
		newBlock("yellow_crystal",		YELLOW_CRYSTAL,		ItemGroups.COLORED_BLOCKS, ORANGE_CRYSTAL);
		newBlock("lime_crystal",			LIME_CRYSTAL,		ItemGroups.COLORED_BLOCKS, YELLOW_CRYSTAL);
		newBlock("green_crystal",		GREEN_CRYSTAL,		ItemGroups.COLORED_BLOCKS, LIME_CRYSTAL);
		newBlock("cyan_crystal",			CYAN_CRYSTAL,		ItemGroups.COLORED_BLOCKS, GREEN_CRYSTAL);
		newBlock("light_blue_crystal",	LIGHT_BLUE_CRYSTAL,	ItemGroups.COLORED_BLOCKS, CYAN_CRYSTAL);
		newBlock("blue_crystal",			BLUE_CRYSTAL,		ItemGroups.COLORED_BLOCKS, LIGHT_BLUE_CRYSTAL);
		newBlock("purple_crystal",		PURPLE_CRYSTAL,		ItemGroups.COLORED_BLOCKS, BLUE_CRYSTAL);
		newBlock("magenta_crystal",		MAGENTA_CRYSTAL,	ItemGroups.COLORED_BLOCKS, PURPLE_CRYSTAL);
		newBlock("pink_crystal",			PINK_CRYSTAL,		ItemGroups.COLORED_BLOCKS, MAGENTA_CRYSTAL);

		newBlock("tentacle_block",			TENTACLE_BLOCK,				ItemGroups.NATURAL_BLOCKS, Items.BONE_BLOCK, true);
		newBlock("chocolate_gravel",			CHOCOLATE_GRAVEL,			ItemGroups.NATURAL_BLOCKS, Items.GRAVEL);
		newBlock("candy_cane_log",			CANDY_CANE_LOG,				ItemGroups.BUILDING_BLOCKS, Items.WARPED_BUTTON);
		newBlock("candy_cane_block",			CANDY_CANE_BLOCK,			ItemGroups.BUILDING_BLOCKS, CANDY_CANE_LOG);
		newBlock("stripped_candy_cane_log",	STRIPPED_CANDY_CANE_LOG,	ItemGroups.BUILDING_BLOCKS, CANDY_CANE_BLOCK);
		newBlock("stripped_candy_cane_block",STRIPPED_CANDY_CANE_BLOCK,	ItemGroups.BUILDING_BLOCKS, STRIPPED_CANDY_CANE_LOG);
		newBlock("peppermint_block",			PEPPERMINT_BLOCK,			ItemGroups.BUILDING_BLOCKS, STRIPPED_CANDY_CANE_BLOCK);
	}
}