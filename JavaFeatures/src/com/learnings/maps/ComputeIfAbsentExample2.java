package com.learnings.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ComputeIfAbsentExample2 {
  public static void main(String[] args) {
	  Map<String,List<String>> map = new HashMap<>();
	  map.computeIfAbsent("fruits", k-> new ArrayList<>()).add("apple");
	  map.computeIfAbsent("fruits",k-> new ArrayList<>()).add("banana");
	  map.computeIfAbsent("veg", k-> new ArrayList<>()).add("carrot");
	  System.out.println(map); //{fruits=[apple, banana], veg=[carrot]}
	
}
}
