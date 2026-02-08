package com.learnings.textblocks;

public class TextBlocksExample4 {
	public static void main(String[] args) {
		String name = "kishore";
		
		String str1 = """
		        Hello " + name + "
		        """;
		System.out.println(str1);
		
		String str2 = """
		        Hello %s
		        """.formatted(name);
		System.out.println(str2);


	}

}
