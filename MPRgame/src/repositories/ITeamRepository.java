package repositories;

import java.util.List;

import domain.Game;
import domain.Team;

public interface ITeamRepository extends IRepository<Team>{
	
	public List<Team> withGame(Game game);
	
	public List<Team> withGame(String gameName);
	
	public List<Team> withGame(int gameId);

}
