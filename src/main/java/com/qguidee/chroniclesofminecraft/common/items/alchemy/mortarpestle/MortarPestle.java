package com.qguidee.chroniclesofminecraft.common.items.alchemy.mortarpestle;

import com.qguidee.chroniclesofminecraft.ChroniclesOfMinecraftPacketHandler;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import net.minecraftforge.common.capabilities.ICapabilityProvider;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class MortarPestle extends Item {

    ICapabilityProvider capabilityProvider = null;

    public MortarPestle(Properties properties) {
        super(properties);
    }

    @Nonnull
    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {

        if (!worldIn.isRemote) {
            ChroniclesOfMinecraftPacketHandler.INSTANCE.sendToServer(new MortarPestlePacketCreatePetals(0));
        }

        return super.onItemRightClick(worldIn, playerIn, handIn);
    }

    @Nullable
    @Override
    public ICapabilityProvider initCapabilities(ItemStack stack, @Nullable CompoundNBT nbt) {
        return capabilityProvider = new MortarPestleCapabilityProvider();
    }
}
