package main.java.models.requests;

import java.util.Objects;

public class CreateContractRequest {

    private String id;
    private String playerId;
    private Integer yearlySalary;
    private Integer totalYears;

    public CreateContractRequest(String id, String playerId, Integer yearlySalary, Integer totalYears) {
        this.id = id;
        this.playerId = playerId;
        this.yearlySalary = yearlySalary;
        this.totalYears = totalYears;
    }

    public CreateContractRequest() {
    }

    public CreateContractRequest(Builder builder) {
        this.id = builder.id;
        this.playerId = builder.playerId;
        this.yearlySalary = builder.yearlySalary;
        this.totalYears = builder.totalYears;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
        return Objects.equals(getId(), that.getId()) && Objects.equals(getPlayerId(), that.getPlayerId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getPlayerId());
    }

    @Override
    public String toString() {
        return "CreateContractRequest{" +
                "contractId='" + id + '\'' +
                ", playerId='" + playerId + '\'' +
                ", yearlySalary=" + yearlySalary +
                ", totalYears=" + totalYears +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        private String id;
        private String playerId;
        private Integer yearlySalary;
        private Integer totalYears;

        private Builder() {

        }

        public Builder withContractId(String idTouse) {
            this.id = idTouse;
            return this;
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
