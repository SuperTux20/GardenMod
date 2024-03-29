package com.supertux20.gardenmod.blocks;

import org.quiltmc.qsl.block.extensions.api.QuiltBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.Direction.Axis;

public class LogBase extends Block {
	public LogBase(BlockSoundGroup sound) {
		super(QuiltBlockSettings.create().sounds(sound).strength(2F, 2F));
		setDefaultState(this.stateManager.getDefaultState().with(Properties.AXIS, Axis.Y));
	}
	
	public LogBase() {
		super(QuiltBlockSettings.create().sounds(BlockSoundGroup.WOOD).strength(2F, 2F));
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
