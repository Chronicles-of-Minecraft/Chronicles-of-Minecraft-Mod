package com.qguidee.chroniclesofminecraft.common.setup;

import com.qguidee.chroniclesofminecraft.ChroniclesOfMinecraftContainers;
import com.qguidee.chroniclesofminecraft.common.gui.screens.AlembicScreen;
import com.qguidee.chroniclesofminecraft.common.items.alchemy.mortarpestle.MortarPestleScreen;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScreenManager;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;

public class ClientProxy implements IProxy {
    @Override
    public void init() {
        ScreenManager.registerFactory(ChroniclesOfMinecraftContainers.alembicMk1, AlembicScreen::new);
        ScreenManager.registerFactory(ChroniclesOfMinecraftContainers.alembicMk2, AlembicScreen::new);
        ScreenManager.registerFactory(ChroniclesOfMinecraftContainers.alembicMk3, AlembicScreen::new);
        ScreenManager.registerFactory(ChroniclesOfMinecraftContainers.mortarPestle, MortarPestleScreen::new);
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
