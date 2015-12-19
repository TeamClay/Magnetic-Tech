package com.teamclay.MagnticTech.Item;

import com.teamclay.MagnticTech.MagneticTech;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBoronDust extends Item{
	public ItemBoronDust(){
		this.setMaxStackSize(64);
		this.setFull3D();
		this.setCreativeTab(MagneticTech.MT_BASE);
		this.setTextureName("magnetictech:boron_dust");
		this.setHasSubtypes(false);
		this.setUnlocalizedName("boron_dust");
	}
}
