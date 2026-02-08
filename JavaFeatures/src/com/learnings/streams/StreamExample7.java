package com.learnings.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Partition numbers by even and odd
public class StreamExample7 {
	public static void main(String[] args) {
		List<Integer> list = List.of(1,2,3,4,5,6,7,8);
		Map<Boolean,List<Integer>> map = list.stream()
				                       .collect(Collectors.partitioningBy(n->n%2==0));
		map.forEach((key,value) -> System.out.println(key + " " + value));
	}

}
