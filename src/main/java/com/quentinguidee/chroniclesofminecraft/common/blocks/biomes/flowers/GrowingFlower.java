package com.quentinguidee.chroniclesofminecraft.common.blocks.biomes.flowers;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.CropsBlock;
import net.minecraft.block.material.Material;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer.Builder;
import net.minecraft.util.IItemProvider;
import net.minecraft.world.World;

public abstract class GrowingFlower extends CropsBlock {
    public final int MAX_AGE;

    public GrowingFlower(int maxAge) {
        super(Block.Properties.create(Material.PLANTS).hardnessAndResistance(0).tickRandomly().doesNotBlockMovement());
        this.MAX_AGE = maxAge;
    }

    @Override
    public abstract IntegerProperty getAgeProperty();

    @Override
    protected abstract IItemProvider getSeedsItem();

    @Override
    protected abstract void fillStateContainer(Builder<Block, BlockState> builder);

    @Override
    public int getMaxAge() {
        return MAX_AGE;
    }

    @Override
    protected int getBonemealAgeIncrease(World worldIn) {
        return 1;
    }
}
