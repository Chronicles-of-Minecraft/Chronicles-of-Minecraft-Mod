package com.quentinguidee.chroniclesofminecraft.common.biomes.world;

import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.provider.OverworldBiomeProviderSettings;
import net.minecraft.world.gen.ChunkGenerator;

public class NormalWorldType extends WorldType {
    public NormalWorldType() { super("chroniclesworld"); }

    @Override
    public ChunkGenerator<?> createChunkGenerator(World world) {
        ModGenSettings settings = new ModGenSettings();
        OverworldBiomeProviderSettings overworldBiomeProviderSettings = new OverworldBiomeProviderSettings(world.getWorldInfo());
        overworldBiomeProviderSettings.setGeneratorSettings(settings);

        ModBiomeProvider biomeProvider = new ModBiomeProvider(overworldBiomeProviderSettings);

        return new ModChuckGenerator(world, biomeProvider, settings);
    }
}
