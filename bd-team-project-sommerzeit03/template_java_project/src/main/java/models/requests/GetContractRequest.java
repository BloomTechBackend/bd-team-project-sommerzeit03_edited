package main.java.models.requests;

import main.java.models.results.GetContractResult;

import java.util.Objects;

public class GetContractRequest {

    private String id;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GetContractRequest)) return false;
        GetContractRequest that = (GetContractRequest) o;
        return Objects.equals(getId(), that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "GetContractResult{" +
                "id='" + id + '\'' +
                '}';
    }

    public static Builder builder() {
        return new GetContractRequest.Builder();
    }

    public static final class Builder {
        private String id;

        private Builder() {

        }

        public Builder withId(String idToUse) {
            this.id = idToUse;
            return this;
        }

        public GetContractRequest build() {
            return new GetContractRequest(this);
        }
    }
}
