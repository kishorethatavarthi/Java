package com.learnings.recordexamples;

import java.util.ArrayList;
import java.util.List;

public record Team1(String name, List<String> members) {
	
	public static void main(String[] args) {
		Team1 team = new Team1("Yuva", List.of("kishore"));
		System.out.println(team);
		
		team.members.add("rvr");
		System.out.println(team);
	}

}
