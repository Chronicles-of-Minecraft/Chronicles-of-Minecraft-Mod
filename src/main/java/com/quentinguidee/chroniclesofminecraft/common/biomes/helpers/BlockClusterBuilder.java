package com.quentinguidee.chroniclesofminecraft.common.biomes.helpers;

import net.minecraft.block.Block;
import net.minecraft.world.gen.blockplacer.SimpleBlockPlacer;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.BlockClusterFeatureConfig;
import net.minecraftforge.fml.RegistryObject;

public class BlockClusterBuilder {
    public static BlockClusterFeatureConfig build(RegistryObject<Block> registryObject) {
        BlockClusterFeatureConfig.Builder blockClusterFeatureConfigBuilder = new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(registryObject.get().getDefaultState()), new SimpleBlockPlacer());
        return blockClusterFeatureConfigBuilder.build();
    }
}