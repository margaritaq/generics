package var3.teams;

import var3.Enum.SportType;
import var3.abstracts.Team;

public class FootBallTeam extends Team {

    private static final SportType footballSportType = SportType.FootBall;

    public FootBallTeam(String name) {
        super(name, footballSportType);
    }
}
