package var3.teams;

import var3.Enum.SportType;
import var3.abstracts.Team;

public class BoxTeam extends Team {
    private static final SportType boxSportType = SportType.Box;

    public BoxTeam(String name) {
        super(name, boxSportType);
    }
}
