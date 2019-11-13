package var3.abstracts;

import var3.Enum.SportType;

public abstract class Team implements Comparable<Team> {
    private String name;
    private SportType sportType;

    public Team(String name, SportType sportType) {
        this.name = name;
        this.sportType = sportType;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Team team) {
        return this.name.compareTo(team.getName());
    }

    @Override
    public String toString() {
        return getName();
    }
}
