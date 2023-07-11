package main.java.models.results;

import main.java.dynamodb.models.Contract;
import main.java.models.ContractModel;

public class CreateContractResult {

    private ContractModel contractModel;

    public CreateContractResult(Builder builder) {
        this.contractModel = builder.contractModel;
    }

    public ContractModel getContractModel() {
        return contractModel;
    }

    public void setContractModel(ContractModel contractModel) {
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

        public CreateContractResult build() {
            return new CreateContractResult(this);
        }
    }
}
