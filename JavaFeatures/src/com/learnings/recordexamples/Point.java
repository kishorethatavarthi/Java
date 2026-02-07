package com.learnings.recordexamples;

public record Point(int x, int y) {
	public static void main(String[] args) {
		Point p1 = new Point(1, 2);
		Point p2 = new Point(1, 2);
		System.out.println(p1 == p2);
		System.out.println("P1 Hashcode " + p1.hashCode());
		System.out.println("P2 Hashcode " + p2.hashCode());
		System.out.println(p1.hashCode() == p2.hashCode());
		System.out.println(p1.equals(p2));
	}

}
