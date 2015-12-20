package com.teamclay.MagnticTech.gui;

import com.teamclay.MagnticTech.TileEntity.TileEntityMagneticFurnace;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;

public class ContainerMagneticFurnace extends Container{
	private TileEntityMagneticFurnace tile;
	public ContainerMagneticFurnace(InventoryPlayer par1InventoryPlayer, TileEntityMagneticFurnace par2TileEntity)
    {
        tile = par2TileEntity;
    }
	@Override
	public boolean canInteractWith(EntityPlayer p_75145_1_) {
		return true;
	}

}
