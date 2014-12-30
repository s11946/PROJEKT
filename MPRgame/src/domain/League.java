package domain;

import java.util.*;

public class League extends Entity {
//shop
	
	private String name;
	private List<Team> teams;
	
	public League(){
		this.teams = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Team> getTeams() {
		return teams;
	}

	public void setTeams(List<Team> teams) {
		this.teams = teams;
	}
	
}
