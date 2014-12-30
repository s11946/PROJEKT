package repositories.impl;

import java.sql.Connection;
import java.sql.SQLException;


import domain.Team;

public class TeamRepository extends Repository<Team> {
	
	public TeamRepository(Connection connection, IEntityBuilder<Team> builder) {
		super(connection, builder);
	}


	@Override
	protected void setUpUpdateQuery(Team entity) throws SQLException {
		this.update.setString(1, entity.getName());
		this.update.setString(2, entity.getNationality());
		this.update.setInt(3, entity.getGame().getId());
		this.update.setInt(4, entity.getId());
		
	}

	@Override
	protected void setUpInsertQuery(Team entity) throws SQLException {
		this.insert.setString(1, entity.getName());
		this.insert.setString(2, entity.getNationality());
		this.insert.setInt(3, entity.getGame().getId());
	}

	@Override
	protected String getTableName() {
		return "team";
	}

	@Override
	protected String getInsertQuery() {
		return "INSERT INTO team(name,nationality,game) VALUES(?,?,?)";
	}

	@Override
	protected String getUpdateQuery() {
		return "UPDATE team SET (name,nationality,game)=(?,?,?) WHERE id=?";
	}

}
