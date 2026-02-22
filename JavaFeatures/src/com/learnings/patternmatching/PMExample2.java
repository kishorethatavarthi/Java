package com.learnings.patternmatching;

public class PMExample2 {
	static String describe(Object obj) {
        return switch (obj) {
            case String s -> "Text: " + s;
            case Integer i -> "Number: " + i;
            case Double d -> "Decimal: " + d;
            case null -> "Null";
            default -> "Other type";
        };
    }
	
	
	public static void main(String[] args) {
		System.out.println(describe("Java"));
        System.out.println(describe(42));
        System.out.println(describe(3.14));
        System.out.println(describe(null));
	}

}
