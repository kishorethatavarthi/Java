package com.learnings.textblocks;

public class TextBlocksExample2 {
	public static void main(String[] args) {
		String str = """
				Hello
				World
				""";
		System.out.println(str);
		System.out.println(str.length());
		
		String str1 = """
				Hello
				World\
				""";
		System.out.println(str1);
		System.out.println(str1.length());
		
		String str2 = """
				Hello\
				World\
				""";
		System.out.println(str2);
		System.out.println(str2.length());
		
	}

}
