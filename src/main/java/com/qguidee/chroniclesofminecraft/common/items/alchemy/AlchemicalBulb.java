package com.qguidee.chroniclesofminecraft.common.items.alchemy;

import com.qguidee.chroniclesofminecraft.ChroniclesOfMinecraftCore;
import com.qguidee.chroniclesofminecraft.ChroniclesOfMinecraftItems;
import net.minecraft.client.renderer.color.IItemColor;
import net.minecraft.client.renderer.model.ModelBakery;
import net.minecraft.client.renderer.model.ModelResourceLocation;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.AreaEffectCloudEntity;
import net.minecraft.entity.boss.dragon.EnderDragonEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionUtils;
import net.minecraft.potion.Potions;
import net.minecraft.stats.Stats;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.RayTraceContext;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponent;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.model.IModelPart;
import net.minecraftforge.common.model.IModelState;
import net.minecraftforge.common.model.TRSRTransformation;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Optional;

public class AlchemicalBulb extends Item {
    public AlchemicalBulb(Properties builder) {
        super(builder);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {

        RayTraceResult raytraceresult = rayTrace(worldIn, playerIn, RayTraceContext.FluidMode.SOURCE_ONLY);
        ItemStack itemstack = playerIn.getHeldItem(handIn);

        if (raytraceresult.getType() == RayTraceResult.Type.MISS) {
            return new ActionResult<>(ActionResultType.PASS, itemstack);
        } else {
            if (raytraceresult.getType() == RayTraceResult.Type.BLOCK) {
                BlockPos blockpos = ((BlockRayTraceResult)raytraceresult).getPos();
                if (!worldIn.isBlockModifiable(playerIn, blockpos)) {
                    return new ActionResult<>(ActionResultType.PASS, itemstack);
                }

                if (worldIn.getFluidState(blockpos).isTagged(FluidTags.WATER)) {
                    worldIn.playSound(playerIn, playerIn.posX, playerIn.posY, playerIn.posZ, SoundEvents.ITEM_BOTTLE_FILL, SoundCategory.NEUTRAL, 1.0F, 1.0F);
                    return new ActionResult<>(ActionResultType.SUCCESS, this.turnBottleIntoItem(itemstack, playerIn, addPotionToItemStack(new ItemStack(ChroniclesOfMinecraftItems.alchemicalBulbEmpty), AlchemicalBulbFluidsList.WATER)));
                }
            }

            return new ActionResult<>(ActionResultType.PASS, itemstack);
        }
    }

    protected ItemStack turnBottleIntoItem(ItemStack itemStack, PlayerEntity player, ItemStack stack) {
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

    public static ItemStack addPotionToItemStack(ItemStack itemIn, AlchemicalBulbFluid alchemicalBulbFluid) {
        // PotionUtils.addPotionToItemStack()

        itemIn.getOrCreateTag().putString("AlchemicalBulbFluid", alchemicalBulbFluid.getKey());

        return itemIn;
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        if (stack.getTag() != null && !stack.getTag().getString("AlchemicalBulbFluid").equals("") && stack.getTag().getString("AlchemicalBulbFluid").equals(AlchemicalBulbFluidsList.WATER.getKey())) {
            tooltip.add(new TextComponent() {
                @Override
                public String getUnformattedComponentText() {
                    return "WATER";
                }

                @Override
                public ITextComponent shallowCopy() {
                    return null;
                }
            });
        } else if (stack.getTag() != null && !stack.getTag().getString("AlchemicalBulbFluid").equals("") && stack.getTag().getString("AlchemicalBulbFluid").equals(AlchemicalBulbFluidsList.EMPTY.getKey())) {
            tooltip.add(new TextComponent() {
                @Override
                public String getUnformattedComponentText() {
                    return "EMPTY";
                }

                @Override
                public ITextComponent shallowCopy() {
                    return null;
                }
            });
        } else {
            tooltip.add(new TextComponent() {
                @Override
                public String getUnformattedComponentText() {
                    return "NULL";
                }

                @Override
                public ITextComponent shallowCopy() {
                    return null;
                }
            });
        }
    }

    @Override
    public void fillItemGroup(ItemGroup group, NonNullList<ItemStack> items) {
        super.fillItemGroup(group, items);


        for (AlchemicalBulbFluid alchemicalBulbFluid : AlchemicalBulbFluidsList.getList()) {
            ItemStack itemStack = new ItemStack(ChroniclesOfMinecraftItems.alchemicalBulbEmpty);
            itemStack.getOrCreateTag().putString("AlchemicalBulbFluid", alchemicalBulbFluid.getKey());

            // "bulb_content=" + alchemicalBulbFluid.getKey()
            ModelResourceLocation modelResourceLocation = new ModelResourceLocation(this.getRegistryName(), "inventory");

            ModelLoader.addSpecialModel(modelResourceLocation);

            items.add(itemStack);
        }
    }
}
