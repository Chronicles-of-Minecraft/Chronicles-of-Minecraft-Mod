package com.qguidee.chroniclesofminecraft;

import com.qguidee.chroniclesofminecraft.common.gui.container.AlembicContainer;
import com.qguidee.chroniclesofminecraft.common.items.alchemy.mortarpestle.MortarPestleContainer;
import com.qguidee.chroniclesofminecraft.common.items.alchemy.mortarpestle.MortarPillarContainerProvider;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.common.extensions.IForgeContainerType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = ChroniclesOfMinecraftCore.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(ChroniclesOfMinecraftCore.MOD_ID)
public class ChroniclesOfMinecraftContainers {

    public static ContainerType<AlembicContainer> alembic;

    public static MortarPestleContainer mortarPestleContainer;
    public static ContainerType<MortarPestleContainer> mortarPestle;

    private static void init() {
        alembic = IForgeContainerType.create((windowId, inv, data) -> {
            BlockPos pos = data.readBlockPos();
            return new AlembicContainer(windowId, ChroniclesOfMinecraftCore.proxy.getClientWorld(), pos, inv, ChroniclesOfMinecraftCore.proxy.getClientPlayer());
        });
        alembic.setRegistryName("alembic");

        mortarPestle = IForgeContainerType.create((windowId, inv, data) -> {
            MortarPillarContainerProvider containerProvider = new MortarPillarContainerProvider();
            return mortarPestleContainer = new MortarPestleContainer(windowId, inv);
        });
        mortarPestle.setRegistryName("mortar_pestle");
    }

    @SubscribeEvent
    public static void registerContainers(RegistryEvent.Register<ContainerType<?>> event) {
        init();

        event.getRegistry().registerAll(
                alembic, mortarPestle
        );
    }
}
