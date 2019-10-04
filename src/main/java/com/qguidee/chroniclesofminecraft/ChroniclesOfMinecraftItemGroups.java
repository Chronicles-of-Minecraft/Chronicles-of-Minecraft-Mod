package com.qguidee.chroniclesofminecraft;

import com.qguidee.chroniclesofminecraft.ChroniclesOfMinecraftItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

class ChroniclesOfMinecraftItemGroups {

    static final ItemGroup ALCHEMY = (new ItemGroup("chroniclesOfMinecraftAlchemy") {
        @OnlyIn(Dist.CLIENT)
        public ItemStack createIcon() {
            return new ItemStack(ChroniclesOfMinecraftItems.fireWand);
        }
    }).setTabPath("chronicles_of_minecraft_alchemy");

    static final ItemGroup BIOMES = (new ItemGroup("chroniclesOfMinecraftBiomes") {
        @OnlyIn(Dist.CLIENT)
        public ItemStack createIcon() {
            return new ItemStack(ChroniclesOfMinecraftItems.flowerRosaAlba);
        }
    }).setTabPath("chronicles_of_minecraft_biomes");

}
