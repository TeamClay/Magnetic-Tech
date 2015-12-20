package com.teamclay.MagnticTech.Block;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.server.gui.IUpdatePlayerListBox;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IChatComponent;

public class MagneticTileEntity extends TileEntity implements IUpdatePlayerListBox, IInventory{
	 private ItemStack tstack[] = new ItemStack[3];   
     
     public void update() {
     }


     @Override
     public int getSizeInventory() {
             // TODO Auto-generated method stub
             return tstack.length;
     } 

     @Override
     public ItemStack getStackInSlot(int index) {
             // TODO Auto-generated method stub
             return tstack[index];
     }
     @Override
     public ItemStack decrStackSize(int index, int count) {
             if (this.tstack[index] != null)
             {
                         ItemStack itemstack;

                         if (this.tstack[index].stackSize <= count)
                         {
                             itemstack = this.tstack[index];
                             this.tstack[index] = null;
                             return itemstack;
                         }
                         else
                         {
                             itemstack = this.tstack[index].splitStack(count);

                             if (this.tstack[index].stackSize == 0)
                             {
                                         this.tstack[index] = null;
                             }

                             return itemstack;
                         }
             }
             else
                    {
                         return null;
             }
     }    //复制原版熔炉代码

     @Override
     public ItemStack getStackInSlotOnClosing(int index) {
             // TODO Auto-generated method stub
             return null;
     }    //关闭Gui时触发的事件

     @Override
     public void setInventorySlotContents(int index, ItemStack stack) {
             // TODO Auto-generated method stub
             this.tstack[index] = stack;
             if (stack != null && stack.stackSize > this.getInventoryStackLimit())
             {
                         stack.stackSize = this.getInventoryStackLimit();
             }
     }

     @Override
     public int getInventoryStackLimit() {
             // TODO Auto-generated method stub
             return 64;
     }
     @Override
     public boolean isItemValidForSlot(int index, ItemStack stack) {
             // TODO Auto-generated method stub
             return false;
     }


	@Override
	public String getInventoryName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean hasCustomInventoryName() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isUseableByPlayer(EntityPlayer p_70300_1_) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void openInventory() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void closeInventory() {
		// TODO Auto-generated method stub
		
	}
     
}
