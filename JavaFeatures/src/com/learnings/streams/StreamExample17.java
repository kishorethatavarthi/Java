package com.learnings.streams;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Element with max frequency
public class StreamExample17 {
	public static void main(String[] args) {
		List<Integer> list = List.of(1,2,3,4,5,1,1,3,3,4,5,7,2,3,1,6);
		Integer element = list.stream().collect(Collectors.groupingBy(e->e , Collectors.counting()))
				                   .entrySet()
				                   .stream()
				                   .max(Map.Entry.comparingByValue())
				                   .map(Map.Entry::getKey)
				                   .get();
				               
		System.out.println(element);
	}

}
