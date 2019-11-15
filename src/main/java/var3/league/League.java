package var3.league;

import var3.abstracts.Team;

import java.util.*;

public class League<T extends Team> {

    private Set<T> teams = new TreeSet<>();

    public void addTeam(T team) {
        teams.add(team);
    }

    public void printTeams() {
        System.out.println(teams);
    }
}
