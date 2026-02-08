package com.learnings.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Remove null values from list of values
public class StreamExample13 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(
		        Arrays.asList("kishore", "vinay", null, "rvr", null)
		);
		
		list.stream().
		filter(x -> x!=null).
		collect(Collectors.toList())
		.forEach(System.out::println);
	}

}
