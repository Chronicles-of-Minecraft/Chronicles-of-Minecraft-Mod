package com.qguidee.chroniclesofminecraft.common.items.mortarpestle;

import com.qguidee.chroniclesofminecraft.common.items.ChroniclesOfMinecraftItems;
import net.minecraft.client.renderer.texture.ITickable;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.INBT;
import net.minecraft.util.Direction;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.common.util.INBTSerializable;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.items.ItemStackHandler;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class MortarPestleCapabilityProvider implements ICapabilityProvider, INBTSerializable {

    private ItemStackHandler itemHandler;

    @Nonnull
    private ItemStackHandler getItemHandler() {
        if (itemHandler == null)
            itemHandler = new ItemStackHandler(7);

        return this.itemHandler;
    }

    @Nonnull
    @Override
    public <T> LazyOptional<T> getCapability(@Nonnull Capability<T> cap, @Nullable Direction side) {
        if (cap == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY)
            return LazyOptional.of(this::getItemHandler).cast();

        return LazyOptional.empty();
    }

    @Override
    public INBT serializeNBT() {
        return null;
    }

    @Override
    public void deserializeNBT(INBT nbt) {

    }
}
