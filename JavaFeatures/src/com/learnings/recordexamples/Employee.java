package com.learnings.recordexamples;

public record Employee(String name, double salary) {
	public Employee{
		if(salary <= 0) {
			throw new IllegalArgumentException("Invalid Salary mustbe greater than zero");
		}
	}
	
	public static void main(String[] args) {
		Employee employee = new Employee("kishore",10000);
		System.out.println(employee);
		
		Employee employee1 = new Employee("vinay", 0);
		System.out.println(employee1);
	}

}
