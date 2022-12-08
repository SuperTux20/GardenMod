package com.supertux20.gardenmod.init;

import com.supertux20.gardenmod.GardenMod;
import com.supertux20.gardenmod.blocks.AmethystBlock;
import com.supertux20.gardenmod.blocks.AquamarineBlock;
import com.supertux20.gardenmod.blocks.CandyCaneBlock;
import com.supertux20.gardenmod.blocks.CandyCaneLog;
import com.supertux20.gardenmod.blocks.ChocolateGravel;
import com.supertux20.gardenmod.blocks.DeepslateMythrilOre;
import com.supertux20.gardenmod.blocks.DeepslateOrichalcumOre;
import com.supertux20.gardenmod.blocks.MythrilBlock;
import com.supertux20.gardenmod.blocks.MythrilOre;
import com.supertux20.gardenmod.blocks.OnyxBlock;
import com.supertux20.gardenmod.blocks.OrichalcumBlock;
import com.supertux20.gardenmod.blocks.OrichalcumOre;
import com.supertux20.gardenmod.blocks.PeppermintBlock;
import com.supertux20.gardenmod.blocks.RawAquamarineBlock;
import com.supertux20.gardenmod.blocks.RawDiamondBlock;
import com.supertux20.gardenmod.blocks.RawEmeraldBlock;
import com.supertux20.gardenmod.blocks.RawMythrilBlock;
import com.supertux20.gardenmod.blocks.RawOnyxBlock;
import com.supertux20.gardenmod.blocks.RawOrichalcumBlock;
import com.supertux20.gardenmod.blocks.RawQuartzBlock;
import com.supertux20.gardenmod.blocks.RawRubyBlock;
import com.supertux20.gardenmod.blocks.RawSapphireBlock;
import com.supertux20.gardenmod.blocks.RawTopazBlock;
import com.supertux20.gardenmod.blocks.RawTourmalineBlock;
import com.supertux20.gardenmod.blocks.RubyBlock;
import com.supertux20.gardenmod.blocks.SapphireBlock;
import com.supertux20.gardenmod.blocks.TentacleBlock;
import com.supertux20.gardenmod.blocks.TopazBlock;
import com.supertux20.gardenmod.blocks.TourmalineBlock;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class GardenBlocks {
	public static void newBlock(String blockName, Block block, ItemGroup group) {
		Registry.register(Registry.ITEM, new Identifier(GardenMod.ID, blockName),
				new BlockItem(block, new Item.Settings().group(group)));
		Registry.register(Registry.BLOCK, new Identifier(GardenMod.ID, blockName), block);
	}

	public static final Block MYTHRIL_ORE = new MythrilOre();
	public static final Block ORICHALCUM_ORE = new OrichalcumOre();
	
	public static final Block DEEPSLATE_MYTHRIL_ORE = new DeepslateMythrilOre();
	public static final Block DEEPSLATE_ORICHALCUM_ORE = new DeepslateOrichalcumOre();

	public static final Block RAW_MYTHRIL_BLOCK = new RawMythrilBlock();
	public static final Block RAW_ORICHALCUM_BLOCK = new RawOrichalcumBlock();

	public static final Block MYTHRIL_BLOCK= new MythrilBlock();
	public static final Block ORICHALCUM_BLOCK = new OrichalcumBlock();

	public static final Block RAW_AQUAMARINE_BLOCK = new RawAquamarineBlock();
	public static final Block RAW_DIAMOND_BLOCK = new RawDiamondBlock();
	public static final Block RAW_EMERALD_BLOCK = new RawEmeraldBlock();
	public static final Block RAW_ONYX_BLOCK = new RawOnyxBlock();
	public static final Block RAW_QUARTZ_BLOCK = new RawQuartzBlock();
	public static final Block RAW_RUBY_BLOCK = new RawRubyBlock();
	public static final Block RAW_SAPPHIRE_BLOCK = new RawSapphireBlock();
	public static final Block RAW_TOPAZ_BLOCK = new RawTopazBlock();
	public static final Block RAW_TOURMALINE_BLOCK = new RawTourmalineBlock();

	public static final Block AMETHYST_BLOCK = new AmethystBlock();
	public static final Block AQUAMARINE_BLOCK = new AquamarineBlock();
	public static final Block ONYX_BLOCK = new OnyxBlock();
	public static final Block RUBY_BLOCK = new RubyBlock();
	public static final Block SAPPHIRE_BLOCK = new SapphireBlock();
	public static final Block TOPAZ_BLOCK = new TopazBlock();
	public static final Block TOURMALINE_BLOCK = new TourmalineBlock();

	public static final Block TENTACLE_BLOCK = new TentacleBlock();
	public static final Block CHOCOLATE_GRAVEL = new ChocolateGravel();
	public static final Block PEPPERMINT_BLOCK = new PeppermintBlock();
	public static final Block CANDY_CANE_BLOCK = new CandyCaneBlock();
	public static final Block CANDY_CANE_LOG = new CandyCaneLog();

	// registers the blocks so they now exist in the registry
	public static void register() {
		newBlock("mythril_ore", MYTHRIL_ORE, ItemGroup.BUILDING_BLOCKS);
		newBlock("orichalcum_ore", ORICHALCUM_ORE, ItemGroup.BUILDING_BLOCKS);

		newBlock("deepslate_mythril_ore", DEEPSLATE_MYTHRIL_ORE, ItemGroup.BUILDING_BLOCKS);
		newBlock("deepslate_orichalcum_ore", DEEPSLATE_ORICHALCUM_ORE, ItemGroup.BUILDING_BLOCKS);

		newBlock("raw_mythril_block", RAW_MYTHRIL_BLOCK, ItemGroup.BUILDING_BLOCKS);
		newBlock("raw_orichalcum_block", RAW_ORICHALCUM_BLOCK, ItemGroup.BUILDING_BLOCKS);

		newBlock("mythril_block", MYTHRIL_BLOCK, ItemGroup.BUILDING_BLOCKS);
		newBlock("orichalcum_block", ORICHALCUM_BLOCK, ItemGroup.BUILDING_BLOCKS);

		newBlock("raw_aquamarine_block", RAW_AQUAMARINE_BLOCK, ItemGroup.BUILDING_BLOCKS);
		newBlock("raw_diamond_block", RAW_DIAMOND_BLOCK, ItemGroup.BUILDING_BLOCKS);
		newBlock("raw_emerald_block", RAW_EMERALD_BLOCK, ItemGroup.BUILDING_BLOCKS);
		newBlock("raw_onyx_block", RAW_ONYX_BLOCK, ItemGroup.BUILDING_BLOCKS);
		newBlock("raw_quartz_block", RAW_QUARTZ_BLOCK, ItemGroup.BUILDING_BLOCKS);
		newBlock("raw_ruby_block", RAW_RUBY_BLOCK, ItemGroup.BUILDING_BLOCKS);
		newBlock("raw_sapphire_block", RAW_SAPPHIRE_BLOCK, ItemGroup.BUILDING_BLOCKS);
		newBlock("raw_topaz_block", RAW_TOPAZ_BLOCK, ItemGroup.BUILDING_BLOCKS);
		newBlock("raw_tourmaline_block", RAW_TOURMALINE_BLOCK, ItemGroup.BUILDING_BLOCKS);

		newBlock("amethyst_block", AMETHYST_BLOCK, ItemGroup.BUILDING_BLOCKS);
		newBlock("aquamarine_block", AQUAMARINE_BLOCK, ItemGroup.BUILDING_BLOCKS);
		newBlock("onyx_block", ONYX_BLOCK, ItemGroup.BUILDING_BLOCKS);
		newBlock("ruby_block", RUBY_BLOCK, ItemGroup.BUILDING_BLOCKS);
		newBlock("sapphire_block", SAPPHIRE_BLOCK, ItemGroup.BUILDING_BLOCKS);
		newBlock("topaz_block", TOPAZ_BLOCK, ItemGroup.BUILDING_BLOCKS);
		newBlock("tourmaline_block", TOURMALINE_BLOCK, ItemGroup.BUILDING_BLOCKS);

		newBlock("tentacle_block", TENTACLE_BLOCK, ItemGroup.BUILDING_BLOCKS);
		newBlock("chocolate_gravel", CHOCOLATE_GRAVEL, ItemGroup.BUILDING_BLOCKS);
		newBlock("peppermint_block", PEPPERMINT_BLOCK, ItemGroup.BUILDING_BLOCKS);
		newBlock("candy_cane_block", CANDY_CANE_BLOCK, ItemGroup.BUILDING_BLOCKS);
		newBlock("candy_cane_log", CANDY_CANE_LOG, ItemGroup.BUILDING_BLOCKS);
	}
}