package com.qguidee.chroniclesofminecraft.common.blocks.biomes.flowers;

import net.minecraft.block.Block;
import net.minecraft.block.FlowerBlock;
import net.minecraft.block.material.Material;
import net.minecraft.potion.Effects;

public class FlowerBlockWithoutStage extends FlowerBlock {

    public FlowerBlockWithoutStage() {
        super(Effects.SPEED, 0, Block.Properties
                .create(Material.PLANTS)
                .hardnessAndResistance(0)
                .doesNotBlockMovement()
        ); // TODO: Effect
    }
}
