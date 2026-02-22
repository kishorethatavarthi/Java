package com.learnings.maps;

import java.util.HashMap;
import java.util.Map;

public class ComputeIfAbsentExample3 {
	public static void main(String[] args) {
		Map<String,String> map = new HashMap<>();
		map.computeIfAbsent("kishore", k ->null);
		System.out.println(map); //{}
		
		System.out.println("================1==========");
		//NullPointerException will come because the we are placing null in place of computation
		map.computeIfAbsent("vinay", null); 
		
	}

}
