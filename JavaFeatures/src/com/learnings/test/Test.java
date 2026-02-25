package com.learnings.test;

import java.util.HashSet;
import java.util.Objects;

public class Test {
	
	private int id;
	
	private String name;
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	
	public Test(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Test other = (Test) obj;
		return id == other.id && Objects.equals(name, other.name);
	}


	public static void main(String[] args) {
		Test t1 = new Test(1,"kishore");
		Test t2 = new Test(1,"kishore");
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
		HashSet<Test> set = new HashSet<>();
		set.add(t1); set.add(t2);
		System.out.println(set.size());
		
	}

}
