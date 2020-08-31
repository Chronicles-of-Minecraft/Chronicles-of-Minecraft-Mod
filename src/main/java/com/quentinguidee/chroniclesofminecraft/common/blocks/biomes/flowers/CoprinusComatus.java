package com.quentinguidee.chroniclesofminecraft.common.blocks.biomes.flowers;

import com.quentinguidee.chroniclesofminecraft.common.items.ModItems;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer.Builder;
import net.minecraft.util.IItemProvider;

public class CoprinusComatus extends GrowingFlower {
    private static IntegerProperty age = IntegerProperty.create("age", 0, 5);

    public CoprinusComatus() {
        super(5);
    }

    @Override
    public IntegerProperty getAgeProperty() {
        return age;
    }

    @Override
    protected IItemProvider getSeedsItem() {
        return ModItems.FLOWER_COPRINUS_COMATUS.get();
    }

    @Override
    protected void fillStateContainer(Builder<Block, BlockState> builder) {
        builder.add(age);
    }
}