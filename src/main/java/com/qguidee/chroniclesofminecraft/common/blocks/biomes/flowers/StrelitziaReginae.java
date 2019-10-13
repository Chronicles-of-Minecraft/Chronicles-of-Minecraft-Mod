package com.qguidee.chroniclesofminecraft.common.blocks.biomes.flowers;

import com.qguidee.chroniclesofminecraft.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.IItemProvider;

import javax.annotation.Nonnull;

public class StrelitziaReginae extends FlowerBlockWithStages {

    public static final IntegerProperty AGE = BlockStateProperties.AGE_0_2;

    public StrelitziaReginae() {
        super(2);
    }

    @Nonnull
    @Override
    protected IItemProvider getSeedsItem() {
        return ModItems.flowerStrelitziaReginae;
    }

    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(AGE);
    }

    @Nonnull
    @Override
    public IntegerProperty getAgeProperty() {
        return AGE;
    }
}
