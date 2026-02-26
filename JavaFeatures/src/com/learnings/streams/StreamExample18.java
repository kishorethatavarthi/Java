package com.learnings.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Find all anagrams grouped together
public class StreamExample18 {
	public static void main(String[] args) {
		List<String> words = List.of("kishore","vinay","mam","amm","ehikosr");
		Map<String, List<String>> anagrams = words.stream()
		        .collect(Collectors.groupingBy(word -> {
		            char[] chars = word.toCharArray();
		            Arrays.sort(chars);
		            return new String(chars);
		        }));
		System.out.println(anagrams);

	}

}
