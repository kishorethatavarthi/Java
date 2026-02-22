package com.learnings.patternmatching;

public class PMExample1 {
	static void process(Object obj) {
		if (obj instanceof String s && s.length() > 1) {
			System.out.println("String length = " + s.length());
		} else if (obj instanceof Integer i) {
			System.out.println("Integer squared = " + (i * i));
		} else {
			System.out.println("Unknown type");
		}
	}

	public static void main(String[] args) {
		process("Hello");
		process(10);
		process(3.14);
	}

}
