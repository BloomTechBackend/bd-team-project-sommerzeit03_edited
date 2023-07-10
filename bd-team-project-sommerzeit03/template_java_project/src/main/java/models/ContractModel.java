package main.java.models;

import java.time.ZonedDateTime;
import java.util.Objects;

public class ContractModel {

    private String id;
    private String playerId;
    private Integer yearlySalary;
    private Integer totalYears;
    private Integer signingBonus;

    public ContractModel(Builder builder) {
        this.id = builder.id;
        this.playerId = builder.playerId;
        this.yearlySalary = builder.yearlySalary;
        this.totalYears = builder.totalYears;
        this.signingBonus = builder.signingBonus;
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

    public Integer getSigningBonus() {
        return signingBonus;
    }

    public void setSigningBonus(Integer signingBonus) {
        this.signingBonus = signingBonus;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ContractModel)) return false;
        ContractModel that = (ContractModel) o;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getPlayerId(), that.getPlayerId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getPlayerId());
    }

    @Override
    public String toString() {
        return "ContractModel{" +
                "id='" + id + '\'' +
                ", playerId='" + playerId + '\'' +
                ", yearlySalary=" + yearlySalary +
                ", totalYears=" + totalYears +
                ", signingBonus=" + signingBonus +
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
        private Integer signingBonus;

        public Builder withId(String idToUse) {
            this.id = idToUse;
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

        public Builder withSigningBonus(Integer signingBonusToUse) {
            this.signingBonus = signingBonusToUse;
            return this;
        }

        public ContractModel build(){
            return new ContractModel(this);
        }
    }
}
