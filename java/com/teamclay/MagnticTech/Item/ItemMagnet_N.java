package com.teamclay.MagnticTech.Item;

import com.teamclay.MagnticTech.MagneticTech;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemMagnet_N extends Item{
	public ItemMagnet_N(){
		super();
		this.setMaxStackSize(16);
		this.setFull3D();
		this.setCreativeTab(MagneticTech.MT_BASE);
		this.setTextureName("magnetictech:magnet");
		this.setHasSubtypes(false);
		this.setUnlocalizedName("magnetn");
	}
}
