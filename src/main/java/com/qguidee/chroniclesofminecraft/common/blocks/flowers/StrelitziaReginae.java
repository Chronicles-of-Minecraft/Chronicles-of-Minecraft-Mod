package com.qguidee.chroniclesofminecraft.common.blocks.flowers;

import com.qguidee.chroniclesofminecraft.common.items.ChroniclesOfMinecraftItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.CropsBlock;
import net.minecraft.block.IGrowable;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

public class StrelitziaReginae extends CropsBlock implements IGrowable {

    public static final IntegerProperty AGE = BlockStateProperties.AGE_0_2;

    public StrelitziaReginae(Properties builder) {
        super(builder);
    }

    @Override
    public int getMaxAge() {
        return 2;
    }

    @Override
    protected int getBonemealAgeIncrease(World worldIn) {
        return 1;
    }

    @Override
    protected IItemProvider getSeedsItem() {
        return ChroniclesOfMinecraftItems.flowerStrelitziaReginae;
    }

    @Override
    public boolean canGrow(IBlockReader worldIn, BlockPos pos, BlockState state, boolean isClient) {
        return true;
    }

    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(AGE);
    }

    @Override
    public IntegerProperty getAgeProperty() {
        return AGE;
    }

}
