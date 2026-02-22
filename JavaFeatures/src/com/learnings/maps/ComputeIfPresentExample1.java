package com.learnings.maps;

import java.util.HashMap;
import java.util.Map;

public class ComputeIfPresentExample1 {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		map.put("token", 30);
		
		map.computeIfPresent("token", (k,v) -> v == null ? 1 : v + 20);
		map.computeIfPresent("session", (k,v) -> v == null ? 1 : v + 20);
		System.out.println(map); //{token=50}
		
		map.computeIfPresent("token", (k,v) -> v >= 50 ? null : 1);
		System.out.println(map); //{}
		
		
	}

}
