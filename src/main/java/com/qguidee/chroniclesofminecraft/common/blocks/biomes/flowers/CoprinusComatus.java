package com.qguidee.chroniclesofminecraft.common.blocks.biomes.flowers;

import com.qguidee.chroniclesofminecraft.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.util.IItemProvider;

import javax.annotation.Nonnull;

public class CoprinusComatus extends FlowerBlockWithStages {

    private static final IntegerProperty AGE = IntegerProperty.create("age", 0, 5);

    public CoprinusComatus() {
        super(5);
    }

    @Nonnull
    @Override
    protected IItemProvider getSeedsItem() {
        return ModItems.flowerCoprinusComatus;
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
}
