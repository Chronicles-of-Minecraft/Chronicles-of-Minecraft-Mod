package com.qguidee.chroniclesofminecraft;

import com.qguidee.chroniclesofminecraft.common.items.alchemy.AlchemicalBulbFluid;
import net.minecraft.client.renderer.model.ModelResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

import java.util.Objects;

@Mod.EventBusSubscriber(modid = ChroniclesOfMinecraftCore.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(ChroniclesOfMinecraftCore.MOD_ID)
public class ChroniclesOfMinecraftModels {

    @SubscribeEvent
    public static void registerContainers(ModelRegistryEvent event) {
        for (AlchemicalBulbFluid alchemicalBulbFluid : AlchemicalBulbFluid.values()) {
            ModelLoader.addSpecialModel(new ModelResourceLocation(Objects.requireNonNull(ChroniclesOfMinecraftItems.alchemicalBulb.getRegistryName()), "content=" + alchemicalBulbFluid.getKey()));
        }
    }
}
