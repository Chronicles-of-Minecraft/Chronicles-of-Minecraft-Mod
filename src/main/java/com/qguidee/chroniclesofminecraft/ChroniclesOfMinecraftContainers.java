package com.qguidee.chroniclesofminecraft;

import com.qguidee.chroniclesofminecraft.ChroniclesOfMinecraftCore;
import com.qguidee.chroniclesofminecraft.common.blocks.alembic.AlembicContainer;
import com.qguidee.chroniclesofminecraft.common.blocks.alembic.AlembicTile;
import com.qguidee.chroniclesofminecraft.common.items.mortarpestle.MortarPestle;
import com.qguidee.chroniclesofminecraft.common.items.mortarpestle.MortarPestleContainer;
import com.qguidee.chroniclesofminecraft.common.items.mortarpestle.MortarPillarContainerProvider;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.common.extensions.IForgeContainerType;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.ItemStackHandler;
import net.minecraftforge.registries.ObjectHolder;

import javax.swing.plaf.basic.BasicComboBoxUI;

@Mod.EventBusSubscriber(modid = ChroniclesOfMinecraftCore.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(ChroniclesOfMinecraftCore.MOD_ID)
public class ChroniclesOfMinecraftContainers {

    public static ContainerType<AlembicContainer> alembic;

    public static MortarPestleContainer mortarPestleContainer;
    public static ContainerType<MortarPestleContainer> mortarPestle;

    public static void init() {
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
