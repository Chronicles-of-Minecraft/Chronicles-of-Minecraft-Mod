package com.qguidee.chroniclesofminecraft.common;

import com.qguidee.chroniclesofminecraft.ChroniclesOfMinecraftCore;
import com.qguidee.chroniclesofminecraft.common.items.ChroniclesOfMinecraftItems;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.registry.Registry;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class CustomItemGroup extends ItemGroup {

    public static final ItemGroup CHRONICLES_OF_MINECRAFT_CORE = (new ItemGroup("chroniclesOfMinecraftCore") {
        @OnlyIn(Dist.CLIENT)
        public ItemStack createIcon() {
            return new ItemStack(ChroniclesOfMinecraftItems.fireWand);
        }
    }).setTabPath("chronicles_of_minecraft_core");

    public CustomItemGroup(String label) {
        super(label);
    }

    public CustomItemGroup(int index, String label) {
        super(index, label);
    }

    @Override
    public ItemStack createIcon() {
        return null;
    }
}
