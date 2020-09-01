package com.quentinguidee.chroniclesofminecraft.common.blocks.biomes.flowers;

import com.quentinguidee.chroniclesofminecraft.common.items.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer.Builder;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.IItemProvider;

public class AloesCandela extends GrowingFlower {
    private static final IntegerProperty age = BlockStateProperties.AGE_0_2;

    public AloesCandela() { super(2); }

    @Override
    protected IItemProvider getSeedsItem() {
        return ModItems.FLOWER_ALOES_CANDELA.get();
    }

    @Override
    public IntegerProperty getAgeProperty() {
        return age;
    }

    @Override
    protected void fillStateContainer(Builder<Block, BlockState> builder) {
        builder.add(age);
    }
}
