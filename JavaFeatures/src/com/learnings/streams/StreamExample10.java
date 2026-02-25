package com.learnings.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

//Find longest string
public class StreamExample10 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("kishor");
		list.add("rvr");
		list.add("vinay");
		list.add(null);
		
		Optional<String> maxLengthString =list.
				                          stream().
				                          filter(Objects::nonNull).
				                          collect(Collectors.maxBy(
				                    		  Comparator.comparing(x->x.length())));
		System.out.println(maxLengthString.get());
		
		
	}

}
