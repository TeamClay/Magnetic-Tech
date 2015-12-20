package com.teamclay.MagnticTech.Item;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.teamclay.MagnticTech.MagneticTech;
import com.teamclay.MagnticTech.Machine.MagneticFurnace;

import net.minecraft.block.Block;
import net.minecraft.block.BlockBed;
import net.minecraft.block.BlockButton;
import net.minecraft.block.BlockChest;
import net.minecraft.block.BlockLever;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.ChatStyle;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

public class ItemWrench extends Item{
	private final Set<Class<? extends Block>> shiftRotations = new HashSet();
	  private final Set<Class<? extends Block>> bannedRotations = new HashSet();
	public ItemWrench(){
		this.setMaxStackSize(1);
		this.setFull3D();
		this.setHasSubtypes(false);
		this.setTextureName("magnetictech:wrench");
		this.setUnlocalizedName("wrench");
		this.setCreativeTab(MagneticTech.MT_BASE);
		this.setHarvestLevel("wrench", 1);
		shiftRotations.add(BlockLever.class);
        shiftRotations.add(BlockButton.class);
        shiftRotations.add(BlockChest.class);
        bannedRotations.add(BlockBed.class);
	}
	private boolean isShiftRotation(Class<? extends Block> cls) {
		    for (Class shift : this.shiftRotations) {
		      if (shift.isAssignableFrom(cls))
		        return true;
		    }
		    return false;
		  }

	 private boolean isBannedRotation(Class<? extends Block> cls) {
		    for (Class banned : this.bannedRotations) {
		      if (banned.isAssignableFrom(cls))
		        return true;
		    }
		    return false;
	}
	@Override
	public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ)
	  {
	    Block block = world.getBlock(x, y, z);
	    if (block == null) {
	      return false;
	    }
	    if (player.isSneaking() != isShiftRotation(block.getClass())) {
	      return false;
	    }
	    if (isBannedRotation(block.getClass())) {
	      return false;
	    }
	    if (block.rotateBlock(world, x, y, z, ForgeDirection.getOrientation(0))) {
	      player.swingItem();
	      return !world.isRemote;
	    }
	    if (block.rotateBlock(world, x, y, z, ForgeDirection.getOrientation(0))) {
		      player.swingItem();
		      return !world.isRemote;
		    }
	    return false;
	 }
}