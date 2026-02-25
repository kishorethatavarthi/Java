package com.learnings.streams;

import java.util.Comparator;
import java.util.List;

//second lowest number
public class StreamExample5 {
	public static void main(String[] args) {
		List<Integer> list = List.of(1,10,5,8,90,100,-1,0,-5);
		Integer secondLowest = list.
				stream().
				distinct().
				sorted().
				skip(1).
				findFirst().
				orElse(null);
		System.out.println(secondLowest);
		
		System.out.println("==============================");
		Integer secondHighest =  list.
				                 stream().
				                 distinct().
				                 sorted(Comparator.reverseOrder()).
				                 skip(1).
				                 findFirst().
				                 orElse(null);
		System.out.println(secondHighest);
	}

}
