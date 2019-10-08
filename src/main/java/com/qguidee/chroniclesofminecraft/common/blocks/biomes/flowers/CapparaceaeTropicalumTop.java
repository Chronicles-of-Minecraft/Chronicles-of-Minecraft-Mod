package com.qguidee.chroniclesofminecraft.common.blocks.biomes.flowers;

import com.qguidee.chroniclesofminecraft.ChroniclesOfMinecraftBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

import javax.annotation.Nonnull;
import java.util.Random;

public class CapparaceaeTropicalumTop extends CapparaceaeTropicalumBottom {

    public CapparaceaeTropicalumTop() {
        super();
    }

    public void grow(World worldIn, BlockPos pos, BlockState state) {
        // VOID
    }

    @Override
    public void tick(@Nonnull BlockState state, World worldIn, @Nonnull BlockPos pos, @Nonnull Random random) {
        // VOID
    }

    @Override
    protected boolean isValidGround(BlockState state, IBlockReader worldIn, BlockPos pos) {
        return state.getBlock() == ChroniclesOfMinecraftBlocks.flowerCapparaceaeTropicalumBottom;
    }
}
