package repositories.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import domain.League;

public class LeagueBuilder implements IEntityBuilder<League> {

	@Override
	public League build(ResultSet rs) throws SQLException {
		League result = new League();
		result.setId(rs.getInt("id"));
		result.setName(rs.getString("name"));
		return result;
	}

}
