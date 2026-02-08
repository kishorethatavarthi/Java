package com.learnings.optional;

import java.util.Optional;

public class OptionalExample2 {
	public static String getDefault() {
		System.out.println("getDefault() method is called");
		return "Default value";
	}
	public static void main(String[] args) {
		Optional<String> op1 = Optional.ofNullable("kishore");
		//Eager evaluation always calls that getDefault() method even value is present
		String result1 = op1.orElse(getDefault());
		System.out.println(result1);
		
		System.out.println("=========================");
		//Lazy evaluation if the op1 has value getDefault() method will not be called
		String result2 = op1.orElseGet(()->getDefault());
		System.out.println(result2);
		
		System.out.println("=========================");
		Optional<String> op2 = Optional.ofNullable(null);
		op2.orElseThrow(()-> new IllegalArgumentException("Value missing"));
		
		
		
	}

}
