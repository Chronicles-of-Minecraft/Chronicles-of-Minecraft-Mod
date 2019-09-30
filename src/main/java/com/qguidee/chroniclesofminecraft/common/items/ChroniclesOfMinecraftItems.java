package com.qguidee.chroniclesofminecraft.common.items;

import com.qguidee.chroniclesofminecraft.ChroniclesOfMinecraftCore;
import com.qguidee.chroniclesofminecraft.common.CustomItemGroup;
import com.qguidee.chroniclesofminecraft.common.blocks.ChroniclesOfMinecraftBlocks;
import com.qguidee.chroniclesofminecraft.common.blocks.ChroniclesOfMinecraftContainers;
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

    public static Item rosePetal;

    public static Item sickleIron;
    public static Item sickleGold;
    public static Item sickleAlchemium;

    public static Item mortarPestleStone;
    public static Item mortarPestleGold;
    public static Item mortarPestleAlchemium;

    public static Item ingotAlchemium;

    public static Item distiller;
    public static Item alembic;

    public static Item flowerRosaRosea;
    public static Item flowerRosaAlba;
    public static Item flowerRosaHyacinus;
    public static Item flowerLiliaceaeCandela;

    public static Item flowerAloesCandela;
    public static Item flowerCapparaceaeTropicalum;

    public static void init() {

        // Wands
        fireWand = new Item(new Item.Properties().maxStackSize(1).group(CustomItemGroup.CHRONICLES_OF_MINECRAFT_CORE)).setRegistryName(ChroniclesOfMinecraftCore.MOD_ID, "fire_wand");
        waterWand = new Item(new Item.Properties().maxStackSize(1).group(CustomItemGroup.CHRONICLES_OF_MINECRAFT_CORE)).setRegistryName(ChroniclesOfMinecraftCore.MOD_ID, "water_wand");
        earthWand = new Item(new Item.Properties().maxStackSize(1).group(CustomItemGroup.CHRONICLES_OF_MINECRAFT_CORE)).setRegistryName(ChroniclesOfMinecraftCore.MOD_ID, "earth_wand");
        airWand = new Item(new Item.Properties().maxStackSize(1).group(CustomItemGroup.CHRONICLES_OF_MINECRAFT_CORE)).setRegistryName(ChroniclesOfMinecraftCore.MOD_ID, "air_wand");

        // Petals
        rosePetal = new Item(new Item.Properties().maxStackSize(1).group(CustomItemGroup.CHRONICLES_OF_MINECRAFT_CORE)).setRegistryName(ChroniclesOfMinecraftCore.MOD_ID, "rose_petal");

        // Tools
        sickleIron = new Sickle(ItemTierCustom.IRON_SICKLE, 1, 1.0f,
                        new Item.Properties().maxStackSize(1).group(CustomItemGroup.CHRONICLES_OF_MINECRAFT_CORE)).setRegistryName(ChroniclesOfMinecraftCore.MOD_ID, "sickle_iron");

        sickleGold = new Sickle(ItemTierCustom.GOLD_SICKLE, 1, 1.0f,
                        new Item.Properties().maxStackSize(1).group(CustomItemGroup.CHRONICLES_OF_MINECRAFT_CORE)).setRegistryName(ChroniclesOfMinecraftCore.MOD_ID, "sickle_gold");

        sickleAlchemium = new Sickle(ItemTierCustom.ALCHEMIUM_SICKLE, 1, 1.0f,
                        new Item.Properties().maxStackSize(1).group(CustomItemGroup.CHRONICLES_OF_MINECRAFT_CORE)).setRegistryName(ChroniclesOfMinecraftCore.MOD_ID, "sickle_alchemium");

        mortarPestleStone = new Item(new Item.Properties().maxStackSize(1).group(CustomItemGroup.CHRONICLES_OF_MINECRAFT_CORE)).setRegistryName(ChroniclesOfMinecraftCore.MOD_ID, "mortar_pestle_stone");
        mortarPestleGold = new Item(new Item.Properties().maxStackSize(1).group(CustomItemGroup.CHRONICLES_OF_MINECRAFT_CORE)).setRegistryName(ChroniclesOfMinecraftCore.MOD_ID, "mortar_pestle_gold");
        mortarPestleAlchemium = new Item(new Item.Properties().maxStackSize(1).group(CustomItemGroup.CHRONICLES_OF_MINECRAFT_CORE)).setRegistryName(ChroniclesOfMinecraftCore.MOD_ID, "mortar_pestle_alchemium");

        // Ingots
        ingotAlchemium = new Item(new Item.Properties().maxStackSize(64).group(CustomItemGroup.CHRONICLES_OF_MINECRAFT_CORE)).setRegistryName(ChroniclesOfMinecraftCore.MOD_ID, "ingot_alchemium");

        ingotAlchemium = new Item(new Item.Properties().maxStackSize(64).group(CustomItemGroup.CHRONICLES_OF_MINECRAFT_CORE)).setRegistryName(ChroniclesOfMinecraftCore.MOD_ID, "ingot_alchemium");

        distiller = new BlockItem(ChroniclesOfMinecraftBlocks.distiller, new Item.Properties().maxStackSize(64).group(CustomItemGroup.CHRONICLES_OF_MINECRAFT_CORE)).setRegistryName(ChroniclesOfMinecraftCore.MOD_ID, "distiller");
        alembic = new BlockItem(ChroniclesOfMinecraftBlocks.alembic, new Item.Properties().maxStackSize(64).group(CustomItemGroup.CHRONICLES_OF_MINECRAFT_CORE)).setRegistryName(ChroniclesOfMinecraftCore.MOD_ID, "alembic");

        // Flowers
        flowerRosaRosea = new BlockItem(ChroniclesOfMinecraftBlocks.flowerRosaRosea, new Item.Properties().maxStackSize(64).group(CustomItemGroup.CHRONICLES_OF_MINECRAFT_CORE)).setRegistryName("flower_rosa_rosea");
        flowerRosaAlba = new BlockItem(ChroniclesOfMinecraftBlocks.flowerRosaAlba, new Item.Properties().maxStackSize(64).group(CustomItemGroup.CHRONICLES_OF_MINECRAFT_CORE)).setRegistryName("flower_rosa_alba");
        flowerRosaHyacinus = new BlockItem(ChroniclesOfMinecraftBlocks.flowerRosaHyacinus, new Item.Properties().maxStackSize(64).group(CustomItemGroup.CHRONICLES_OF_MINECRAFT_CORE)).setRegistryName("flower_rosa_hyacinus");
        flowerLiliaceaeCandela = new BlockItem(ChroniclesOfMinecraftBlocks.flowerLiliaceaeCandela, new Item.Properties().maxStackSize(64).group(CustomItemGroup.CHRONICLES_OF_MINECRAFT_CORE)).setRegistryName("flower_liliaceae_candela");

        flowerAloesCandela = new BlockItem(ChroniclesOfMinecraftBlocks.flowerAloesCandela, new Item.Properties().maxStackSize(64).group(CustomItemGroup.CHRONICLES_OF_MINECRAFT_CORE)).setRegistryName("flower_aloes_candela");
        flowerCapparaceaeTropicalum = new BlockItem(ChroniclesOfMinecraftBlocks.flowerCapparaceaeTropicalumBottom, new Item.Properties().maxStackSize(64).group(CustomItemGroup.CHRONICLES_OF_MINECRAFT_CORE)).setRegistryName("flower_capparaceae_tropicalum");

    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        init();

        event.getRegistry().registerAll(
            fireWand, waterWand, earthWand, airWand,

            rosePetal,

            sickleIron, sickleGold, sickleAlchemium,

            mortarPestleStone, mortarPestleGold, mortarPestleAlchemium,

            ingotAlchemium,

            distiller, alembic,

            flowerRosaRosea, flowerRosaAlba, flowerRosaHyacinus, flowerLiliaceaeCandela,

            flowerAloesCandela, flowerCapparaceaeTropicalum
        );
    }
}
