package com.supertux20.gardenmod.init;

import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

import com.supertux20.gardenmod.GardenMod;
import com.supertux20.gardenmod.blocks.CandyCaneBlock;
import com.supertux20.gardenmod.blocks.CandyCaneLog;
import com.supertux20.gardenmod.blocks.ChocolateGravel;
import com.supertux20.gardenmod.blocks.PeppermintBlock;
import com.supertux20.gardenmod.blocks.TentacleBlock;
import com.supertux20.gardenmod.blocks.minerals.DeepslateMythrilOre;
import com.supertux20.gardenmod.blocks.minerals.DeepslateOrichalcumOre;
import com.supertux20.gardenmod.blocks.minerals.MythrilOre;
import com.supertux20.gardenmod.blocks.minerals.OrichalcumOre;
import com.supertux20.gardenmod.blocks.minerals.crystals.BlackCrystal;
import com.supertux20.gardenmod.blocks.minerals.crystals.BlueCrystal;
import com.supertux20.gardenmod.blocks.minerals.crystals.BrownCrystal;
import com.supertux20.gardenmod.blocks.minerals.crystals.CyanCrystal;
import com.supertux20.gardenmod.blocks.minerals.crystals.GrayCrystal;
import com.supertux20.gardenmod.blocks.minerals.crystals.GreenCrystal;
import com.supertux20.gardenmod.blocks.minerals.crystals.LightBlueCrystal;
import com.supertux20.gardenmod.blocks.minerals.crystals.LightGrayCrystal;
import com.supertux20.gardenmod.blocks.minerals.crystals.LimeCrystal;
import com.supertux20.gardenmod.blocks.minerals.crystals.MagentaCrystal;
import com.supertux20.gardenmod.blocks.minerals.crystals.OrangeCrystal;
import com.supertux20.gardenmod.blocks.minerals.crystals.PinkCrystal;
import com.supertux20.gardenmod.blocks.minerals.crystals.PurpleCrystal;
import com.supertux20.gardenmod.blocks.minerals.crystals.RedCrystal;
import com.supertux20.gardenmod.blocks.minerals.crystals.WhiteCrystal;
import com.supertux20.gardenmod.blocks.minerals.crystals.YellowCrystal;
import com.supertux20.gardenmod.blocks.minerals.raw.RawAmberBlock;
import com.supertux20.gardenmod.blocks.minerals.raw.RawAquamarineBlock;
import com.supertux20.gardenmod.blocks.minerals.raw.RawDiamondBlock;
import com.supertux20.gardenmod.blocks.minerals.raw.RawEmeraldBlock;
import com.supertux20.gardenmod.blocks.minerals.raw.RawLapisLazuliBlock;
import com.supertux20.gardenmod.blocks.minerals.raw.RawMoonstoneBlock;
import com.supertux20.gardenmod.blocks.minerals.raw.RawMythrilBlock;
import com.supertux20.gardenmod.blocks.minerals.raw.RawOlivineBlock;
import com.supertux20.gardenmod.blocks.minerals.raw.RawOnyxBlock;
import com.supertux20.gardenmod.blocks.minerals.raw.RawOrichalcumBlock;
import com.supertux20.gardenmod.blocks.minerals.raw.RawQuartzBlock;
import com.supertux20.gardenmod.blocks.minerals.raw.RawRoseQuartzBlock;
import com.supertux20.gardenmod.blocks.minerals.raw.RawRubyBlock;
import com.supertux20.gardenmod.blocks.minerals.raw.RawSmokyquartzBlock;
import com.supertux20.gardenmod.blocks.minerals.raw.RawTigerEyeBlock;
import com.supertux20.gardenmod.blocks.minerals.raw.RawTopazBlock;
import com.supertux20.gardenmod.blocks.minerals.raw.RawTourmalineBlock;
import com.supertux20.gardenmod.blocks.minerals.refined.AmberBlock;
import com.supertux20.gardenmod.blocks.minerals.refined.AmethystBlock;
import com.supertux20.gardenmod.blocks.minerals.refined.AquamarineBlock;
import com.supertux20.gardenmod.blocks.minerals.refined.MoonstoneBlock;
import com.supertux20.gardenmod.blocks.minerals.refined.MythrilBlock;
import com.supertux20.gardenmod.blocks.minerals.refined.OlivineBlock;
import com.supertux20.gardenmod.blocks.minerals.refined.OnyxBlock;
import com.supertux20.gardenmod.blocks.minerals.refined.OrichalcumBlock;
import com.supertux20.gardenmod.blocks.minerals.refined.RoseQuartzBlock;
import com.supertux20.gardenmod.blocks.minerals.refined.RubyBlock;
import com.supertux20.gardenmod.blocks.minerals.refined.SmokyQuartzBlock;
import com.supertux20.gardenmod.blocks.minerals.refined.TigerEyeBlock;
import com.supertux20.gardenmod.blocks.minerals.refined.TopazBlock;
import com.supertux20.gardenmod.blocks.minerals.refined.TourmalineBlock;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class GardenBlocks {
	public static void newBlock(String blockName, Block block, RegistryKey<ItemGroup> group, Object[]... sorting) {
		Registry.register(Registries.ITEM, new Identifier(GardenMod.ID, blockName), new BlockItem(block, new QuiltItemSettings()));
		Registry.register(Registries.BLOCK, new Identifier(GardenMod.ID, blockName), block);
		if (sorting.length == 1) {
			if (!(sorting[0][0] instanceof Boolean)) { 
				throw new IllegalArgumentException("Sort method is not boolean");
			}
			if (!(sorting[0][1] instanceof ItemConvertible)) { 
				throw new IllegalArgumentException("Sort item is not item");
			}
			Boolean before = (Boolean)sorting[0][0];
			ItemConvertible sortItem = (ItemConvertible)sorting[0][1];
			if (before) {
				ItemGroupEvents.modifyEntriesEvent(group).register(entries -> {entries.addBefore(sortItem, block.asItem());});
			} else {
				ItemGroupEvents.modifyEntriesEvent(group).register(entries -> {entries.addAfter(sortItem, block.asItem());});
			}
		} else {
			ItemGroupEvents.modifyEntriesEvent(group).register(entries -> {entries.addItem(block.asItem());});
		}
	}

	public static final Block MYTHRIL_ORE = new MythrilOre();
	public static final Block DEEPSLATE_MYTHRIL_ORE = new DeepslateMythrilOre();
	
	public static final Block ORICHALCUM_ORE = new OrichalcumOre();
	public static final Block DEEPSLATE_ORICHALCUM_ORE = new DeepslateOrichalcumOre();

	public static final Block RAW_MYTHRIL_BLOCK = new RawMythrilBlock();
	public static final Block MYTHRIL_BLOCK= new MythrilBlock();

	public static final Block RAW_ORICHALCUM_BLOCK = new RawOrichalcumBlock();
	public static final Block ORICHALCUM_BLOCK = new OrichalcumBlock();

	public static final Block RAW_AMBER_BLOCK = new RawAmberBlock();
	public static final Block RAW_AQUAMARINE_BLOCK = new RawAquamarineBlock();
	public static final Block RAW_DIAMOND_BLOCK = new RawDiamondBlock();
	public static final Block RAW_EMERALD_BLOCK = new RawEmeraldBlock();
	public static final Block RAW_LAPIS_LAZULI_BLOCK = new RawLapisLazuliBlock();
	public static final Block RAW_MOONSTONE_BLOCK = new RawMoonstoneBlock();
	public static final Block RAW_OLIVINE_BLOCK = new RawOlivineBlock();
	public static final Block RAW_ONYX_BLOCK = new RawOnyxBlock();
	public static final Block RAW_QUARTZ_BLOCK = new RawQuartzBlock();
	public static final Block RAW_ROSE_QUARTZ_BLOCK = new RawRoseQuartzBlock();
	public static final Block RAW_RUBY_BLOCK = new RawRubyBlock();
	public static final Block RAW_SMOKY_QUARTZ_BLOCK = new RawSmokyquartzBlock();
	public static final Block RAW_TIGER_EYE_BLOCK = new RawTigerEyeBlock();
	public static final Block RAW_TOPAZ_BLOCK = new RawTopazBlock();
	public static final Block RAW_TOURMALINE_BLOCK = new RawTourmalineBlock();

	public static final Block AMBER_BLOCK = new AmberBlock();
	public static final Block AMETHYST_BLOCK = new AmethystBlock();
	public static final Block AQUAMARINE_BLOCK = new AquamarineBlock();
	public static final Block MOONSTONE_BLOCK = new MoonstoneBlock();
	public static final Block OLIVINE_BLOCK = new OlivineBlock();
	public static final Block ONYX_BLOCK = new OnyxBlock();
	public static final Block ROSE_QUARTZ_BLOCK = new RoseQuartzBlock();
	public static final Block RUBY_BLOCK = new RubyBlock();
	public static final Block SMOKY_QUARTZ_BLOCK = new SmokyQuartzBlock();
	public static final Block TIGER_EYE_BLOCK = new TigerEyeBlock();
	public static final Block TOPAZ_BLOCK = new TopazBlock();
	public static final Block TOURMALINE_BLOCK = new TourmalineBlock();

	public static final Block WHITE_CRYSTAL = new WhiteCrystal();
	public static final Block LIGHT_GRAY_CRYSTAL = new LightGrayCrystal();
	public static final Block GRAY_CRYSTAL = new GrayCrystal();
	public static final Block BLACK_CRYSTAL = new BlackCrystal();
	public static final Block BROWN_CRYSTAL = new BrownCrystal();
	public static final Block RED_CRYSTAL = new RedCrystal();
	public static final Block ORANGE_CRYSTAL = new OrangeCrystal();
	public static final Block YELLOW_CRYSTAL = new YellowCrystal();
	public static final Block LIME_CRYSTAL = new LimeCrystal();
	public static final Block GREEN_CRYSTAL = new GreenCrystal();
	public static final Block CYAN_CRYSTAL = new CyanCrystal();
	public static final Block LIGHT_BLUE_CRYSTAL = new LightBlueCrystal();
	public static final Block BLUE_CRYSTAL = new BlueCrystal();
	public static final Block PURPLE_CRYSTAL = new PurpleCrystal();
	public static final Block MAGENTA_CRYSTAL = new MagentaCrystal();
	public static final Block PINK_CRYSTAL = new PinkCrystal();

	public static final Block TENTACLE_BLOCK = new TentacleBlock();
	public static final Block CHOCOLATE_GRAVEL = new ChocolateGravel();
	public static final Block PEPPERMINT_BLOCK = new PeppermintBlock();
	public static final Block CANDY_CANE_BLOCK = new CandyCaneBlock();
	public static final Block CANDY_CANE_LOG = new CandyCaneLog();

	// registers the blocks so they now exist in the registry
	public static void register() {
		newBlock("mythril_ore",					MYTHRIL_ORE,				ItemGroups.NATURAL_BLOCKS, new Object[] {false, Items.DEEPSLATE_GOLD_ORE});
		newBlock("deepslate_mythril_ore",		DEEPSLATE_MYTHRIL_ORE,		ItemGroups.NATURAL_BLOCKS, new Object[] {false, MYTHRIL_ORE});
		newBlock("raw_mythril_block",			RAW_MYTHRIL_BLOCK,			ItemGroups.NATURAL_BLOCKS, new Object[] {false, Items.RAW_GOLD_BLOCK});
		newBlock("mythril_block",				MYTHRIL_BLOCK,				ItemGroups.BUILDING_BLOCKS, new Object[] {false, Items.LIGHT_WEIGHTED_PRESSURE_PLATE});
		newBlock("orichalcum_ore",				ORICHALCUM_ORE,				ItemGroups.NATURAL_BLOCKS, new Object[] {false, DEEPSLATE_MYTHRIL_ORE});
		newBlock("deepslate_orichalcum_ore",	DEEPSLATE_ORICHALCUM_ORE,	ItemGroups.NATURAL_BLOCKS, new Object[] {false, ORICHALCUM_ORE});
		newBlock("raw_orichalcum_block",		RAW_ORICHALCUM_BLOCK,		ItemGroups.NATURAL_BLOCKS, new Object[] {false, RAW_MYTHRIL_BLOCK});
		newBlock("orichalcum_block",			ORICHALCUM_BLOCK,			ItemGroups.BUILDING_BLOCKS, new Object[] {false, MYTHRIL_BLOCK});
		newBlock("tentacle_block",				TENTACLE_BLOCK,				ItemGroups.NATURAL_BLOCKS);
		
		newBlock("raw_amber_block",			RAW_AMBER_BLOCK,		ItemGroups.NATURAL_BLOCKS, new Object[] {true, Items.AMETHYST_BLOCK});
		newBlock("raw_aquamarine_block",	RAW_AQUAMARINE_BLOCK,	ItemGroups.NATURAL_BLOCKS, new Object[] {false, Items.AMETHYST_BLOCK});
		newBlock("raw_diamond_block",		RAW_DIAMOND_BLOCK,		ItemGroups.NATURAL_BLOCKS, new Object[] {false, RAW_AQUAMARINE_BLOCK});
		newBlock("raw_emerald_block",		RAW_EMERALD_BLOCK,		ItemGroups.NATURAL_BLOCKS, new Object[] {false, RAW_DIAMOND_BLOCK});
		newBlock("raw_lapis_lazuli_block",	RAW_LAPIS_LAZULI_BLOCK,	ItemGroups.NATURAL_BLOCKS, new Object[] {false, RAW_EMERALD_BLOCK});
		newBlock("raw_moonstone_block",		RAW_MOONSTONE_BLOCK,	ItemGroups.NATURAL_BLOCKS, new Object[] {false, RAW_LAPIS_LAZULI_BLOCK});
		newBlock("raw_olivine_block",		RAW_OLIVINE_BLOCK,		ItemGroups.NATURAL_BLOCKS, new Object[] {false, RAW_MOONSTONE_BLOCK});
		newBlock("raw_onyx_block",			RAW_ONYX_BLOCK,			ItemGroups.NATURAL_BLOCKS, new Object[] {false, RAW_OLIVINE_BLOCK});
		newBlock("raw_quartz_block",		RAW_QUARTZ_BLOCK,		ItemGroups.NATURAL_BLOCKS, new Object[] {false, RAW_ONYX_BLOCK});
		newBlock("raw_rose_quartz_block",	RAW_ROSE_QUARTZ_BLOCK,	ItemGroups.NATURAL_BLOCKS, new Object[] {false, RAW_QUARTZ_BLOCK});
		newBlock("raw_ruby_block",			RAW_RUBY_BLOCK,			ItemGroups.NATURAL_BLOCKS, new Object[] {false, RAW_ROSE_QUARTZ_BLOCK});
		newBlock("raw_smoky_quartz_block",	RAW_SMOKY_QUARTZ_BLOCK,	ItemGroups.NATURAL_BLOCKS, new Object[] {false, RAW_RUBY_BLOCK});
		newBlock("raw_tiger_eye_block",		RAW_TIGER_EYE_BLOCK,	ItemGroups.NATURAL_BLOCKS, new Object[] {false, RAW_SMOKY_QUARTZ_BLOCK});
		newBlock("raw_topaz_block",			RAW_TOPAZ_BLOCK,		ItemGroups.NATURAL_BLOCKS, new Object[] {false, RAW_TIGER_EYE_BLOCK});
		newBlock("raw_tourmaline_block",	RAW_TOURMALINE_BLOCK,	ItemGroups.NATURAL_BLOCKS, new Object[] {false, RAW_TOPAZ_BLOCK});
		
		newBlock("amber_block",			AMBER_BLOCK,		ItemGroups.BUILDING_BLOCKS, new Object[] {true, Items.DIAMOND_BLOCK});
		newBlock("amethyst_block",		AMETHYST_BLOCK,		ItemGroups.BUILDING_BLOCKS, new Object[] {false, AMBER_BLOCK});
		newBlock("aquamarine_block",	AQUAMARINE_BLOCK,	ItemGroups.BUILDING_BLOCKS, new Object[] {false, AMETHYST_BLOCK});
		newBlock("moonstone_block",		MOONSTONE_BLOCK,	ItemGroups.BUILDING_BLOCKS, new Object[] {false, Items.LAPIS_BLOCK});
		newBlock("olivine_block",		OLIVINE_BLOCK,		ItemGroups.BUILDING_BLOCKS, new Object[] {false, MOONSTONE_BLOCK});
		newBlock("onyx_block",			ONYX_BLOCK,			ItemGroups.BUILDING_BLOCKS, new Object[] {false, OLIVINE_BLOCK});
		newBlock("rose_quartz_block",	ROSE_QUARTZ_BLOCK,	ItemGroups.BUILDING_BLOCKS, new Object[] {false, ONYX_BLOCK});
		newBlock("ruby_block",			RUBY_BLOCK,			ItemGroups.BUILDING_BLOCKS, new Object[] {false, ROSE_QUARTZ_BLOCK});
		newBlock("smoky_quartz_block",	SMOKY_QUARTZ_BLOCK,	ItemGroups.BUILDING_BLOCKS, new Object[] {false, RUBY_BLOCK});
		newBlock("tiger_eye_block",		TIGER_EYE_BLOCK,	ItemGroups.BUILDING_BLOCKS, new Object[] {false, SMOKY_QUARTZ_BLOCK});
		newBlock("topaz_block",			TOPAZ_BLOCK,		ItemGroups.BUILDING_BLOCKS, new Object[] {false, TIGER_EYE_BLOCK});
		newBlock("tourmaline_block",	TOURMALINE_BLOCK,	ItemGroups.BUILDING_BLOCKS, new Object[] {false, TOPAZ_BLOCK});

		newBlock("white_crystal",		WHITE_CRYSTAL,		ItemGroups.COLORED_BLOCKS);
		newBlock("light_gray_crystal",	LIGHT_GRAY_CRYSTAL,	ItemGroups.COLORED_BLOCKS);
		newBlock("gray_crystal",		GRAY_CRYSTAL,		ItemGroups.COLORED_BLOCKS);
		newBlock("black_crystal",		BLACK_CRYSTAL,		ItemGroups.COLORED_BLOCKS);
		newBlock("brown_crystal",		BROWN_CRYSTAL,		ItemGroups.COLORED_BLOCKS);
		newBlock("red_crystal",			RED_CRYSTAL,		ItemGroups.COLORED_BLOCKS);
		newBlock("orange_crystal",		ORANGE_CRYSTAL,		ItemGroups.COLORED_BLOCKS);
		newBlock("yellow_crystal",		YELLOW_CRYSTAL,		ItemGroups.COLORED_BLOCKS);
		newBlock("lime_crystal",		LIME_CRYSTAL,		ItemGroups.COLORED_BLOCKS);
		newBlock("green_crystal",		GREEN_CRYSTAL,		ItemGroups.COLORED_BLOCKS);
		newBlock("cyan_crystal",		CYAN_CRYSTAL,		ItemGroups.COLORED_BLOCKS);
		newBlock("light_blue_crystal",	LIGHT_BLUE_CRYSTAL,	ItemGroups.COLORED_BLOCKS);
		newBlock("blue_crystal",		BLUE_CRYSTAL,		ItemGroups.COLORED_BLOCKS);
		newBlock("purple_crystal",		PURPLE_CRYSTAL,		ItemGroups.COLORED_BLOCKS);
		newBlock("magenta_crystal",		MAGENTA_CRYSTAL,	ItemGroups.COLORED_BLOCKS);
		newBlock("pink_crystal",		PINK_CRYSTAL,		ItemGroups.COLORED_BLOCKS);

		newBlock("chocolate_gravel",	CHOCOLATE_GRAVEL,	ItemGroups.NATURAL_BLOCKS);
		newBlock("peppermint_block",	PEPPERMINT_BLOCK,	ItemGroups.BUILDING_BLOCKS);
		newBlock("candy_cane_block",	CANDY_CANE_BLOCK,	ItemGroups.BUILDING_BLOCKS);
		newBlock("candy_cane_log",		CANDY_CANE_LOG,		ItemGroups.BUILDING_BLOCKS);
	}
}