package com.qguidee.chroniclesofminecraft.common.blocks.flowers;

import com.qguidee.chroniclesofminecraft.ChroniclesOfMinecraftBlocks;
import com.qguidee.chroniclesofminecraft.ChroniclesOfMinecraftItems;
import net.minecraft.block.*;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

import java.util.Random;

public class CapparaceaeTropicalumBottom extends CropsBlock implements IGrowable {

    public static final int MAX_BOTTOM_AGE = 2;
    public static final IntegerProperty AGE = IntegerProperty.create("age", 0, 4);

    public CapparaceaeTropicalumBottom(Properties builder) {
        super(builder);
    }

    @Override
    public int getMaxAge() {
        return 4;
    }

    @Override
    public IntegerProperty getAgeProperty() {
        return AGE;
    }

    @Override
    protected int getBonemealAgeIncrease(World worldIn) {
        return 1;
    }

    @Override
    protected IItemProvider getSeedsItem() {
        return ChroniclesOfMinecraftItems.flowerCapparaceaeTropicalum;
    }

    @Override
    public boolean canGrow(IBlockReader worldIn, BlockPos pos, BlockState state, boolean isClient) {
        return true;
    }

    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(AGE);
    }

    public void grow(World worldIn, BlockPos pos, BlockState state)
    {
        int i = this.getAge(state) + this.getBonemealAgeIncrease(worldIn);
        int j = this.getMaxAge();

        int ageTop = i - MAX_BOTTOM_AGE;

        if (i > j) {
            i = j;
        } else if (ageTop > 0) {
            if (worldIn.getBlockState(pos.up()).getBlock() == Blocks.AIR) {
                worldIn.setBlockState(pos.up(), ChroniclesOfMinecraftBlocks.flowerCapparaceaeTropicalumTop.getDefaultState());
            }
            if (worldIn.getBlockState(pos.up()).getBlock() == ChroniclesOfMinecraftBlocks.flowerCapparaceaeTropicalumTop) {
                // BlockState topBlockState = worldIn.getBlockState(pos.up());
                CapparaceaeTropicalumTop topBlock = (CapparaceaeTropicalumTop) worldIn.getBlockState(pos.up()).getBlock();
                worldIn.setBlockState(pos.up(), topBlock.withAge(i), 2);
                worldIn.setBlockState(pos, this.withAge(i), 2);
            }
        } else {
            worldIn.setBlockState(pos, this.withAge(i), 2);
        }

    }

    @Override
    public void tick(BlockState state, World worldIn, BlockPos pos, Random random) {
        super.tick(state, worldIn, pos, random);

        this.grow(worldIn, pos, state);
    }
}
