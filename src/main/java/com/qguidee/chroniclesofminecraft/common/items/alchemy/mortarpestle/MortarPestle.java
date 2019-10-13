package com.qguidee.chroniclesofminecraft.common.items.alchemy.mortarpestle;

import com.qguidee.chroniclesofminecraft.ModItemGroups;
import com.qguidee.chroniclesofminecraft.ModPacketHandler;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

import javax.annotation.Nonnull;

public class MortarPestle extends Item {

    public MortarPestle() {
        super(new Item.Properties()
                .maxStackSize(1)
                .group(ModItemGroups.ALCHEMY)
        );
    }

    @Nonnull
    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {

        if (!worldIn.isRemote) {
            ModPacketHandler.INSTANCE.sendToServer(new MortarPestlePacketCreatePetals(0));
        }

        return super.onItemRightClick(worldIn, playerIn, handIn);
    }
}
