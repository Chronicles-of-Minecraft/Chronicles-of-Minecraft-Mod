package com.qguidee.chroniclesofminecraft.common.items.alchemy.mortarpestle;

import com.qguidee.chroniclesofminecraft.common.gui.container.MortarPestleContainer;
import com.qguidee.chroniclesofminecraft.common.gui.containerproviders.MortarPillarContainerProvider;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.network.PacketBuffer;
import net.minecraftforge.fml.network.NetworkEvent;

import java.util.function.Supplier;

/*enum MortarPestleAction {
    OPEN_GUI,
    CREATE_PETALS
}*/

public class MortarPestlePacketCreatePetals {

    private static final int OPEN_GUI = 0;
    private static final int GRIND = 1;

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
            ServerPlayerEntity sender = context.get().getSender(); // the client that sent this packet
            assert sender != null;

            switch (this.data) {
                case OPEN_GUI:
                    sender.openContainer(new MortarPillarContainerProvider());
                    break;
                case GRIND:
                    MortarPestleContainer mortarPestleContainer = (MortarPestleContainer) sender.openContainer;
                    mortarPestleContainer.grind();
                    break;
            }

        });
        context.get().setPacketHandled(true);
    }
}
