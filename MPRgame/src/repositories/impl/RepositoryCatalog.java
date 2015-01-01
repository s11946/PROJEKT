package repositories.impl;

import java.sql.Connection;

import repositories.IGameRepository;
import repositories.IMatchRepository;
import repositories.IRepositoryCatalog;
import repositories.ITeamRepository;
import unitofwork.IUnitOfWork;

public class RepositoryCatalog implements IRepositoryCatalog {
	
	private Connection connection;
	private IUnitOfWork uow;

	public RepositoryCatalog(Connection connection, IUnitOfWork uow) {
		super();
		this.connection = connection;
		this.uow = uow;
	}
	@Override
	public IMatchRepository getMatches() {
		return new MatchRepository(connection, new MatchBuilder(), uow);
	}

	@Override
	public ITeamRepository getTeams() {
		return new TeamRepository(connection, new TeamBuilder(), uow);
	}

	@Override
	public IGameRepository getGames() {
		return new GameRepository(connection, new GameBuilder(), uow);
	}

}
