package com.learnings.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Find duplicate elements in a list
public class StreamExample4 {
	public static void main(String[] args) {
		List<String> list = List.of("k","i","s","k","s","r");
		list.stream().collect(Collectors.groupingBy(c->c,Collectors.counting()))
		.entrySet()
		.stream()
		.filter(x->x.getValue()>1)
		.map(Map.Entry::getKey)
		.forEach(System.out::println);
	}

}
