package main.java.models.requests;

import java.util.Objects;

public class CreatePlayerRequest {

    private String id;
    private String name;
    private String position;
    private String teamName;
    private String teamCity;

    public CreatePlayerRequest(String id, String name, String position, String teamName, String teamCity) {
        this.id = id;
        this.name = name;
        this.position = position;
    }

    public CreatePlayerRequest() {}

    public CreatePlayerRequest(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.position = builder.position;
        this.teamName = builder.teamName;
        this.teamCity = builder.teamCity;
    }

    public String getId() {
        return this.id;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CreatePlayerRequest)) return false;
        CreatePlayerRequest that = (CreatePlayerRequest) o;
        return Objects.equals(getId(), that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "CreatePlayerRequest{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", teamName='" + teamName + '\'' +
                ", teamCity='" + teamCity + '\'' +
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

        public Builder withTeamCity(String teamCityToUse) {
            this.teamCity = teamCityToUse;
            return this;
        }

        public Builder withTeamName(String teamNameToUse) {
            this.teamName = teamNameToUse;
            return this;
        }

        public CreatePlayerRequest build() {
            return new CreatePlayerRequest(this);
        }
    }
}
