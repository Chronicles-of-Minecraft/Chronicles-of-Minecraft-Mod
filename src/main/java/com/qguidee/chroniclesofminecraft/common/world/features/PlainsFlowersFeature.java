package com.qguidee.chroniclesofminecraft.common.world.features;

import com.mojang.datafixers.Dynamic;
import com.qguidee.chroniclesofminecraft.ModBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.FlowersFeature;
import net.minecraft.world.gen.feature.NoFeatureConfig;

import javax.annotation.Nonnull;
import java.util.Random;
import java.util.function.Function;

public class PlainsFlowersFeature extends FlowersFeature {
    public PlainsFlowersFeature(Function<Dynamic<?>, ? extends NoFeatureConfig> p_i51465_1_) {
        super(p_i51465_1_);
    }

    @Nonnull
    public BlockState getRandomFlower(@Nonnull Random random, BlockPos pos) {
        double d0 = Biome.INFO_NOISE.getValue((double) pos.getX() / 200.0D, (double) pos.getZ() / 200.0D);
        if (d0 < -0.8D) {
            int j = random.nextInt(4);
            switch (j) {
                case 0:
                    return ModBlocks.flowerAloesCandela.getDefaultState();
                case 1:
                    return ModBlocks.flowerRosaRosea.getDefaultState();
                case 2:
                    return ModBlocks.flowerRosaRosea.getDefaultState();
                case 3:
                default:
                    return ModBlocks.flowerRosaRosea.getDefaultState();
            }
        } /*else if (random.nextInt(3) > 0) {
            int i = random.nextInt(4);
            switch (i) {
                case 0:
                    // return Blocks.POPPY.getDefaultState();
                case 1:
                    // return Blocks.AZURE_BLUET.getDefaultState();
                case 2:
                    // return Blocks.OXEYE_DAISY.getDefaultState();
                case 3:
                default:
                    // return Blocks.CORNFLOWER.getDefaultState();
            }
        }*/ else {
            return ModBlocks.flowerRosaRosea.getDefaultState();
        }
    }
}