package com.qguidee.chroniclesofminecraft.common.items.alchemy.mortarpestle;

import com.qguidee.chroniclesofminecraft.ChroniclesOfMinecraftContainers;
import com.qguidee.chroniclesofminecraft.ChroniclesOfMinecraftItems;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.Slot;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.common.util.NonNullSupplier;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;

import javax.annotation.Nonnull;

public class MortarPestleContainer extends Container {

    // @CapabilityInject(IItemHandler.class)
    // private static LazyOptional<IItemHandler> ITEM_HANDLER_CAPABILITY = LazyOptional.empty();

    //private IItemHandler customInventory;

    public MortarPestleContainer(int id, PlayerInventory playerInventory) {
        super(ChroniclesOfMinecraftContainers.mortarPestle, id);

        addSlot(new SlotItemHandler(getIItemHandler(), 0, 25, 35));
        addSlot(new SlotItemHandler(getIItemHandler(), 1, 104, 10));
        addSlot(new SlotItemHandler(getIItemHandler(), 2, 133, 10));
        addSlot(new SlotItemHandler(getIItemHandler(), 3, 104, 33));
        addSlot(new SlotItemHandler(getIItemHandler(), 4, 133, 33));
        addSlot(new SlotItemHandler(getIItemHandler(), 5, 104, 57));
        addSlot(new SlotItemHandler(getIItemHandler(), 6, 133, 57));

        for (int i = 0; i < 9; i++) {
            addSlot(new Slot(playerInventory, i, 8 + (18*i), 142));
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 9; j++) {
                addSlot(new Slot(playerInventory, 9 + (i * 9) + j, 8 + (18*j), 84 + (18*i)));
            }
        }
    }

    @Override
    public boolean canInteractWith(PlayerEntity playerIn) {
        return true;
    }

    @Override
    public void onContainerClosed(PlayerEntity playerIn) {
        super.onContainerClosed(playerIn);

        for (int i = 0; i < getIItemHandler().getSlots(); i++) {
            playerIn.inventory.addItemStackToInventory(getIItemHandler().getStackInSlot(i));
        }
    }

    @Nonnull
    @Override
    public ItemStack transferStackInSlot(PlayerEntity playerIn, int index) {
        ItemStack previousItemStack = ItemStack.EMPTY;
        Slot slot = this.inventorySlots.get(index);

        if (slot != null && slot.getHasStack()) {
            ItemStack currentItemStack = slot.getStack();
            previousItemStack = currentItemStack.copy();

            if (index == 0) {
                if (!this.mergeItemStack(currentItemStack, 1, this.inventorySlots.size(), true)) {
                    return ItemStack.EMPTY;
                }
            } else if (!this.mergeItemStack(currentItemStack, 0, 1, false)) {
                return ItemStack.EMPTY;
            }

            if (currentItemStack.isEmpty()) {
                slot.putStack(ItemStack.EMPTY);
            } else {
                slot.onSlotChanged();
            }

            slot.onTake(playerIn, currentItemStack);
        }

        return previousItemStack;
    }

    private IItemHandler getIItemHandler() {
        LazyOptional<IItemHandler> ITEM_HANDLER_CAPABILITY = ((MortarPestle) ChroniclesOfMinecraftItems.mortarPestleStone).capabilityProvider.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null);

        NonNullSupplier<IItemHandler> nonNullSupplier = new NonNullSupplier<IItemHandler>() {
            @Nonnull
            @Override
            public IItemHandler get() {
                return null;
            }
        };

        return ITEM_HANDLER_CAPABILITY.orElseGet(nonNullSupplier);
    }

    void grind() {
        if (getIItemHandler().getStackInSlot(0).getItem() == ChroniclesOfMinecraftItems.flowerRosaRosea) {
            getIItemHandler().getStackInSlot(0).setCount(0);
            getIItemHandler().insertItem(1, new ItemStack(ChroniclesOfMinecraftItems.flowerRosaRoseaPetals, 1), false);
        }
    }
}
