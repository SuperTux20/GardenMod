package com.supertux20.gardenmod.init;

import com.supertux20.gardenmod.GardenMod;
import com.supertux20.gardenmod.items.AmethystChimes;
import com.supertux20.gardenmod.items.CinnamonRoll;
import com.supertux20.gardenmod.items.minerals.MythrilNugget;
import com.supertux20.gardenmod.items.minerals.OrichalcumNugget;
import com.supertux20.gardenmod.items.minerals.raw.RawAmber;
import com.supertux20.gardenmod.items.minerals.raw.RawAquamarine;
import com.supertux20.gardenmod.items.minerals.raw.RawDiamond;
import com.supertux20.gardenmod.items.minerals.raw.RawEmerald;
import com.supertux20.gardenmod.items.minerals.raw.RawMoonstone;
import com.supertux20.gardenmod.items.minerals.raw.RawMythril;
import com.supertux20.gardenmod.items.minerals.raw.RawOlivine;
import com.supertux20.gardenmod.items.minerals.raw.RawOnyx;
import com.supertux20.gardenmod.items.minerals.raw.RawOrichalcum;
import com.supertux20.gardenmod.items.minerals.raw.RawRoseQuartz;
import com.supertux20.gardenmod.items.minerals.raw.RawRuby;
import com.supertux20.gardenmod.items.minerals.raw.RawSmokyQuartz;
import com.supertux20.gardenmod.items.minerals.raw.RawTigerEye;
import com.supertux20.gardenmod.items.minerals.raw.RawTopaz;
import com.supertux20.gardenmod.items.minerals.raw.RawTourmaline;
import com.supertux20.gardenmod.items.minerals.refined.Amber;
import com.supertux20.gardenmod.items.minerals.refined.Amethyst;
import com.supertux20.gardenmod.items.minerals.refined.Aquamarine;
import com.supertux20.gardenmod.items.minerals.refined.LapisLazuli;
import com.supertux20.gardenmod.items.minerals.refined.Moonstone;
import com.supertux20.gardenmod.items.minerals.refined.MythrilIngot;
import com.supertux20.gardenmod.items.minerals.refined.Olivine;
import com.supertux20.gardenmod.items.minerals.refined.Onyx;
import com.supertux20.gardenmod.items.minerals.refined.OrichalcumIngot;
import com.supertux20.gardenmod.items.minerals.refined.Quartz;
import com.supertux20.gardenmod.items.minerals.refined.RoseQuartz;
import com.supertux20.gardenmod.items.minerals.refined.Ruby;
import com.supertux20.gardenmod.items.minerals.refined.SmokyQuartz;
import com.supertux20.gardenmod.items.minerals.refined.TigerEye;
import com.supertux20.gardenmod.items.minerals.refined.Topaz;
import com.supertux20.gardenmod.items.minerals.refined.Tourmaline;

