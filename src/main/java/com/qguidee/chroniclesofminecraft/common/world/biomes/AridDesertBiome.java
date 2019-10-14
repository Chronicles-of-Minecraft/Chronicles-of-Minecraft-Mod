package com.qguidee.chroniclesofminecraft.common.world.biomes;

import com.qguidee.chroniclesofminecraft.common.world.BiomeFeatures;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.placement.FrequencyConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.surfacebuilders.ConfiguredSurfaceBuilder;

public class AridDesertBiome extends Biome {
    public AridDesertBiome() {
        super((new Biome.Builder())
                .surfaceBuilder(new ConfiguredSurfaceBuilder<>(BiomeFeatures.ARID_DESERT_SURFACE_BUILDER, BiomeFeatures.ARID_DESERT_SURFACE_BUILDER_CONFIG))
                .precipitation(RainType.NONE)
                .category(Category.NONE)
                .depth(0F)
                .scale(0F)
                .temperature(2F)
                .downfall(0F)
                .waterColor(4159204)
                .waterFogColor(329011)
                .parent((String) null));

        setRegistryName("biome_arid_desert");

        DefaultBiomeFeatures.addOres(this);

        this.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(Feature.REED, IFeatureConfig.NO_FEATURE_CONFIG, Placement.COUNT_HEIGHTMAP_DOUBLE, new FrequencyConfig(60)));
        this.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(Feature.CACTUS, IFeatureConfig.NO_FEATURE_CONFIG, Placement.COUNT_HEIGHTMAP_DOUBLE, new FrequencyConfig(10)));

        this.addSpawn(EntityClassification.CREATURE, new Biome.SpawnListEntry(EntityType.RABBIT, 4, 2, 3));
        this.addSpawn(EntityClassification.AMBIENT, new Biome.SpawnListEntry(EntityType.BAT, 10, 8, 8));
    }
}
