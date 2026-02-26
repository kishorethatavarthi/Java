package com.learnings.streams;

import java.util.List;

//Find sum of digits of all numbers in list
public class StremExample19 {
	public static void main(String[] args) {
		List<Integer> list = List.of(123,234,345,456);
		int sum = list.stream().
				flatMapToInt(s->String.valueOf(s).chars().map(c->c-'0')).
				sum();
		System.out.println(sum);
	}

}
