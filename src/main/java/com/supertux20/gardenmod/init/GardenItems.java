package com.supertux20.gardenmod.init;

import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

import com.supertux20.gardenmod.GardenMod;
import com.supertux20.gardenmod.items.*;
import com.supertux20.gardenmod.items.food.*;

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
		GardenMod.sortItemIntoCreativeTab(itemName, item, group, sortItem, sortBefore);
	}

	public static final Item AMETHYST_CHIMES	= new AmethystChimes();
	
	public static final Item CINNAMON_ROLL		= new CinnamonRoll();
	public static final Item ROASTED_FLESH		= new RoastedFlesh();

	public static final Item RAW_MYTHRIL		= new Item(new QuiltItemSettings());
	public static final Item MYTHRIL_NUGGET		= new Item(new QuiltItemSettings());
	public static final Item MYTHRIL_INGOT		= new Item(new QuiltItemSettings());
	public static final Item RAW_ORICHALCUM		= new Item(new QuiltItemSettings());
	public static final Item ORICHALCUM_NUGGET	= new Item(new QuiltItemSettings());
	public static final Item ORICHALCUM_INGOT	= new Item(new QuiltItemSettings());
	public static final Item STONE_BRICK		= new Item(new QuiltItemSettings());

	public static final Item AMBER			= new Item(new QuiltItemSettings());
	public static final Item AMETHYST		= new Item(new QuiltItemSettings());
	public static final Item AQUAMARINE		= new Item(new QuiltItemSettings());
	public static final Item LAPIS_LAZULI	= new Item(new QuiltItemSettings());
	public static final Item MOONSTONE		= new Item(new QuiltItemSettings());
	public static final Item PERIDOT		= new Item(new QuiltItemSettings());
	public static final Item ONYX			= new Item(new QuiltItemSettings());
	public static final Item QUARTZ			= new Item(new QuiltItemSettings());
	public static final Item ROSE_QUARTZ	= new Item(new QuiltItemSettings());
	public static final Item RUBY			= new Item(new QuiltItemSettings());
	public static final Item SMOKY_QUARTZ	= new Item(new QuiltItemSettings());
	public static final Item TIGER_EYE		= new Item(new QuiltItemSettings());
	public static final Item TOPAZ			= new Item(new QuiltItemSettings());
	public static final Item TOURMALINE		= new Item(new QuiltItemSettings());

	public static final Item RAW_AMBER			= new Item(new QuiltItemSettings());
	public static final Item RAW_AQUAMARINE		= new Item(new QuiltItemSettings());
	public static final Item RAW_DIAMOND		= new Item(new QuiltItemSettings());
	public static final Item RAW_EMERALD		= new Item(new QuiltItemSettings());
	public static final Item RAW_MOONSTONE		= new Item(new QuiltItemSettings());
	public static final Item RAW_PERIDOT		= new Item(new QuiltItemSettings());
	public static final Item RAW_ONYX			= new Item(new QuiltItemSettings());
	public static final Item RAW_ROSE_QUARTZ	= new Item(new QuiltItemSettings());
	public static final Item RAW_RUBY			= new Item(new QuiltItemSettings());
	public static final Item RAW_SMOKY_QUARTZ	= new Item(new QuiltItemSettings());
	public static final Item RAW_TIGER_EYE		= new Item(new QuiltItemSettings());
	public static final Item RAW_TOPAZ			= new Item(new QuiltItemSettings());
	public static final Item RAW_TOURMALINE		= new Item(new QuiltItemSettings());

	// registers the items so they now exist in the registry
	public static void register() {
		newItem("amethyst_chimes",	AMETHYST_CHIMES,	ItemGroups.TOOLS_AND_UTILITIES, Items.GOAT_HORN);
		
		newItem("cinnamon_roll",	CINNAMON_ROLL,		ItemGroups.FOOD_AND_DRINKS, Items.PUMPKIN_PIE);
		newItem("roasted_flesh",	ROASTED_FLESH,		ItemGroups.FOOD_AND_DRINKS, Items.ROTTEN_FLESH);
		
		newItem("raw_mythril",			RAW_MYTHRIL,		ItemGroups.INGREDIENTS, Items.RAW_GOLD);
		newItem("mythril_nugget",		MYTHRIL_NUGGET,		ItemGroups.INGREDIENTS, Items.GOLD_NUGGET);
		newItem("mythril_ingot",		MYTHRIL_INGOT,		ItemGroups.INGREDIENTS, Items.GOLD_INGOT);
		newItem("raw_orichalcum",		RAW_ORICHALCUM,		ItemGroups.INGREDIENTS, RAW_MYTHRIL);
		newItem("orichalcum_nugget",	ORICHALCUM_NUGGET,	ItemGroups.INGREDIENTS, MYTHRIL_NUGGET);
		newItem("orichalcum_ingot",		ORICHALCUM_INGOT,	ItemGroups.INGREDIENTS, MYTHRIL_INGOT);
		newItem("stone_brick",			STONE_BRICK,		ItemGroups.INGREDIENTS, Items.BRICK, true);

		newItem("amber",		AMBER,			ItemGroups.INGREDIENTS, Items.DIAMOND, true);
		newItem("amethyst",		AMETHYST,		ItemGroups.INGREDIENTS, AMBER);
		newItem("aquamarine",	AQUAMARINE,		ItemGroups.INGREDIENTS, AMETHYST);
		newItem("lapis_lazuli",	LAPIS_LAZULI,	ItemGroups.INGREDIENTS, Items.EMERALD);
		newItem("moonstone",	MOONSTONE,		ItemGroups.INGREDIENTS, LAPIS_LAZULI);
		newItem("peridot",		PERIDOT,		ItemGroups.INGREDIENTS, MOONSTONE);
		newItem("onyx",			ONYX,			ItemGroups.INGREDIENTS, PERIDOT);
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
		newItem("raw_peridot",		RAW_PERIDOT,		ItemGroups.INGREDIENTS, RAW_MOONSTONE);
		newItem("raw_onyx",			RAW_ONYX,			ItemGroups.INGREDIENTS, RAW_PERIDOT);
		newItem("raw_rose_quartz",	RAW_ROSE_QUARTZ,	ItemGroups.INGREDIENTS, Items.QUARTZ);
		newItem("raw_ruby",			RAW_RUBY,			ItemGroups.INGREDIENTS, RAW_ROSE_QUARTZ);
		newItem("raw_smoky_quartz",	RAW_SMOKY_QUARTZ,	ItemGroups.INGREDIENTS, RAW_RUBY);
		newItem("raw_tiger_eye",	RAW_TIGER_EYE,		ItemGroups.INGREDIENTS, RAW_SMOKY_QUARTZ);
		newItem("raw_topaz",		RAW_TOPAZ,			ItemGroups.INGREDIENTS, RAW_TIGER_EYE);
		newItem("raw_tourmaline",	RAW_TOURMALINE,		ItemGroups.INGREDIENTS, RAW_TOPAZ);
	}
}