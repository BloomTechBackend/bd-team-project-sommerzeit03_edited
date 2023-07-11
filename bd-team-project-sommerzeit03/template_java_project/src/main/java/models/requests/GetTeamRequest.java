package main.java.models.requests;

import java.util.Objects;

public class GetTeamRequest {

    private String name;
    private String city;

    public GetTeamRequest() {

    }

    public GetTeamRequest(Builder builder) {
        this.name = builder.name;
        this.city = builder.city;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GetTeamRequest)) return false;
        GetTeamRequest that = (GetTeamRequest) o;
        return Objects.equals(getName(), that.getName()) && Objects.equals(getCity(), that.getCity());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getCity());
    }

    @Override
    public String toString() {
        return "GetTeamRequest{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        private String name;
        private String city;

        public Builder withName(String nameToUse) {
            this.name = nameToUse;
            return this;
        }

        public Builder withCity(String cityToUse) {
            this.city = cityToUse;
            return this;
        }

        public GetTeamRequest build() {
            return new GetTeamRequest(this);
        }
    }
}
