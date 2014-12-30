package repositories.impl;

import repositories.IGameRepository;
import repositories.IMatchRepository;
import repositories.IRepositoryCatalog;
import repositories.ITeamRepository;

public class DummyRepositoryCatalog implements IRepositoryCatalog {
	
	DummyDb db = new DummyDb();

	@Override
	public IMatchRepository getMatches() {
		throw new UnsupportedOperationException("Not supported yet.");
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
