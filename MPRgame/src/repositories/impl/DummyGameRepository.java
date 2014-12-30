package repositories.impl;

import java.util.List;

import domain.Game;
import domain.Team;
import repositories.IGameRepository;

public class DummyGameRepository implements IGameRepository {
	
	private DummyDb db;
	
	public DummyGameRepository(DummyDb db){
		this.db = db;
	}

	@Override
	public void save(Game entity) {
		this.db.games.add(entity);
		
	}

	@Override
	public void update(Game entity) {
	}

	@Override
	public void delete(Game entity) {
		this.db.games.remove(entity);
		
	}

	@Override
	public Game get(int id) {
		for (Game g : db.games){
			if(g.getId() == id) {
				return g;
			}
		}
		return null;
	}

	@Override
	public List<Game> getAll() {
		return db.games;
	}

	@Override
	public Game fromTeam(Team team) {
		return fromTeam(team.getId());
	}

	@Override
	public Game fromTeam(String teamName) {
		for (Team g : db.teams){
			if (g.getName().equals(teamName)){
				return g.getGame();
			}
		}
		return null;
	}

	@Override
	public Game fromTeam(int teamId) {
		for (Team g : db.teams) {
			if (g.getId() == teamId) {
				return g.getGame();
			}
		}
		return null;
	}

}
