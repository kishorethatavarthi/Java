package com.learnings.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Find average salary
public class StreamExample15 {
	record Employee(int id, String name,String department,double salary) {}
	
	public static void main(String[] args) {
		Employee e1 = new Employee(1, "kishore","CSE", 10000);
		Employee e2 = new Employee(2,"vinay","CSE",100);
		Employee e3 = new Employee(3,"rvr","ECE",900.12);
		Employee e4 = new Employee(4, "kish", "CSE",800.14);
		Employee e5 = new Employee(5,"vin","Mech",657);
		Employee e6 = new Employee(6,"rv","IT",734);
		List<Employee> list = List.of(e1,e2,e3,e4,e5,e6);
		
		System.out.println("======Averge salary of all employees======");
		double avgSalry = list.stream().collect(Collectors.averagingDouble(Employee::salary));
		System.out.println(avgSalry);
		
		System.out.println("=======Average salary of employees by each department=======");
		Map<String,Double> map = list.stream().collect(Collectors.groupingBy(Employee::department,
				Collectors.averagingDouble(Employee::salary)));
		map.forEach((key,value) -> System.out.println(key + " avg salary "+value));
		
		
		
	}

}
