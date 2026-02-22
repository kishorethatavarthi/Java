package com.learnings.maps;

import java.util.HashMap;

public class ReplaceExample1 {
	public static void main(String[] args) {
		HashMap<String,Integer> map = new HashMap<>();
		map.put("k", 10);
		map.replace("k",5);
		map.replace("k", 10,20);
		System.out.println(map); //{k=5}
		
		map.replaceAll((_,v) -> v*2);
		System.out.println(map); //{k=10}
	}

}
