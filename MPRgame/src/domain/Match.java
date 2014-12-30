package domain;

import java.sql.Date;
import java.util.*;

public class Match extends Entity {
//shopping
	private List<Team> teams;
	private Date date;
	private League legaue;
	private String score;
	
	
	public Match(){
		this.teams = new ArrayList<>();
	}

	public List<Team> getTeams() {
		return teams;
	}

	public void setTeams(List<Team> teams) {
		this.teams = teams;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public League getLegaue() {
		return legaue;
	}

	public void setLegaue(League legaue) {
		this.legaue = legaue;
	}
	
	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}
	
}
