package com.learnings.sealedclasses;

public class MotorBike extends Bike{
	public static void main(String[] args) {
		MotorBike mb = new MotorBike();
		System.out.println(mb.getBasePrice() * 1000);
		System.out.println(mb.getName() + " motor");
	}

}
