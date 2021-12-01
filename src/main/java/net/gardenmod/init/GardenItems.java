package net.gardenmod.init;

import net.gardenmod.GardenMod;
import net.gardenmod.WindChimes;
import net.gardenmod.HoneyBucket;
import net.gardenmod.CinnamonRoll;
import net.gardenmod.MythrilIngot;
import net.gardenmod.OrichalcumIngot;
import net.gardenmod.Amethyst;
import net.gardenmod.Aquamarine;
import net.gardenmod.Diamond;
import net.gardenmod.Emerald;
import net.gardenmod.Onyx;
import net.gardenmod.Quartz;
import net.gardenmod.Ruby;
import net.gardenmod.Sapphire;
import net.gardenmod.Topaz;
import net.gardenmod.Tourmaline;
import net.gardenmod.AquamarineShard;
import net.gardenmod.OnyxShard;
import net.gardenmod.RubyShard;
import net.gardenmod.SapphireShard;
import net.gardenmod.TopazShard;
import net.gardenmod.TourmalineShard;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class GardenItems {
	public static final void newItem(String itemName, Item item) { Registry.register(Registry.ITEM, new Identifier(GardenMod.MOD_ID, itemName), item); }

	public static final Item WIND_CHIMES   = new WindChimes();
	public static final Item CINNAMON_ROLL = new CinnamonRoll();

	public static final Item MYTHRIL_INGOT    = new MythrilIngot();
	public static final Item ORICHALCUM_INGOT = new OrichalcumIngot();

	public static final Item AMETHYST   = new Amethyst();
	public static final Item AQUAMARINE = new Aquamarine();
	public static final Item DIAMOND    = new Diamond();
	public static final Item EMERALD    = new Emerald();
	public static final Item ONYX       = new Onyx();
	public static final Item QUARTZ     = new Quartz();
	public static final Item RUBY       = new Ruby();
	public static final Item SAPPHIRE   = new Sapphire();
	public static final Item TOPAZ      = new Topaz();
	public static final Item TOURMALINE = new Tourmaline();

	public static final Item AQUAMARINE_SHARD = new AquamarineShard();
	public static final Item ONYX_SHARD       = new OnyxShard();
	public static final Item RUBY_SHARD       = new RubyShard();
	public static final Item SAPPHIRE_SHARD   = new SapphireShard();
	public static final Item TOPAZ_SHARD      = new TopazShard();
	public static final Item TOURMALINE_SHARD = new TourmalineShard();

	// registers the items so they now exist in the registry
	public static void register() {
		newItem("wind_chimes",   WIND_CHIMES  );
		newItem("cinnamon_roll", CINNAMON_ROLL);

		newItem("mythril_ingot",    MYTHRIL_INGOT   );
		newItem("orichalcum_ingot", ORICHALCUM_INGOT);

		newItem("amethyst",   AMETHYST  );
		newItem("aquamarine", AQUAMARINE);
		newItem("diamond",    DIAMOND   );
		newItem("emerald",    EMERALD   );
		newItem("onyx",       ONYX      );
		newItem("quartz",     QUARTZ    );
		newItem("ruby",       RUBY      );
		newItem("sapphire",   SAPPHIRE  );
		newItem("topaz",      TOPAZ     );
		newItem("tourmaline", TOURMALINE);

		newItem("aquamarine_shard", AQUAMARINE_SHARD);
		newItem("onyx_shard",       ONYX_SHARD      );
		newItem("ruby_shard",       RUBY_SHARD      );
		newItem("sapphire_shard",   SAPPHIRE_SHARD  );
		newItem("topaz_shard",      TOPAZ_SHARD     );
		newItem("tourmaline_shard", TOURMALINE_SHARD);
	}
}