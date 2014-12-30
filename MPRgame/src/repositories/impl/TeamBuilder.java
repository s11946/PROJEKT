package repositories.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import domain.Team;

public class TeamBuilder implements IEntityBuilder<Team>{

	@Override
	public Team build(ResultSet rs) throws SQLException {
		Team result = new Team();
		result.setId(rs.getInt("id"));
		result.setName(rs.getString("name"));
		result.setNationality(rs.getString("nationality"));
		return result;
	}

}