import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class GardenItems {
	public static void newItem(String itemName, Item item, RegistryKey<ItemGroup> group, ItemConvertible sortItem, Object... sortBefore) {
		Registry.register(Registries.ITEM, new Identifier(GardenMod.ID, itemName), item);
		GardenMod.newItem(itemName, item, group, sortItem, sortBefore);
	}

	public static final Item AMETHYST_CHIMES = new AmethystChimes();
	public static final Item CINNAMON_ROLL = new CinnamonRoll();

	public static final Item RAW_MYTHRIL = new RawMythril();
	public static final Item MYTHRIL_NUGGET = new MythrilNugget();
	public static final Item MYTHRIL_INGOT = new MythrilIngot();
	public static final Item RAW_ORICHALCUM = new RawOrichalcum();
	public static final Item ORICHALCUM_NUGGET = new OrichalcumNugget();
	public static final Item ORICHALCUM_INGOT = new OrichalcumIngot();

	public static final Item AMBER = new Amber();
	public static final Item AMETHYST = new Amethyst();
	public static final Item AQUAMARINE = new Aquamarine();
	public static final Item LAPIS_LAZULI = new LapisLazuli();
	public static final Item MOONSTONE = new Moonstone();
	public static final Item OLIVINE = new Olivine();
	public static final Item ONYX = new Onyx();
	public static final Item QUARTZ = new Quartz();
	public static final Item ROSE_QUARTZ = new RoseQuartz();
	public static final Item RUBY = new Ruby();
	public static final Item SMOKY_QUARTZ = new SmokyQuartz();
	public static final Item TIGER_EYE = new TigerEye();
	public static final Item TOPAZ = new Topaz();
	public static final Item TOURMALINE = new Tourmaline();

	public static final Item RAW_AMBER = new RawAmber();
	public static final Item RAW_AQUAMARINE = new RawAquamarine();
	public static final Item RAW_DIAMOND = new RawDiamond();
	public static final Item RAW_EMERALD = new RawEmerald();
	public static final Item RAW_MOONSTONE = new RawMoonstone();
	public static final Item RAW_OLIVINE = new RawOlivine();
	public static final Item RAW_ONYX = new RawOnyx();
	public static final Item RAW_ROSE_QUARTZ = new RawRoseQuartz();
	public static final Item RAW_RUBY = new RawRuby();
	public static final Item RAW_SMOKY_QUARTZ = new RawSmokyQuartz();
	public static final Item RAW_TIGER_EYE = new RawTigerEye();
	public static final Item RAW_TOPAZ = new RawTopaz();
	public static final Item RAW_TOURMALINE = new RawTourmaline();

	// registers the items so they now exist in the registry
	public static void register() {
		newItem("amethyst_chimes",	AMETHYST_CHIMES,	ItemGroups.TOOLS_AND_UTILITIES, Items.GOAT_HORN);
		newItem("cinnamon_roll",	CINNAMON_ROLL,		ItemGroups.FOOD_AND_DRINKS, Items.SPIDER_EYE);
		
		newItem("raw_mythril",			RAW_MYTHRIL,		ItemGroups.INGREDIENTS, Items.RAW_GOLD);
		newItem("mythril_nugget",		MYTHRIL_NUGGET,		ItemGroups.INGREDIENTS, Items.GOLD_NUGGET);
		newItem("mythril_ingot",		MYTHRIL_INGOT,		ItemGroups.INGREDIENTS, Items.GOLD_INGOT);
		newItem("raw_orichalcum",		RAW_ORICHALCUM,		ItemGroups.INGREDIENTS, RAW_MYTHRIL);
		newItem("orichalcum_nugget",	ORICHALCUM_NUGGET,	ItemGroups.INGREDIENTS, MYTHRIL_NUGGET);
		newItem("orichalcum_ingot",		ORICHALCUM_INGOT,	ItemGroups.INGREDIENTS, MYTHRIL_INGOT);

		newItem("amber",		AMBER,			ItemGroups.INGREDIENTS, Items.DIAMOND, true);
		newItem("amethyst",		AMETHYST,		ItemGroups.INGREDIENTS, AMBER);
		newItem("aquamarine",	AQUAMARINE,		ItemGroups.INGREDIENTS, AMETHYST);
		newItem("lapis_lazuli",	LAPIS_LAZULI,	ItemGroups.INGREDIENTS, Items.EMERALD);
		newItem("moonstone",	MOONSTONE,		ItemGroups.INGREDIENTS, LAPIS_LAZULI);
		newItem("olivine",		OLIVINE,		ItemGroups.INGREDIENTS, MOONSTONE);
		newItem("onyx",			ONYX,			ItemGroups.INGREDIENTS, OLIVINE);
		newItem("quartz",		QUARTZ,			ItemGroups.INGREDIENTS, ONYX);
		newItem("rose_quartz",	ROSE_QUARTZ,	ItemGroups.INGREDIENTS, QUARTZ);
		newItem("ruby",			RUBY,			ItemGroups.INGREDIENTS, ROSE_QUARTZ);
		newItem("smoky_quartz",	SMOKY_QUARTZ,	ItemGroups.INGREDIENTS, RUBY);
		newItem("tiger_eye",	TIGER_EYE,		ItemGroups.INGREDIENTS, SMOKY_QUARTZ);
		newItem("topaz",		TOPAZ,			ItemGroups.INGREDIENTS, TIGER_EYE);
		newItem("tourmaline",	TOURMALINE,		ItemGroups.INGREDIENTS, TOPAZ);

		newItem("raw_amber",		RAW_AMBER,			ItemGroups.INGREDIENTS, Items.AMETHYST_SHARD, true);
		newItem("raw_aquamarine",	RAW_AQUAMARINE,		ItemGroups.INGREDIENTS, Items.AMETHYST_SHARD);
		newItem("raw_diamond",		RAW_DIAMOND,		ItemGroups.INGREDIENTS, RAW_AQUAMARINE);
		newItem("raw_emerald",		RAW_EMERALD,		ItemGroups.INGREDIENTS, RAW_DIAMOND);
		newItem("raw_moonstone",	RAW_MOONSTONE,		ItemGroups.INGREDIENTS, Items.LAPIS_LAZULI);
		newItem("raw_olivine",		RAW_OLIVINE,		ItemGroups.INGREDIENTS, RAW_MOONSTONE);
		newItem("raw_onyx",			RAW_ONYX,			ItemGroups.INGREDIENTS, RAW_OLIVINE);
		newItem("raw_rose_quartz",	RAW_ROSE_QUARTZ,	ItemGroups.INGREDIENTS, Items.QUARTZ);
		newItem("raw_ruby",			RAW_RUBY,			ItemGroups.INGREDIENTS, RAW_ROSE_QUARTZ);
		newItem("raw_smoky_quartz",	RAW_SMOKY_QUARTZ,	ItemGroups.INGREDIENTS, RAW_RUBY);
		newItem("raw_tiger_eye",	RAW_TIGER_EYE,		ItemGroups.INGREDIENTS, RAW_SMOKY_QUARTZ);
		newItem("raw_topaz",		RAW_TOPAZ,			ItemGroups.INGREDIENTS, RAW_TIGER_EYE);
		newItem("raw_tourmaline",	RAW_TOURMALINE,		ItemGroups.INGREDIENTS, RAW_TOPAZ);
	}
}