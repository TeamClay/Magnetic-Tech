package com.teamclay.MagnticTech.Item;

import com.teamclay.MagnticTech.MagneticTech;

import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraftforge.common.util.EnumHelper;

public class ItemSeptumMagnetShovel extends ItemSpade{
	public static ToolMaterial material = EnumHelper.addToolMaterial("SeptumMagnet", 5, 200, 5.0F, 2.0F, 15);
	public ItemSeptumMagnetShovel(){
		super(material);
		this.setMaxDamage(1200);
		this.setUnlocalizedName("septum_magnet_shovel");
		this.setTextureName("magnetictech:septum_magnet_iron_shovel");
		this.setMaxStackSize(1);
		this.setCreativeTab(MagneticTech.MT_BASE);
	}
}
