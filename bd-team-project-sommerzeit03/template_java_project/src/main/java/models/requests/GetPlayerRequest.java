package main.java.models.requests;

import java.util.Objects;

public class GetPlayerRequest {

    private String id;

    public GetPlayerRequest() {

    }

    public GetPlayerRequest(Builder builder) {
        this.id = builder.id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GetPlayerRequest)) return false;
        GetPlayerRequest that = (GetPlayerRequest) o;
        return Objects.equals(getId(), that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "GetPlayerRequest{" +
                "id='" + id + '\'' +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        private String id;

        public Builder withId(String idToUse) {
            this.id  = idToUse;
            return this;
        }

        public GetPlayerRequest build() {
            return new GetPlayerRequest(this);
        }
    }
}
