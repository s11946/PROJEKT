package repositories.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import domain.Match;

public class MatchBuilder implements IEntityBuilder<Match> {

	@Override
	public Match build(ResultSet rs) throws SQLException {
		Match result = new Match();
		result.setId(rs.getInt("id"));
		result.setDate(rs.getDate("date"));
		result.setScore(rs.getString("score"));
		return null;
	}
	

}
