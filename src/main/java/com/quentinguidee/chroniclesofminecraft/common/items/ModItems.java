package com.quentinguidee.chroniclesofminecraft.common.items;

import com.quentinguidee.chroniclesofminecraft.ChroniclesOfMinecraft;
import com.quentinguidee.chroniclesofminecraft.common.blocks.ModBlocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, ChroniclesOfMinecraft.MODID);

    /*
     * Combat
     */
    public static final RegistryObject<Item> FIRE_WAND = ITEMS.register("fire_wand", () -> new Item(new Item.Properties().group(ItemGroupType.MAGIC).maxStackSize(1)));
    public static final RegistryObject<Item> AIR_WAND = ITEMS.register("air_wand", () -> new Item(new Item.Properties().group(ItemGroupType.MAGIC).maxStackSize(1)));
    public static final RegistryObject<Item> EARTH_WAND = ITEMS.register("earth_wand", () -> new Item(new Item.Properties().group(ItemGroupType.MAGIC).maxStackSize(1)));
    public static final RegistryObject<Item> WATER_WAND = ITEMS.register("water_wand", () -> new Item(new Item.Properties().group(ItemGroupType.MAGIC).maxStackSize(1)));

    public static final RegistryObject<Item> ALCHEMIUM_HELMET = ITEMS.register("alchemium_helmet", () -> new Item(new Item.Properties().group(ItemGroupType.ALCHEMY).maxStackSize(1)));
    public static final RegistryObject<Item> ALCHEMIUM_CHESTPLATE = ITEMS.register("alchemium_chestplate", () -> new Item(new Item.Properties().group(ItemGroupType.ALCHEMY).maxStackSize(1)));
    public static final RegistryObject<Item> ALCHEMIUM_LEGGINGS = ITEMS.register("alchemium_leggings", () -> new Item(new Item.Properties().group(ItemGroupType.ALCHEMY).maxStackSize(1)));
    public static final RegistryObject<Item> ALCHEMIUM_BOOTS = ITEMS.register("alchemium_boots", () -> new Item(new Item.Properties().group(ItemGroupType.ALCHEMY).maxStackSize(1)));

    /*
     * Flowers
     */
    public static final RegistryObject<Item> FLOWER_ROSA_ROSEA = ITEMS.register("flower_rosa_rosea", () -> new BlockItem(ModBlocks.FLOWER_ROSA_ROSEA.get(), new Item.Properties().group(ItemGroupType.BIOMES)));
    public static final RegistryObject<Item> FLOWER_ROSA_ALBA = ITEMS.register("flower_rosa_alba", () -> new BlockItem(ModBlocks.FLOWER_ROSA_ALBA.get(), new Item.Properties().group(ItemGroupType.BIOMES)));
    public static final RegistryObject<Item> FLOWER_ROSA_HYACINUS = ITEMS.register("flower_rosa_hyacinus", () -> new BlockItem(ModBlocks.FLOWER_ROSA_HYACINUS.get(), new Item.Properties().group(ItemGroupType.BIOMES)));

    public static final RegistryObject<Item> FLOWER_CENTAUREA_MONTANA = ITEMS.register("flower_centaurea_montana", () -> new BlockItem(ModBlocks.FLOWER_CENTAUREA_MONTANA.get(), new Item.Properties().group(ItemGroupType.BIOMES)));
    public static final RegistryObject<Item> FLOWER_LILIACEAE_CANDELA = ITEMS.register("flower_liliaceae_candela", () -> new BlockItem(ModBlocks.FLOWER_LILIACEAE_CANDELA.get(), new Item.Properties().group(ItemGroupType.BIOMES)));
    public static final RegistryObject<Item> FLOWER_CANTHARELLUS_PLATYPHYLLUS = ITEMS.register("flower_cantharellus_platyphyllus", () -> new BlockItem(ModBlocks.FLOWER_CANTHARELLUS_PLATYPHYLLUS.get(), new Item.Properties().group(ItemGroupType.BIOMES)));

    public static final RegistryObject<Item> FLOWER_ALOES_CANDELA = ITEMS.register("flower_aloes_candela", () -> new BlockItem(ModBlocks.FLOWER_ALOES_CANDELA.get(), new Item.Properties().group(ItemGroupType.BIOMES)));
    public static final RegistryObject<Item> FLOWER_BULBUM_AER = ITEMS.register("flower_bulbum_aer", () -> new BlockItem(ModBlocks.FLOWER_BULBUM_AER.get(), new Item.Properties().group(ItemGroupType.BIOMES)));
    public static final RegistryObject<Item> FLOWER_COPRINUS_LUMUS = ITEMS.register("flower_coprinus_lumus", () -> new BlockItem(ModBlocks.FLOWER_COPRINUS_LUMUS.get(), new Item.Properties().group(ItemGroupType.BIOMES)));
    public static final RegistryObject<Item> FLOWER_CAPPARACEAE_TROPICALUM = ITEMS.register("flower_capparaceae_tropicalum", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FLOWER_STRELITZIA_REGINAE = ITEMS.register("flower_strelitzia_reginae", () -> new Item(new Item.Properties().group(ItemGroupType.BIOMES)));
    public static final RegistryObject<Item> FLOWER_ARUM_TITAN = ITEMS.register("flower_arum_titan", () -> new Item(new Item.Properties().group(ItemGroupType.BIOMES)));
    public static final RegistryObject<Item> FLOWER_COPRINUS_COMATUS = ITEMS.register("flower_coprinus_comatus", () -> new BlockItem(ModBlocks.FLOWER_COPRINUS_COMATUS.get(), new Item.Properties().group(ItemGroupType.BIOMES)));
    public static final RegistryObject<Item> FLOWER_ARMILLARIA_MELLEA = ITEMS.register("flower_armillaria_mellea", () -> new Item(new Item.Properties().group(ItemGroupType.BIOMES)));
    public static final RegistryObject<Item> FLOWER_BAMBUSA_GIVRA = ITEMS.register("flower_bambusa_givra", () -> new BlockItem(ModBlocks.FLOWER_BAMBUSA_GIVRA.get(), new Item.Properties().group(ItemGroupType.BIOMES)));

    public static final RegistryObject<Item> FLOWER_ROSA_ROSEA_PETALS = ITEMS.register("flower_rosa_rosea_petals", () -> new Item(new Item.Properties().group(ItemGroupType.BIOMES)));
    public static final RegistryObject<Item> FLOWER_ROSA_ALBA_PETALS = ITEMS.register("flower_rosa_alba_petals", () -> new Item(new Item.Properties().group(ItemGroupType.BIOMES)));
    public static final RegistryObject<Item> FLOWER_ROSA_HYACINUS_PETALS = ITEMS.register("flower_rosa_hyacinus_petals", () -> new Item(new Item.Properties().group(ItemGroupType.BIOMES)));
    public static final RegistryObject<Item> FLOWER_ALOES_CANDELA_FRUIT = ITEMS.register("flower_aloes_candela_fruit", () -> new Item(new Item.Properties().group(ItemGroupType.BIOMES)));

    public static final RegistryObject<Item> FLOWER_BAMBUSA_GIVRA_THORNS = ITEMS.register("flower_bambusa_givra_thorns", () -> new Item(new Item.Properties().group(ItemGroupType.BIOMES)));
    public static final RegistryObject<Item> FLOWER_BULBUM_AER_LEAVE = ITEMS.register("flower_bulbum_aer_leave", () -> new Item(new Item.Properties().group(ItemGroupType.BIOMES)));
    public static final RegistryObject<Item> FLOWER_ARUM_TITAN_SUC = ITEMS.register("flower_arum_titan_suc", () -> new Item(new Item.Properties().group(ItemGroupType.BIOMES)));
    public static final RegistryObject<Item> FLOWER_ARMILLARIA_MELLEA_HEART = ITEMS.register("flower_armillaria_mellea_heart", () -> new Item(new Item.Properties().group(ItemGroupType.BIOMES)));

    public static final RegistryObject<Item> FLOWER_MUSHROOMS_CHAMPIGNOLITE = ITEMS.register("flower_mushrooms_champignolite", () -> new Item(new Item.Properties().group(ItemGroupType.BIOMES)));
    public static final RegistryObject<Item> FLOWER_CAPPARACEAE_TROPICALUM_BERRY = ITEMS.register("flower_capparaceae_tropicalum_berry", () -> new Item(new Item.Properties().group(ItemGroupType.BIOMES)));
    public static final RegistryObject<Item> FLOWER_COPRINUS_COMATUS_CAP = ITEMS.register("flower_coprinus_comatus_cap", () -> new Item(new Item.Properties().group(ItemGroupType.BIOMES)));
    public static final RegistryObject<Item> FLOWER_COPRINUS_LUMUS_CAP = ITEMS.register("flower_coprinus_lumus_cap", () -> new Item(new Item.Properties().group(ItemGroupType.BIOMES)));

    /**
     * ORES
     */
    public static final RegistryObject<Item> ORE_ALCHEMIUM = ITEMS.register("ore_alchemium", () -> new BlockItem(ModBlocks.ORE_ALCHEMIUM.get(), new Item.Properties().group(ItemGroupType.BIOMES)));
    public static final RegistryObject<Item> ORE_ALUMINIUM = ITEMS.register("ore_aluminium", () -> new BlockItem(ModBlocks.ORE_ALUMINIUM.get(), new Item.Properties().group(ItemGroupType.BIOMES)));
    public static final RegistryObject<Item> ORE_ARSENIC = ITEMS.register("ore_arsenic", () -> new BlockItem(ModBlocks.ORE_ARSENIC.get(), new Item.Properties().group(ItemGroupType.BIOMES)));
    public static final RegistryObject<Item> ORE_COBALT = ITEMS.register("ore_cobalt", () -> new BlockItem(ModBlocks.ORE_COBALT.get(), new Item.Properties().group(ItemGroupType.BIOMES)));
    public static final RegistryObject<Item> ORE_COPPER = ITEMS.register("ore_copper", () -> new BlockItem(ModBlocks.ORE_COPPER.get(), new Item.Properties().group(ItemGroupType.BIOMES)));
    public static final RegistryObject<Item> ORE_GALLIUM = ITEMS.register("ore_gallium", () -> new BlockItem(ModBlocks.ORE_GALLIUM.get(), new Item.Properties().group(ItemGroupType.BIOMES)));
    public static final RegistryObject<Item> ORE_MYTHRIL = ITEMS.register("ore_mythril", () -> new BlockItem(ModBlocks.ORE_MYTHRIL.get(), new Item.Properties().group(ItemGroupType.BIOMES)));
    public static final RegistryObject<Item> ORE_SODIUM = ITEMS.register("ore_sodium", () -> new BlockItem(ModBlocks.ORE_SODIUM.get(), new Item.Properties().group(ItemGroupType.BIOMES)));
    public static final RegistryObject<Item> ORE_SULFUR = ITEMS.register("ore_sulfur", () -> new BlockItem(ModBlocks.ORE_SULFUR.get(), new Item.Properties().group(ItemGroupType.BIOMES)));
    public static final RegistryObject<Item> ORE_TIN = ITEMS.register("ore_tin", () -> new BlockItem(ModBlocks.ORE_TIN.get(), new Item.Properties().group(ItemGroupType.BIOMES)));
    public static final RegistryObject<Item> ORE_TITANIUM = ITEMS.register("ore_titanium", () -> new BlockItem(ModBlocks.ORE_TITANIUM.get(), new Item.Properties().group(ItemGroupType.BIOMES)));
    public static final RegistryObject<Item> ORE_ZINC = ITEMS.register("ore_zinc", () -> new BlockItem(ModBlocks.ORE_ZINC.get(), new Item.Properties().group(ItemGroupType.BIOMES)));
    public static final RegistryObject<Item> ORE_ZIRCONIUM = ITEMS.register("ore_zirconium", () -> new BlockItem(ModBlocks.ORE_ZIRCONIUM.get(), new Item.Properties().group(ItemGroupType.BIOMES)));

    public static final RegistryObject<Item> INGOT_ALCHEMIUM = ITEMS.register("ingot_alchemium", () -> new Item(new Item.Properties().group(ItemGroupType.BIOMES)));
    public static final RegistryObject<Item> INGOT_ALUMINIUM = ITEMS.register("ingot_aluminium", () -> new Item(new Item.Properties().group(ItemGroupType.BIOMES)));
    public static final RegistryObject<Item> INGOT_BRONZE = ITEMS.register("ingot_bronze", () -> new Item(new Item.Properties().group(ItemGroupType.BIOMES)));
    public static final RegistryObject<Item> INGOT_COBALT = ITEMS.register("ingot_cobalt", () -> new Item(new Item.Properties().group(ItemGroupType.BIOMES)));
    public static final RegistryObject<Item> INGOT_COPPER = ITEMS.register("ingot_copper", () -> new Item(new Item.Properties().group(ItemGroupType.BIOMES)));
    public static final RegistryObject<Item> INGOT_GALLIUM = ITEMS.register("ingot_gallium", () -> new Item(new Item.Properties().group(ItemGroupType.BIOMES)));
    public static final RegistryObject<Item> INGOT_MYTHRIL = ITEMS.register("ingot_mythril", () -> new Item(new Item.Properties().group(ItemGroupType.BIOMES)));

    // TODO
    // public static final RegistryObject<Item> INGOT_SODIUM =
    // ITEMS.register("ingot_sodium",
    // () -> new Item(new Item.Properties().group(ItemGroupType.BIOMES)));

    public static final RegistryObject<Item> INGOT_TIN = ITEMS.register("ingot_tin", () -> new Item(new Item.Properties().group(ItemGroupType.BIOMES)));
    public static final RegistryObject<Item> INGOT_TITANIUM = ITEMS.register("ingot_titanium", () -> new Item(new Item.Properties().group(ItemGroupType.BIOMES)));

    // TODO
    // public static final RegistryObject<Item> INGOT_ZINC =
    // ITEMS.register("ingot_zinc",
    // () -> new Item(new Item.Properties().group(ItemGroupType.BIOMES)));

    // Crystals
    public static final RegistryObject<Item> CRYSTAL_SULFUR = ITEMS.register("crystal_sulfur", () -> new Item(new Item.Properties().group(ItemGroupType.BIOMES)));
    public static final RegistryObject<Item> CRYSTAL_ZIRCONIUM = ITEMS.register("crystal_zirconium", () -> new Item(new Item.Properties().group(ItemGroupType.BIOMES)));

    public static final RegistryObject<Item> LICHEN = ITEMS.register("lichen", () -> new BlockItem(ModBlocks.LICHEN.get(), new Item.Properties().group(ItemGroupType.BIOMES)));
    public static final RegistryObject<Item> LIMESTONE = ITEMS.register("limestone", () -> new BlockItem(ModBlocks.LIMESTONE.get(), new Item.Properties().group(ItemGroupType.BIOMES)));
}
