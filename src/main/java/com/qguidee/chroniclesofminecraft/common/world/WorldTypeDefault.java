package com.qguidee.chroniclesofminecraft.common.world;

import com.qguidee.chroniclesofminecraft.ModBiomes;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.provider.SingleBiomeProvider;
import net.minecraft.world.biome.provider.SingleBiomeProviderSettings;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.OverworldChunkGenerator;
import net.minecraft.world.gen.OverworldGenSettings;

public class WorldTypeDefault extends WorldType {
    public WorldTypeDefault() {
        super("chronicles");
    }

    @Override
    public ChunkGenerator<?> createChunkGenerator(World world) {
        OverworldGenSettings settings = new OverworldGenSettings();
        SingleBiomeProviderSettings singleBiomeProviderSettings = new SingleBiomeProviderSettings();

        for (Biome biome : ModBiomes.biomes) {
            singleBiomeProviderSettings.setBiome(biome);
        }

        return new OverworldChunkGenerator(world, new SingleBiomeProvider(singleBiomeProviderSettings), settings);
    }
}
