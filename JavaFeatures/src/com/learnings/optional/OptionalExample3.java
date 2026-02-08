package com.learnings.optional;

import java.util.List;
import java.util.Optional;

public class OptionalExample3 {
	public static void main(String[] args) {
		Optional<String> op1 = Optional.of("kishore");
		Optional<Integer> ot1 = op1.map(String::length);
		ot1.ifPresent(System.out::println);

		System.out.println("========================");
		Optional<Optional<String>> op2 = Optional.ofNullable(Optional.ofNullable(null));
		Optional<String> ot2 = op2.flatMap(x -> x);
		// It will print Optional.empty
		System.out.println(ot2);

		System.out.println("========================");
		Optional<Integer> op3 = Optional.ofNullable(25);
		op3.filter(x -> x >= 18).ifPresent(System.out::println);

		System.out.println("========================");
		Optional<Integer> op4 = Optional.ofNullable(null);
		op4.filter(x -> x >= 18).ifPresent(System.out::println);

		System.out.println("========================");
		List<Optional<String>> list = List.of(Optional.of("A"), Optional.empty(), Optional.of("B"));

		list.stream().flatMap(Optional::stream).forEach(System.out::println);

	}

}
