package com.learnings.streams;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

//Highest salary Employee by each department
public class StreamExample9 {
	
	record Employee(int id, String name,String department,double salary) {}
	
	public static void main(String[] args) {
		Employee e1 = new Employee(1, "kishore","CSE", 10000);
		Employee e2 = new Employee(2,"vinay","CSE",100);
		Employee e3 = new Employee(3,"rvr","ECE",900.12);
		Employee e4 = new Employee(4, "kish", "CSE",800.14);
		Employee e5 = new Employee(5,"vin","Mech",657);
		Employee e6 = new Employee(6,"rv","IT",734);
		
		List<Employee> list = List.of(e1,e2,e3,e4,e5,e6);
		System.out.println("==========Highest salary Employee by each department=========");
		Map<String,Optional<Employee>> map = list.stream().collect(Collectors.groupingBy(e->e.department,
				Collectors.maxBy(Comparator.comparing(Employee::salary))));
		
		map.forEach((key,value)->System.out.println(key + " "+value.get()));
		
		System.out.println("======Top 3 highest salaries========");
		list.stream().
		sorted(Comparator.comparing(Employee::salary).reversed()).
		limit(3).
		forEach(System.out::println);
		
	}

}
