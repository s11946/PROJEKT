package repositories;

public interface IRepositoryCatalog {
	
	public IMatchRepository getMatches();
	public ITeamRepository getTeams();
	public IGameRepository getGames();
}
