package com.learnings.streams;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

//Get distinct characters from a list of strings
public class StreamExample16 {
	public static void main(String[] args) {
		List<String> list = List.of("kishor","rvr","vinay");
		Set<Character> set =list.stream()
				                .flatMap(x->x.chars().mapToObj(ch->(char)ch))
				                .sorted()
		                        .collect(Collectors.toCollection(LinkedHashSet::new));
		             
		System.out.println(set);
	}

}
