package com.qguidee.chroniclesofminecraft;

import com.qguidee.chroniclesofminecraft.common.world.WorldTypeDefault;
import com.qguidee.chroniclesofminecraft.common.world.biomes.AridDesertBiome;
import com.qguidee.chroniclesofminecraft.common.world.biomes.PlainsBiome;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

import java.util.ArrayList;
import java.util.List;

@Mod.EventBusSubscriber(modid = ModCore.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(ModCore.MOD_ID)
public class ModBiomes {

    public static List<Biome> biomes = new ArrayList<>();

    private static WorldTypeDefault worldType;

    public static Biome plainsBiome = new PlainsBiome();
    public static Biome aridDesertBiome = new AridDesertBiome();

    static void setup() {
        worldType = new WorldTypeDefault();
    }

    private static void init() {
        biomes.add(plainsBiome);
        biomes.add(aridDesertBiome);
    }

    @SubscribeEvent
    public static void registerBiomes(RegistryEvent.Register<Biome> event) {
        init();

        for (Biome biome : biomes) {
            event.getRegistry().register(biome);
        }
    }
}
