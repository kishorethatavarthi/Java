package com.learnings.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Group Employees by Department
public class StreamExample8 {
	record Employee(int id,String name,String department) {}
	
	public static void main(String[] args) {
		Employee e1 = new Employee(1, "kishore", "CSE");
		Employee e2 = new Employee(2,"vinay","EEE");
		Employee e3 = new Employee(3,"rvr","ECE");
		List<Employee> list = List.of(e1,e2,e3);
		
		Map<String,List<Employee>> ans = list.stream().
				collect(Collectors.groupingBy(e->e.department));
		ans.forEach((key,value) -> System.out.println(key + " "+value));
	}

}
