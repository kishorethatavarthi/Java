package com.learnings.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Find length of each string in a list
public class StreamExample11 {
	public static void main(String[] args) {
		List<String> list = List.of("kishore","vinay","rvr");
		Map<String,Integer> map = list.stream().
				                      collect(Collectors.toMap(x->x, x->x.length()));
		System.out.println(map);
	}

}
