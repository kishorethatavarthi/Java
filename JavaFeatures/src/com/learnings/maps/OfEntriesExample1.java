package com.learnings.maps;

import java.util.Map;

public class OfEntriesExample1 {
	public static void main(String[] args) {
		//It is immutable
		//we can put unlimited key value pairs
		Map<String,Integer> map = Map.ofEntries(
				Map.entry("a",1),
				Map.entry("b",2));
		System.out.println(map);
				
	}

}
