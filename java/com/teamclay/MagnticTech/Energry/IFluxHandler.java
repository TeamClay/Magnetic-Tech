package com.teamclay.MagnticTech.Energry;

import net.minecraftforge.common.util.ForgeDirection;

public interface IFluxHandler extends IFluxProvider,IFluxReceiver{
	@Override
	int receiveEnergy(ForgeDirection from, int maxReceive, boolean simulate);
	@Override
	int extractEnergy(ForgeDirection from, int maxExtract, boolean simulate);
	@Override
	int getEnergyStored(ForgeDirection from);
	@Override
	int getMaxEnergyStored(ForgeDirection from);
}
