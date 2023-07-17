package main.java.models.results;

import main.java.dynamodb.models.Team;
import main.java.models.TeamModel;

public class GetTeamResult {

    private TeamModel team;

    public GetTeamResult(Builder builder) {
        this.team = builder.team;
    }

    public TeamModel getTeam() {
        return team;
    }

    public void setTeam(TeamModel team) {
        this.team = team;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        private TeamModel team;

        public Builder withTeam(TeamModel teamToUse) {
            this.team = teamToUse;
            return this;
        }

        public GetTeamResult build() {
            return new GetTeamResult(this);
        }
    }

}
