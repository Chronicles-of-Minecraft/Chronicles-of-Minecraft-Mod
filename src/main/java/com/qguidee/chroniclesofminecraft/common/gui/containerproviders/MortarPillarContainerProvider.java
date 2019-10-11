package com.qguidee.chroniclesofminecraft.common.gui.containerproviders;


import com.qguidee.chroniclesofminecraft.ChroniclesOfMinecraftItems;
import com.qguidee.chroniclesofminecraft.common.gui.container.MortarPestleContainer;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.Objects;

public class MortarPillarContainerProvider implements INamedContainerProvider {

    public MortarPillarContainerProvider() {
        super();
    }

    @Nonnull
    @Override
    public ITextComponent getDisplayName() {
        return new StringTextComponent(Objects.requireNonNull(ChroniclesOfMinecraftItems.mortarPestleStone.getRegistryName()).getPath());
    }

    @Nullable
    @Override
    public Container createMenu(int windowId, @Nonnull PlayerInventory playerInventory, PlayerEntity playerEntity) {
        return new MortarPestleContainer(windowId, playerInventory);
    }
}
