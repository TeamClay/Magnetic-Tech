package com.teamclay.MagnticTech;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class Ore implements IWorldGenerator{

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		Gen(random, chunkZ, chunkZ, world, chunkProvider, chunkProvider, MagneticTech.Boron_Ore, 25);
		Gen(random, chunkZ, chunkZ, world, chunkProvider, chunkProvider, MagneticTech.Neodymium_ore, 35);
		Gen(random, chunkZ, chunkZ, world, chunkProvider, chunkProvider, MagneticTech.Septum_Magnet, 55);
		Gen(random, chunkZ, chunkZ, world, chunkProvider, chunkProvider, MagneticTech.Magnetite_N, 55);
		Gen(random, chunkZ, chunkZ, world, chunkProvider, chunkProvider, MagneticTech.Magnetite_S, 55);
	}
	public void Gen(Random random, int i, int j, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider,Block block,int hight){
		int firstBlockXCoord = i + random.nextInt(16);
		int firstBlockYCoord = random.nextInt(hight);
		int firstBlockZCoord = j + random.nextInt(16);
		 
		(new WorldGenMinable(block, 9)).generate(world, random, firstBlockXCoord, firstBlockYCoord, firstBlockZCoord);
	}
}
