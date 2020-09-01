package com.quentinguidee.chroniclesofminecraft.common.blocks.biomes.flowers;

import net.minecraft.block.Block;
import net.minecraft.block.FlowerBlock;
import net.minecraft.block.material.Material;
import net.minecraft.potion.Effects;

public class Flower extends FlowerBlock {
    public Flower() { super(Effects.SPEED, 0, Block.Properties.create(Material.PLANTS).tickRandomly().hardnessAndResistance(0).doesNotBlockMovement()); }
}
