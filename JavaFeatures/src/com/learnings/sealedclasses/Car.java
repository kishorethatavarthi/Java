package com.learnings.sealedclasses;

public final class Car extends Vehicle{
	public static void main(String[] args) {
		Car car = new Car();
		System.out.println(car.getBasePrice());
	}

}
