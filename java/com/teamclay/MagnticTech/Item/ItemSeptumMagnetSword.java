package com.teamclay.MagnticTech.Item;

import com.teamclay.MagnticTech.MagneticTech;

import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ItemSeptumMagnetSword extends ItemSword{
	public static ToolMaterial material = EnumHelper.addToolMaterial("SeptumMagnet", 2, 200, 2.0F, 2.0F, 14);
	public ItemSeptumMagnetSword(){
		super(material);
		this.setMaxDamage(200);
		this.setUnlocalizedName("septum_magnet_sword");
		this.setTextureName("magnetictech:septum_magnet_iron_sword");
		this.setMaxStackSize(1);
		this.setCreativeTab(MagneticTech.MT_BASE);
	}
}
