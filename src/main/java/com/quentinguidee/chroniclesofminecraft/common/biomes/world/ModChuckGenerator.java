package com.quentinguidee.chroniclesofminecraft.common.biomes.world;

import net.minecraft.world.IWorld;
import net.minecraft.world.biome.provider.BiomeProvider;
import net.minecraft.world.gen.OverworldChunkGenerator;

public class ModChuckGenerator extends OverworldChunkGenerator {
    public ModChuckGenerator(IWorld worldIn, BiomeProvider provider, ModGenSettings settings) {
        super(worldIn, provider, settings);
    }
}
