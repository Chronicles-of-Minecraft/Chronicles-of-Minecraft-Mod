package com.quentinguidee.chroniclesofminecraft.common.biomes;

import com.quentinguidee.chroniclesofminecraft.common.biomes.helpers.BlockClusterBuilder;
import com.quentinguidee.chroniclesofminecraft.common.biomes.helpers.ModBiomeFeatures;
import com.quentinguidee.chroniclesofminecraft.common.blocks.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.placement.ChanceConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.surfacebuilders.ConfiguredSurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;

public class ValleyBiome extends Biome {
    public static final SurfaceBuilderConfig SURFACE_BUILDER_CONFIG = new SurfaceBuilderConfig(Blocks.GRASS_BLOCK.getDefaultState(), Blocks.DIRT.getDefaultState(), Blocks.STONE.getDefaultState());
    public static final SurfaceBuilderConfig SURFACE_BUILDER_CONFIG_LIMESTONE = new SurfaceBuilderConfig(ModBlocks.LIMESTONE.get().getDefaultState(), Blocks.DIRT.getDefaultState(), Blocks.SAND.getDefaultState());
    public static final SurfaceBuilderConfig SURFACE_BUILDER_CONFIG_STONE = new SurfaceBuilderConfig(Blocks.STONE.getDefaultState(), Blocks.DIRT.getDefaultState(), Blocks.SAND.getDefaultState());
    public static final SurfaceBuilderConfig SURFACE_BUILDER_CONFIG_GRAVEL = new SurfaceBuilderConfig(Blocks.GRAVEL.getDefaultState(), Blocks.DIRT.getDefaultState(), Blocks.SAND.getDefaultState());

    protected ValleyBiome() {
        super((new Biome.Builder()).surfaceBuilder(new ConfiguredSurfaceBuilder<>(ModBiomeFeatures.VALLEY_SURFACE_BUILDER, SURFACE_BUILDER_CONFIG)).precipitation(RainType.RAIN).category(Category.NONE).depth(0F).scale(0F).temperature(0.8F).downfall(0.4F).waterColor(4159204).waterFogColor(329011).parent((String)null));

        ModBiomeFeatures.addOres(this);
        ModBiomeFeatures.addLimestone(this);
        DefaultBiomeFeatures.addGrass(this);

        this.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.FLOWER.withConfiguration(BlockClusterBuilder.build(ModBlocks.FLOWER_ROSA_ROSEA)).withPlacement(Placement.CHANCE_HEIGHTMAP_DOUBLE.configure(new ChanceConfig(10))));
        this.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.FLOWER.withConfiguration(BlockClusterBuilder.build(ModBlocks.FLOWER_CENTAUREA_MONTANA)).withPlacement(Placement.CHANCE_HEIGHTMAP_DOUBLE.configure(new ChanceConfig(4))));

        this.addSpawn(EntityClassification.CREATURE, new Biome.SpawnListEntry(EntityType.SHEEP, 12, 4, 4));
        this.addSpawn(EntityClassification.CREATURE, new Biome.SpawnListEntry(EntityType.PIG, 10, 4, 4));
        this.addSpawn(EntityClassification.CREATURE, new Biome.SpawnListEntry(EntityType.CHICKEN, 10, 4, 4));
        this.addSpawn(EntityClassification.CREATURE, new Biome.SpawnListEntry(EntityType.COW, 8, 4, 4));
        this.addSpawn(EntityClassification.CREATURE, new Biome.SpawnListEntry(EntityType.HORSE, 5, 2, 6));
        this.addSpawn(EntityClassification.CREATURE, new Biome.SpawnListEntry(EntityType.DONKEY, 1, 1, 3));
        this.addSpawn(EntityClassification.AMBIENT, new Biome.SpawnListEntry(EntityType.BAT, 10, 8, 8));
    }
}
