package com.quentinguidee.chroniclesofminecraft.common.biomes.world;

import net.minecraft.world.gen.OverworldGenSettings;

public class ModGenSettings extends OverworldGenSettings {
    @Override
    public int getBiomeSize() {
        return 4;
    }

    @Override
    public int getRiverSize() {
        return 4;
    }

    @Override
    public int getBiomeId() {
        return -1;
    }

    @Override
    public int getBedrockFloorHeight() {
        return 0;
    }
}
