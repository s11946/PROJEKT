package repositories.impl;

import java.sql.Connection;
import java.sql.SQLException;




import java.util.List;

import repositories.ITeamRepository;
import unitofwork.IUnitOfWork;
import domain.Game;
import domain.Team;

public class TeamRepository extends Repository<Team> implements ITeamRepository {
	
	public TeamRepository(Connection connection, IEntityBuilder<Team> builder, IUnitOfWork uow) {
		super(connection, builder, uow);
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


	@Override
	public List<Team> withGame(Game game) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<Team> withGame(String gameName) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<Team> withGame(int gameId) {
		// TODO Auto-generated method stub
		return null;
	}

}
