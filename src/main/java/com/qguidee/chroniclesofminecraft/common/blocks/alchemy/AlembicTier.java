package com.qguidee.chroniclesofminecraft.common.blocks.alchemy;

import com.qguidee.chroniclesofminecraft.ModContainers;
import com.qguidee.chroniclesofminecraft.ModItems;
import com.qguidee.chroniclesofminecraft.ModTileEntities;
import com.qguidee.chroniclesofminecraft.common.gui.container.AlembicContainer;
import com.qguidee.chroniclesofminecraft.common.gui.tileentity.AlembicTileEntity;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntityType;

public enum AlembicTier {
    ALEMBIC_MK1(5, ModItems.alembicMk1, ModTileEntities.alembicMk1, ModContainers.alembicMk1, "textures/gui/brewing_stand_mk1.png"),
    ALEMBIC_MK2(6, ModItems.alembicMk2, ModTileEntities.alembicMk2, ModContainers.alembicMk2, "textures/gui/brewing_stand_mk2.png"),
    ALEMBIC_MK3(7, ModItems.alembicMk3, ModTileEntities.alembicMk3, ModContainers.alembicMk3, "textures/gui/brewing_stand_mk3.png");

    private int itemHandlerSize;
    private Item item;
    private TileEntityType<AlembicTileEntity> tileEntity;
    private ContainerType<AlembicContainer> container;
    private String resource;

    AlembicTier(int itemHandlerSize, Item item, TileEntityType<AlembicTileEntity> tileEntity, ContainerType<AlembicContainer> container, String resource) {
        this.itemHandlerSize = itemHandlerSize;
        this.item = item;
        this.tileEntity = tileEntity;
        this.container = container;
        this.resource = resource;
    }

    public int getItemHandlerSize() {
        return itemHandlerSize;
    }

    public Item getItem() {
        return item;
    }

    public TileEntityType<AlembicTileEntity> getTileEntity() {
        return tileEntity;
    }

    public ContainerType<AlembicContainer> getContainer() {
        return container;
    }

    public String getResource() {
        return resource;
    }
}
