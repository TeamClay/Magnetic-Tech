package com.teamclay.MagnticTech.Block;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;

public class ContarinerMagnetic extends Container{

	 public ContarinerMagnetic(InventoryPlayer par1InventoryPlayer, MagneticTileEntity tileEntity) {
//        this.addSlotToContainer(new Slot(par1InventoryPlayer, field_94535_f, field_94535_f, field_94535_f));
 }
 
 @Override
 public boolean canInteractWith(EntityPlayer playerIn) {
         return true;
 }

}
