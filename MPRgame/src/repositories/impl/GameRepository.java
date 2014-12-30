package repositories.impl;

import java.sql.Connection;
import java.sql.SQLException;
import domain.Game;

public class GameRepository extends Repository<Game>{
	
	public GameRepository(Connection connection, IEntityBuilder<Game> builder) {
		super(connection, builder);
	}

	@Override
	protected void setUpUpdateQuery(Game entity) throws SQLException {
		this.update.setString(1, entity.getName());
		this.update.setString(2, entity.getCode());
		this.update.setInt(3, entity.getId());
		
	}

	@Override
	protected void setUpInsertQuery(Game entity) throws SQLException {
		this.insert.setString(1, entity.getName());
		this.insert.setString(2, entity.getCode());
		
	}

	@Override
	protected String getTableName() {
		return "game";
	}

	@Override
	protected String getInsertQuery() {
		return "INSERT INTO game (name,code) VALUES(?,?)";
	}

	@Override
	protected String getUpdateQuery() {
		return "UPDATE game SET (name,code)=(?,?) WHERE id=?";
	}

}
