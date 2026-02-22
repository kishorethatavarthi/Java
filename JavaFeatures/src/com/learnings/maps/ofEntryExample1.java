package com.learnings.maps;

import java.util.Map;

public class ofEntryExample1 {
	public static void main(String[] args) {
		//It is immutable
		Map.Entry<String,Integer>  entry=Map.entry("k", 10);
		entry.setValue(100);
		System.out.println(entry);
		
	}

}
