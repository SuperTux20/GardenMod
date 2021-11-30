package net.gardenmod;

import net.fabricmc.api.ModInitializer;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class GardenMod implements ModInitializer {
	public static final String MOD_ID = "gardenmod";

	private void newItem(String itemName, Item item) { Registry.register(Registry.ITEM, new Identifier(MOD_ID, itemName), item); }

	private void newBlock(String blockName, Block block, ItemGroup group) {
		Registry.register(Registry.ITEM,  new Identifier(MOD_ID, blockName), new BlockItem(block, new Item.Settings().group(group)));
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, blockName), block);
	}

	public static final Item    WIND_CHIMES          = new WindChimes();
	public static final Item    CINNAMON_ROLL        = new CinnamonRoll();
	public static final Item    MYTHRIL_INGOT        = new MythrilIngot();
	public static final Item    ORICHALCUM_INGOT     = new OrichalcumIngot();
	public static final Item    AMETHYST             = new Amethyst();
	public static final Item    AQUAMARINE           = new Aquamarine();
	public static final Item    DIAMOND              = new Diamond();
	public static final Item    EMERALD              = new Emerald();
	public static final Item    ONYX                 = new Onyx();
	public static final Item    QUARTZ               = new Quartz();
	public static final Item    RUBY                 = new Ruby();
	public static final Item    SAPPHIRE             = new Sapphire();
	public static final Item    TOPAZ                = new Topaz();
	public static final Item    TOURMALINE           = new Tourmaline();
	public static final Item    AQUAMARINE_SHARD     = new AquamarineShard();
	public static final Item    ONYX_SHARD           = new OnyxShard();
	public static final Item    RUBY_SHARD           = new RubyShard();
	public static final Item    SAPPHIRE_SHARD       = new SapphireShard();
	public static final Item    TOPAZ_SHARD          = new TopazShard();
	public static final Item    TOURMALINE_SHARD     = new TourmalineShard();
	public static final Block   TENTACLE_BLOCK       = new TentacleBlock();
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
	public static final Block   CHOCOLATE_GRAVEL     = new ChocolateGravel();
	public static final Block   PEPPERMINT_BLOCK     = new PeppermintBlock();
	public static final Block   CANDY_CANE_BLOCK     = new CandyCaneBlock();
	public static final Block   CANDY_CANE_LOG       = new CandyCaneLog();


	@Override
	public void onInitialize() {
		newItem( "wind_chimes",          WIND_CHIMES                                    );
		newItem( "cinnamon_roll",        CINNAMON_ROLL                                  );
		newItem( "mythril_ingot",        MYTHRIL_INGOT                                  );
		newItem( "orichalcum_ingot",     ORICHALCUM_INGOT                               );
		newItem( "amethyst",             AMETHYST                                       );
		newItem( "aquamarine",           AQUAMARINE                                     );
		newItem( "diamond",              DIAMOND                                        );
		newItem( "emerald",              EMERALD                                        );
		newItem( "onyx",                 ONYX                                           );
		newItem( "quartz",               QUARTZ                                         );
		newItem( "ruby",                 RUBY                                           );
		newItem( "sapphire",             SAPPHIRE                                       );
		newItem( "topaz",                TOPAZ                                          );
		newItem( "tourmaline",           TOURMALINE                                     );
		newItem( "aquamarine_shard",     AQUAMARINE_SHARD                               );
		newItem( "onyx_shard",           ONYX_SHARD                                     );
		newItem( "ruby_shard",           RUBY_SHARD                                     );
		newItem( "sapphire_shard",       SAPPHIRE_SHARD                                 );
		newItem( "topaz_shard",          TOPAZ_SHARD                                    );
		newItem( "tourmaline_shard",     TOURMALINE_SHARD                               );
		newBlock("tentacle_block",       TENTACLE_BLOCK,       ItemGroup.BUILDING_BLOCKS);
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
		newBlock("chocolate_gravel",     CHOCOLATE_GRAVEL,     ItemGroup.BUILDING_BLOCKS);
		newBlock("peppermint_block",     PEPPERMINT_BLOCK,     ItemGroup.BUILDING_BLOCKS);
		newBlock("candy_cane_block",     CANDY_CANE_BLOCK,     ItemGroup.BUILDING_BLOCKS);
		newBlock("candy_cane_log",       CANDY_CANE_LOG,       ItemGroup.BUILDING_BLOCKS);
	}
}
