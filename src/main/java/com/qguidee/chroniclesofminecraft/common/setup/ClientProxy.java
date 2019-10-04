package com.qguidee.chroniclesofminecraft.common.setup;

import com.qguidee.chroniclesofminecraft.ChroniclesOfMinecraftContainers;
import com.qguidee.chroniclesofminecraft.common.blocks.alembic.AlembicScreen;
import com.qguidee.chroniclesofminecraft.common.items.mortarpestle.MortarPestleScreen;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScreenManager;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;

public class ClientProxy implements IProxy {
    @Override
    public void init() {
        ScreenManager.registerFactory(ChroniclesOfMinecraftContainers.alembic, AlembicScreen::new);
        ScreenManager.registerFactory(ChroniclesOfMinecraftContainers.mortarPestle, MortarPestleScreen::new);

        //ModLoadingContext.get().registerExtensionPoint(ExtensionPoint.CONFIGGUIFACTORY, );
    }

    @Override
    public World getClientWorld() {
        return Minecraft.getInstance().world;
    }

    @Override
    public PlayerEntity getClientPlayer() {
        return Minecraft.getInstance().player;
    }
}
