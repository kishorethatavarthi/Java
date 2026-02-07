package com.learnings.recordexamples;

public record Person(String name, int age) {
	
	public boolean isAdult() {
		return age>=18;
	}
	
	public static void main(String[] args) {
		Person person = new Person("kishore",27);
		System.out.println(person.isAdult());
	}

}
