package main.java.dynamodb;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import main.java.dynamodb.models.Contract;

import javax.inject.Inject;

public class ContractDao {

    private final DynamoDBMapper dynamoDBMapper;

    /**
     *
     * @param dynamoDBMapper used to interact with the Contracts table
     */
    @Inject
    public ContractDao(DynamoDBMapper dynamoDBMapper) {
        this.dynamoDBMapper = dynamoDBMapper;
    }

    public Contract getContract(String playerId) {
        Contract contract = this.dynamoDBMapper.load(Contract.class, playerId);

        return contract;
    }

    public Contract saveContract(Contract contract) {
        this.dynamoDBMapper.save(contract);

        return contract;
    }

}
