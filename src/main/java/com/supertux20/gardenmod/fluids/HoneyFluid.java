package com.supertux20.gardenmod.fluids;

import com.supertux20.gardenmod.init.GardenFluids;

import net.minecraft.block.BlockState;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.Item;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.Properties;
import net.minecraft.world.WorldView;

public abstract class HoneyFluid extends FluidBase {
	@Override
	public Fluid getStill() {
		return GardenFluids.STILL_HONEY;
	}

	@Override
	public Fluid getFlowing() {
		return GardenFluids.FLOWING_HONEY;
	}

	@Override
	public Item getBucketItem() {
		return GardenFluids.HONEY_BUCKET;
	}

	@Override
	protected BlockState toBlockState(FluidState fluidState) {
		return GardenFluids.HONEY.getDefaultState().with(Properties.LEVEL_15, getBlockStateLevel(fluidState));
	}

	@Override
	protected int getFlowSpeed(WorldView worldView) {
		return 1;
	}

	@Override
	protected int getLevelDecreasePerBlock(WorldView worldView) {
		return 2;
	}

	public static class Flowing extends HoneyFluid {
		@Override
		protected void appendProperties(StateManager.Builder<Fluid, FluidState> builder) {
			super.appendProperties(builder);
			builder.add(LEVEL);
		}

		@Override
		public int getLevel(FluidState fluidState) {
			return fluidState.get(LEVEL);
		}

		public boolean isStill(FluidState fluidState) {
			return false;
		}

		@Override
		public boolean isSource(FluidState state) {
			return false;
		}
	}

	public static class Still extends HoneyFluid {
		public int getLevel(FluidState fluidState) {
			return 8;
		}

		public boolean isStill(FluidState fluidState) {
			return true;
		}

		@Override
		public boolean isSource(FluidState state) {
			return true;
		}
	}
}
