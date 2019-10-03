package com.qguidee.chroniclesofminecraft.common.items.mortarpestle;

import com.qguidee.chroniclesofminecraft.common.blocks.ChroniclesOfMinecraftContainers;
import com.qguidee.chroniclesofminecraft.common.items.ChroniclesOfMinecraftItems;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.Slot;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.common.util.NonNullSupplier;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemStackHandler;
import net.minecraftforge.items.SlotItemHandler;

import javax.annotation.Nonnull;

public class MortarPestleContainer extends Container {

    @CapabilityInject(IItemHandler.class)
    private static LazyOptional<IItemHandler> ITEM_HANDLER_CAPABILITY = LazyOptional.empty();

    private IItemHandler customInventory;

    public MortarPestleContainer(int id, PlayerInventory playerInventory) {
        super(ChroniclesOfMinecraftContainers.mortarPestle, id);

        ITEM_HANDLER_CAPABILITY = ((MortarPestle) ChroniclesOfMinecraftItems.mortarPestleStone).capabilityProvider.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null);

        NonNullSupplier<IItemHandler> nonNullSupplier = new NonNullSupplier<IItemHandler>() {
            @Nonnull
            @Override
            public IItemHandler get() {
                return null;
            }
        };

        customInventory = ITEM_HANDLER_CAPABILITY.orElseGet(nonNullSupplier);

        addSlot(new SlotItemHandler(customInventory, 0, 25, 35));
        addSlot(new SlotItemHandler(customInventory, 1, 104, 10));
        addSlot(new SlotItemHandler(customInventory, 2, 133, 10));
        addSlot(new SlotItemHandler(customInventory, 3, 104, 33));
        addSlot(new SlotItemHandler(customInventory, 4, 133, 33));
        addSlot(new SlotItemHandler(customInventory, 5, 104, 57));
        addSlot(new SlotItemHandler(customInventory, 6, 133, 57));

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

        for (int i = 0; i < customInventory.getSlots(); i++) {
            playerIn.inventory.addItemStackToInventory(customInventory.getStackInSlot(i));
        }
    }

    @Nonnull
    @Override
    public ItemStack transferStackInSlot(PlayerEntity playerIn, int index) {
        ItemStack itemstack = ItemStack.EMPTY;
        Slot slot = this.inventorySlots.get(index);

        if (slot != null && slot.getHasStack()) {
            ItemStack itemstack1 = slot.getStack();
            itemstack = itemstack1.copy();

            if (index == 0) {
                if (!this.mergeItemStack(itemstack1, 1, /*this.inventorySlots.size()*/ 42, true)) {
                    return ItemStack.EMPTY;
                }
            } else if (!this.mergeItemStack(itemstack1, 0, 1, false)) {
                return ItemStack.EMPTY;
            }

            if (itemstack1.isEmpty()) {
                slot.putStack(ItemStack.EMPTY);
            } else {
                slot.onSlotChanged();
            }
        }

        return itemstack;
    }

    public void grind() {
        int itemCount = customInventory.getStackInSlot(0).getCount();

        if (customInventory.getStackInSlot(0).getItem() == ChroniclesOfMinecraftItems.flowerRosaRosea) {

            ((ItemStackHandler) customInventory).setStackInSlot(0, ItemStack.EMPTY);
            ((ItemStackHandler) customInventory).setStackInSlot(1, new ItemStack(ChroniclesOfMinecraftItems.flowerRosaRoseaPetals, itemCount));

//            customInventory.getStackInSlot(0).shrink(itemCount);
//            customInventory.insertItem(1, new ItemStack(ChroniclesOfMinecraftItems.flowerRosaRoseaPetals, 1), false);


        }
    }

}
