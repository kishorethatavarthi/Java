package com.learnings.streams;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

//First Non Repeating character in a string
public class StreamExample2 {
	public static void main(String[] args) {
		String str = "aabbccdeefff";
		Character ch = str.chars()
				       .mapToObj(c->(char)c)
				       .collect(Collectors.groupingBy(c->c,LinkedHashMap::new,Collectors.counting()))
				       .entrySet()
				       .stream()
				       .filter(e->e.getValue()==1)
				       .map(Map.Entry::getKey)
				       .findAny()
				       .orElse(null);
		System.out.println(ch);

	}

}
