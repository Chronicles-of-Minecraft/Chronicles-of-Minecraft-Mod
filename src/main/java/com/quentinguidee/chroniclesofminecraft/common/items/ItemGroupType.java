package com.quentinguidee.chroniclesofminecraft.common.items;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ItemGroupType {
    public static final ItemGroup MAGIC = new ItemGroup("chroniclesOfMinecraftMagic") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.FIRE_WAND.get());
        }
    };

    public static final ItemGroup ALCHEMY = new ItemGroup("chroniclesOfMinecraftAlchemy") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.ALCHEMIUM_BOOTS.get());
        }
    };

    public static final ItemGroup BIOMES = new ItemGroup("chroniclesOfMinecraftBiomes") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.FLOWER_ALOES_CANDELA.get());
        }
    };
}
