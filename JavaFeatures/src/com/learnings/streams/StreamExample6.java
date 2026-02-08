package com.learnings.streams;

import java.util.List;

//sum of numbers
public class StreamExample6 {
	public static void main(String[] args) {
		List<Integer> list = List.of(1,2,3,4,5,6,7,8);
		int sum = list.stream().reduce(0, Integer::sum);
		System.out.println(sum);
	}

}
