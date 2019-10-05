package com.qguidee.chroniclesofminecraft.common.items.alchemy.mortarpestle;


import com.qguidee.chroniclesofminecraft.ChroniclesOfMinecraftItems;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;

import javax.annotation.Nullable;

public class MortarPillarContainerProvider implements INamedContainerProvider {

    public MortarPillarContainerProvider() {
        super();
    }

    @Override
    public ITextComponent getDisplayName() {
        return new StringTextComponent(ChroniclesOfMinecraftItems.mortarPestleStone.getRegistryName().getPath());
    }

    @Nullable
    @Override
    public Container createMenu(int windowId, PlayerInventory playerInventory, PlayerEntity playerEntity) {
        return new MortarPestleContainer(windowId, playerInventory);
    }

}
