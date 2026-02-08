package com.learnings.streams;

import java.util.List;

//Common elements between two lists
public class StreamExample12 {
	public static void main(String[] args) {
		List<String> list1 = List.of("kishore","vinay","rvr");
		List<String> list2 = List.of("kishore","vinay");
		
		List<String> commonElements = list1.stream()
				                           .filter(list2::contains)
				                           .toList();
		System.out.println(commonElements);
	}

}
