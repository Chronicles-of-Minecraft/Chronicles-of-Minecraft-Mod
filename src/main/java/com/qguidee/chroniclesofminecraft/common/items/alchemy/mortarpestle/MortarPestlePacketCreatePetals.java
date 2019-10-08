package com.qguidee.chroniclesofminecraft.common.items.alchemy.mortarpestle;

import com.qguidee.chroniclesofminecraft.ChroniclesOfMinecraftItems;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketBuffer;
import net.minecraftforge.fml.network.NetworkEvent;

import java.util.function.Supplier;

public class MortarPestlePacketCreatePetals {

    private final int data;

    public MortarPestlePacketCreatePetals(PacketBuffer buf) {
        this.data = buf.readInt();
    }

    public MortarPestlePacketCreatePetals(int data) {
        this.data = data;
    }

    public void encode(PacketBuffer buf) {
        buf.writeInt(data);
    }

    public void handle(Supplier<NetworkEvent.Context> context) {
        context.get().enqueueWork(() -> {
            // Work that needs to be threadsafe (most work)
            PlayerEntity sender = context.get().getSender(); // the client that sent this packet

            MortarPestleContainer mortarPestleContainer = (MortarPestleContainer) sender.openContainer;
            if (mortarPestleContainer.getIItemHandler().getStackInSlot(0).getItem() == ChroniclesOfMinecraftItems.flowerRosaRosea) {
                mortarPestleContainer.getIItemHandler().getStackInSlot(0).setCount(0);
                mortarPestleContainer.getIItemHandler().insertItem(1, new ItemStack(ChroniclesOfMinecraftItems.flowerRosaRoseaPetals, 1), false);
            }
        });
        context.get().setPacketHandled(true);
    }
}
