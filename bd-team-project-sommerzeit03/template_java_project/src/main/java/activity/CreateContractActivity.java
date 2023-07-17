package main.java.activity;


import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;
import com.amazonaws.regions.DefaultAwsRegionProviderChain;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import main.java.converters.ModelConverter;
import main.java.dynamodb.ContractDao;
import main.java.dynamodb.models.Contract;
import main.java.models.requests.CreateContractRequest;
import main.java.models.results.CreateContractResult;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.inject.Inject;

public class CreateContractActivity implements RequestHandler<CreateContractRequest, CreateContractResult> {

    private final Logger log = LogManager.getLogger();
    private final ContractDao contractDao;

    public CreateContractActivity() {
        this.contractDao = new ContractDao(new DynamoDBMapper(AmazonDynamoDBClient.builder()
                .withRegion(Regions.US_WEST_2)
                .withCredentials(DefaultAWSCredentialsProviderChain.getInstance())
                .build()));
    }

    /**
     *
     * @param contractDao contractDao
     */
    @Inject
    public CreateContractActivity(ContractDao contractDao) {
        this.contractDao = contractDao;
    }


    @Override
    public CreateContractResult handleRequest(final CreateContractRequest createContractRequest, Context context) {
        log.info("Received CreateContractRequest {}", createContractRequest);

        Contract contract = new Contract();
        contract.setId(createContractRequest.getId());
        contract.setPlayerId(createContractRequest.getPlayerId());
        contract.setYearlySalary(createContractRequest.getYearlySalary());
        contract.setTotalYears(createContractRequest.getTotalYears());

        Contract contractFromDao = contractDao.saveContract(contract);

        ModelConverter modelConverter = new ModelConverter();

        return CreateContractResult.builder()
                .withContractModel(modelConverter.toContractModel(contract))
                .build();
    }
}
