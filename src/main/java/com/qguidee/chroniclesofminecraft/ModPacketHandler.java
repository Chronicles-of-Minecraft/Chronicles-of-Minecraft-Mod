package com.qguidee.chroniclesofminecraft;

import com.qguidee.chroniclesofminecraft.common.items.alchemy.mortarpestle.MortarPestlePacketCreatePetals;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.network.NetworkRegistry;
import net.minecraftforge.fml.network.simple.SimpleChannel;

public class ModPacketHandler {

    private static final String PROTOCOL_VERSION = "1";
    public static final SimpleChannel INSTANCE = NetworkRegistry.newSimpleChannel(
            new ResourceLocation(ModCore.MOD_ID, "main"),
            () -> PROTOCOL_VERSION,
            PROTOCOL_VERSION::equals,
            PROTOCOL_VERSION::equals
    );

    static void registerPackets() {
        INSTANCE.registerMessage(0, MortarPestlePacketCreatePetals.class, MortarPestlePacketCreatePetals::encode, MortarPestlePacketCreatePetals::new, MortarPestlePacketCreatePetals::handle);
    }
}
