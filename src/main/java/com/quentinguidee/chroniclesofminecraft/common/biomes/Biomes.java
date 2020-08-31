package com.quentinguidee.chroniclesofminecraft.common.biomes;

import com.quentinguidee.chroniclesofminecraft.ChroniclesOfMinecraft;

import net.minecraft.world.biome.Biome;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Biomes {
    public static final DeferredRegister<Biome> BIOMES = new DeferredRegister<>(ForgeRegistries.BIOMES,
            ChroniclesOfMinecraft.MODID);

    public static RegistryObject<Biome> VALLEY = BIOMES.register("valley", () -> new ValleyBiome());
    public static RegistryObject<Biome> ARID_DESERT = BIOMES.register("arid_desert", () -> new AridDesertBiome());
}
