package com.qguidee.chroniclesofminecraft.common.gui.screens;

import com.mojang.blaze3d.platform.GlStateManager;
import com.qguidee.chroniclesofminecraft.ModCore;
import com.qguidee.chroniclesofminecraft.common.gui.container.AlembicContainer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;

public class AlembicScreen extends ContainerScreen<AlembicContainer> {

    public AlembicScreen(AlembicContainer screenContainer, PlayerInventory inv, ITextComponent titleIn) {
        super(screenContainer, inv, titleIn);
        this.xSize = 176;
        this.ySize = 181;
    }

    private ResourceLocation getGui() {
        return new ResourceLocation(ModCore.MOD_ID, this.getContainer().alembicTier.getResource());
    }

    @Override
    public void render(int mouseX, int mouseY, float partialTicks) {
        this.renderBackground();
        super.render(mouseX, mouseY, partialTicks);
        this.renderHoveredToolTip(mouseX, mouseY);
    }

    @Override
    protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
        drawString(Minecraft.getInstance().fontRenderer, "Alembic", 10, 10, 0xffffff);
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
        GlStateManager.color4f(1.0F, 1.0F, 1.0F, 1.0F);
        assert this.minecraft != null;
        this.minecraft.getTextureManager().bindTexture(getGui());
        int relX = (this.width - this.xSize) / 2;
        int relY = (this.height - this.ySize) / 2;
        this.blit(relX, relY, 0, 0, this.xSize, this.ySize);
    }
}
