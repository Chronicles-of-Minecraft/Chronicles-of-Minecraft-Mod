package com.qguidee.chroniclesofminecraft;

import com.qguidee.chroniclesofminecraft.common.blocks.alchemy.AlembicTier;
import com.qguidee.chroniclesofminecraft.common.gui.container.AlembicContainer;
import com.qguidee.chroniclesofminecraft.common.gui.container.MortarPestleContainer;
import com.qguidee.chroniclesofminecraft.common.gui.containerproviders.MortarPillarContainerProvider;
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

    public static ContainerType<AlembicContainer> alembicMk1;
    public static ContainerType<AlembicContainer> alembicMk2;
    public static ContainerType<AlembicContainer> alembicMk3;

    public static MortarPestleContainer mortarPestleContainer;
    public static ContainerType<MortarPestleContainer> mortarPestle;

    private static void init() {
        alembicMk1 = IForgeContainerType.create((windowId, inv, data) -> {
            BlockPos pos = data.readBlockPos();
            return new AlembicContainer(windowId, ChroniclesOfMinecraftCore.proxy.getClientWorld(), pos, inv, ChroniclesOfMinecraftCore.proxy.getClientPlayer(), AlembicTier.ALEMBIC_MK1);
        });
        alembicMk1.setRegistryName("alembic_mk1");

        alembicMk2 = IForgeContainerType.create((windowId, inv, data) -> {
            BlockPos pos = data.readBlockPos();
            return new AlembicContainer(windowId, ChroniclesOfMinecraftCore.proxy.getClientWorld(), pos, inv, ChroniclesOfMinecraftCore.proxy.getClientPlayer(), AlembicTier.ALEMBIC_MK2);
        });
        alembicMk2.setRegistryName("alembic_mk2");

        alembicMk3 = IForgeContainerType.create((windowId, inv, data) -> {
            BlockPos pos = data.readBlockPos();
            return new AlembicContainer(windowId, ChroniclesOfMinecraftCore.proxy.getClientWorld(), pos, inv, ChroniclesOfMinecraftCore.proxy.getClientPlayer(), AlembicTier.ALEMBIC_MK3);
        });
        alembicMk3.setRegistryName("alembic_mk3");

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
                alembicMk1,
                alembicMk2,
                alembicMk3,
                mortarPestle
        );
    }
}
