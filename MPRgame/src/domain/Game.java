package domain;

import java.util.*;

public class Game extends Entity {
//category
	
	private String name;
	private String code;
	private List<Team> teams;
	
	public Game(){
		this.teams = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public List<Team> getTeams() {
		return teams;
	}

	public void setTeams(List<Team> teams) {
		this.teams = teams;
	}
	
	
}
