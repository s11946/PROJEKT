package repositories.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import domain.Game;

public class GameBuilder implements IEntityBuilder<Game>{

	@Override
	public Game build(ResultSet rs) throws SQLException {
		Game result = new Game();
		result.setId(rs.getInt("id"));
		result.setName(rs.getString("name"));
		result.setCode(rs.getString("code"));
		return result;
	}
	
	

}
