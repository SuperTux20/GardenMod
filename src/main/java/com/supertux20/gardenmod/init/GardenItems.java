package com.supertux20.gardenmod.init;

import com.supertux20.gardenmod.GardenMod;
import com.supertux20.gardenmod.items.Amber;
import com.supertux20.gardenmod.items.Amethyst;
import com.supertux20.gardenmod.items.AmethystChimes;
import com.supertux20.gardenmod.items.Aquamarine;
import com.supertux20.gardenmod.items.CinnamonRoll;
import com.supertux20.gardenmod.items.LapisLazuli;
import com.supertux20.gardenmod.items.Olivine;
import com.supertux20.gardenmod.items.Moonstone;
import com.supertux20.gardenmod.items.MythrilIngot;
import com.supertux20.gardenmod.items.MythrilNugget;
import com.supertux20.gardenmod.items.Onyx;
import com.supertux20.gardenmod.items.OrichalcumIngot;
import com.supertux20.gardenmod.items.OrichalcumNugget;
import com.supertux20.gardenmod.items.Quartz;
import com.supertux20.gardenmod.items.RawAmber;
import com.supertux20.gardenmod.items.RawAquamarine;
import com.supertux20.gardenmod.items.RawDiamond;
import com.supertux20.gardenmod.items.RawEmerald;
import com.supertux20.gardenmod.items.RawOlivine;
import com.supertux20.gardenmod.items.RawMoonstone;
import com.supertux20.gardenmod.items.RawMythril;
import com.supertux20.gardenmod.items.RawOnyx;
import com.supertux20.gardenmod.items.RawOrichalcum;
import com.supertux20.gardenmod.items.RawRoseQuartz;
import com.supertux20.gardenmod.items.RawRuby;
import com.supertux20.gardenmod.items.RawSmokyQuartz;
import com.supertux20.gardenmod.items.RawTigerEye;
import com.supertux20.gardenmod.items.RawTopaz;
import com.supertux20.gardenmod.items.RawTourmaline;
import com.supertux20.gardenmod.items.RoseQuartz;
import com.supertux20.gardenmod.items.Ruby;
import com.supertux20.gardenmod.items.SmokyQuartz;
import com.supertux20.gardenmod.items.TigerEye;
import com.supertux20.gardenmod.items.Topaz;
import com.supertux20.gardenmod.items.Tourmaline;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class GardenItems {
	public static final void newItem(String itemName, Item item, RegistryKey<ItemGroup> group) {
		Registry.register(Registries.ITEM, new Identifier(GardenMod.ID, itemName), item);
		ItemGroupEvents.modifyEntriesEvent(group).register(entries -> {entries.addItem(item);});
	}

	public static final Item AMETHYST_CHIMES = new AmethystChimes();
	public static final Item CINNAMON_ROLL = new CinnamonRoll();

	public static final Item MYTHRIL_INGOT = new MythrilIngot();
	public static final Item ORICHALCUM_INGOT = new OrichalcumIngot();

	public static final Item MYTHRIL_NUGGET = new MythrilNugget();
	public static final Item ORICHALCUM_NUGGET = new OrichalcumNugget();

	public static final Item RAW_MYTHRIL = new RawMythril();
	public static final Item RAW_ORICHALCUM = new RawOrichalcum();

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
		newItem("amethyst_chimes", AMETHYST_CHIMES, ItemGroups.TOOLS_AND_UTILITIES);
		newItem("cinnamon_roll", CINNAMON_ROLL, ItemGroups.FOOD_AND_DRINKS);

		newItem("mythril_nugget", MYTHRIL_NUGGET, ItemGroups.INGREDIENTS);
		newItem("orichalcum_nugget", ORICHALCUM_NUGGET, ItemGroups.INGREDIENTS);

		newItem("mythril_ingot", MYTHRIL_INGOT, ItemGroups.INGREDIENTS);
		newItem("orichalcum_ingot", ORICHALCUM_INGOT, ItemGroups.INGREDIENTS);

		newItem("raw_mythril", RAW_MYTHRIL, ItemGroups.INGREDIENTS);
		newItem("raw_orichalcum", RAW_ORICHALCUM, ItemGroups.INGREDIENTS);

		newItem("amber", AMBER, ItemGroups.INGREDIENTS);
		newItem("amethyst", AMETHYST, ItemGroups.INGREDIENTS);
		newItem("aquamarine", AQUAMARINE, ItemGroups.INGREDIENTS);
		newItem("lapis_lazuli", LAPIS_LAZULI, ItemGroups.INGREDIENTS);
		newItem("olivine", OLIVINE, ItemGroups.INGREDIENTS);
		newItem("moonstone", MOONSTONE, ItemGroups.INGREDIENTS);
		newItem("onyx", ONYX, ItemGroups.INGREDIENTS);
		newItem("quartz", QUARTZ, ItemGroups.INGREDIENTS);
		newItem("rose_quartz", ROSE_QUARTZ, ItemGroups.INGREDIENTS);
		newItem("ruby", RUBY, ItemGroups.INGREDIENTS);
		newItem("smoky_quartz", SMOKY_QUARTZ, ItemGroups.INGREDIENTS);
		newItem("tiger_eye", TIGER_EYE, ItemGroups.INGREDIENTS);
		newItem("topaz", TOPAZ, ItemGroups.INGREDIENTS);
		newItem("tourmaline", TOURMALINE, ItemGroups.INGREDIENTS);

		newItem("raw_amber", RAW_AMBER, ItemGroups.INGREDIENTS);
		newItem("raw_aquamarine", RAW_AQUAMARINE, ItemGroups.INGREDIENTS);
		newItem("raw_diamond", RAW_DIAMOND, ItemGroups.INGREDIENTS);
		newItem("raw_emerald", RAW_EMERALD, ItemGroups.INGREDIENTS);
		newItem("raw_olivine", RAW_OLIVINE, ItemGroups.INGREDIENTS);
		newItem("raw_moonstone", RAW_MOONSTONE, ItemGroups.INGREDIENTS);
		newItem("raw_onyx", RAW_ONYX, ItemGroups.INGREDIENTS);
		newItem("raw_rose_quartz", RAW_ROSE_QUARTZ, ItemGroups.INGREDIENTS);
		newItem("raw_ruby", RAW_RUBY, ItemGroups.INGREDIENTS);
		newItem("raw_smoky_quartz", RAW_SMOKY_QUARTZ, ItemGroups.INGREDIENTS);
		newItem("raw_tiger_eye", RAW_TIGER_EYE, ItemGroups.INGREDIENTS);
		newItem("raw_topaz", RAW_TOPAZ, ItemGroups.INGREDIENTS);
		newItem("raw_tourmaline", RAW_TOURMALINE, ItemGroups.INGREDIENTS);
	}
}