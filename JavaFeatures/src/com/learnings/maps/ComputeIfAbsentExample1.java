package com.learnings.maps;

import java.util.HashMap;
import java.util.Map;

public class ComputeIfAbsentExample1 {
	public static void main(String[] args) {
		Map<String,String> cache = new HashMap<>();
		//Intially the value is not present so it will fectch from db and put in map
		String value1 = cache.computeIfAbsent("user1", k ->{
			System.out.println("Loading from DB");
			return "Kishore";
		});
		System.out.println(value1); // Kishore
		
		//The value is present so it will directly return "kishore" from map
		String value2 = cache.computeIfAbsent("user1", k->{
			System.out.println("Loading normally");
			return "other";
		});
		System.out.println(value2); // Kishore
		
		System.out.println(cache); // {user1=Kishore}
		
		
	}

}
