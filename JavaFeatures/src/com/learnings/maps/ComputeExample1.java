package com.learnings.maps;

import java.util.HashMap;
import java.util.Map;

public class ComputeExample1 {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		//This will do put operation
		map.compute("kishore", (k,v)-> v== null ? 1: v+1);
		//This will do update operation
		map.compute("kishore", (k,v)-> v== null ? 1: v+1);
		System.out.println(map);
		
		System.out.println("===========2==============");
		Map<String,Integer> map2 = new HashMap<>();
		map2.put("kishore", 1);
		//This will do update operation
		map2.compute("kishore", (k,v)-> v== null ? 1: v+1);
		//This will do update operation
		map2.compute("kishore", (k,v)-> v== null ? 1: v+1);
		System.out.println(map2);
		
		System.out.println("===========3==============");
		Map<String,Integer> map3 = new HashMap<>();
		map3.put("kishore", 30);
		//Here we are doing a check the value is greater than 25 so condition passes
		//It will use null value so compute automatically removes null entries 
		//so map3 will print {}
		map3.compute("kishore", (k,v) -> v>25 ? null : v+1);
		System.out.println(map3);
		
		
	}

}
