package com.learnings.maps;

import java.util.HashMap;
import java.util.Map;

public class OfExample1 {
	public static void main(String[] args) {
		//It is immutable
		//It will not allow duplicate keys
		//It will not allow null keys or null values
		//Max it will allow 10 entries
		Map<String,Integer> map = Map.of("one" , 1 ,"two", 2);
		System.out.println(map);
		
		
		
		
	}

}
