package com.teamclay.MagnticTech.Item;

import com.teamclay.MagnticTech.MagneticTech;

import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraftforge.common.util.EnumHelper;

public class ItemSeptumMagnetHoe extends ItemHoe{
	public static ToolMaterial material = EnumHelper.addToolMaterial("SeptumMagnet", 5, 200, 5.0F, 2.0F, 15);
	public ItemSeptumMagnetHoe(){
		super(material);
		this.setMaxDamage(1000);
		this.setUnlocalizedName("septum_magnet_hoe");
		this.setTextureName("magnetictech:septum_magnet_iron_hoe");
		this.setMaxStackSize(1);
		this.setCreativeTab(MagneticTech.MT_BASE);
	}
}
