package repositories.impl;

import java.util.List;
import java.util.ArrayList;
import domain.Game;
import domain.League;
import domain.Match;
import domain.Team;

public class DummyDb {
	
	public List<Team> teams = new ArrayList<>();
	public List<Match> matches = new ArrayList<>();
	public List<Game> games = new ArrayList<>();
	public List<League> leagues = new ArrayList<>();

}
