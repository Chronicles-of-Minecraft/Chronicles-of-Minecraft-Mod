package com.qguidee.chroniclesofminecraft.common.blocks.alchemy.bottler;

import net.minecraft.block.Block;
import net.minecraft.util.BlockRenderLayer;

import javax.annotation.Nonnull;

public class Bottler extends Block {

    public Bottler(Properties properties) {
        super(properties);
    }

    @Nonnull
    @Override
    public BlockRenderLayer getRenderLayer() {
        return BlockRenderLayer.CUTOUT_MIPPED;
    }
}
