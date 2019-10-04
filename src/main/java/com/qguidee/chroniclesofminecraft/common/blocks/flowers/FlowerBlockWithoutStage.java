package com.qguidee.chroniclesofminecraft.common.blocks.flowers;

import net.minecraft.block.BlockState;
import net.minecraft.block.FlowerBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Effects;
import net.minecraft.world.storage.loot.LootContext;

import java.util.List;

public class FlowerBlockWithoutStage extends FlowerBlock {

    public FlowerBlockWithoutStage(Properties properties) {
        super(Effects.SPEED, 0, properties); // TODO: Effect
    }
}
