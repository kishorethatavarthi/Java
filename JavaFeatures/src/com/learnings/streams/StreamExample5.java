package com.learnings.streams;

import java.util.List;

//second highest number
public class StreamExample5 {
	public static void main(String[] args) {
		List<Integer> list = List.of(1,10,5,8,90,100,-1,0,-5);
		int secondHighest = list.stream().distinct().sorted().skip(1).findFirst().get();
		System.out.println(secondHighest);
	}

}
