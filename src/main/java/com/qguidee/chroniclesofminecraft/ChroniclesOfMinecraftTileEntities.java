package com.qguidee.chroniclesofminecraft;

import com.qguidee.chroniclesofminecraft.common.gui.tileentity.AlembicTileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = ChroniclesOfMinecraftCore.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(ChroniclesOfMinecraftCore.MOD_ID)
public class ChroniclesOfMinecraftTileEntities {

    public static TileEntityType<AlembicTileEntity> alembicMk1;
    public static TileEntityType<AlembicTileEntity> alembicMk2;
    public static TileEntityType<AlembicTileEntity> alembicMk3;

    private static void init() {
        alembicMk1 = TileEntityType.Builder.create(AlembicTileEntity::new, ChroniclesOfMinecraftBlocks.alembicMk1).build(null);
        alembicMk1.setRegistryName(ChroniclesOfMinecraftCore.MOD_ID, "alembic_mk1");
        alembicMk2 = TileEntityType.Builder.create(AlembicTileEntity::new, ChroniclesOfMinecraftBlocks.alembicMk2).build(null);
        alembicMk2.setRegistryName(ChroniclesOfMinecraftCore.MOD_ID, "alembic_mk2");
        alembicMk3 = TileEntityType.Builder.create(AlembicTileEntity::new, ChroniclesOfMinecraftBlocks.alembicMk3).build(null);
        alembicMk3.setRegistryName(ChroniclesOfMinecraftCore.MOD_ID, "alembic_mk3");
    }

    @SubscribeEvent
    public static void registerTileEntities(RegistryEvent.Register<TileEntityType<?>> event) {
        init();

        event.getRegistry().registerAll(
                alembicMk1,
                alembicMk2,
                alembicMk3
        );
    }
}
