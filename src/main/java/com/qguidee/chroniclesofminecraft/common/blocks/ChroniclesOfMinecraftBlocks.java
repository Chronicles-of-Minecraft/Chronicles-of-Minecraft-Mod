package com.qguidee.chroniclesofminecraft.common.blocks;

import com.qguidee.chroniclesofminecraft.ChroniclesOfMinecraftCore;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = ChroniclesOfMinecraftCore.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(ChroniclesOfMinecraftCore.MOD_ID)
public class ChroniclesOfMinecraftBlocks {

    public static Block distiller;
    public static Block alembic;

    public static void init() {

        // Distillery
        distiller = new Distiller(Block.Properties.create(Material.IRON).hardnessAndResistance(5).harvestLevel(0).harvestTool(ToolType.PICKAXE)).setRegistryName(ChroniclesOfMinecraftCore.MOD_ID, "distiller");
        alembic = new Alembic(Block.Properties.create(Material.IRON).hardnessAndResistance(5).harvestLevel(0).harvestTool(ToolType.PICKAXE)).setRegistryName(ChroniclesOfMinecraftCore.MOD_ID, "alembic");

    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        init();

        event.getRegistry().registerAll(
                distiller, alembic
        );
    }

}
