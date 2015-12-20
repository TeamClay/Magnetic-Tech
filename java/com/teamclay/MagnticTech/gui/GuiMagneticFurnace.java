package com.teamclay.MagnticTech.gui;

import org.lwjgl.opengl.GL11;

import com.teamclay.MagnticTech.TileEntity.TileEntityMagneticFurnace;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;

public class GuiMagneticFurnace extends GuiContainer{

	public GuiMagneticFurnace(InventoryPlayer inventory,TileEntityMagneticFurnace tile) {
		super(new ContainerMagneticFurnace(inventory, tile));
	}

	@Override
    protected void drawGuiContainerForegroundLayer(int par1, int par2) {
        // TODO Auto-generated method stub
        super.drawGuiContainerForegroundLayer(par1, par2);
        this.fontRendererObj.drawString("Magnetic Furnace", 65, 6, 4210752);
        this.fontRendererObj.drawString(StatCollector.translateToLocal("container.inventory"), 8, this.ySize - 96 + 2, 4210752);
    }
    @Override
    protected void drawGuiContainerBackgroundLayer(float var1, int var2,
			int var3) {
	// TODO Auto-generated method stub
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.renderEngine.bindTexture(new ResourceLocation("magnetictech","textures/gui/magnetic_furnace.png"));
        int var5 = (this.width - this.xSize) / 2;
        int var6 = (this.height - this.ySize) / 2;
        this.drawTexturedModalRect(var5, var6, 0, 0, this.xSize, this.ySize);
    }
}
