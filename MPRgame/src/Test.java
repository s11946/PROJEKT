import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;

import repositories.IRepository;
import domain.Game;
import domain.League;
import domain.Match;
import domain.Team;


public class Test {

	public static void main(String[] args) {

		Test printer = new Test();
		
		String url="jdbc:hsqldb:hsql://localhost/workdb";
		
		Match match = new Match();
		match.setDate(new Date(System.currentTimeMillis()));
		
		League league = new League();
		league.setName("Clanbase");
		
		Game game = new Game();
		game.setName("Counter-Strike");
		
		Team team = new Team();
		team.setName("PJWSTK");
		team.setNationality("Polish");
		team.setGame(game);
		
	}
}
