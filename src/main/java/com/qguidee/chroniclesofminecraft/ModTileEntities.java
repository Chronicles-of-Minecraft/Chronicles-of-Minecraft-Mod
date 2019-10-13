package com.qguidee.chroniclesofminecraft;

import com.qguidee.chroniclesofminecraft.common.gui.tileentity.AlembicTileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = ModCore.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(ModCore.MOD_ID)
public class ModTileEntities {

    public static TileEntityType<AlembicTileEntity> alembicMk1;
    public static TileEntityType<AlembicTileEntity> alembicMk2;
    public static TileEntityType<AlembicTileEntity> alembicMk3;

    private static void init() {
        alembicMk1 = TileEntityType.Builder.create(AlembicTileEntity::new, ModBlocks.alembicMk1).build(null);
        alembicMk1.setRegistryName(ModCore.MOD_ID, "alembic_mk1");
        alembicMk2 = TileEntityType.Builder.create(AlembicTileEntity::new, ModBlocks.alembicMk2).build(null);
        alembicMk2.setRegistryName(ModCore.MOD_ID, "alembic_mk2");
        alembicMk3 = TileEntityType.Builder.create(AlembicTileEntity::new, ModBlocks.alembicMk3).build(null);
        alembicMk3.setRegistryName(ModCore.MOD_ID, "alembic_mk3");
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
