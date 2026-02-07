package com.learnings.switchexamples;

public class SwitchExample3 {
	public static void main(String[] args) {
		int day = 3;
		String result = switch (day) {
		case 1, 2, 3 -> {
			yield "Weekday";
		}
		case 4, 5 -> {
			yield "Almost weekend";
		}
		case 6, 7 -> {
			yield "Weekend";
		}
		default -> {
			yield "Invalid";
		}
		};
		System.out.println(result);

	}

}
