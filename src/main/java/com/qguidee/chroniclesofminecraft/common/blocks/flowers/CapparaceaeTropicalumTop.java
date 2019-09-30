package com.qguidee.chroniclesofminecraft.common.blocks.flowers;

import com.qguidee.chroniclesofminecraft.common.blocks.ChroniclesOfMinecraftBlocks;
import com.qguidee.chroniclesofminecraft.common.items.ChroniclesOfMinecraftItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.CropsBlock;
import net.minecraft.block.IGrowable;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

import java.util.Random;

public class CapparaceaeTropicalumTop extends CapparaceaeTropicalumBottom {

    public CapparaceaeTropicalumTop(Properties builder) {
        super(builder);
    }

    public void grow(World worldIn, BlockPos pos, BlockState state)
    {
        /*int i = this.getAge(state) + this.getBonemealAgeIncrease(worldIn);
        int j = this.getMaxAge();

        if (i > j) {
            i = j;
        }

        worldIn.setBlockState(pos, this.withAge(i), 2);*/

        // VOID
    }

    @Override
    public void tick(BlockState state, World worldIn, BlockPos pos, Random random) {
        // VOID
    }

    @Override
    protected boolean isValidGround(BlockState state, IBlockReader worldIn, BlockPos pos) {
        return state.getBlock() == ChroniclesOfMinecraftBlocks.flowerCapparaceaeTropicalumBottom;
    }
}
