package com.qguidee.chroniclesofminecraft.common.world.biomes;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;

public class PlainBiome extends Biome {
    public PlainBiome() {
        super((new Biome.Builder())
                .surfaceBuilder(SurfaceBuilder.NOPE, SurfaceBuilder.AIR_CONFIG)
                .precipitation(Biome.RainType.NONE)
                .category(Biome.Category.NONE)
                .depth(0.1F)
                .scale(0.2F)
                .temperature(300.5F)
                .downfall(0.0F)
                .waterColor(4159204)
                .waterFogColor(329011)
                .parent((String) null));

        setRegistryName("biome_plain");
    }
}
