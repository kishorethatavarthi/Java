package com.learnings.optional;

import java.util.Optional;

public class OptionalExample1 {
	public static void main(String[] args) {
		Optional<String> op = Optional.of("kishore");
		System.out.println(op.get());
		
		Optional<String> op1 = Optional.ofNullable(null);
		//Here you will get NullPointerException its not safe to use
		//System.out.println(op1.get());
		
		//We have to use like below isPresent() and get() methods
		if(op1.isPresent()) {
			System.out.println(op1.get());
		}
		
		Optional<String> op2 = Optional.empty();
		//If you do on top of empty you will get NosuchElement Exception
		//System.out.println(op2.get());
		
		if(op2.isPresent()) {
			System.out.println(op2.get());
		}
		
		op2.ifPresentOrElse(System.out::println, ()->System.out.println("No Value"));
		
		
		
		
	}

}
