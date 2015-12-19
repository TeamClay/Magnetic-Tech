package com.teamclay.MagnticTech.Block;

import com.teamclay.MagnticTech.MagneticTech;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockBoron extends Block{
	public BlockBoron(){
		super(Material.rock);
		this.setHarvestLevel("pickaxe", 3);
		this.setBlockName("boron_ore");
		this.setBlockTextureName("magnetictech:boron_ore");
		this.setStepSound(soundTypeStone);
		this.setResistance(15.0F);
		this.setHardness(3.0F);
		this.setCreativeTab(MagneticTech.MT_BASE);
	}
}
