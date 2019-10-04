package com.qguidee.chroniclesofminecraft.common.items.mortarpestle;

import net.minecraft.util.Direction;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.ItemStackHandler;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class MortarPestleCapabilityProvider implements ICapabilityProvider {

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
}
