package repositories;

import java.util.List;
import domain.League;
import domain.Match;

public interface IMatchRepository extends IRepository<Match> {
	
	public List<Match>	inLeague(League League);
	
	public List<Match>	inLeague(int leagueId);
	
	public List<Match>	inLeague(String leagueName);
	
	

}
