package com.learnings.sealedclasses;

public non-sealed class Bike extends Vehicle{
	public String getName() {
		return "Bike";
	}
	public static void main(String[] args) {
		Bike bike = new Bike();
		System.out.println(bike.getBasePrice()+100);
	}
	

}
