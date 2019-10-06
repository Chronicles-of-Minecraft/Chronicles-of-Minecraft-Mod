package com.qguidee.chroniclesofminecraft.common.items.fight.armors.alchemium;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.IArmorMaterial;

public class AlchemiumArmor extends ArmorItem {
    public AlchemiumArmor(EquipmentSlotType slot, Properties builder) {
        super(ArmorMaterial.DIAMOND, slot, builder);
    }
}
