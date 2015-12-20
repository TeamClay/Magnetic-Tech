package com.teamclay.MagnticTech.Energry;

import net.minecraftforge.common.util.ForgeDirection;

public interface IFluxReceiver extends IFluxConnection{
	int receiveEnergy(ForgeDirection from, int maxReceive, boolean simulate);
	int getEnergyStored(ForgeDirection from);
	int getMaxEnergyStored(ForgeDirection from);
}
