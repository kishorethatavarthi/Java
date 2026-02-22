package com.learnings.maps;

import java.util.HashMap;
import java.util.Map;

public class MergeExample2 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("a", 5);

		map.merge("a", 3, (oldV, newV) -> oldV + newV);
		System.out.println(map);//{a=8}
		
		map.merge("a", 10, (o, n) -> null);
		System.out.println(map); // {}
	}

}
