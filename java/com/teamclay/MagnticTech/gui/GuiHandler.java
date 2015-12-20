package com.teamclay.MagnticTech.gui;

import com.teamclay.MagnticTech.Machine.MagneticFurnace;
import com.teamclay.MagnticTech.TileEntity.TileEntityMagneticFurnace;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler{

	@Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world,
                    int x, int y, int z) {
            // TODO Auto-generated method stub
            switch(ID)
    {
    case 10:
           return new GuiMagneticFurnace(player.inventory, (TileEntityMagneticFurnace)player.worldObj.getTileEntity(x, y, z));
    }
    return null;
    }
	@Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world,
                    int x, int y, int z) {
            // TODO Auto-generated method stub
            switch(ID)
    {
    case 10:
           return new ContainerMagneticFurnace(player.inventory, (TileEntityMagneticFurnace)player.worldObj.getTileEntity(x, y, z));
    }
    return null;
    }

}
