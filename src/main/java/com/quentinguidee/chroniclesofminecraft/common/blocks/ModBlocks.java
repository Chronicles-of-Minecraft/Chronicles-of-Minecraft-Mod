package com.quentinguidee.chroniclesofminecraft.common.blocks;

import com.quentinguidee.chroniclesofminecraft.ChroniclesOfMinecraft;
import com.quentinguidee.chroniclesofminecraft.common.blocks.biomes.flowers.AloesCandela;
import com.quentinguidee.chroniclesofminecraft.common.blocks.biomes.flowers.BambusaGivra;
import com.quentinguidee.chroniclesofminecraft.common.blocks.biomes.flowers.BulbumAer;
import com.quentinguidee.chroniclesofminecraft.common.blocks.biomes.flowers.CoprinusComatus;
import com.quentinguidee.chroniclesofminecraft.common.blocks.biomes.flowers.CoprinusLumus;
import com.quentinguidee.chroniclesofminecraft.common.blocks.biomes.flowers.ExpandableFlower;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, ChroniclesOfMinecraft.MODID);

    public static final RegistryObject<Block> FLOWER_ROSA_ROSEA = BLOCKS.register("flower_rosa_rosea", () -> new ExpandableFlower(30));
    public static final RegistryObject<Block> FLOWER_ROSA_ALBA = BLOCKS.register("flower_rosa_alba", () -> new ExpandableFlower(50));
    public static final RegistryObject<Block> FLOWER_ROSA_HYACINUS = BLOCKS.register("flower_rosa_hyacinus", () -> new ExpandableFlower(30));
    public static final RegistryObject<Block> FLOWER_LILIACEAE_CANDELA = BLOCKS.register("flower_liliaceae_candela", () -> new ExpandableFlower(50));
    public static final RegistryObject<Block> FLOWER_CANTHARELLUS_PLATYPHYLLUS = BLOCKS.register("flower_cantharellus_platyphyllus", () -> new ExpandableFlower(25));
    public static final RegistryObject<Block> FLOWER_CENTAUREA_MONTANA = BLOCKS.register("flower_centaurea_montana", () -> new ExpandableFlower(20));

    public static final RegistryObject<Block> FLOWER_ALOES_CANDELA = BLOCKS.register("flower_aloes_candela", () -> new AloesCandela());

    /*
     * flowerCapparaceaeTropicalumBottom = new
     * CapparaceaeTropicalumBottom().setRegistryName(ModCore.MOD_ID,
     * "flower_capparaceae_tropicalum_bottom"), flowerCapparaceaeTropicalumTop =
     * new CapparaceaeTropicalumTop().setRegistryName(ModCore.MOD_ID,
     * "flower_capparaceae_tropicalum_top"), flowerStrelitziaReginae = new
     * StrelitziaReginae().setRegistryName(ModCore.MOD_ID,
     * "flower_strelitzia_reginae"),
     */

    public static final RegistryObject<Block> FLOWER_BULBUM_AER = BLOCKS.register("flower_bulbum_aer", () -> new BulbumAer());
    public static final RegistryObject<Block> FLOWER_COPRINUS_LUMUS = BLOCKS.register("flower_coprinus_lumus", () -> new CoprinusLumus());
    public static final RegistryObject<Block> FLOWER_COPRINUS_COMATUS = BLOCKS.register("flower_coprinus_comatus", () -> new CoprinusComatus());

    /*
     * flowerArmillariaMellea = new
     * ArmillariaMellea().setRegistryName(ModCore.MOD_ID,
     * "flower_armillaria_mellea"),
     */

    public static final RegistryObject<Block> FLOWER_BAMBUSA_GIVRA = BLOCKS.register("flower_bambusa_givra", () -> new BambusaGivra());

    /*
     * flowerArumTitanBottom = new
     * ArumTitanBottom().setRegistryName(ModCore.MOD_ID,
     * "flower_arum_titan_bottom"), flowerArumTitanMid = new
     * ArumTitanMid().setRegistryName(ModCore.MOD_ID, "flower_arum_titan_mid"),
     * flowerArumTitanTop = new ArumTitanTop().setRegistryName(ModCore.MOD_ID,
     * "flower_arum_titan_top"));
     */

    /**
     * ORES
     */
    public static final RegistryObject<Block> ORE_ALCHEMIUM = BLOCKS.register("ore_alchemium", () -> new Block(Block.Properties.create(Material.IRON)));
    public static final RegistryObject<Block> ORE_ALUMINIUM = BLOCKS.register("ore_aluminium", () -> new Block(Block.Properties.create(Material.IRON)));
    public static final RegistryObject<Block> ORE_ARSENIC = BLOCKS.register("ore_arsenic", () -> new Block(Block.Properties.create(Material.IRON)));
    public static final RegistryObject<Block> ORE_COBALT = BLOCKS.register("ore_cobalt", () -> new Block(Block.Properties.create(Material.IRON)));
    public static final RegistryObject<Block> ORE_COPPER = BLOCKS.register("ore_copper", () -> new Block(Block.Properties.create(Material.IRON)));
    public static final RegistryObject<Block> ORE_GALLIUM = BLOCKS.register("ore_gallium", () -> new Block(Block.Properties.create(Material.IRON)));
    public static final RegistryObject<Block> ORE_MYTHRIL = BLOCKS.register("ore_mythril", () -> new Block(Block.Properties.create(Material.IRON)));
    public static final RegistryObject<Block> ORE_SODIUM = BLOCKS.register("ore_sodium", () -> new Block(Block.Properties.create(Material.IRON)));
    public static final RegistryObject<Block> ORE_SULFUR = BLOCKS.register("ore_sulfur", () -> new Block(Block.Properties.create(Material.IRON)));
    public static final RegistryObject<Block> ORE_TIN = BLOCKS.register("ore_tin", () -> new Block(Block.Properties.create(Material.IRON)));
    public static final RegistryObject<Block> ORE_TITANIUM = BLOCKS.register("ore_titanium", () -> new Block(Block.Properties.create(Material.IRON)));
    public static final RegistryObject<Block> ORE_ZINC = BLOCKS.register("ore_zinc", () -> new Block(Block.Properties.create(Material.IRON)));
    public static final RegistryObject<Block> ORE_ZIRCONIUM = BLOCKS.register("ore_zirconium", () -> new Block(Block.Properties.create(Material.IRON)));

    /**
     * BIOMES
     */
    public static final RegistryObject<Block> LICHEN = BLOCKS.register("lichen", () -> new Block(Block.Properties.create(Material.ROCK)));
    public static final RegistryObject<Block> LIMESTONE = BLOCKS.register("limestone", () -> new Block(Block.Properties.create(Material.ROCK)));
}
