package com.teamclay.MagnticTech.Item;

import com.teamclay.MagnticTech.MagneticTech;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemNeodymium extends Item{
	public ItemNeodymium(){
		this.setMaxStackSize(64);
		this.setFull3D();
		this.setCreativeTab(MagneticTech.MT_BASE);
		this.setTextureName("magnetictech:neodymium_dust");
		this.setHasSubtypes(false);
		this.setUnlocalizedName("neodymium_dust");
	}
}
