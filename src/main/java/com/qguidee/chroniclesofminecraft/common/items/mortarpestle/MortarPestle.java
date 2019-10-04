package com.qguidee.chroniclesofminecraft.common.items.mortarpestle;

import com.qguidee.chroniclesofminecraft.ChroniclesOfMinecraftItems;
import net.minecraft.client.renderer.texture.ITickable;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.common.util.NonNullSupplier;
import net.minecraftforge.fml.network.NetworkHooks;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class MortarPestle extends Item implements ITickable {

    public ICapabilityProvider capabilityProvider = null;

    public MortarPestle(Properties properties) {
        super(properties);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
        ServerPlayerEntity playerEntity = null;

        if (!worldIn.isRemote) {
            for (ServerPlayerEntity entity : worldIn.getServer().getPlayerList().getPlayers()) // TODO: Lags ??
                if (entity.getUniqueID().equals(playerIn.getUniqueID())) {
                    playerEntity = entity;
                    break;
                }

            NetworkHooks.openGui(playerEntity, new MortarPillarContainerProvider());
        }

        return super.onItemRightClick(worldIn, playerIn, handIn);
    }

    @Nullable
    @Override
    public ICapabilityProvider initCapabilities(ItemStack stack, @Nullable CompoundNBT nbt) {
        return capabilityProvider = new MortarPestleCapabilityProvider();
    }

    @Override
    public void tick() {
        LazyOptional<IItemHandler> ITEM_HANDLER_CAPABILITY = ((MortarPestle) ChroniclesOfMinecraftItems.mortarPestleStone).capabilityProvider.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null);

        NonNullSupplier<IItemHandler> nonNullSupplier = new NonNullSupplier<IItemHandler>() {
            @Nonnull
            @Override
            public IItemHandler get() {
                return null;
            }
        };

        if (ITEM_HANDLER_CAPABILITY.orElseGet(nonNullSupplier).getStackInSlot(0).getItem() == ChroniclesOfMinecraftItems.flowerRosaRosea) {
            ITEM_HANDLER_CAPABILITY.orElseGet(nonNullSupplier).getStackInSlot(0).setCount(0);
            ITEM_HANDLER_CAPABILITY.orElseGet(nonNullSupplier).insertItem(1, new ItemStack(ChroniclesOfMinecraftItems.flowerRosaRoseaPetals, 1), false);
        }
    }
}
