package com.teamclay.MagnticTech.Item;

import com.teamclay.MagnticTech.MagneticTech;

import net.minecraft.item.ItemPickaxe;
import net.minecraftforge.common.util.EnumHelper;

public class ItemSeptumMagnetPickaxe extends ItemPickaxe{
	public static ToolMaterial material = EnumHelper.addToolMaterial("SeptumMagnet", 5, 200, 5.0F, 2.0F, 15);
	public ItemSeptumMagnetPickaxe(){
		super(material);
		this.setMaxDamage(1700);
		this.setUnlocalizedName("septum_magnet_pickaxe");
		this.setTextureName("magnetictech:septum_magnet_iron_pickaxe");
		this.setMaxStackSize(1);
		this.setCreativeTab(MagneticTech.MT_BASE);
	}
}
