package var3;

import var3.Enum.SportType;
import var3.league.League;
import var3.league.LeagueTable;
import var3.teams.BasketBallTeam;
import var3.teams.BoxTeam;
import var3.teams.FootBallTeam;
import var3.teams.TennisTeam;

public class MainClass {
    public static void main(String[] args) {
        League<FootBallTeam> footballLeague = new League<>();
        League<BasketBallTeam> basketballLeague = new League<>();
        League<BoxTeam> boxLeague = new League<>();
        League<TennisTeam> tennisLeague = new League<>();

        FootBallTeam footBallTeam1 = new FootBallTeam("Dacia");
        FootBallTeam footBallTeam2 = new FootBallTeam("Barcelona");
        FootBallTeam footBallTeam3 = new FootBallTeam("Zimbru");
        FootBallTeam footBallTeam4 = new FootBallTeam("Arsenal");

        BasketBallTeam basketBallTeam1 = new BasketBallTeam("Avengers");
        BasketBallTeam basketBallTeam2 = new BasketBallTeam("Zulu");
        BasketBallTeam basketBallTeam3 = new BasketBallTeam("Magic");
        BasketBallTeam basketBallTeam4 = new BasketBallTeam("Diamond");

        BoxTeam boxTeam1 = new BoxTeam("Slash");
        BoxTeam boxTeam2 = new BoxTeam("Cuvalda");

        TennisTeam tennisTeam = new TennisTeam("Deizy");

        tennisLeague.addTeam(tennisTeam);

        boxLeague.addTeam(boxTeam1);
        boxLeague.addTeam(boxTeam2);

        footballLeague.addTeam(footBallTeam1);
        footballLeague.addTeam(footBallTeam2);
        footballLeague.addTeam(footBallTeam3);
        footballLeague.addTeam(footBallTeam4);

        basketballLeague.addTeam(basketBallTeam1);
        basketballLeague.addTeam(basketBallTeam2);
        basketballLeague.addTeam(basketBallTeam3);
        basketballLeague.addTeam(basketBallTeam4);

        LeagueTable<SportType, League> leagueTable = new LeagueTable<>();

        leagueTable.put(SportType.FootBall, footballLeague);
        leagueTable.put(SportType.BasketBall, basketballLeague);
        leagueTable.put(SportType.Box, boxLeague);
        leagueTable.put(SportType.Tennis, tennisLeague);

        leagueTable.displayTable();

//         fail to compile
//        footballLeague.addTeam(basketBallTeam1);
    }
}
