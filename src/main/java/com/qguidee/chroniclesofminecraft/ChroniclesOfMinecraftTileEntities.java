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

    public static TileEntityType<AlembicTile> alembic;

    private static void init() {
        alembic = TileEntityType.Builder.create(AlembicTile::new, ChroniclesOfMinecraftBlocks.alembic).build(null);
        alembic.setRegistryName("alembic");
    }

    @SubscribeEvent
    public static void registerTileEntities(RegistryEvent.Register<TileEntityType<?>> event) {
        init();

        event.getRegistry().registerAll(
                alembic
        );
    }
}
