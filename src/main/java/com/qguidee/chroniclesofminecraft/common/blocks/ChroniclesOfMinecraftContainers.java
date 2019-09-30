package com.qguidee.chroniclesofminecraft.common.blocks;

import com.qguidee.chroniclesofminecraft.ChroniclesOfMinecraftCore;
import com.qguidee.chroniclesofminecraft.common.blocks.alembic.AlembicContainer;
import com.qguidee.chroniclesofminecraft.common.blocks.alembic.AlembicTile;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.tileentity.TileEntityType;
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

    public static void init() {
        alembic = IForgeContainerType.create((windowId, inv, data) -> {
            BlockPos pos = data.readBlockPos();
            return new AlembicContainer(windowId, ChroniclesOfMinecraftCore.proxy.getClientWorld(), pos, inv, ChroniclesOfMinecraftCore.proxy.getClientPlayer());
        });
        alembic.setRegistryName("alembic");
    }

    @SubscribeEvent
    public static void registerContainers(RegistryEvent.Register<ContainerType<?>> event) {
        init();

        event.getRegistry().registerAll(
                alembic
        );
    }
}
