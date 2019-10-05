package com.qguidee.chroniclesofminecraft.common.items.alchemy;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;

public class AlchemicalBulbFluidsList {

    public static AlchemicalBulbFluid EMPTY = new AlchemicalBulbFluid("empty", 16777045);
    public static AlchemicalBulbFluid WATER = new AlchemicalBulbFluid("water", 16755200);

    public static List<AlchemicalBulbFluid> getList() {
        return Lists.newArrayList(EMPTY, WATER);
    }

}
