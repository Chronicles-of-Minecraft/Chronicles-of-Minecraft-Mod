package com.qguidee.chroniclesofminecraft.common.blocks.alchemy;

import com.qguidee.chroniclesofminecraft.ModCore;
import com.qguidee.chroniclesofminecraft.common.gui.tileentity.AlembicTileEntity;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.NetworkHooks;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class Alembic extends Block {

    public Alembic(Properties properties) {
        super(properties);
    }

    @Nonnull
    @Override
    public BlockRenderLayer getRenderLayer() {
        return BlockRenderLayer.TRANSLUCENT;
    }

    @Override
    public boolean onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
        if (!worldIn.isRemote) {
            TileEntity tileEntity = worldIn.getTileEntity(pos);
            if (tileEntity instanceof INamedContainerProvider) {
                NetworkHooks.openGui((ServerPlayerEntity) player, (INamedContainerProvider) tileEntity, tileEntity.getPos());
            } else {
                throw new IllegalStateException("Our named container provider is missing!");
            }
            return true;
        }
        return super.onBlockActivated(state, worldIn, pos, player, handIn, hit);
    }

    @Nullable
    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        return new AlembicTileEntity(getAlembicTier());
    }

    private AlembicTier getAlembicTier() {
        switch (getRegistryName().getPath()) {
            case "alembic_mk1":
                return AlembicTier.ALEMBIC_MK1;
            case "alembic_mk2":
                return AlembicTier.ALEMBIC_MK2;
            case "alembic_mk3":
                return AlembicTier.ALEMBIC_MK3;
        }

        ModCore.LOGGER.error("ALEMBIC_MK1 by default. Please check the issue. (" + getRegistryName().getPath() + ")");
        return AlembicTier.ALEMBIC_MK1;
    }

    @Override
    public boolean hasTileEntity(BlockState state) {
        return true;
    }

    @Override
    public boolean hasTileEntity() {
        return true;
    }
}
