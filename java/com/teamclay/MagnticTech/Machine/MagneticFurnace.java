package com.teamclay.MagnticTech.Machine;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class MagneticFurnace extends Block{
	public MagneticFurnace(){
		super(Material.rock);
		this.setBlockName("magnetic_furnace");
		this.setStepSound(soundTypeStone);
	}
}
