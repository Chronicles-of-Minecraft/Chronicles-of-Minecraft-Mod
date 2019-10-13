package com.qguidee.chroniclesofminecraft.common.setup;

import com.qguidee.chroniclesofminecraft.ModContainers;
import com.qguidee.chroniclesofminecraft.common.gui.screens.AlembicScreen;
import com.qguidee.chroniclesofminecraft.common.gui.screens.MortarPestleScreen;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScreenManager;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;

public class ClientProxy implements IProxy {
    @Override
    public void init() {
        ScreenManager.registerFactory(ModContainers.alembicMk1, AlembicScreen::new);
        ScreenManager.registerFactory(ModContainers.alembicMk2, AlembicScreen::new);
        ScreenManager.registerFactory(ModContainers.alembicMk3, AlembicScreen::new);
        ScreenManager.registerFactory(ModContainers.mortarPestle, MortarPestleScreen::new);
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
