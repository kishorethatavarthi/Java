package com.learnings.streams;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

//Count occurances of each word
public class StreamExample3 {
	public static void main(String[] args) {
		System.out.println("=============1============");
		String str = "aa bb cc aa bb c d ee";
		String[] arr = str.split("\\s+");
		Map<String,Long> map = Arrays.stream(arr).
				collect(Collectors.groupingBy(c->c,LinkedHashMap::new,Collectors.counting()));
		map.forEach((key,value)-> System.out.println(key + " "+value));
		
		System.out.println("=============2============");
		String str1 = "kishorthatavarthi";
		Map<Character,Long> map1 = str1.chars()
				                   .mapToObj(c->(char)c)
				                   .collect(Collectors.groupingBy(c->c,LinkedHashMap::new,Collectors.counting()));
		
		System.out.println(map1);
		
		
		
	}

}
