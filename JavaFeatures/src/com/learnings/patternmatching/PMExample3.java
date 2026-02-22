package com.learnings.patternmatching;

record Address(String city) {
}

record Person(String name, Address address) {
}

public class PMExample3 {
	static String process(Object obj) {
		return switch (obj) {
		case Person(String name, Address(String city)) -> name + " lives in " + city;
		default -> "Unknown";
		};
	}

	public static void main(String[] args) {
		Person p = new Person("Kishore", new Address("Hyderabad"));
		System.out.println(process(p));
	}

}
