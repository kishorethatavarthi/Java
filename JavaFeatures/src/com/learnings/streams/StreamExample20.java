package com.learnings.streams;

import java.util.stream.Collectors;

//check two strings are anagrams
public class StreamExample20 {
	public static void main(String[] args) {
		String s1 = "kishore";
		String s2 = "ksoiher";
		
		boolean isAnagram = s1.chars()
				              .sorted()
				              .boxed()
				              .collect(Collectors.toList())
				              .equals(
				            		  s2.chars()
				            		  .sorted()
				            		  .boxed()
				            		  .collect(Collectors.toList())
				            		  );
		
		System.out.println(isAnagram);
	}

}
