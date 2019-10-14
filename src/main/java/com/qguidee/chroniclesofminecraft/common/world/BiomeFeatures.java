package com.qguidee.chroniclesofminecraft.common.world;

import com.qguidee.chroniclesofminecraft.common.world.features.AridDesertSurfaceBuilder;
import com.qguidee.chroniclesofminecraft.common.world.features.PlainsFlowersFeature;
import com.qguidee.chroniclesofminecraft.common.world.features.PlainsSurfaceBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.world.gen.feature.FlowersFeature;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;

public class BiomeFeatures {
    public static final FlowersFeature PLAINS_FLOWERS = new PlainsFlowersFeature(NoFeatureConfig::deserialize);

    public static final SurfaceBuilder<SurfaceBuilderConfig> PLAINS_SURFACE_BUILDER = new PlainsSurfaceBuilder(SurfaceBuilderConfig::deserialize);
    public static final SurfaceBuilder<SurfaceBuilderConfig> ARID_DESERT_SURFACE_BUILDER = new AridDesertSurfaceBuilder(SurfaceBuilderConfig::deserialize);

    public static final SurfaceBuilderConfig PLAINS_SURFACE_BUILDER_CONFIG = new SurfaceBuilderConfig(Blocks.GRASS_BLOCK.getDefaultState(), Blocks.DIRT.getDefaultState(), Blocks.GRAVEL.getDefaultState());
    public static final SurfaceBuilderConfig ARID_DESERT_SURFACE_BUILDER_CONFIG = new SurfaceBuilderConfig(Blocks.SAND.getDefaultState(), Blocks.SAND.getDefaultState(), Blocks.GRAVEL.getDefaultState());
}
