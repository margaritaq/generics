package var3.league;

import var3.Enum.SportType;

import java.util.HashMap;
import java.util.Map;

public class LeagueTable<K extends SportType, V extends League> {

    private Map<K, V> leagueTable = new HashMap<>();

    public void put(K sportType, V league) {
        leagueTable.put(sportType, league);
    }

    public void displayTable() {
        for (Map.Entry<K, V> entry : leagueTable.entrySet()) {
            System.out.print(entry.getKey().name() + " ");
            entry.getValue().printTeams();
        }
    }
}
