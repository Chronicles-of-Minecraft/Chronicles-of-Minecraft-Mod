package com.quentinguidee.chroniclesofminecraft.common.biomes.layers;

import java.util.ArrayList;
import java.util.List;

import com.quentinguidee.chroniclesofminecraft.common.biomes.world.ModBiomeProvider;

import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.INoiseRandom;
import net.minecraft.world.gen.layer.traits.IAreaTransformer0;

public enum ModGenLayer implements IAreaTransformer0 {
    INSTANCE;

    @Override
    public int apply(INoiseRandom noiseRandom, int e, int f) {
        List<Biome> biomes = new ArrayList<Biome>();
        biomes.addAll(ModBiomeProvider.biomes);

        int r = noiseRandom.random(biomes.size());
        Biome biome = biomes.get(r);

        return Registry.BIOME.getId(biome);
    }
}