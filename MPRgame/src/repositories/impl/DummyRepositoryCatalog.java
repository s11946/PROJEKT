package repositories.impl;

import repositories.IGameRepository;
import repositories.IMatchRepository;
import repositories.IRepositoryCatalog;
import repositories.ITeamRepository;

public class DummyRepositoryCatalog implements IRepositoryCatalog {
	
	DummyDb db = new DummyDb();

	@Override
	public IMatchRepository getMatches() {
		return new DummyMatchRepository(db);
	}

	@Override
	public ITeamRepository getTeams() {
		return new DummyTeamRepository(db);
	}

	@Override
	public IGameRepository getGames() {
		return new DummyGameRepository(db);
	}
	
	

}
