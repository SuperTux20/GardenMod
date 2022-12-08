package com.supertux20.gardenmod.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.Direction.Axis;

public class CandyCaneLog extends Block {
	public CandyCaneLog() {
		super(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE).strength(2F, 2F));
		setDefaultState(this.stateManager.getDefaultState().with(Properties.AXIS, Axis.Y));
	}

	@Override
	protected void appendProperties(StateManager.Builder<Block, BlockState> stateManager) {
		stateManager.add(Properties.AXIS);
	}

	@Override
	public BlockState getPlacementState(ItemPlacementContext ctx) {
		return this.getDefaultState().with(Properties.AXIS, ctx.getSide().getAxis());
	}
}
