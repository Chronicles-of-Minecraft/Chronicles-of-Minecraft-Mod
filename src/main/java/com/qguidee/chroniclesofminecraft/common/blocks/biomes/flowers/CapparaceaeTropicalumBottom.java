package com.qguidee.chroniclesofminecraft.common.blocks.biomes.flowers;

import com.qguidee.chroniclesofminecraft.ModBlocks;
import com.qguidee.chroniclesofminecraft.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.annotation.Nonnull;
import java.util.Random;

public class CapparaceaeTropicalumBottom extends FlowerBlockWithStages {

    private static final int MAX_BOTTOM_AGE = 2;
    private static final IntegerProperty AGE = IntegerProperty.create("age", 0, 4);

    public CapparaceaeTropicalumBottom() {
        super(4);
    }

    @Nonnull
    @Override
    protected IItemProvider getSeedsItem() {
        return ModItems.flowerCapparaceaeTropicalum;
    }

    @Nonnull
    @Override
    public IntegerProperty getAgeProperty() {
        return AGE;
    }

    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(AGE);
    }

    public void grow(World worldIn, BlockPos pos, BlockState state) {
        int i = this.getAge(state) + this.getBonemealAgeIncrease(worldIn);
        int j = this.getMaxAge();

        int ageTop = i - MAX_BOTTOM_AGE;

        if (i > j) {
            i = j;
        } else if (ageTop > 0) {
            if (worldIn.getBlockState(pos.up()).getBlock() == Blocks.AIR) {
                worldIn.setBlockState(pos.up(), ModBlocks.flowerCapparaceaeTropicalumTop.getDefaultState());
            }
            if (worldIn.getBlockState(pos.up()).getBlock() == ModBlocks.flowerCapparaceaeTropicalumTop) {
                CapparaceaeTropicalumTop topBlock = (CapparaceaeTropicalumTop) worldIn.getBlockState(pos.up()).getBlock();
                worldIn.setBlockState(pos.up(), topBlock.withAge(i), 2);
                worldIn.setBlockState(pos, this.withAge(i), 2);
            }
        } else {
            worldIn.setBlockState(pos, this.withAge(i), 2);
        }
    }

    @Override
    public void tick(@Nonnull BlockState state, World worldIn, @Nonnull BlockPos pos, @Nonnull Random random) {
        super.tick(state, worldIn, pos, random);

        this.grow(worldIn, pos, state);
    }
}
