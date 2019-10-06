package com.qguidee.chroniclesofminecraft;

import com.qguidee.chroniclesofminecraft.common.blocks.alchemy.distiller.Distiller;
import com.qguidee.chroniclesofminecraft.common.blocks.alchemy.alembic.Alembic;
import com.qguidee.chroniclesofminecraft.common.blocks.biomes.flowers.*;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
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
    public static Block flowerCantharellusPlatyphyllus;

    public static Block flowerStrelitziaReginae;
    public static Block flowerBulbumAer;
    public static Block flowerCoprinusLumus;
    public static Block flowerCoprinusComatus;
    public static Block flowerArmillariaMellea;
    public static Block flowerBambusaGivra;

    public static Block flowerAloesCandela;
    public static Block flowerCapparaceaeTropicalumBottom;
    public static Block flowerCapparaceaeTropicalumTop;

    public static Block flowerArumTitanBottom;
    public static Block flowerArumTitanMid;
    public static Block flowerArumTitanTop;

    public static void init() {

        //*********//
        // Alchemy //
        //*********//

        distiller = new Distiller(Block.Properties.create(Material.IRON).hardnessAndResistance(5).harvestLevel(0).harvestTool(ToolType.PICKAXE)).setRegistryName(ChroniclesOfMinecraftCore.MOD_ID, "distiller");
        alembic = new Alembic(Block.Properties.create(Material.IRON).hardnessAndResistance(5).harvestLevel(0).harvestTool(ToolType.PICKAXE))/*.setRegistryName(ChroniclesOfMinecraftCore.MOD_ID, "alembic")*/;

        //********//
        // Biomes //
        //********//

        flowerRosaRosea = new FlowerBlockWithoutStage().setRegistryName(ChroniclesOfMinecraftCore.MOD_ID, "flower_rosa_rosea");
        flowerRosaAlba = new FlowerBlockWithoutStage().setRegistryName(ChroniclesOfMinecraftCore.MOD_ID, "flower_rosa_alba");
        flowerRosaHyacinus = new FlowerBlockWithoutStage().setRegistryName(ChroniclesOfMinecraftCore.MOD_ID, "flower_rosa_hyacinus");
        flowerLiliaceaeCandela = new FlowerBlockWithoutStage().setRegistryName(ChroniclesOfMinecraftCore.MOD_ID, "flower_liliaceae_candela");
        flowerCantharellusPlatyphyllus = new FlowerBlockWithoutStage().setRegistryName(ChroniclesOfMinecraftCore.MOD_ID, "flower_cantharellus_platyphyllus");

        flowerAloesCandela = new AloesCandela().setRegistryName(ChroniclesOfMinecraftCore.MOD_ID, "flower_aloes_candela");
        flowerCapparaceaeTropicalumBottom = new CapparaceaeTropicalumBottom(Block.Properties.create(Material.PLANTS).hardnessAndResistance(0).tickRandomly().doesNotBlockMovement()).setRegistryName(ChroniclesOfMinecraftCore.MOD_ID, "flower_capparaceae_tropicalum_bottom");
        flowerCapparaceaeTropicalumTop = new CapparaceaeTropicalumTop(Block.Properties.create(Material.PLANTS).hardnessAndResistance(0).tickRandomly().doesNotBlockMovement()).setRegistryName(ChroniclesOfMinecraftCore.MOD_ID, "flower_capparaceae_tropicalum_top");
        flowerStrelitziaReginae = new StrelitziaReginae().setRegistryName(ChroniclesOfMinecraftCore.MOD_ID, "flower_strelitzia_reginae");
        flowerBulbumAer = new BulbumAer().setRegistryName(ChroniclesOfMinecraftCore.MOD_ID, "flower_bulbum_aer");
        flowerCoprinusLumus = new CoprinusLumus().setRegistryName(ChroniclesOfMinecraftCore.MOD_ID, "flower_coprinus_lumus");
        flowerCoprinusComatus = new CoprinusComatus().setRegistryName(ChroniclesOfMinecraftCore.MOD_ID, "flower_coprinus_comatus");
        flowerArmillariaMellea = new ArmillariaMellea().setRegistryName(ChroniclesOfMinecraftCore.MOD_ID, "flower_armillaria_mellea");
        flowerBambusaGivra = new BambusaGivra().setRegistryName(ChroniclesOfMinecraftCore.MOD_ID, "flower_bambusa_givra");

        flowerArumTitanBottom = new ArumTitanBottom(Block.Properties.create(Material.PLANTS).hardnessAndResistance(0).tickRandomly().doesNotBlockMovement()).setRegistryName(ChroniclesOfMinecraftCore.MOD_ID, "flower_arum_titan_bottom");
        flowerArumTitanMid = new ArumTitanMid(Block.Properties.create(Material.PLANTS).hardnessAndResistance(0).tickRandomly().doesNotBlockMovement()).setRegistryName(ChroniclesOfMinecraftCore.MOD_ID, "flower_arum_titan_mid");
        flowerArumTitanTop = new ArumTitanTop(Block.Properties.create(Material.PLANTS).hardnessAndResistance(0).tickRandomly().doesNotBlockMovement()).setRegistryName(ChroniclesOfMinecraftCore.MOD_ID, "flower_arum_titan_top");
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        init();

        event.getRegistry().registerAll(

                //*********//
                // Alchemy //
                //*********//

                distiller,
                alembic,


                //********//
                // Biomes //
                //********//

                flowerAloesCandela,
                flowerRosaRosea,
                flowerRosaAlba,
                flowerRosaHyacinus,
                flowerLiliaceaeCandela,
                flowerCantharellusPlatyphyllus,

                flowerCapparaceaeTropicalumBottom,
                flowerCapparaceaeTropicalumTop,
                flowerStrelitziaReginae,
                flowerArumTitanBottom,
                flowerArumTitanMid,
                flowerArumTitanTop,
                flowerCoprinusComatus,
                flowerArmillariaMellea,
                flowerBambusaGivra,

                flowerBulbumAer,
                flowerCoprinusLumus
        );
    }
}
