package com.learnings.immutableclasses;

import java.util.ArrayList;
import java.util.List;

public final class Employee implements Cloneable {
	private final int id;
	private final String name;
	private final List<String> skills;

	public Employee(int id, String name, List<String> skills) {
		this.id = id;
		this.name = name;
		this.skills = new ArrayList<>(skills);
	}

	public List<String> getSkills() {
		return new ArrayList<>(skills);
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		List<String> skills = new ArrayList<>();
		skills.add("coding");
		skills.add("testing");

		Employee e1 = new Employee(1, "kishore", skills);
		Employee e2 = (Employee) e1.clone();
		e2.getSkills().add("debugging");

		System.out.println(e1.getSkills());

	}

}
