package main.java.activity;

import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import main.java.converters.ModelConverter;
import main.java.dynamodb.ContractDao;
import main.java.dynamodb.models.Contract;
import main.java.models.requests.GetContractRequest;
import main.java.models.results.GetContractResult;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.inject.Inject;
import java.util.ConcurrentModificationException;

public class GetContractActivity implements RequestHandler<GetContractRequest, GetContractResult> {

    private final Logger log = LogManager.getLogger();
    private final ContractDao contractDao;

    public GetContractActivity() {
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
    public GetContractActivity(ContractDao contractDao) {
        this.contractDao = contractDao;
    }


    @Override
    public GetContractResult handleRequest(GetContractRequest getContractRequest, Context context) {

        log.info("Received GetContractRequest", getContractRequest);
        String requestedId = getContractRequest.getId();
        Contract contract = contractDao.getContract(requestedId);
        if (contract == null) {
            throw new ConcurrentModificationException("Could not find contract with id: " + requestedId);
        }

        ModelConverter modelConverter = new ModelConverter();

        return GetContractResult.builder()
                .withContractModel(modelConverter.toContractModel(contract))
                .build();
    }
}
