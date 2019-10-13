package com.qguidee.chroniclesofminecraft;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nonnull;

public class ModItemGroups {

    public static final ItemGroup ALCHEMY = (new ItemGroup("chroniclesOfMinecraftAlchemy") {
        @Nonnull
        @OnlyIn(Dist.CLIENT)
        public ItemStack createIcon() {
            return new ItemStack(ModItems.fireWand);
        }
    }).setTabPath("chronicles_of_minecraft_alchemy");


    public static final ItemGroup BIOMES = (new ItemGroup("chroniclesOfMinecraftBiomes") {
        @Nonnull
        @OnlyIn(Dist.CLIENT)
        public ItemStack createIcon() {
            return new ItemStack(ModItems.flowerRosaAlba);
        }
    }).setTabPath("chronicles_of_minecraft_biomes");

}
