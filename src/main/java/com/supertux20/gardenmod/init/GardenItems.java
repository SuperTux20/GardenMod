package com.supertux20.gardenmod.init;

import com.supertux20.gardenmod.GardenMod;
import com.supertux20.gardenmod.items.Amber;
import com.supertux20.gardenmod.items.Amethyst;
import com.supertux20.gardenmod.items.Aquamarine;
import com.supertux20.gardenmod.items.RawAquamarine;
import com.supertux20.gardenmod.items.CinnamonRoll;
import com.supertux20.gardenmod.items.Malachite;
import com.supertux20.gardenmod.items.Moonstone;
import com.supertux20.gardenmod.items.RawDiamond;
import com.supertux20.gardenmod.items.RawEmerald;
import com.supertux20.gardenmod.items.RawMalachite;
import com.supertux20.gardenmod.items.RawMoonstone;
import com.supertux20.gardenmod.items.MythrilIngot;
import com.supertux20.gardenmod.items.MythrilNugget;
import com.supertux20.gardenmod.items.Onyx;
import com.supertux20.gardenmod.items.RawOnyx;
import com.supertux20.gardenmod.items.OrichalcumIngot;
import com.supertux20.gardenmod.items.OrichalcumNugget;
import com.supertux20.gardenmod.items.Quartz;
import com.supertux20.gardenmod.items.RawAmber;
import com.supertux20.gardenmod.items.RawMythril;
import com.supertux20.gardenmod.items.RawOrichalcum;
import com.supertux20.gardenmod.items.RawRosequartz;
import com.supertux20.gardenmod.items.Ruby;
import com.supertux20.gardenmod.items.RawRuby;
import com.supertux20.gardenmod.items.Sapphire;
import com.supertux20.gardenmod.items.Smokyquartz;
import com.supertux20.gardenmod.items.Tigereye;
import com.supertux20.gardenmod.items.RawSapphire;
import com.supertux20.gardenmod.items.RawSmokyquartz;
import com.supertux20.gardenmod.items.RawTigereye;
import com.supertux20.gardenmod.items.Topaz;
import com.supertux20.gardenmod.items.RawTopaz;
import com.supertux20.gardenmod.items.Tourmaline;
import com.supertux20.gardenmod.items.RawTourmaline;
import com.supertux20.gardenmod.items.Rosequartz;
import com.supertux20.gardenmod.items.AmethystChimes;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class GardenItems {
	public static final void newItem(String itemName, Item item) {
		Registry.register(Registry.ITEM, new Identifier(GardenMod.ID, itemName), item);
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
	public static final Item MALACHITE = new Malachite();
	public static final Item MOONSTONE = new Moonstone();
	public static final Item ONYX = new Onyx();
	public static final Item QUARTZ = new Quartz();
	public static final Item ROSEQUARTZ = new Rosequartz();
	public static final Item RUBY = new Ruby();
	public static final Item SAPPHIRE = new Sapphire();
	public static final Item SMOKYQUARTZ = new Smokyquartz();
	public static final Item TIGEREYE = new Tigereye();
	public static final Item TOPAZ = new Topaz();
	public static final Item TOURMALINE = new Tourmaline();

	public static final Item RAW_AMBER = new RawAmber();
	public static final Item RAW_AQUAMARINE = new RawAquamarine();
	public static final Item RAW_DIAMOND = new RawDiamond();
	public static final Item RAW_EMERALD = new RawEmerald();
	public static final Item RAW_MALACHITE = new RawMalachite();
	public static final Item RAW_MOONSTONE = new RawMoonstone();
	public static final Item RAW_ONYX = new RawOnyx();
	public static final Item RAW_ROSEQUARTZ = new RawRosequartz();
	public static final Item RAW_RUBY = new RawRuby();
	public static final Item RAW_SAPPHIRE = new RawSapphire();
	public static final Item RAW_SMOKYQUARTZ = new RawSmokyquartz();
	public static final Item RAW_TIGEREYE = new RawTigereye();
	public static final Item RAW_TOPAZ = new RawTopaz();
	public static final Item RAW_TOURMALINE = new RawTourmaline();

	// registers the items so they now exist in the registry
	public static void register() {
		newItem("amethyst_chimes", AMETHYST_CHIMES);
		newItem("cinnamon_roll", CINNAMON_ROLL);

		newItem("mythril_nugget", MYTHRIL_NUGGET);
		newItem("orichalcum_nugget", ORICHALCUM_NUGGET);

		newItem("mythril_ingot", MYTHRIL_INGOT);
		newItem("orichalcum_ingot", ORICHALCUM_INGOT);

		newItem("raw_mythril", RAW_MYTHRIL);
		newItem("raw_orichalcum", RAW_ORICHALCUM);

		newItem("amber", AMBER);
		newItem("amethyst", AMETHYST);
		newItem("aquamarine", AQUAMARINE);
		newItem("malachite", MALACHITE);
		newItem("moonstone", MOONSTONE);
		newItem("onyx", ONYX);
		newItem("quartz", QUARTZ);
		newItem("rosequartz", ROSEQUARTZ);
		newItem("ruby", RUBY);
		newItem("sapphire", SAPPHIRE);
		newItem("smokyquartz", SMOKYQUARTZ);
		newItem("tigereye", TIGEREYE);
		newItem("topaz", TOPAZ);
		newItem("tourmaline", TOURMALINE);

		newItem("raw_amber", RAW_AMBER);
		newItem("raw_aquamarine", RAW_AQUAMARINE);
		newItem("raw_diamond", RAW_DIAMOND);
		newItem("raw_emerald", RAW_EMERALD);
		newItem("raw_malachite", RAW_MALACHITE);
		newItem("raw_moonstone", RAW_MOONSTONE);
		newItem("raw_onyx", RAW_ONYX);
		newItem("raw_rosequartz", RAW_ROSEQUARTZ);
		newItem("raw_ruby", RAW_RUBY);
		newItem("raw_sapphire", RAW_SAPPHIRE);
		newItem("raw_smokyquartz", RAW_SMOKYQUARTZ);
		newItem("raw_tigereye", RAW_TIGEREYE);
		newItem("raw_topaz", RAW_TOPAZ);
		newItem("raw_tourmaline", RAW_TOURMALINE);
	}
}