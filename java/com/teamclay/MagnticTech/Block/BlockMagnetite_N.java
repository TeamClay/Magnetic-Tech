package com.teamclay.MagnticTech.Block;

import com.teamclay.MagnticTech.MagneticTech;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockMagnetite_N extends Block{
	public BlockMagnetite_N(){
		super(Material.rock);
		this.setHarvestLevel("pickaxe", 2);
		this.setBlockName("magnetiten");
		this.setBlockTextureName("magnetictech:magnetite");
		this.setStepSound(soundTypeStone);
		this.setResistance(15.0F);
		this.setHardness(3.0F);
		this.setCreativeTab(MagneticTech.MT_BASE);
	}
}
