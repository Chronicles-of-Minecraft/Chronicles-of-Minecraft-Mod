package com.quentinguidee.chroniclesofminecraft.common.blocks.biomes.flowers;

import net.minecraft.block.Block;
import net.minecraft.block.SugarCaneBlock;
import net.minecraft.block.material.Material;

public class BambusaGivra extends SugarCaneBlock {
    public BambusaGivra() {
        super(Block.Properties.create(Material.PLANTS).hardnessAndResistance(0).tickRandomly().doesNotBlockMovement());
    }
}