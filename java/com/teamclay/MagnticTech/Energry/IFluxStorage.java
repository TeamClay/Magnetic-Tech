package com.teamclay.MagnticTech.Energry;

public interface IFluxStorage {
	int receiveEnergy(int maxReceive, boolean simulate);
	int extractEnergy(int maxExtract, boolean simulate);
	int getEnergyStored();
	int getMaxEnergyStored();
}
