package com.qguidee.chroniclesofminecraft.common.gui.container;

import com.qguidee.chroniclesofminecraft.ChroniclesOfMinecraftContainers;
import com.qguidee.chroniclesofminecraft.common.blocks.alchemy.AlembicTier;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;
import net.minecraftforge.items.wrapper.InvWrapper;

import javax.annotation.Nonnull;

public class AlembicContainer extends Container {

    private TileEntity tileEntity;
    private PlayerEntity playerEntity;
    private IItemHandler playerInventory;

    public AlembicTier alembicTier;

    public AlembicContainer(int windowId, World world, BlockPos pos, PlayerInventory playerInventory, PlayerEntity player) {
        this(windowId, world, pos, playerInventory, player, AlembicTier.ALEMBIC_MK1);
    }

    public AlembicContainer(int windowId, World world, BlockPos pos, PlayerInventory playerInventory, PlayerEntity player, AlembicTier alembicTier) {
        super(ChroniclesOfMinecraftContainers.alembic, windowId);

        tileEntity = world.getTileEntity(pos);
        this.playerEntity = player;
        this.playerInventory = new InvWrapper(playerInventory);

        this.alembicTier = alembicTier;

        assert tileEntity != null;

        if (alembicTier == AlembicTier.ALEMBIC_MK1) {
            tileEntity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY).ifPresent(itemHandler -> {
                addSlot(new SlotItemHandler(itemHandler, 0, 8, 28));
                addSlot(new SlotItemHandler(itemHandler, 0, 42, 28));
                addSlot(new SlotItemHandler(itemHandler, 0, 152, 28));
                addSlot(new SlotItemHandler(itemHandler, 0, 63, 66));
                addSlot(new SlotItemHandler(itemHandler, 0, 97, 72));
            });
        } else if (alembicTier == AlembicTier.ALEMBIC_MK2) {

        } else if (alembicTier == AlembicTier.ALEMBIC_MK3) {

        }

        for (int i = 0; i < 9; i++) {
            addSlot(new Slot(playerInventory, i, 8 + (18 * i), 157));
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 9; j++) {
                addSlot(new Slot(playerInventory, 9 + (i * 9) + j, 8 + (18 * j), 99 + (18 * i)));
            }
        }
    }

    @Override
    public boolean canInteractWith(@Nonnull PlayerEntity playerIn) {
        return true;
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
}
