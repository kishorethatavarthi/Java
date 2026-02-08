package com.learnings.streams;

import java.util.List;
import java.util.stream.Collectors;

public class StreamExample1 {
	public static void main(String[] args) {
		
		List<Integer> list = List.of(1,2,3,4,5,7);
		list.stream().forEach(System.out::println);
		
		System.out.println("===========1=========");
		//even numbers
		list.stream().filter(n->n%2==0).forEach(System.out::println);
		
		System.out.println("====Join list of strings by comma======");
		List<String> list1 = List.of("k","i","s","h","o","r");
		String ans = list1.stream().collect(Collectors.joining());
		System.out.println(ans);
		
		System.out.println("=====flatten list of lists======");
		List<List<String>> list2 = List.of(List.of("kishor"),
				List.of("k","r"),
				List.of("rocky","vinay"));
		List<String> ans1 = list2.stream().flatMap(List::stream).collect(Collectors.toList());
		System.out.println(ans1);
		
		System.out.println("========Find values starting with 1");
		List<String> list3 = List.of("123","234","111","110","236");
		List<String> ans2 = list3.stream().filter(n->n.startsWith("1"))
				                 .collect(Collectors.toList());
		System.out.println(ans2);
		
		System.out.println("=========Find total characters in a list of strings======");
		List<String> list4 = List.of("kishore","vinay","rvr");
		int count = list4.stream()
				         .mapToInt(String::length)
				         .sum();
		System.out.println(count);
		
		System.out.println("============Palindromes in a list===========");
		List<String> list5 = List.of("kishore","rvr","vinay");
		list5.stream().filter(x->x.equals(new StringBuffer(x).reverse().toString()))
		              .forEach(System.out::println);
		
		
	}

}
