package com.learnings.strings;

public class StringsExample1 {
	public static void main(String[] args) {
		String str = "kishore";
		str.chars().forEach(System.out::println);
		
		System.out.println("==========1==========");
		str.chars().forEach(x->System.out.println((char)x));
		
		System.out.println("==========2==========");
		str.codePoints().forEach(System.out::println);
		
		System.out.println("==========3==========");
		System.out.println("   ".isBlank()); // true
		System.out.println("   ".isEmpty()); //false
		
		System.out.println("==========4==========");
		String text = "A\nB\nC";
		text.lines().forEach(System.out::println);
		
		System.out.println("==========5==========");
		System.out.println("  hello  ".strip());
		System.out.println("  hello  ".strip().length());
		System.out.println("  hello  ".stripLeading());
		System.out.println("  hello  ".stripLeading().length());
		System.out.println("  hello  ".stripTrailing());
		System.out.println("  hello  ".stripTrailing().length());
		
		System.out.println("==========6==========");
		System.out.println("kishore ".repeat(5));
		
		System.out.println("==========7==========");
		
	}

}
