package repositories;

import domain.Game;
import domain.Team;

public interface IGameRepository extends IRepository<Game> {
	
	public Game fromTeam(Team team);
	
	public Game fromTeam(String teamName);
	
	public Game fromTeam(int teamId);
	

}
