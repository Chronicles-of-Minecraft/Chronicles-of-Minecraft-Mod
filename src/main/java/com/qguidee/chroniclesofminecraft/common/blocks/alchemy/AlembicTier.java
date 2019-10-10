package com.qguidee.chroniclesofminecraft.common.blocks.alchemy;

import com.qguidee.chroniclesofminecraft.ChroniclesOfMinecraftContainers;
import com.qguidee.chroniclesofminecraft.ChroniclesOfMinecraftItems;
import com.qguidee.chroniclesofminecraft.ChroniclesOfMinecraftTileEntities;
import com.qguidee.chroniclesofminecraft.common.gui.container.AlembicContainer;
import com.qguidee.chroniclesofminecraft.common.gui.tileentity.AlembicTileEntity;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntityType;

public enum AlembicTier {
    ALEMBIC_MK1(5, ChroniclesOfMinecraftItems.alembicMk1, ChroniclesOfMinecraftTileEntities.alembicMk1, ChroniclesOfMinecraftContainers.alembicMk1, "textures/gui/brewing_stand_mk1.png"),
    ALEMBIC_MK2(6, ChroniclesOfMinecraftItems.alembicMk2, ChroniclesOfMinecraftTileEntities.alembicMk2, ChroniclesOfMinecraftContainers.alembicMk2, "textures/gui/brewing_stand_mk2.png"),
    ALEMBIC_MK3(7, ChroniclesOfMinecraftItems.alembicMk3, ChroniclesOfMinecraftTileEntities.alembicMk3, ChroniclesOfMinecraftContainers.alembicMk3, "textures/gui/brewing_stand_mk3.png");

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
