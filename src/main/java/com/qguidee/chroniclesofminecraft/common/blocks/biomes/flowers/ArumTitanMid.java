package com.qguidee.chroniclesofminecraft.common.blocks.biomes.flowers;

import com.qguidee.chroniclesofminecraft.ChroniclesOfMinecraftBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

import java.util.Random;

public class ArumTitanMid extends ArumTitanBottom {

    public ArumTitanMid(Properties builder) {
        super(builder);
    }

    public void grow(World worldIn, BlockPos pos, BlockState state) {
        // VOID
    }

    @Override
    public void tick(BlockState state, World worldIn, BlockPos pos, Random random) {
        // VOID
    }

    @Override
    protected boolean isValidGround(BlockState state, IBlockReader worldIn, BlockPos pos) {
        return state.getBlock() == ChroniclesOfMinecraftBlocks.flowerArumTitanBottom;
    }
}
