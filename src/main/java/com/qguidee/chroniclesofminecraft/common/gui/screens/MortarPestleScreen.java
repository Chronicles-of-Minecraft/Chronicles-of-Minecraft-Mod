package com.qguidee.chroniclesofminecraft.common.gui.screens;

import com.mojang.blaze3d.platform.GlStateManager;
import com.qguidee.chroniclesofminecraft.ModCore;
import com.qguidee.chroniclesofminecraft.ModPacketHandler;
import com.qguidee.chroniclesofminecraft.common.gui.container.MortarPestleContainer;
import com.qguidee.chroniclesofminecraft.common.items.alchemy.mortarpestle.MortarPestlePacketCreatePetals;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;

public class MortarPestleScreen extends ContainerScreen<MortarPestleContainer> {
    private static ResourceLocation gui = new ResourceLocation(ModCore.MOD_ID, "textures/gui/mortar_pestle.png");

    public MortarPestleScreen(MortarPestleContainer screenContainer, PlayerInventory inv, ITextComponent titleIn) {
        super(screenContainer, inv, titleIn);
    }

    @Override
    public void render(int mouseX, int mouseY, float partialTicks) {
        this.renderBackground();
        super.render(mouseX, mouseY, partialTicks);
        this.renderHoveredToolTip(mouseX, mouseY);
    }

    @Override
    protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
        // super.drawGuiContainerForegroundLayer(mouseX, mouseY);
        drawString(Minecraft.getInstance().fontRenderer, "Mortar & pestle", 10, 10, 0xffffff);
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
        GlStateManager.color4f(1.0F, 1.0F, 1.0F, 1.0F);

        assert this.minecraft != null;
        this.minecraft.getTextureManager().bindTexture(gui);

        int relX = (this.width - this.xSize) / 2;
        int relY = (this.height - this.ySize) / 2;
        this.blit(relX, relY, 0, 0, this.xSize, this.ySize);

        this.addButton(new Button(relX + 22, relY + 59, 70, 20, "Grind", p_onPress_1_ -> {
            ModPacketHandler.INSTANCE.sendToServer(new MortarPestlePacketCreatePetals(1));
        }));
    }
}