package com.quentinguidee.chroniclesofminecraft.common.biomes.world;

import com.google.common.collect.ImmutableSet;
import com.quentinguidee.chroniclesofminecraft.common.biomes.Biomes;
import com.quentinguidee.chroniclesofminecraft.common.biomes.layers.ModGenLayer;
import java.util.Set;
import java.util.function.LongFunction;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.provider.BiomeProvider;
import net.minecraft.world.biome.provider.OverworldBiomeProviderSettings;
import net.minecraft.world.gen.IExtendedNoiseRandom;
import net.minecraft.world.gen.LazyAreaLayerContext;
import net.minecraft.world.gen.OverworldGenSettings;
import net.minecraft.world.gen.area.IArea;
import net.minecraft.world.gen.area.IAreaFactory;
import net.minecraft.world.gen.area.LazyArea;
import net.minecraft.world.gen.layer.Layer;
import net.minecraft.world.gen.layer.SmoothLayer;
import net.minecraft.world.gen.layer.ZoomLayer;

public class ModBiomeProvider extends BiomeProvider {
    private final Layer layer;
    public static final Set<Biome> biomes = ImmutableSet.of(Biomes.VALLEY.get(), Biomes.ARID_DESERT.get());

    protected ModBiomeProvider(OverworldBiomeProviderSettings settingsProvider) {
        super(biomes);

        getBiomesToSpawnIn().clear();
        getBiomesToSpawnIn().addAll(biomes);

        this.layer = makeLayers(settingsProvider.func_226850_a_(), settingsProvider.func_226851_b_(), settingsProvider.getGeneratorSettings());
    }

    public static Layer makeLayers(long seed, WorldType worldType, OverworldGenSettings genSettings) {
        int i = 25;
        IAreaFactory<LazyArea> iareafactory = makeLayers(worldType, genSettings, (ctx) -> { return new LazyAreaLayerContext(i, seed, ctx); });
        return new Layer(iareafactory);
    }

    public static <T extends IArea, C extends IExtendedNoiseRandom<T>> IAreaFactory<T> makeLayers(WorldType worldType, OverworldGenSettings genSettings, LongFunction<C> lf) {

        // Create the map
        IAreaFactory<T> iAreaFactory = ModGenLayer.INSTANCE.apply(lf.apply(1L));

        // Unzoom
        iAreaFactory = ZoomLayer.NORMAL.apply(lf.apply(2000L), iAreaFactory);
        iAreaFactory = ZoomLayer.NORMAL.apply(lf.apply(2001L), iAreaFactory);
        iAreaFactory = ZoomLayer.NORMAL.apply(lf.apply(2002L), iAreaFactory);
        iAreaFactory = ZoomLayer.NORMAL.apply(lf.apply(2003L), iAreaFactory);

        iAreaFactory = SmoothLayer.INSTANCE.apply((IExtendedNoiseRandom)lf.apply(1000L), iAreaFactory);

        return iAreaFactory;
    }

    @Override
    public Biome getNoiseBiome(int x, int y, int z) {
        return layer.func_215738_a(x, z);
    }
}
