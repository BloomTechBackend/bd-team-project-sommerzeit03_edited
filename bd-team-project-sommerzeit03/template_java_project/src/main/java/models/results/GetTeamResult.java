package main.java.models.results;

import main.java.dynamodb.models.Team;

public class GetTeamResult {

    private Team team;

    public GetTeamResult(Builder builder) {

    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        private Team team;

        public Builder withTeam(Team teamToUse) {
            this.team = teamToUse;
            return this;
        }

        public GetTeamResult build() {
            return new GetTeamResult(this);
        }
    }

}
