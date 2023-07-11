package main.java.models.requests;

import java.util.Objects;

public class CreateContractRequest {

    private String playerId;
    private Integer yearlySalary;
    private Integer totalYears;

    public CreateContractRequest(String playerId, Integer yearlySalary, Integer totalYears) {
        this.playerId = playerId;
        this.yearlySalary = yearlySalary;
        this.totalYears = totalYears;
    }

    public CreateContractRequest() {
    }

    public CreateContractRequest(Builder builder) {
        this.playerId = builder.playerId;
        this.yearlySalary = builder.yearlySalary;
        this.totalYears = builder.totalYears;
    }

    public String getPlayerId() {
        return playerId;
    }

    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    public Integer getYearlySalary() {
        return yearlySalary;
    }

    public void setYearlySalary(Integer yearlySalary) {
        this.yearlySalary = yearlySalary;
    }

    public Integer getTotalYears() {
        return totalYears;
    }

    public void setTotalYears(Integer totalYears) {
        this.totalYears = totalYears;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CreateContractRequest)) return false;
        CreateContractRequest that = (CreateContractRequest) o;
        return Objects.equals(getPlayerId(), that.getPlayerId()) && Objects.equals(getYearlySalary(), that.getYearlySalary()) && Objects.equals(getTotalYears(), that.getTotalYears());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPlayerId(), getYearlySalary(), getTotalYears());
    }

    @Override
    public String toString() {
        return "CreateContractRequest{" +
                "playedId='" + playerId + '\'' +
                ", yearlySalary=" + yearlySalary +
                ", totalYears=" + totalYears +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        private String playerId;
        private Integer yearlySalary;
        private Integer totalYears;

        private Builder() {

        }

        public Builder withPlayerId(String playerIdToUse) {
            this.playerId = playerIdToUse;
            return this;
        }

        public Builder withYearlySalary(Integer yearlySalaryToUse) {
            this.yearlySalary = yearlySalaryToUse;
            return this;
        }

        public Builder withTotalYears(Integer totalYearsToUse) {
            this.totalYears = totalYearsToUse;
            return this;
        }

        public CreateContractRequest build() {
            return new CreateContractRequest(this);
        }
    }
}
