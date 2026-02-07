package com.learnings.switchexamples;

public class SwitchExample2 {
	public static void main(String[] args) {
		int day = 3;

		String dayName = switch (day) {
		case 1 -> "Monday";
		case 2 -> "Tuesday";
		case 3 -> "Wednesday";
		default -> "Invalid";
		};
		System.out.println(dayName);
	}

}
