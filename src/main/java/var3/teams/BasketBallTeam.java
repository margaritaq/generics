package var3.teams;

import var3.Enum.SportType;
import var3.abstracts.Team;

public class BasketBallTeam extends Team {

    private static final SportType basketBallSportType = SportType.BasketBall;

    public BasketBallTeam(String name) {
        super(name, basketBallSportType);
    }
}
