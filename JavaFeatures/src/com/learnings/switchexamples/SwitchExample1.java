package com.learnings.switchexamples;

public class SwitchExample1 {
	public static void main(String[] args) {
		int day = 3;
		String dayName;

		switch (day) {
		case 1:
			dayName = "Monday";
			break;
		case 2:
			dayName = "Tuesday";
			break;
		case 3:
			dayName = "Wednesday";
			break;
		default:
			dayName = "Invalid";
		}
		System.out.println(dayName);
	}

}
