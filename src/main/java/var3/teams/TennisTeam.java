package var3.teams;

import var3.Enum.SportType;
import var3.abstracts.Team;

public class TennisTeam extends Team {
    private static final SportType tennisSportType = SportType.Tennis;

    public TennisTeam(String name) {
        super(name, tennisSportType);
    }
}
