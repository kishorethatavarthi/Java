package com.learnings.recordexamples;

public record User(String name, int age) {
	public static void main(String[] args) {
		User user  = new User("kishore", 27);
		System.out.println(user.name);
		System.out.println(user.age);
		System.out.println(user);
	}

}
