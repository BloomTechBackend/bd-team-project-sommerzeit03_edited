package main.java.models.requests;

import java.util.Objects;

public class UpdatePlayerRequest {
    private String id;
    private Integer atBats;
    private Integer homeruns;
    private Integer runsBattedIn;
    private Integer hits;
    private Integer runsScored;
    private Integer stolenBases;

    public UpdatePlayerRequest(){

    }

    public UpdatePlayerRequest(String id, Integer atBats, Integer homeruns, Integer runsBattedIn, Integer hits, Integer runsScored, Integer stolenBases) {
        this.id = id;
        this.atBats = atBats;
        this.homeruns = homeruns;
        this.runsBattedIn = runsBattedIn;
        this.hits = hits;
        this.runsScored = runsScored;
        this.stolenBases = stolenBases;
    }

    public UpdatePlayerRequest(Builder builder) {
        this.id = builder.id;
        this.atBats = builder.atBats;
        this.homeruns = builder.homeruns;
        this.runsBattedIn = builder.runsBattedIn;
        this.hits = builder.hits;
        this.runsScored = builder.runsScored;
        this.stolenBases = builder.stolenBases;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getAtBats() {
        return atBats;
    }

    public void setAtBats(Integer atBats) {
        this.atBats = atBats;
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

    public Integer getHits() {
        return hits;
    }

    public void setHits(Integer hits) {
        this.hits = hits;
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
        if (!(o instanceof UpdatePlayerRequest)) return false;
        UpdatePlayerRequest that = (UpdatePlayerRequest) o;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getAtBats(), that.getAtBats()) && Objects.equals(getHomeruns(), that.getHomeruns()) && Objects.equals(getRunsBattedIn(), that.getRunsBattedIn()) && Objects.equals(getHits(), that.getHits()) && Objects.equals(getRunsScored(), that.getRunsScored()) && Objects.equals(getStolenBases(), that.getStolenBases());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getAtBats(), getHomeruns(), getRunsBattedIn(), getHits(), getRunsScored(), getStolenBases());
    }

    @Override
    public String toString() {
        return "UpdatePlayerRequest{" +
                "id='" + id + '\'' +
                ", atBats=" + atBats +
                ", homeruns=" + homeruns +
                ", runsBattedIn=" + runsBattedIn +
                ", hits=" + hits +
                ", runsScored=" + runsScored +
                ", stolenBases=" + stolenBases +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        private String id;
        private Integer atBats;
        private Integer homeruns;
        private Integer runsBattedIn;
        private Integer hits;
        private Integer runsScored;
        private Integer stolenBases;

        public Builder withId(String idToUse) {
            this.id = idToUse;
            return this;
        }

        public Builder withAtBats(Integer atBatsToUse) {
            this.atBats = atBatsToUse;
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

        public Builder withHits(Integer hitsToUse) {
            this.hits = hitsToUse;
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

        public UpdatePlayerRequest build() {
            return new UpdatePlayerRequest(this);
        }
    }
}
