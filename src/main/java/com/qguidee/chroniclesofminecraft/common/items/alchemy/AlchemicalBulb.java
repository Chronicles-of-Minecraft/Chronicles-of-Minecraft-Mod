package com.qguidee.chroniclesofminecraft.common.items.alchemy;

import com.qguidee.chroniclesofminecraft.ModItemGroups;
import com.qguidee.chroniclesofminecraft.ModItems;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Stats;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.RayTraceContext;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponent;
import net.minecraft.world.World;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.List;

public class AlchemicalBulb extends Item {
    public AlchemicalBulb(Properties builder) {
        super(builder);
    }

    @Nonnull
    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, @Nonnull Hand handIn) {
        RayTraceResult raytraceresult = rayTrace(worldIn, playerIn, RayTraceContext.FluidMode.SOURCE_ONLY);
        ItemStack itemstack = playerIn.getHeldItem(handIn);

        if (raytraceresult.getType() == RayTraceResult.Type.MISS) {
            return new ActionResult<>(ActionResultType.PASS, itemstack);
        } else {
            if (raytraceresult.getType() == RayTraceResult.Type.BLOCK) {
                BlockPos blockpos = ((BlockRayTraceResult) raytraceresult).getPos();
                if (!worldIn.isBlockModifiable(playerIn, blockpos)) {
                    return new ActionResult<>(ActionResultType.PASS, itemstack);
                }

                if (worldIn.getFluidState(blockpos).isTagged(FluidTags.WATER)) {
                    worldIn.playSound(playerIn, playerIn.posX, playerIn.posY, playerIn.posZ, SoundEvents.ITEM_BOTTLE_FILL, SoundCategory.NEUTRAL, 1.0F, 1.0F);
                    return new ActionResult<>(ActionResultType.SUCCESS, this.turnBottleIntoItem(itemstack, playerIn, addPotionToItemStack(new ItemStack(ModItems.alchemicalBulb), AlchemicalBulbFluid.WATER)));
                }
            }

            return new ActionResult<>(ActionResultType.PASS, itemstack);
        }
    }

    private ItemStack turnBottleIntoItem(ItemStack itemStack, PlayerEntity player, ItemStack stack) {
        itemStack.shrink(1);
        player.addStat(Stats.ITEM_USED.get(this));
        if (itemStack.isEmpty()) {
            return stack;
        } else {
            if (!player.inventory.addItemStackToInventory(stack)) {
                player.dropItem(stack, false);
            }

            return itemStack;
        }
    }

    private static ItemStack addPotionToItemStack(ItemStack itemIn, AlchemicalBulbFluid alchemicalBulbFluid) {
        itemIn.getOrCreateTag().putInt("AlchemicalBulbFluid", alchemicalBulbFluid.ordinal());

        return itemIn;
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        if (stack.getTag() != null && stack.getTag().getInt("AlchemicalBulbFluid") == AlchemicalBulbFluid.EMPTY.ordinal()) {
            tooltip.add(new TextComponent() {
                @Nonnull
                @Override
                public String getUnformattedComponentText() {
                    return "EMPTY";
                }

                @Nonnull
                @Override
                public ITextComponent shallowCopy() {
                    return null;
                }
            });
        } else if (stack.getTag() != null && stack.getTag().getInt("AlchemicalBulbFluid") == AlchemicalBulbFluid.WATER.ordinal()) {
            tooltip.add(new TextComponent() {
                @Nonnull
                @Override
                public String getUnformattedComponentText() {
                    return "WATER";
                }

                @Nonnull
                @Override
                public ITextComponent shallowCopy() {
                    return null;
                }
            });
        }
    }

    @Override
    public void fillItemGroup(@Nonnull ItemGroup group, @Nonnull NonNullList<ItemStack> items) {
        super.fillItemGroup(group, items);

        if (group == ModItemGroups.ALCHEMY) {
            for (AlchemicalBulbFluid alchemicalBulbFluid : AlchemicalBulbFluid.values()) {
                ItemStack itemStack = new ItemStack(ModItems.alchemicalBulb);
                itemStack.getOrCreateTag().putInt("AlchemicalBulbFluid", alchemicalBulbFluid.ordinal());

                items.add(itemStack);
            }
        }
    }
}
