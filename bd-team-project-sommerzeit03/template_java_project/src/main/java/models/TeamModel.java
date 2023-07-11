package main.java.models;

import java.util.Objects;

public class TeamModel {

    private String name;
    private String city;
    private Integer yearFounded;
    private String stadium;

    public TeamModel() {
    }

    public TeamModel(Builder builder) {
        this.name = builder.name;
        this.city = builder.city;
        this.yearFounded = builder.yearFounded;
        this.stadium = builder.stadium;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getYearFounded() {
        return yearFounded;
    }

    public void setYearFounded(Integer yearFounded) {
        this.yearFounded = yearFounded;
    }

    public String getStadium() {
        return stadium;
    }

    public void setStadium(String stadium) {
        this.stadium = stadium;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TeamModel)) return false;
        TeamModel teamModel = (TeamModel) o;
        return Objects.equals(getName(), teamModel.getName()) && Objects.equals(getCity(), teamModel.getCity());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getCity());
    }

    @Override
    public String toString() {
        return "TeamModel{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", yearFounded=" + yearFounded +
                ", stadium='" + stadium + '\'' +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        private String name;
        private String city;
        private Integer yearFounded;
        private String stadium;

        public Builder withName(String nameToUse) {
            this.name = nameToUse;
            return this;
        }

        public Builder withCity(String cityToUse) {
            this.city = cityToUse;
            return this;
        }

        public Builder withYearFounded(Integer yearFoundedToUse) {
            this.yearFounded = yearFoundedToUse;
            return this;
        }

        public Builder withStadium(String stadiumToUse) {
            this.stadium = stadiumToUse;
            return this;
        }

        public TeamModel build() {
            return new TeamModel(this);
        }
    }
}
