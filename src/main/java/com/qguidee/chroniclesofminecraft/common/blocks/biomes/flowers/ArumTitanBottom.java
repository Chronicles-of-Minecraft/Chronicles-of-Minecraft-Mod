package com.qguidee.chroniclesofminecraft.common.blocks.biomes.flowers;

import com.qguidee.chroniclesofminecraft.ChroniclesOfMinecraftBlocks;
import com.qguidee.chroniclesofminecraft.ChroniclesOfMinecraftItems;
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

public class ArumTitanBottom extends FlowerBlockWithStages {

    private static final int MAX_BOT_AGE = 3;
    private static final int MAX_MID_AGE = 5;
    private static final IntegerProperty AGE = IntegerProperty.create("age", 0, 6);

    public ArumTitanBottom() {
        super(6);
    }

    @Nonnull
    @Override
    protected IItemProvider getSeedsItem() {
        return ChroniclesOfMinecraftItems.flowerArumTitan;
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

        int ageMid = i - MAX_BOT_AGE;
        int ageTop = i - MAX_MID_AGE;

        if (i > j) {
            i = j;
        } else if (ageMid > 0) {
            if (worldIn.getBlockState(pos.up()).getBlock() == Blocks.AIR) {
                worldIn.setBlockState(pos.up(), ChroniclesOfMinecraftBlocks.flowerArumTitanMid.getDefaultState());
            }
            if (worldIn.getBlockState(pos.up()).getBlock() == ChroniclesOfMinecraftBlocks.flowerArumTitanMid) {
                ArumTitanMid topBlock = (ArumTitanMid) worldIn.getBlockState(pos.up()).getBlock();
                worldIn.setBlockState(pos.up(), topBlock.withAge(i), 2);
            }

            if (ageTop > 0) {
                if (worldIn.getBlockState(pos.up(2)).getBlock() == Blocks.AIR) {
                    worldIn.setBlockState(pos.up(2), ChroniclesOfMinecraftBlocks.flowerArumTitanTop.getDefaultState());
                }
                if (worldIn.getBlockState(pos.up(2)).getBlock() == ChroniclesOfMinecraftBlocks.flowerArumTitanTop) {
                    ArumTitanTop topBlock = (ArumTitanTop) worldIn.getBlockState(pos.up(2)).getBlock();
                    worldIn.setBlockState(pos.up(2), topBlock.withAge(i), 2);
                }
            }

            worldIn.setBlockState(pos, this.withAge(i), 2);
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
