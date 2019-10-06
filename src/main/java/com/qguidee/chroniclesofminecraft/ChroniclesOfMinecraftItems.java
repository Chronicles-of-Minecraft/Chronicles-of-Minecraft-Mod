package com.qguidee.chroniclesofminecraft;

import com.qguidee.chroniclesofminecraft.common.items.alchemy.AlchemicalBulb;
import com.qguidee.chroniclesofminecraft.common.items.alchemy.Sickle;
import com.qguidee.chroniclesofminecraft.common.items.alchemy.mortarpestle.MortarPestle;
import com.qguidee.chroniclesofminecraft.common.items.fight.armors.alchemium.AlchemiumArmorBoots;
import com.qguidee.chroniclesofminecraft.common.items.fight.armors.alchemium.AlchemiumArmorChestplate;
import com.qguidee.chroniclesofminecraft.common.items.fight.armors.alchemium.AlchemiumArmorHelmet;
import com.qguidee.chroniclesofminecraft.common.items.fight.armors.alchemium.AlchemiumArmorLeggings;
import com.qguidee.chroniclesofminecraft.common.others.ItemTierCustom;
import net.minecraft.item.*;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = ChroniclesOfMinecraftCore.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(ChroniclesOfMinecraftCore.MOD_ID)
public class ChroniclesOfMinecraftItems {

    public static Item fireWand;
    public static Item waterWand;
    public static Item earthWand;
    public static Item airWand;

    public static Item sickleIron;
    public static Item sickleGold;
    public static Item sickleAlchemium;

    public static Item mortarPestleStone;
    public static Item mortarPestleGold;
    public static Item mortarPestleAlchemium;

    public static Item ingotAlchemium;

    public static Item distiller;
    public static Item alembic;

    public static Item alchemicalBulbEmpty;

    public static Item flowerRosaRosea;
    public static Item flowerRosaAlba;
    public static Item flowerRosaHyacinus;
    public static Item flowerLiliaceaeCandela;
    public static Item flowerCantharellusPlatyphyllus;

    public static Item flowerAloesCandela;
    public static Item flowerBulbumAer;
    public static Item flowerCapparaceaeTropicalum;
    public static Item flowerStrelitziaReginae;
    public static Item flowerArumTitan;
    public static Item flowerCoprinusLumus;
    public static Item flowerCoprinusComatus;
    public static Item flowerArmillariaMellea;
    public static Item flowerBambusaGivra;

    // Petals
    public static Item flowerRosaRoseaPetals;
    public static Item flowerRosaAlbaPetals;
    public static Item flowerRosaHyacinusPetals;
    public static Item flowerAloesCandelaFruit;
    public static Item flowerBambusaGivraThorns;

    public static Item alchemiumChestplate;
    public static Item alchemiumHelmet;
    public static Item alchemiumBoots;
    public static Item alchemiumLeggings;

