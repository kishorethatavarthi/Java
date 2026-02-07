package com.learnings.recordexamples;

import java.util.ArrayList;
import java.util.List;

public record Team3(String name, List<String> members) {
	
	public Team3{
		members = List.copyOf(members);
	}
	
	public static void main(String[] args) {
		ArrayList<String> members = new ArrayList<>();
		members.add("kishore");
		members.add("vinay");
		
		Team3 team = new Team3("Dhruva",members);
		System.out.println(team);
		
		team.members.add("rvr");
		System.out.println(team);
	}

}
