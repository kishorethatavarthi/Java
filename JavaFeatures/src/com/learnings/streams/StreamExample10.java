package com.learnings.streams;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

//Find longest string
public class StreamExample10 {
	public static void main(String[] args) {
		List<String> list = List.of("kishor","rvr","vinay");
		Optional<String> maxLengthString = list.stream().
				                      collect(Collectors.maxBy(
				                    		  Comparator.comparing(x->x.length())));
		System.out.println(maxLengthString.get());
		
		
	}

}
