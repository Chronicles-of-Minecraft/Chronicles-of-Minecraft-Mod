package com.qguidee.chroniclesofminecraft.common.gui.tileentity;

import com.qguidee.chroniclesofminecraft.common.blocks.alchemy.AlembicTier;
import com.qguidee.chroniclesofminecraft.common.gui.container.AlembicContainer;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.ItemStackHandler;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.Objects;

public class AlembicTileEntity extends TileEntity implements INamedContainerProvider, ITickableTileEntity {

    private ItemStackHandler itemStackHandler;

    private AlembicTier alembicTier;

    public AlembicTileEntity() {
        super(AlembicTier.ALEMBIC_MK1.getTileEntity());

        this.alembicTier = AlembicTier.ALEMBIC_MK1;
    }

    public AlembicTileEntity(AlembicTier alembicTier) {
        super(alembicTier.getTileEntity());

        this.alembicTier = alembicTier;
    }

    @Nonnull
    @Override
    public ITextComponent getDisplayName() {
        return new StringTextComponent(Objects.requireNonNull(getType().getRegistryName()).getPath());
    }

    @Nullable
    @Override
    public Container createMenu(int i, @Nonnull PlayerInventory playerInventory, @Nonnull PlayerEntity playerEntity) {
        assert world != null;
        return new AlembicContainer(i, world, pos, playerInventory, playerEntity, alembicTier);
    }

    @Override
    public void tick() {

    }

    @Nonnull
    @Override
    public CompoundNBT write(CompoundNBT compound) {
        CompoundNBT compoundNBTInv = getItemStackHandler().serializeNBT();

        compound.put("inventory", compoundNBTInv);
        compound.putInt("alembic_tier", alembicTier.ordinal());

        return super.write(compound);
    }

    @Override
    public void read(CompoundNBT compound) {
        CompoundNBT compoundNBTInv = compound.getCompound("inventory");
        getItemStackHandler().deserializeNBT(compoundNBTInv);

        int i = compound.getInt("alembic_tier");
        this.alembicTier = AlembicTier.values()[i];

        super.read(compound);
    }

    private ItemStackHandler getItemStackHandler() {
        if (itemStackHandler == null)
            return itemStackHandler = new ItemStackHandler(alembicTier.getItemHandlerSize());

        return itemStackHandler;
    }

    @Nonnull
    @Override
    public <T> LazyOptional<T> getCapability(@Nonnull Capability<T> cap) {
        if (cap == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY) {
            return LazyOptional.of(() -> (T) getItemStackHandler());
        }

        return super.getCapability(cap);
    }
}
