package com.teamclay.MagnticTech.gui;

import org.lwjgl.opengl.GL11;

import com.teamclay.MagnticTech.Block.ContarinerMagnetic;
import com.teamclay.MagnticTech.Block.MagneticTileEntity;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.client.gui.GuiSlot;
import net.minecraft.client.gui.GuiTextField;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.gui.inventory.GuiFurnace;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraftforge.client.event.RenderGameOverlayEvent;

public class MagneticFurnaceGui extends GuiContainer{
	private InventoryPlayer player;
	private MagneticTileEntity furnace;
	private GuiSlot slot1;
	public MagneticFurnaceGui(InventoryPlayer p_i1091_1_,
			MagneticTileEntity tileEntityFurnace) {
		super(new ContarinerMagnetic());
		this.player = p_i1091_1_;
		this.furnace = tileEntityFurnace;
		
		
	}
	@Override
	protected void drawGuiContainerBackgroundLayer(float f,
			int x, int y) {
		 GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		 drawRect((int)(width*0.1), (int)(height*0.1), (int)(width*0.9), (int)(height*1.2), 0x80FFFFFF);
	}
	
}
