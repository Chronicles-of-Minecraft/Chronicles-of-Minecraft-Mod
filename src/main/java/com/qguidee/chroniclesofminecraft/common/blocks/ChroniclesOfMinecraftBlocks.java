package com.qguidee.chroniclesofminecraft.common.blocks;

import com.qguidee.chroniclesofminecraft.ChroniclesOfMinecraftCore;
import com.qguidee.chroniclesofminecraft.common.blocks.flowers.*;
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

    // Flowers
    public static Block flowerRosaRosea;
    public static Block flowerRosaAlba;
    public static Block flowerRosaHyacinus;
    public static Block flowerLiliaceaeCandela;
    public static Block flowerStrelitziaReginae;

    public static Block flowerAloesCandela;
    public static Block flowerCapparaceaeTropicalumBottom;
    public static Block flowerCapparaceaeTropicalumTop;

    public static Block flowerArumTitanBottom;
    public static Block flowerArumTitanMid;
    public static Block flowerArumTitanTop;

    public static void init() {

        // Distillery
        distiller = new Distiller(Block.Properties.create(Material.IRON).hardnessAndResistance(5).harvestLevel(0).harvestTool(ToolType.PICKAXE)).setRegistryName(ChroniclesOfMinecraftCore.MOD_ID, "distiller");
        alembic = new Alembic(Block.Properties.create(Material.IRON).hardnessAndResistance(5).harvestLevel(0).harvestTool(ToolType.PICKAXE))/*.setRegistryName(ChroniclesOfMinecraftCore.MOD_ID, "alembic")*/;

        // Flowers
        flowerRosaRosea = new FlowerBlockWithoutStage(Block.Properties.create(Material.PLANTS).hardnessAndResistance(1).harvestLevel(0).harvestTool(ToolType.SHOVEL)).setRegistryName(ChroniclesOfMinecraftCore.MOD_ID, "flower_rosa_rosea");
        flowerRosaAlba = new FlowerBlockWithoutStage(Block.Properties.create(Material.PLANTS).hardnessAndResistance(1).harvestLevel(0).harvestTool(ToolType.SHOVEL)).setRegistryName(ChroniclesOfMinecraftCore.MOD_ID, "flower_rosa_alba");
        flowerRosaHyacinus = new FlowerBlockWithoutStage(Block.Properties.create(Material.PLANTS).hardnessAndResistance(1).harvestLevel(0).harvestTool(ToolType.SHOVEL)).setRegistryName(ChroniclesOfMinecraftCore.MOD_ID, "flower_rosa_hyacinus");
        flowerLiliaceaeCandela = new FlowerBlockWithoutStage(Block.Properties.create(Material.PLANTS).hardnessAndResistance(1).harvestLevel(0).harvestTool(ToolType.SHOVEL)).setRegistryName(ChroniclesOfMinecraftCore.MOD_ID, "flower_liliaceae_candela");

        flowerAloesCandela = new AloesCandela(Block.Properties.create(Material.PLANTS).hardnessAndResistance(1).harvestLevel(0).tickRandomly()).setRegistryName(ChroniclesOfMinecraftCore.MOD_ID, "flower_aloes_candela");
        flowerCapparaceaeTropicalumBottom = new CapparaceaeTropicalumBottom(Block.Properties.create(Material.PLANTS).hardnessAndResistance(1).harvestLevel(0).tickRandomly()).setRegistryName(ChroniclesOfMinecraftCore.MOD_ID, "flower_capparaceae_tropicalum_bottom");
        flowerCapparaceaeTropicalumTop = new CapparaceaeTropicalumTop(Block.Properties.create(Material.PLANTS).hardnessAndResistance(1).harvestLevel(0).tickRandomly()).setRegistryName(ChroniclesOfMinecraftCore.MOD_ID, "flower_capparaceae_tropicalum_top");
        flowerStrelitziaReginae = new StrelitziaReginae(Block.Properties.create(Material.PLANTS).hardnessAndResistance(1).harvestLevel(0).tickRandomly()).setRegistryName(ChroniclesOfMinecraftCore.MOD_ID, "flower_strelitzia_reginae");

        flowerArumTitanBottom = new ArumTitanBottom(Block.Properties.create(Material.PLANTS).hardnessAndResistance(1).harvestLevel(0).tickRandomly()).setRegistryName(ChroniclesOfMinecraftCore.MOD_ID, "flower_arum_titan_bottom");
        flowerArumTitanMid = new ArumTitanMid(Block.Properties.create(Material.PLANTS).hardnessAndResistance(1).harvestLevel(0).tickRandomly()).setRegistryName(ChroniclesOfMinecraftCore.MOD_ID, "flower_arum_titan_mid");
        flowerArumTitanTop = new ArumTitanTop(Block.Properties.create(Material.PLANTS).hardnessAndResistance(1).harvestLevel(0).tickRandomly()).setRegistryName(ChroniclesOfMinecraftCore.MOD_ID, "flower_arum_titan_top");
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        init();

        event.getRegistry().registerAll(
                distiller, alembic,

                flowerRosaRosea, flowerRosaAlba, flowerRosaHyacinus, flowerLiliaceaeCandela,

                flowerAloesCandela, flowerCapparaceaeTropicalumBottom, flowerCapparaceaeTropicalumTop, flowerStrelitziaReginae, flowerArumTitanBottom, flowerArumTitanMid, flowerArumTitanTop
        );
    }
}
