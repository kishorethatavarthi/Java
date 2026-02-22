package com.learnings.maps;

import java.util.HashMap;
import java.util.Map;

public class MergeExample1 {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		String[] words = {"java", "java", "spring", "java", "api"};
		
		for(String word : words) {
			map.merge(word, 1, Integer::sum);
		}
		
		System.out.println(map); // {spring=1, java=3, api=1}
	}

}
