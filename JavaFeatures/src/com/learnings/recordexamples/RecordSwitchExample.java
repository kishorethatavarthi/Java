package com.learnings.recordexamples;

public class RecordSwitchExample {

	record User(String name, int age) {
	}

	public static void main(String[] args) {

		Object obj = new User("Kishore", 10);

		String result = switch (obj) {
		case User(String name, int age) when age >= 18 -> "Adult user: " + name;
		case User(String name, _) -> "Minor user: " + name;
		default -> "Unknown";
		};

		System.out.println(result);
	}
}
