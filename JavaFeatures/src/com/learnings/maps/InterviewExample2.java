package com.learnings.maps;

import java.util.HashMap;
import java.util.Map;

public class InterviewExample2 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();

        map.compute("a", (_, v) -> v == null ? 1 : v + 1);
        map.computeIfAbsent("b", _ -> 10);
        map.computeIfPresent("b", (_, v) -> v * 2);
        map.merge("a", 5, Integer::sum);

        System.out.println(map); // {a=6, b=20}
	}

}