    public static void init() {

        //*********//
        // Alchemy //
        //*********//

        fireWand = new Item(new Item.Properties().maxStackSize(1).group(ChroniclesOfMinecraftItemGroups.ALCHEMY)).setRegistryName(ChroniclesOfMinecraftCore.MOD_ID, "fire_wand");
        waterWand = new Item(new Item.Properties().maxStackSize(1).group(ChroniclesOfMinecraftItemGroups.ALCHEMY)).setRegistryName(ChroniclesOfMinecraftCore.MOD_ID, "water_wand");
        earthWand = new Item(new Item.Properties().maxStackSize(1).group(ChroniclesOfMinecraftItemGroups.ALCHEMY)).setRegistryName(ChroniclesOfMinecraftCore.MOD_ID, "earth_wand");
        airWand = new Item(new Item.Properties().maxStackSize(1).group(ChroniclesOfMinecraftItemGroups.ALCHEMY)).setRegistryName(ChroniclesOfMinecraftCore.MOD_ID, "air_wand");

        sickleIron = new Sickle(ItemTierCustom.IRON_SICKLE, 1, 1.0f,
                        new Item.Properties().maxStackSize(1).group(ChroniclesOfMinecraftItemGroups.ALCHEMY)).setRegistryName(ChroniclesOfMinecraftCore.MOD_ID, "sickle_iron");

        sickleGold = new Sickle(ItemTierCustom.GOLD_SICKLE, 1, 1.0f,
                        new Item.Properties().maxStackSize(1).group(ChroniclesOfMinecraftItemGroups.ALCHEMY)).setRegistryName(ChroniclesOfMinecraftCore.MOD_ID, "sickle_gold");

        sickleAlchemium = new Sickle(ItemTierCustom.ALCHEMIUM_SICKLE, 1, 1.0f,
                        new Item.Properties().maxStackSize(1).group(ChroniclesOfMinecraftItemGroups.ALCHEMY)).setRegistryName(ChroniclesOfMinecraftCore.MOD_ID, "sickle_alchemium");

        mortarPestleStone = new MortarPestle(new Item.Properties().maxStackSize(1).group(ChroniclesOfMinecraftItemGroups.ALCHEMY)).setRegistryName(ChroniclesOfMinecraftCore.MOD_ID, "mortar_pestle_stone");
        mortarPestleGold = new MortarPestle(new Item.Properties().maxStackSize(1).group(ChroniclesOfMinecraftItemGroups.ALCHEMY)).setRegistryName(ChroniclesOfMinecraftCore.MOD_ID, "mortar_pestle_gold");
        mortarPestleAlchemium = new MortarPestle(new Item.Properties().maxStackSize(1).group(ChroniclesOfMinecraftItemGroups.ALCHEMY)).setRegistryName(ChroniclesOfMinecraftCore.MOD_ID, "mortar_pestle_alchemium");

        ingotAlchemium = new Item(new Item.Properties().group(ChroniclesOfMinecraftItemGroups.ALCHEMY)).setRegistryName(ChroniclesOfMinecraftCore.MOD_ID, "ingot_alchemium");

        distiller = new BlockItem(ChroniclesOfMinecraftBlocks.distiller, new Item.Properties().group(ChroniclesOfMinecraftItemGroups.ALCHEMY)).setRegistryName(ChroniclesOfMinecraftCore.MOD_ID, "distiller");
        alembic = new BlockItem(ChroniclesOfMinecraftBlocks.alembic, new Item.Properties().group(ChroniclesOfMinecraftItemGroups.ALCHEMY)).setRegistryName(ChroniclesOfMinecraftCore.MOD_ID, "alembic");

        alchemicalBulbEmpty = new AlchemicalBulb(new Item.Properties().group(ChroniclesOfMinecraftItemGroups.ALCHEMY)).setRegistryName(ChroniclesOfMinecraftCore.MOD_ID, "alchemical_bulb_empty");

        //********//
        // Biomes //
        //********//

        flowerRosaRosea = new BlockItem(ChroniclesOfMinecraftBlocks.flowerRosaRosea, new Item.Properties().group(ChroniclesOfMinecraftItemGroups.BIOMES)).setRegistryName("flower_rosa_rosea");
        flowerRosaAlba = new BlockItem(ChroniclesOfMinecraftBlocks.flowerRosaAlba, new Item.Properties().group(ChroniclesOfMinecraftItemGroups.BIOMES)).setRegistryName("flower_rosa_alba");
        flowerRosaHyacinus = new BlockItem(ChroniclesOfMinecraftBlocks.flowerRosaHyacinus, new Item.Properties().group(ChroniclesOfMinecraftItemGroups.BIOMES)).setRegistryName("flower_rosa_hyacinus");
        flowerLiliaceaeCandela = new BlockItem(ChroniclesOfMinecraftBlocks.flowerLiliaceaeCandela, new Item.Properties().group(ChroniclesOfMinecraftItemGroups.BIOMES)).setRegistryName("flower_liliaceae_candela");
        flowerCantharellusPlatyphyllus = new BlockItem(ChroniclesOfMinecraftBlocks.flowerCantharellusPlatyphyllus, new Item.Properties().group(ChroniclesOfMinecraftItemGroups.BIOMES)).setRegistryName("flower_cantharellus_platyphyllus");

        flowerAloesCandela = new BlockItem(ChroniclesOfMinecraftBlocks.flowerAloesCandela, new Item.Properties().group(ChroniclesOfMinecraftItemGroups.BIOMES)).setRegistryName("flower_aloes_candela");
        flowerBulbumAer = new BlockItem(ChroniclesOfMinecraftBlocks.flowerBulbumAer, new Item.Properties().group(ChroniclesOfMinecraftItemGroups.BIOMES)).setRegistryName("flower_bulbum_aer");
        flowerCoprinusLumus = new BlockItem(ChroniclesOfMinecraftBlocks.flowerCoprinusLumus, new Item.Properties().group(ChroniclesOfMinecraftItemGroups.BIOMES)).setRegistryName("flower_coprinus_lumus");
        flowerCapparaceaeTropicalum = new BlockItem(ChroniclesOfMinecraftBlocks.flowerCapparaceaeTropicalumBottom, new Item.Properties().group(ChroniclesOfMinecraftItemGroups.BIOMES)).setRegistryName("flower_capparaceae_tropicalum");
        flowerStrelitziaReginae = new BlockItem(ChroniclesOfMinecraftBlocks.flowerStrelitziaReginae, new Item.Properties().group(ChroniclesOfMinecraftItemGroups.BIOMES)).setRegistryName("flower_strelitzia_reginae");
        flowerArumTitan = new BlockItem(ChroniclesOfMinecraftBlocks.flowerArumTitanBottom, new Item.Properties().group(ChroniclesOfMinecraftItemGroups.BIOMES)).setRegistryName("flower_arum_titan");
        flowerCoprinusComatus = new BlockItem(ChroniclesOfMinecraftBlocks.flowerCoprinusComatus, new Item.Properties().group(ChroniclesOfMinecraftItemGroups.BIOMES)).setRegistryName("flower_coprinus_comatus");
        flowerArmillariaMellea = new BlockItem(ChroniclesOfMinecraftBlocks.flowerArmillariaMellea, new Item.Properties().group(ChroniclesOfMinecraftItemGroups.BIOMES)).setRegistryName("flower_armillaria_mellea");
        flowerBambusaGivra = new BlockItem(ChroniclesOfMinecraftBlocks.flowerBambusaGivra, new Item.Properties().group(ChroniclesOfMinecraftItemGroups.BIOMES)).setRegistryName("flower_bambusa_givra");

        flowerRosaRoseaPetals = new Item(new Item.Properties().group(ChroniclesOfMinecraftItemGroups.BIOMES)).setRegistryName(ChroniclesOfMinecraftCore.MOD_ID, "flower_rosa_rosea_petals");
        flowerRosaAlbaPetals = new Item(new Item.Properties().group(ChroniclesOfMinecraftItemGroups.BIOMES)).setRegistryName(ChroniclesOfMinecraftCore.MOD_ID, "flower_rosa_alba_petals");
        flowerRosaHyacinusPetals = new Item(new Item.Properties().group(ChroniclesOfMinecraftItemGroups.BIOMES)).setRegistryName(ChroniclesOfMinecraftCore.MOD_ID, "flower_rosa_hyacinus_petals");
        flowerAloesCandelaFruit = new Item(new Item.Properties().group(ChroniclesOfMinecraftItemGroups.BIOMES)).setRegistryName(ChroniclesOfMinecraftCore.MOD_ID, "flower_aloes_candela_fruit");
        flowerBambusaGivraThorns = new Item(new Item.Properties().group(ChroniclesOfMinecraftItemGroups.BIOMES)).setRegistryName(ChroniclesOfMinecraftCore.MOD_ID, "flower_bambusa_givra_thorns");

        alchemiumChestplate = new AlchemiumArmorChestplate(new Item.Properties().group(ChroniclesOfMinecraftItemGroups.BIOMES)).setRegistryName(ChroniclesOfMinecraftCore.MOD_ID, "alchemium_chestplate");
        alchemiumHelmet = new AlchemiumArmorHelmet(new Item.Properties().group(ChroniclesOfMinecraftItemGroups.BIOMES)).setRegistryName(ChroniclesOfMinecraftCore.MOD_ID, "alchemium_helmet");
        alchemiumBoots = new AlchemiumArmorBoots(new Item.Properties().group(ChroniclesOfMinecraftItemGroups.BIOMES)).setRegistryName(ChroniclesOfMinecraftCore.MOD_ID, "alchemium_boots");
        alchemiumLeggings = new AlchemiumArmorLeggings(new Item.Properties().group(ChroniclesOfMinecraftItemGroups.BIOMES)).setRegistryName(ChroniclesOfMinecraftCore.MOD_ID, "alchemium_leggings");

    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        init();

    event.getRegistry().registerAll(

            //*********//
            // Alchemy //
            //*********//

            fireWand,
            waterWand,
            earthWand,
            airWand,

            sickleIron,
            sickleGold,
            sickleAlchemium,

            mortarPestleStone,
            mortarPestleGold,
            mortarPestleAlchemium,

            ingotAlchemium,

            distiller,
            alembic,

            alchemicalBulbEmpty,


            //********//
            // Biomes //
            //********//

            flowerRosaRosea,
            flowerRosaAlba,
            flowerRosaHyacinus,
            flowerLiliaceaeCandela,
            flowerCantharellusPlatyphyllus,

            flowerStrelitziaReginae,
            flowerArumTitan,
            flowerCoprinusComatus,
            flowerArmillariaMellea,

            flowerCoprinusLumus,
            flowerAloesCandela,
            flowerBulbumAer,
            flowerCapparaceaeTropicalum,
            flowerBambusaGivra,

            flowerRosaRoseaPetals,
            flowerRosaAlbaPetals,
            flowerRosaHyacinusPetals,
            flowerAloesCandelaFruit,
            flowerBambusaGivraThorns,


            //********//
            // Combat //
            //********//

            alchemiumChestplate,
            alchemiumHelmet,
            alchemiumBoots,
            alchemiumLeggings
        );
    }
}
