package com.learnings.streams;

import java.util.Comparator;
import java.util.List;

//sort employees by ascending salary
public class StreamExample14 {
	record Employee(int id, String name,String department,double salary) {}
	
	public static void main(String[] args) {
		Employee e1 = new Employee(1, "kishore","CSE", 10000);
		Employee e2 = new Employee(2,"vinay","CSE",100);
		Employee e3 = new Employee(3,"rvr","ECE",900.12);
		Employee e4 = new Employee(4, "kish", "CSE",800.14);
		Employee e5 = new Employee(5,"vin","Mech",657);
		Employee e6 = new Employee(6,"rv","IT",734);
		List<Employee> list = List.of(e1,e2,e3,e4,e5,e6);
		
		//Ascending salary sorting
		System.out.println("====Sorting by salary ascending=====");
		list.stream().
		sorted(Comparator.comparing(Employee::salary)).
		forEach(System.out::println);
		
		//Descending salary sorting
		System.out.println("====Sorting by salary descending=====");
		list.stream().
		sorted(Comparator.comparing(Employee::salary).reversed()).
		forEach(System.out::println);
			
	}

}
