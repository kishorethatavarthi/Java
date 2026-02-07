package com.learnings.recordexamples;

import java.util.ArrayList;
import java.util.List;

public record Team(String name, List<String> members) {
	
	public static void main(String[] args) {
		ArrayList<String> members = new ArrayList<>();
		members.add("kishore");
		members.add("vinay");
		
		Team team = new Team("Yuva", members);
		System.out.println(team);
		
		team.members.add("rvr");
		System.out.println(team);
	}

}
