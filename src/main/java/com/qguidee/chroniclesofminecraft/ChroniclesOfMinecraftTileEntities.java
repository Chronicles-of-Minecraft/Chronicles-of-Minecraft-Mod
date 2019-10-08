package com.qguidee.chroniclesofminecraft;

import com.qguidee.chroniclesofminecraft.common.blocks.alchemy.alembic.AlembicTile;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = ChroniclesOfMinecraftCore.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(ChroniclesOfMinecraftCore.MOD_ID)
public class ChroniclesOfMinecraftTileEntities {

    public static TileEntityType<AlembicTile> alembicMk1;

    private static void init() {
        alembicMk1 = TileEntityType.Builder.create(AlembicTile::new, ChroniclesOfMinecraftBlocks.alembicMk1).build(null);
        alembicMk1.setRegistryName("alembic_mk1");
    }

    @SubscribeEvent
    public static void registerTileEntities(RegistryEvent.Register<TileEntityType<?>> event) {
        init();

        event.getRegistry().registerAll(
                alembicMk1
        );
    }
}
