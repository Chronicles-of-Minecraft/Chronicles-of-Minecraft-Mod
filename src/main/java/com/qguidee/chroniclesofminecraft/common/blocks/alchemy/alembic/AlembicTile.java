package com.qguidee.chroniclesofminecraft.common.blocks.alchemy.alembic;

import com.qguidee.chroniclesofminecraft.ChroniclesOfMinecraftTileEntities;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;

import javax.annotation.Nullable;

public class AlembicTile extends TileEntity implements INamedContainerProvider {

    public AlembicTile() {
        super(ChroniclesOfMinecraftTileEntities.alembicMk1);
    }

    @Override
    public ITextComponent getDisplayName() {
        return new StringTextComponent(getType().getRegistryName().getPath());
    }

    @Nullable
    @Override
    public Container createMenu(int i, PlayerInventory playerInventory, PlayerEntity playerEntity) {
        return new AlembicContainer(i, world, pos, playerInventory, playerEntity);
    }
}
