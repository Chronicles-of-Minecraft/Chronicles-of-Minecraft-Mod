package com.qguidee.chroniclesofminecraft.common.blocks.biomes.flowers;

import com.qguidee.chroniclesofminecraft.ChroniclesOfMinecraftItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;

import javax.annotation.Nonnull;

public class AloesCandela extends FlowerBlockWithStages {

    public static final IntegerProperty AGE = BlockStateProperties.AGE_0_2;

    public AloesCandela() {
        super(2, ChroniclesOfMinecraftItems.flowerAloesCandela);
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
