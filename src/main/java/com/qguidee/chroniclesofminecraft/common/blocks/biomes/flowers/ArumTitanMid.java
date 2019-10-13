package com.qguidee.chroniclesofminecraft.common.blocks.biomes.flowers;

import com.qguidee.chroniclesofminecraft.ModBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.Random;

public class ArumTitanMid extends ArumTitanBottom {

    public ArumTitanMid() {
        super();
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
        return state.getBlock() == ModBlocks.flowerArumTitanBottom;
    }

    @Override
    protected int getBonemealAgeIncrease(World worldIn) {
        return 0;
    }

    @Override
    public boolean canUseBonemeal(World worldIn, Random rand, BlockPos pos, BlockState state) {
        ((ArumTitanBottom) worldIn.getBlockState(pos.down()).getBlock()).grow(worldIn, worldIn.rand, pos.down(), worldIn.getBlockState(pos.down()));

        return true;
    }

    @Override
    public void harvestBlock(@Nonnull World worldIn, PlayerEntity player, @Nonnull BlockPos pos, BlockState state, @Nullable TileEntity te, @Nonnull ItemStack stack) {
        super.harvestBlock(worldIn, player, pos, state, te, stack);

        worldIn.setBlockState(pos.down(), Blocks.AIR.getDefaultState());

        //TODO: This works only in Survival
    }
}
