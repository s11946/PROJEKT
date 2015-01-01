package repositories.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import repositories.IMatchRepository;
import unitofwork.IUnitOfWork;
import domain.League;
import domain.Match;

public class MatchRepository extends Repository<Match> implements IMatchRepository {
	
	public MatchRepository(Connection connection, IEntityBuilder<Match> builder, IUnitOfWork uow) {
		super(connection, builder, uow);
	}

	@Override
	protected void setUpUpdateQuery(Match entity) throws SQLException {
		this.update.setDate(1, entity.getDate());
		this.update.setString(2, entity.getScore());
		this.update.setInt(3, entity.getLegaue().getId());
		this.update.setInt(4, entity.getId());
		
	}

	@Override
	protected void setUpInsertQuery(Match entity) throws SQLException {
		this.insert.setDate(1, entity.getDate());
		this.insert.setString(2, entity.getScore());
		this.insert.setInt(3, entity.getLegaue().getId());
		
	}

	@Override
	protected String getTableName() {
		return "match";
	}

	@Override
	protected String getInsertQuery() {
		return "INSERT INTO match(score,league) VALUES(?,?)";
	}

	@Override
	protected String getUpdateQuery() {
		return "UPDATE match SET (score,league)=(?,?) WHERE id=?";
	}

	@Override
	public List<Match> inLeague(League league) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Match> inLeague(int leagueId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Match> inLeague(String leagueName) {
		// TODO Auto-generated method stub
		return null;
	}

}
