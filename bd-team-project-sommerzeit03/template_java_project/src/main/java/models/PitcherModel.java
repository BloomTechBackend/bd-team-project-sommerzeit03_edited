package main.java.models;

import java.util.Objects;

public class PitcherModel {

    private String id;
    private String name;
    private String teamName;
    private String teamCity;
    private Double inningsPitched;
    private Integer runsAllowed;
    private Double earnedRunsAverage;
    private Integer strikeouts;
    private Integer walks;

    public PitcherModel() {
    }

    public PitcherModel(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.teamName = builder.teamName;
        this.teamCity = builder.teamCity;
        this.inningsPitched = builder.inningsPitched;
        this.runsAllowed = builder.runsAllowed;
        this.earnedRunsAverage = builder.earnedRunsAverage;
        this.strikeouts = builder.strikeouts;
        this.walks = builder.walks;
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

    public Double getInningsPitched() {
        return inningsPitched;
    }

    public void setInningsPitched(Double inningsPitched) {
        this.inningsPitched = inningsPitched;
    }

    public Integer getRunsAllowed() {
        return runsAllowed;
    }

    public void setRunsAllowed(Integer runsAllowed) {
        this.runsAllowed = runsAllowed;
    }

    public Double getEarnedRunsAverage() {
        return earnedRunsAverage;
    }

    public void setEarnedRunsAverage(Double earnedRunsAverage) {
        this.earnedRunsAverage = earnedRunsAverage;
    }

    public Integer getStrikeouts() {
        return strikeouts;
    }

    public void setStrikeouts(Integer strikeouts) {
        this.strikeouts = strikeouts;
    }

    public Integer getWalks() {
        return walks;
    }

    public void setWalks(Integer walks) {
        this.walks = walks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PitcherModel)) return false;
        PitcherModel that = (PitcherModel) o;
        return Objects.equals(getId(), that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "PitcherModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", teamName='" + teamName + '\'' +
                ", teamCity='" + teamCity + '\'' +
                ", inningsPitched=" + inningsPitched +
                ", runsAllowed=" + runsAllowed +
                ", earnedRunsAverage=" + earnedRunsAverage +
                ", strikeouts=" + strikeouts +
                ", walks=" + walks +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        private String id;
        private String name;
        private String teamName;
        private String teamCity;
        private Double inningsPitched;
        private Integer runsAllowed;
        private Double earnedRunsAverage;
        private Integer strikeouts;
        private Integer walks;

        public Builder withId(String idToUse) {
            this.id = idToUse;
            return this;
        }

        public Builder withName(String nameToUse) {
            this.name = nameToUse;
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

        public Builder withInningsPitched(Double inningsPitchedToUse) {
            this.inningsPitched = inningsPitchedToUse;
            return this;
        }

        public Builder withRunsAllowed(Integer runsAllowedToUse) {
            this.runsAllowed = runsAllowedToUse;
            return this;
        }

        public Builder withEarnedRunsAverage(Double earnedRunsAverageToUse) {
            this.earnedRunsAverage = earnedRunsAverageToUse;
            return this;
        }

        public Builder withStrikeouts(Integer strikeoutsToUse) {
            this.strikeouts = strikeoutsToUse;
            return this;
        }

        public Builder withWalks(Integer walksToUse) {
            this.walks = walksToUse;
            return this;
        }

        public PitcherModel build() {
            return new PitcherModel(this);
        }

    }
}
