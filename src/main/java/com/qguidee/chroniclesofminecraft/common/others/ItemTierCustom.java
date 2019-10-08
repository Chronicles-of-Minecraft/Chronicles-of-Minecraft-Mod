package com.qguidee.chroniclesofminecraft.common.others;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyLoadBase;

import java.util.function.Supplier;

public enum ItemTierCustom implements IItemTier {

    IRON_SICKLE(0, 50, 6.0F, 0.0F, 14, () -> {
        return Ingredient.fromItems(Items.IRON_INGOT);
    }),
    GOLD_SICKLE(1, 150, 10.0F, 0.0F, 22, () -> {
        return Ingredient.fromItems(Items.GOLD_INGOT);
    }),
    ALCHEMIUM_SICKLE(2, 600, 16.0F, 0.0F, 36, () -> {
        return Ingredient.fromItems(Items.GOLD_INGOT); // TODO: Change this.
    });

    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    private final LazyLoadBase<Ingredient> repairMaterial;

    private ItemTierCustom(int harvestLevelIn, int maxUsesIn, float efficiencyIn, float attackDamageIn, int enchantabilityIn, Supplier<Ingredient> repairMaterialIn) {
        this.harvestLevel = harvestLevelIn;
        this.maxUses = maxUsesIn;
        this.efficiency = efficiencyIn;
        this.attackDamage = attackDamageIn;
        this.enchantability = enchantabilityIn;
        this.repairMaterial = new LazyLoadBase<>(repairMaterialIn);
    }

    public int getMaxUses() {
        return this.maxUses;
    }

    public float getEfficiency() {
        return this.efficiency;
    }

    public float getAttackDamage() {
        return this.attackDamage;
    }

    public int getHarvestLevel() {
        return this.harvestLevel;
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    public Ingredient getRepairMaterial() {
        return this.repairMaterial.getValue();
    }

}
