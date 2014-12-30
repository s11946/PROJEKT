package repositories.impl;

import java.sql.Connection;
import java.sql.SQLException;

import domain.Match;

public class MatchRepository extends Repository<Match> {
	
	public MatchRepository(Connection connection, IEntityBuilder<Match> builder) {
		super(connection, builder);
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

}
