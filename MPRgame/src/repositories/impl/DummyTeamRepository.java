package repositories.impl;

import java.util.ArrayList;
import java.util.List;

import domain.Game;
import domain.Team;
import repositories.ITeamRepository;

public class DummyTeamRepository implements ITeamRepository {
	
	private DummyDb db;
	
	public DummyTeamRepository(DummyDb db) {
		super();
		this.db = db;
	}

	@Override
	public void save(Team entity) {
		this.db.teams.add(entity);
		
	}

	@Override
	public void update(Team entity) {
	}

	@Override
	public void delete(Team entity) {
		this.db.teams.remove(entity);
	}

	@Override
	public Team get(int id) {
		for (Team t : db.teams) {
			if (t.getId() == id) {
				return t;
			}
		}
		return null;
	}

	@Override
	public List<Team> getAll() {
		return this.db.teams;
	}

	@Override
	public List<Team> withGame(Game game) {
		return withGame(game.getId());
	}

	@Override
	public List<Team> withGame(String gameName) {
		for (Game g : db.games) {
			if (g.getName().equals(gameName)) {
				return g.getTeams();
			}
		}
		return new ArrayList<>();
	}	

	@Override
	public List<Team> withGame(int gameId) {
		for (Game g : db.games) {
			if (g.getId() == gameId) {
				return g.getTeams();
			}
		}
		return new ArrayList<>();
	}

}
