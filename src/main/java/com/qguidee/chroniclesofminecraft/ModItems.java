package com.qguidee.chroniclesofminecraft;

import com.qguidee.chroniclesofminecraft.common.items.alchemy.AlchemicalBulb;
import com.qguidee.chroniclesofminecraft.common.items.alchemy.Sickle;
import com.qguidee.chroniclesofminecraft.common.items.alchemy.mortarpestle.MortarPestle;
import com.qguidee.chroniclesofminecraft.common.items.fight.armors.alchemium.AlchemiumArmorBoots;
import com.qguidee.chroniclesofminecraft.common.items.fight.armors.alchemium.AlchemiumArmorChestplate;
import com.qguidee.chroniclesofminecraft.common.items.fight.armors.alchemium.AlchemiumArmorHelmet;
import com.qguidee.chroniclesofminecraft.common.items.fight.armors.alchemium.AlchemiumArmorLeggings;
import com.qguidee.chroniclesofminecraft.common.others.ItemTierCustom;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

import java.util.Arrays;
import java.util.List;

@Mod.EventBusSubscriber(modid = ModCore.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(ModCore.MOD_ID)
public class ModItems {

    public static List<Item> itemsAlchemy;
    public static List<Item> itemsBiomes;

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

    public static Item maceratingTank;
    public static Item bottler;
    public static Item alembicMk1;
    public static Item alembicMk2;
    public static Item alembicMk3;

    public static Item alchemicalBulb;

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
    public static Item flowerBulbumAerLeave;
    public static Item flowerArumTitanSuc;
    public static Item flowerArmillariaMelleaHeart;
    public static Item flowerMushroomsChampignolite;
    public static Item flowerCapparaceaeTropicalumBerry;
    public static Item flowerCoprinusComatusCap;
    public static Item flowerCoprinusLumusCap;

    public static Item alchemiumChestplate;
    public static Item alchemiumHelmet;
    public static Item alchemiumBoots;
    public static Item alchemiumLeggings;

    private static void init() {

        itemsAlchemy = Arrays.asList(
                fireWand = new Item(new Item.Properties().maxStackSize(1).group(ModItemGroups.ALCHEMY)).setRegistryName(ModCore.MOD_ID, "fire_wand"),
                waterWand = new Item(new Item.Properties().maxStackSize(1).group(ModItemGroups.ALCHEMY)).setRegistryName(ModCore.MOD_ID, "water_wand"),
                earthWand = new Item(new Item.Properties().maxStackSize(1).group(ModItemGroups.ALCHEMY)).setRegistryName(ModCore.MOD_ID, "earth_wand"),
                airWand = new Item(new Item.Properties().maxStackSize(1).group(ModItemGroups.ALCHEMY)).setRegistryName(ModCore.MOD_ID, "air_wand"),

                sickleIron = new Sickle(ItemTierCustom.IRON_SICKLE, 1, 1.0f,
                        new Item.Properties().maxStackSize(1).group(ModItemGroups.ALCHEMY)).setRegistryName(ModCore.MOD_ID, "sickle_iron"),

                sickleGold = new Sickle(ItemTierCustom.GOLD_SICKLE, 1, 1.0f,
                        new Item.Properties().maxStackSize(1).group(ModItemGroups.ALCHEMY)).setRegistryName(ModCore.MOD_ID, "sickle_gold"),

                sickleAlchemium = new Sickle(ItemTierCustom.ALCHEMIUM_SICKLE, 1, 1.0f,
                        new Item.Properties().maxStackSize(1).group(ModItemGroups.ALCHEMY)).setRegistryName(ModCore.MOD_ID, "sickle_alchemium"),

                mortarPestleStone = new MortarPestle().setRegistryName(ModCore.MOD_ID, "mortar_pestle_stone"),
                mortarPestleGold = new MortarPestle().setRegistryName(ModCore.MOD_ID, "mortar_pestle_gold"),
                mortarPestleAlchemium = new MortarPestle().setRegistryName(ModCore.MOD_ID, "mortar_pestle_alchemium"),

                ingotAlchemium = new Item(new Item.Properties().group(ModItemGroups.ALCHEMY)).setRegistryName(ModCore.MOD_ID, "ingot_alchemium"),

                maceratingTank = new BlockItem(ModBlocks.maceratingTank, new Item.Properties().group(ModItemGroups.ALCHEMY)).setRegistryName(ModCore.MOD_ID, "macerating_tank"),
                bottler = new BlockItem(ModBlocks.bottler, new Item.Properties().group(ModItemGroups.ALCHEMY)).setRegistryName(ModCore.MOD_ID, "bottler"),
                alembicMk1 = new BlockItem(ModBlocks.alembicMk1, new Item.Properties().group(ModItemGroups.ALCHEMY)).setRegistryName(ModCore.MOD_ID, "alembic_mk1"),
                alembicMk2 = new BlockItem(ModBlocks.alembicMk2, new Item.Properties().group(ModItemGroups.ALCHEMY)).setRegistryName(ModCore.MOD_ID, "alembic_mk2"),
                alembicMk3 = new BlockItem(ModBlocks.alembicMk3, new Item.Properties().group(ModItemGroups.ALCHEMY)).setRegistryName(ModCore.MOD_ID, "alembic_mk3"),

                alchemicalBulb = new AlchemicalBulb(new Item.Properties().group(ModItemGroups.ALCHEMY)).setRegistryName(ModCore.MOD_ID, "alchemical_bulb"));

        itemsBiomes = Arrays.asList(
                flowerRosaRosea = new BlockItem(ModBlocks.flowerRosaRosea, new Item.Properties().group(ModItemGroups.BIOMES)).setRegistryName("flower_rosa_rosea"),
                flowerRosaAlba = new BlockItem(ModBlocks.flowerRosaAlba, new Item.Properties().group(ModItemGroups.BIOMES)).setRegistryName("flower_rosa_alba"),
                flowerRosaHyacinus = new BlockItem(ModBlocks.flowerRosaHyacinus, new Item.Properties().group(ModItemGroups.BIOMES)).setRegistryName("flower_rosa_hyacinus"),
                flowerLiliaceaeCandela = new BlockItem(ModBlocks.flowerLiliaceaeCandela, new Item.Properties().group(ModItemGroups.BIOMES)).setRegistryName("flower_liliaceae_candela"),
                flowerCantharellusPlatyphyllus = new BlockItem(ModBlocks.flowerCantharellusPlatyphyllus, new Item.Properties().group(ModItemGroups.BIOMES)).setRegistryName("flower_cantharellus_platyphyllus"),

                flowerAloesCandela = new BlockItem(ModBlocks.flowerAloesCandela, new Item.Properties().group(ModItemGroups.BIOMES)).setRegistryName("flower_aloes_candela"),
                flowerBulbumAer = new BlockItem(ModBlocks.flowerBulbumAer, new Item.Properties().group(ModItemGroups.BIOMES)).setRegistryName("flower_bulbum_aer"),
                flowerCoprinusLumus = new BlockItem(ModBlocks.flowerCoprinusLumus, new Item.Properties().group(ModItemGroups.BIOMES)).setRegistryName("flower_coprinus_lumus"),
                flowerCapparaceaeTropicalum = new BlockItem(ModBlocks.flowerCapparaceaeTropicalumBottom, new Item.Properties().group(ModItemGroups.BIOMES)).setRegistryName("flower_capparaceae_tropicalum"),
                flowerStrelitziaReginae = new BlockItem(ModBlocks.flowerStrelitziaReginae, new Item.Properties().group(ModItemGroups.BIOMES)).setRegistryName("flower_strelitzia_reginae"),
                flowerArumTitan = new BlockItem(ModBlocks.flowerArumTitanBottom, new Item.Properties().group(ModItemGroups.BIOMES)).setRegistryName("flower_arum_titan"),
                flowerCoprinusComatus = new BlockItem(ModBlocks.flowerCoprinusComatus, new Item.Properties().group(ModItemGroups.BIOMES)).setRegistryName("flower_coprinus_comatus"),
                flowerArmillariaMellea = new BlockItem(ModBlocks.flowerArmillariaMellea, new Item.Properties().group(ModItemGroups.BIOMES)).setRegistryName("flower_armillaria_mellea"),
                flowerBambusaGivra = new BlockItem(ModBlocks.flowerBambusaGivra, new Item.Properties().group(ModItemGroups.BIOMES)).setRegistryName("flower_bambusa_givra"),

                flowerRosaRoseaPetals = new Item(new Item.Properties().group(ModItemGroups.BIOMES)).setRegistryName(ModCore.MOD_ID, "flower_rosa_rosea_petals"),
                flowerRosaAlbaPetals = new Item(new Item.Properties().group(ModItemGroups.BIOMES)).setRegistryName(ModCore.MOD_ID, "flower_rosa_alba_petals"),
                flowerRosaHyacinusPetals = new Item(new Item.Properties().group(ModItemGroups.BIOMES)).setRegistryName(ModCore.MOD_ID, "flower_rosa_hyacinus_petals"),
                flowerAloesCandelaFruit = new Item(new Item.Properties().group(ModItemGroups.BIOMES)).setRegistryName(ModCore.MOD_ID, "flower_aloes_candela_fruit"),
                flowerBambusaGivraThorns = new Item(new Item.Properties().group(ModItemGroups.BIOMES)).setRegistryName(ModCore.MOD_ID, "flower_bambusa_givra_thorns"),
                flowerBulbumAerLeave = new Item(new Item.Properties().group(ModItemGroups.BIOMES)).setRegistryName(ModCore.MOD_ID, "flower_bulbum_aer_leave"),
                flowerArumTitanSuc = new Item(new Item.Properties().group(ModItemGroups.BIOMES)).setRegistryName(ModCore.MOD_ID, "flower_arum_titan_suc"),
                flowerArmillariaMelleaHeart = new Item(new Item.Properties().group(ModItemGroups.BIOMES)).setRegistryName(ModCore.MOD_ID, "flower_armillaria_mellea_heart"),
                flowerMushroomsChampignolite = new Item(new Item.Properties().group(ModItemGroups.BIOMES)).setRegistryName(ModCore.MOD_ID, "flower_mushrooms_champignolite"),
                flowerCapparaceaeTropicalumBerry = new Item(new Item.Properties().group(ModItemGroups.BIOMES)).setRegistryName(ModCore.MOD_ID, "flower_capparaceae_tropicalum_berry"),
                flowerCoprinusComatusCap = new Item(new Item.Properties().group(ModItemGroups.BIOMES)).setRegistryName(ModCore.MOD_ID, "flower_coprinus_comatus_cap"),
                flowerCoprinusLumusCap = new Item(new Item.Properties().group(ModItemGroups.BIOMES)).setRegistryName(ModCore.MOD_ID, "flower_coprinus_lumus_cap"),

                alchemiumChestplate = new AlchemiumArmorChestplate(new Item.Properties().group(ModItemGroups.BIOMES)).setRegistryName(ModCore.MOD_ID, "alchemium_chestplate"),
                alchemiumHelmet = new AlchemiumArmorHelmet(new Item.Properties().group(ModItemGroups.BIOMES)).setRegistryName(ModCore.MOD_ID, "alchemium_helmet"),
                alchemiumBoots = new AlchemiumArmorBoots(new Item.Properties().group(ModItemGroups.BIOMES)).setRegistryName(ModCore.MOD_ID, "alchemium_boots"),
                alchemiumLeggings = new AlchemiumArmorLeggings(new Item.Properties().group(ModItemGroups.BIOMES)).setRegistryName(ModCore.MOD_ID, "alchemium_leggings"));
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        init();

        for (Item item : itemsAlchemy) {
            event.getRegistry().register(item);
        }

        for (Item item : itemsBiomes) {
            event.getRegistry().register(item);
        }
    }
}
