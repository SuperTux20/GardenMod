package net.gardenmod;

import net.fabricmc.api.ModInitializer;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.FoodComponent;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class GardenMod implements ModInitializer {
	public static final String MOD_NAME = "gardenmod";
	public static final Item WIND_CHIMES = new WindChimes(new Item.Settings().group(ItemGroup.MISC));
	public static final Item CINNAMON_ROLL = new CinnamonRoll(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(2).saturationModifier(6f).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,20*10), 1).alwaysEdible().build()));
	public static final Block TENTACLE_BLOCK = new TentacleBlock();
	public static final Block MYTHRIL_ORE = new MythrilOre();
	public static final Block ORICHALCUM_ORE = new OrichalcumOre();

	private void newItem(String itemName, Item item) {
		Registry.register(Registry.ITEM, new Identifier(MOD_NAME, itemName), item);
	}

	private void newBlock(String blockName, Block block, ItemGroup group) {
		Registry.register(Registry.ITEM, new Identifier(MOD_NAME, blockName), new BlockItem(block, new Item.Settings().group(group)));
		Registry.register(Registry.BLOCK, new Identifier(MOD_NAME, blockName), block);
	}

	@Override
	public void onInitialize() {
		newItem("wind_chimes", WIND_CHIMES);
		newItem("cinnamon_roll", CINNAMON_ROLL);
		newBlock("tentacle_block", TENTACLE_BLOCK, ItemGroup.DECORATIONS);
		newBlock("mythril_ore", MYTHRIL_ORE, ItemGroup.BUILDING_BLOCKS);
		newBlock("orichalcum_ore", ORICHALCUM_ORE, ItemGroup.BUILDING_BLOCKS);
	}
}
