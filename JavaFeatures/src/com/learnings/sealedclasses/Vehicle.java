package com.learnings.sealedclasses;

public sealed class Vehicle permits Bike,Car{
	public int getBasePrice() {
		return 10;
	}

}
