package com.teamclay.MagnticTech.Item;

import com.teamclay.MagnticTech.MagneticTech;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemSeptumMagnetIronIngot extends Item{
	public ItemSeptumMagnetIronIngot(){
		super();
		this.setMaxStackSize(16);
		this.setFull3D();
		this.setCreativeTab(MagneticTech.MT_BASE);
		this.setTextureName("magnetictech:septum_magnet_iron_ingot");
		this.setHasSubtypes(false);
		this.setUnlocalizedName("septummagnetironingot");
	}
}
