package com.qguidee.chroniclesofminecraft.common.items.alchemy.mortarpestle;

import com.qguidee.chroniclesofminecraft.ChroniclesOfMinecraftItems;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketBuffer;
import net.minecraftforge.fml.network.NetworkEvent;

import java.util.function.Supplier;

public class MortarPestlePacketDeleteFlower {

    private final ItemStack itemStack;

    public MortarPestlePacketDeleteFlower(PacketBuffer buf) {
        // this.data = buf.readInt();
        this.itemStack = buf.readItemStack();
    }

    public MortarPestlePacketDeleteFlower(ItemStack itemStack) {
        // this.data = data;
        this.itemStack = itemStack;
    }

    public void encode(PacketBuffer buf) {
        buf.writeItemStack(itemStack);
    }

    public void handle(Supplier<NetworkEvent.Context> context) {
        context.get().enqueueWork(() -> {
            // Work that needs to be threadsafe (most work)
            PlayerEntity sender = context.get().getSender(); // the client that sent this packet


            if (itemStack.getItem() == ChroniclesOfMinecraftItems.flowerRosaRosea) {
                itemStack.setCount(0);
                //itemStack.insertItem(1, new ItemStack(ChroniclesOfMinecraftItems.flowerRosaRoseaPetals, 1), false);
            }
        });
        context.get().setPacketHandled(true);
    }
}
