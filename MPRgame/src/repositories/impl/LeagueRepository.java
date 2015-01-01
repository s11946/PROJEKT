package repositories.impl;

import java.sql.Connection;
import java.sql.SQLException;

import unitofwork.IUnitOfWork;
import domain.League;

public class LeagueRepository extends Repository<League> {
	
	public LeagueRepository(Connection connection, IEntityBuilder<League> builder, IUnitOfWork uow) {
		super(connection, builder, uow);
	}


	@Override
	protected void setUpUpdateQuery(League entity) throws SQLException {
		this.update.setString(1, entity.getName());
		this.update.setInt(2, entity.getId());
		
	}

	@Override
	protected void setUpInsertQuery(League entity) throws SQLException {
		this.insert.setString(1, entity.getName());
		
	}

	@Override
	protected String getTableName() {
		return "league";
	}

	@Override
	protected String getInsertQuery() {
		return "INSERT INTO league(name) VALUES(?)";
	}

	@Override
	protected String getUpdateQuery() {
		return "UPDATE league SET (name)=(?) WHERE id=?";
	}
	
	

}
