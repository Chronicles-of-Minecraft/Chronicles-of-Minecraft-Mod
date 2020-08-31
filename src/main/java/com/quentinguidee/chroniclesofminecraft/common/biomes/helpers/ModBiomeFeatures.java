package com.quentinguidee.chroniclesofminecraft.common.biomes.helpers;

import com.google.common.collect.Lists;
import com.quentinguidee.chroniclesofminecraft.common.biomes.surfacebuilder.ValleySurfaceBuilder;
import com.quentinguidee.chroniclesofminecraft.common.blocks.ModBlocks;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.BlockBlobConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.SphereReplaceConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.FrequencyConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;

public class ModBiomeFeatures {
    private static final BlockState LIMESTONE = ModBlocks.LIMESTONE.get().getDefaultState();

    public static final SurfaceBuilder<SurfaceBuilderConfig> VALLEY_SURFACE_BUILDER = new ValleySurfaceBuilder(SurfaceBuilderConfig::deserialize);

    public static void addOres(Biome biomeIn) {
        DefaultBiomeFeatures.addOres(biomeIn);

        // OR
        biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, Blocks.GOLD_ORE.getDefaultState(), 9)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(2, 0, 0, 32))));

        // MYTHRIL

        // REDSTONE
        biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, Blocks.REDSTONE_ORE.getDefaultState(), 8)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(8, 0, 0, 16))));

        // FER
        biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, Blocks.IRON_ORE.getDefaultState(), 9)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(20, 0, 0, 64))));

        // ZINC

        // CUIVRE

        // SODIUM

        // CHARBON
        biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, Blocks.COAL_ORE.getDefaultState(), 17)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(20, 0, 0, 128))));

        // ETAIN
    }

    public static void addLimestone(Biome biomeIn) {
        biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.DISK.withConfiguration(new SphereReplaceConfig(LIMESTONE, 8, 2, Lists.newArrayList(new BlockState[]{Blocks.DIRT.getDefaultState(), Blocks.GRASS_BLOCK.getDefaultState()}))).withPlacement(Placement.COUNT_TOP_SOLID.configure(new FrequencyConfig(6))));
        biomeIn.addFeature(GenerationStage.Decoration.LOCAL_MODIFICATIONS, Feature.FOREST_ROCK.withConfiguration(new BlockBlobConfig(LIMESTONE, 0)).withPlacement(Placement.FOREST_ROCK.configure(new FrequencyConfig(2))));
    }

    // OR ET DIAMANT EN COMMUN A TOUTES LES REGIONS
}
