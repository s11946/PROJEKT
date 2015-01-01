package repositories.impl;

import java.sql.Connection;
import java.sql.SQLException;

import repositories.IGameRepository;
import unitofwork.IUnitOfWork;
import domain.Game;
import domain.Team;

public class GameRepository extends Repository<Game> implements IGameRepository{
	
	public GameRepository(Connection connection, IEntityBuilder<Game> builder, IUnitOfWork uow) {
		super(connection, builder, uow);
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

	@Override
	public Game fromTeam(Team team) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Game fromTeam(String teamName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Game fromTeam(int teamId) {
		// TODO Auto-generated method stub
		return null;
	}

}
