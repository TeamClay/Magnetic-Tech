package com.teamclay.MagnticTech.Block;

import com.teamclay.MagnticTech.MagneticTech;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockSeptumMagnet extends Block{
	public BlockSeptumMagnet(){
		super(Material.rock);
		this.setHarvestLevel("pickaxe", 1);
		this.setBlockName("septummagnet");
		this.setBlockTextureName("magnetictech:septum_magnet");
		this.setStepSound(soundTypeStone);
		this.setResistance(15.0F);
		this.setHardness(3.0F);
		this.setCreativeTab(MagneticTech.MT_BASE);
	}
}
