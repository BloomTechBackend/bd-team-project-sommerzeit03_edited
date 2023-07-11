package main.java.models.results;

import main.java.dynamodb.models.Contract;
import main.java.models.ContractModel;

import java.util.Objects;

public class GetContractResult {

    private ContractModel contractModel;

    public GetContractResult(Builder builder) {

    }

    public ContractModel getContract() {
        return contractModel;
    }

    public void setContract(ContractModel contractModel) {
        this.contractModel = contractModel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        private ContractModel contractModel;

        public Builder withContractModel(ContractModel contractModelToUse) {
            this.contractModel = contractModelToUse;
            return this;
        }

        public GetContractResult build() {
            return new GetContractResult(this);
        }
    }
}
