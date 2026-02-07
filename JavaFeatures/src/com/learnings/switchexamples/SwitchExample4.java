package com.learnings.switchexamples;

public class SwitchExample4 {
	public static void main(String[] args) {
		Object obj = 3;
		int len = switch (obj) {
		case String s -> s.length();
		case Integer i -> i;
		default -> 0;
		};

		System.out.println(len);

	}

}
