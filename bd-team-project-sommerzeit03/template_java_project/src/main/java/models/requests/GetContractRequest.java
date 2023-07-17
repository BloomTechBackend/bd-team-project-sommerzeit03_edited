package main.java.models.requests;

import main.java.models.results.GetContractResult;

import java.util.Objects;

public class GetContractRequest {

    private String id;
    private String playerId;

    public GetContractRequest() {
    }

    public GetContractRequest(Builder builder) {
        this.id = builder.id;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GetContractRequest)) return false;
        GetContractRequest that = (GetContractRequest) o;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getPlayerId(), that.getPlayerId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getPlayerId());
    }

    @Override
    public String toString() {
        return "GetContractRequest{" +
                "id='" + id + '\'' +
                ", playerId='" + playerId + '\'' +
                '}';
    }

    public static Builder builder() {
        return new GetContractRequest.Builder();
    }

    public static final class Builder {
        private String id;
        private String  playerId;

        private Builder() {

        }

        public Builder withId(String idToUse) {
            this.id = idToUse;
            return this;
        }

        public Builder withPlayerId(String playerIdToUse) {
            this.playerId = playerIdToUse;
            return this;
        }

        public GetContractRequest build() {
            return new GetContractRequest(this);
        }
    }
}
