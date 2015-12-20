package com.teamclay.MagnticTech.Energry;

import net.minecraftforge.common.util.ForgeDirection;

public interface IFluxProvider extends IFluxConnection{
	int extractEnergy(ForgeDirection from, int maxExtract, boolean simulate);
	int getEnergyStored(ForgeDirection from);
	int getMaxEnergyStored(ForgeDirection from);
}
