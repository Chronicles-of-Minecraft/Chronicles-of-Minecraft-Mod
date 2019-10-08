package com.qguidee.chroniclesofminecraft.common.blocks.biomes.flowers;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.CropsBlock;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

import javax.annotation.Nonnull;

public abstract class FlowerBlockWithStages extends CropsBlock {

    private int maxAge;
    private Item seed;

    FlowerBlockWithStages(int maxAge, Item seed) {
        super(Block.Properties
                .create(Material.PLANTS)
                .hardnessAndResistance(0)
                .tickRandomly()
                .doesNotBlockMovement()
        );

        this.maxAge = maxAge;
        this.seed = seed;
    }

    @Override
    public int getMaxAge() {
        return maxAge;
    }

    @Override
    protected int getBonemealAgeIncrease(World worldIn) {
        return 1;
    }

    @Nonnull
    @Override
    protected IItemProvider getSeedsItem() {
        return seed;
    }

    @Override
    public boolean canGrow(IBlockReader worldIn, BlockPos pos, BlockState state, boolean isClient) {
        return true;
    }

    @Nonnull
    @Override
    public abstract IntegerProperty getAgeProperty();

    @Override
    protected abstract void fillStateContainer(StateContainer.Builder<Block, BlockState> builder);
}
