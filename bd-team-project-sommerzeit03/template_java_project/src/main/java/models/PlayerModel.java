package main.java.models;

import java.util.Objects;

public class PlayerModel {

    private String id;
    private String name;
    private String position;
    private String teamName;
    private String teamCity;
    private Integer atBats;
    private Integer hits;
    private Double battingAverage;
    private Integer homeruns;
    private Integer runsBattedIn;
    private Integer runsScored;
    private Integer stolenBases;

    public PlayerModel() {
    }

    public PlayerModel(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.position = builder.position;
        this.teamName = builder.teamName;
        this.teamCity = builder.teamCity;
        this.atBats = builder.atBats;
        this.hits = builder.hits;
        this.battingAverage = builder.battingAverage;
        this.homeruns = builder.homeruns;
        this.runsBattedIn = builder.runsBattedIn;
        this.runsScored = builder.runsScored;
        this.stolenBases = builder.stolenBases;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamCity() {
        return teamCity;
    }

    public void setTeamCity(String teamCity) {
        this.teamCity = teamCity;
    }

    public Integer getAtBats() {
        return atBats;
    }

    public void setAtBats(Integer atBats) {
        this.atBats = atBats;
    }

    public Integer getHits() {
        return hits;
    }

    public void setHits(Integer hits) {
        this.hits = hits;
    }

    public Double getBattingAverage() {
        return battingAverage;
    }

    public void setBattingAverage(Double battingAverage) {
        this.battingAverage = battingAverage;
    }

    public Integer getHomeruns() {
        return homeruns;
    }

    public void setHomeruns(Integer homeruns) {
        this.homeruns = homeruns;
    }

    public Integer getRunsBattedIn() {
        return runsBattedIn;
    }

    public void setRunsBattedIn(Integer runsBattedIn) {
        this.runsBattedIn = runsBattedIn;
    }

    public Integer getRunsScored() {
        return runsScored;
    }

    public void setRunsScored(Integer runsScored) {
        this.runsScored = runsScored;
    }

    public Integer getStolenBases() {
        return stolenBases;
    }

    public void setStolenBases(Integer stolenBases) {
        this.stolenBases = stolenBases;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PlayerModel)) return false;
        PlayerModel that = (PlayerModel) o;
        return Objects.equals(getId(), that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "FieldPlayerModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", teamName='" + teamName + '\'' +
                ", teamCity='" + teamCity + '\'' +
                ", atBats=" + atBats +
                ", hits=" + hits +
                ", battingAverage=" + battingAverage +
                ", homeruns=" + homeruns +
                ", runsBattedIn=" + runsBattedIn +
                ", runsScored=" + runsScored +
                ", stolenBases=" + stolenBases +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        private String id;
        private String name;
        private String position;
        private String teamName;
        private String teamCity;
        private Integer atBats;
        private Integer hits;
        private Double battingAverage;
        private Integer homeruns;
        private Integer runsBattedIn;
        private Integer runsScored;
        private Integer stolenBases;



        public Builder withId(String idToUse) {
            this.id = idToUse;
            return this;
        }

        public Builder withName(String nameToUse) {
            this.name = nameToUse;
            return this;
        }

        public Builder withPosition(String positionToUse) {
            this.position = positionToUse;
            return this;
        }

        public Builder withTeamName(String teamNameToUse) {
            this.teamName = teamNameToUse;
            return this;
        }

        public Builder withTeamCity(String teamCityToUse) {
            this.teamCity = teamCityToUse;
            return this;
        }

        public Builder withAtBats(Integer atBatsToUse) {
            this.atBats = atBatsToUse;
            return this;
        }

        public Builder withHits(Integer hitsToUse) {
            this.hits = hitsToUse;
            return this;
        }

        public Builder withBattingAverage(Double battingAverageToUse) {
            this.battingAverage = battingAverageToUse;
            return this;
        }

        public Builder withHomeruns(Integer homerunsToUse) {
            this.homeruns = homerunsToUse;
            return this;
        }

        public Builder withRunsBattedIn(Integer runsBattedInToUse) {
            this.runsBattedIn = runsBattedInToUse;
            return this;
        }

        public Builder withRunsScored(Integer runsScoredToUse) {
            this.runsScored = runsScoredToUse;
            return this;
        }

        public Builder withStolenBases(Integer stolenBasesToUse) {
            this.stolenBases = stolenBasesToUse;
            return this;
        }

        public PlayerModel build() {
            return new PlayerModel(this);
        }


    }
}
