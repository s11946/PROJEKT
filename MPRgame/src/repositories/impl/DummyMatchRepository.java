package repositories.impl;

import java.util.ArrayList;
import java.util.List;
import domain.League;
import domain.Match;
import repositories.IMatchRepository;

public class DummyMatchRepository implements IMatchRepository{
	
	private DummyDb db;
	
	public DummyMatchRepository(DummyDb db) {
	super();
	this.db = db;
	}

	@Override
	public void save(Match entity) {
		this.db.matches.add(entity);
		
	}

	@Override
	public void update(Match entity) {
	}

	@Override
	public void delete(Match entity) {
		this.db.matches.remove(entity);
		
	}

	@Override
	public Match get(int id) {
		for(Match m : db.matches) {
			if (m.getId() == id) {
				return m;
			}
		}
		return null;
	}

	@Override
	public List<Match> getAll() {
		return this.db.matches;
	}

	@Override
	public List<Match> inLeague(League league) {
		return inLeague(league.getId());
	}

	@Override
	public List<Match> inLeague(int leagueId) {
		for (League l : db.leagues) {
			if (l.getId() == leagueId) {
				return l.getMatches();
			}
		}
		return new ArrayList<>();
	}

	@Override
	public List<Match> inLeague(String leagueName) {
		for(League l : db.leagues) {
			if (l.getName().equals(leagueName)) {
				return l.getMatches();
			}
		}
		return new ArrayList<>();
	}

}
