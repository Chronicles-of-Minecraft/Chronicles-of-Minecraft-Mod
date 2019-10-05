package com.qguidee.chroniclesofminecraft.common.blocks.alchemy.alembic;

import com.qguidee.chroniclesofminecraft.ChroniclesOfMinecraftContainers;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.items.IItemHandler;
import net.minecraft.world.World;
import net.minecraftforge.items.wrapper.InvWrapper;

import javax.annotation.Nullable;

public class AlembicContainer extends Container {

    private TileEntity tileEntity;
    private PlayerEntity playerEntity;
    private IItemHandler playerInventory;

    protected AlembicContainer(@Nullable ContainerType<?> type, int id) {
        super(ChroniclesOfMinecraftContainers.alembic, id);
    }

    public AlembicContainer(int windowId, World world, BlockPos pos, PlayerInventory playerInventory, PlayerEntity player) {
        super(ChroniclesOfMinecraftContainers.alembic, windowId);

        tileEntity = world.getTileEntity(pos);
        this.playerEntity = player;
        this.playerInventory = new InvWrapper(playerInventory);
    }



    @Override
    public boolean canInteractWith(PlayerEntity playerIn) {
        return true;
        //return isWithinUsableDistance(IWorldPosCallable.of(tileEntity.getWorld(), tileEntity.getPos()), playerEntity, ChroniclesOfMinecraftBlocks.alembic);
    }
}
