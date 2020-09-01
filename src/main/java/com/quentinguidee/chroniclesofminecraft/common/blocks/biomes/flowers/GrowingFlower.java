package com.quentinguidee.chroniclesofminecraft.common.blocks.biomes.flowers;

import com.quentinguidee.chroniclesofminecraft.common.blocks.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.CropsBlock;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer.Builder;
import net.minecraft.util.IItemProvider;
import net.minecraft.world.World;

public abstract class GrowingFlower extends CropsBlock {
    public final int MAX_AGE;

    public GrowingFlower(int maxAge) { this(ModBlocks.DEFAULT_FLOWER_PROPERTIES, maxAge); }

    public GrowingFlower(Block.Properties properties, int maxAge) {
        super(properties);
        this.MAX_AGE = maxAge;
    }

    @Override public abstract IntegerProperty getAgeProperty();

    @Override protected abstract IItemProvider getSeedsItem();

    @Override protected abstract void fillStateContainer(Builder<Block, BlockState> builder);

    @Override
    public int getMaxAge() {
        return MAX_AGE;
    }

    @Override
    protected int getBonemealAgeIncrease(World worldIn) {
        return 1;
    }
}
