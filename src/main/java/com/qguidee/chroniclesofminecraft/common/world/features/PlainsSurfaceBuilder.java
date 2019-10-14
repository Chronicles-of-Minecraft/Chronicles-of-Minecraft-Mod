package com.qguidee.chroniclesofminecraft.common.world.features;

import com.mojang.datafixers.Dynamic;
import com.qguidee.chroniclesofminecraft.common.world.BiomeFeatures;
import net.minecraft.block.BlockState;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.IChunk;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;

import java.util.Random;
import java.util.function.Function;

public class PlainsSurfaceBuilder extends SurfaceBuilder<SurfaceBuilderConfig> {

    public PlainsSurfaceBuilder(Function<Dynamic<?>, ? extends SurfaceBuilderConfig> p_i51305_1_) {
        super(p_i51305_1_);
    }

    @Override
    public void buildSurface(Random random, IChunk chunkIn, Biome biomeIn, int x, int z, int startHeight, double noise, BlockState defaultBlock, BlockState defaultFluid, int seaLevel, long seed, SurfaceBuilderConfig config) {
        SurfaceBuilder.DEFAULT.buildSurface(random, chunkIn, biomeIn, x, z, startHeight, noise, defaultBlock, defaultFluid, seaLevel, seed, BiomeFeatures.PLAINS_SURFACE_BUILDER_CONFIG);
    }
}
