package com.qguidee.chroniclesofminecraft.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.util.BlockRenderLayer;

public class Alembic extends Block {

    public Alembic(Properties properties) {
        super(properties);
    }

    @Override
    public BlockRenderLayer getRenderLayer() {
        return BlockRenderLayer.TRANSLUCENT;
    }


}
