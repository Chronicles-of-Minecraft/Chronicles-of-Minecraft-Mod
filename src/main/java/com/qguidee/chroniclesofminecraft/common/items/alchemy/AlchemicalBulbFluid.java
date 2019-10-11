package com.qguidee.chroniclesofminecraft.common.items.alchemy;

public enum AlchemicalBulbFluid {
    EMPTY("empty", 16777045),
    WATER("water", 16755200);

    private String key;
    private int color;

    AlchemicalBulbFluid(String key, int color) {
        this.key = key;
        this.color = color;
    }

    public String getKey() {
        return key;
    }

    public int getColor() {
        return color;
    }
}
