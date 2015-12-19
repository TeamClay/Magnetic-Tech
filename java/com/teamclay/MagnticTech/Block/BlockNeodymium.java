package com.teamclay.MagnticTech.Block;

import com.teamclay.MagnticTech.MagneticTech;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockNeodymium extends Block{
	public BlockNeodymium(){
		super(Material.rock);
		this.setHarvestLevel("pickaxe", 3);
		this.setBlockName("neodymium_ore");
		this.setBlockTextureName("magnetictech:neodymium_ore");
		this.setStepSound(soundTypeStone);
		this.setResistance(15.0F);
		this.setHardness(3.5F);
		this.setCreativeTab(MagneticTech.MT_BASE);
	}
}
