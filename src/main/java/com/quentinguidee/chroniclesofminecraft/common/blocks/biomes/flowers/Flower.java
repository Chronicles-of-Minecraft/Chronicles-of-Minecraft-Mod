package com.quentinguidee.chroniclesofminecraft.common.blocks.biomes.flowers;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.FlowerBlock;
import net.minecraft.block.IGrowable;
import net.minecraft.block.material.Material;
import net.minecraft.potion.Effects;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

public class Flower extends FlowerBlock implements IGrowable {
    private int expansionChance;

    public Flower() {
        this(25);
    }

    public Flower(int expansionChance) {
        super(Effects.SPEED, 0, Block.Properties.create(Material.PLANTS).tickRandomly().hardnessAndResistance(0)
                .doesNotBlockMovement());

        this.expansionChance = expansionChance;
    }

    @Override
    public void tick(BlockState state, ServerWorld worldIn, BlockPos pos, Random rand) {
        if (rand.nextInt(expansionChance) == 0) {
            int maxNumberOfFlowers = 3;
            // int j = 4;

            // If there is too much flowers around, return;
            for (BlockPos blockPos : BlockPos.getAllInBoxMutable(pos.add(-4, -1, -4), pos.add(4, 1, 4))) {
                if (worldIn.getBlockState(blockPos).getBlock() == this) {
                    --maxNumberOfFlowers;
                    if (maxNumberOfFlowers <= 0) {
                        return;
                    }
                }
            }

            BlockPos blockPos = pos.add(generateCoordinate(rand), rand.nextInt(2) - rand.nextInt(2),
                    generateCoordinate(rand));

            for (int k = 0; k < 4; ++k) {
                if (worldIn.isAirBlock(blockPos) && state.isValidPosition(worldIn, blockPos)
                        && worldIn.canBlockSeeSky(blockPos)) {
                    pos = blockPos;
                }

                blockPos = pos.add(generateCoordinate(rand), rand.nextInt(2) - rand.nextInt(2),
                        generateCoordinate(rand));
            }

            if (worldIn.isAirBlock(blockPos) && state.isValidPosition(worldIn, blockPos)
                    && worldIn.canBlockSeeSky(blockPos)) {
                grow(worldIn, rand, blockPos, state);
            }
        }
    }

    // TODO: Move this method away.
    private int generateCoordinate(Random rand) {
        int x = 0;
        while (x == -1 || x == 0 || x == 1) {
            x = rand.nextInt(4) - rand.nextInt(4);
        }
        return x;
    }

    @Override
    public boolean isValidPosition(BlockState state, IWorldReader worldIn, BlockPos pos) {
        BlockPos blockpos = pos.down();
        BlockState blockstate = worldIn.getBlockState(blockpos);
        return blockstate.canSustainPlant(worldIn, blockpos, Direction.UP, this) ? true : false;
    }

    @Override
    public boolean canGrow(IBlockReader worldIn, BlockPos pos, BlockState state, boolean isClient) {
        return true;
    }

    @Override
    public boolean canUseBonemeal(World worldIn, Random rand, BlockPos pos, BlockState state) {
        return true;
    }

    @Override
    public void grow(ServerWorld worldIn, Random rand, BlockPos blockPos, BlockState state) {
        worldIn.setBlockState(blockPos, state, 2);
    }
}
