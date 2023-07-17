package main.java.activity;

import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import main.java.converters.ModelConverter;
import main.java.dynamodb.ContractDao;
import main.java.dynamodb.TeamDao;
import main.java.dynamodb.models.Team;
import main.java.exceptions.TeamNotFoundException;
import main.java.models.requests.GetTeamRequest;
import main.java.models.results.GetTeamResult;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.inject.Inject;

public class GetTeamActivity implements RequestHandler<GetTeamRequest, GetTeamResult> {

    private final Logger log = LogManager.getLogger();
    private final TeamDao teamDao;

    public GetTeamActivity() {
        this.teamDao = new TeamDao(new DynamoDBMapper(AmazonDynamoDBClient.builder()
                .withRegion(Regions.US_WEST_2)
                .withCredentials(DefaultAWSCredentialsProviderChain.getInstance())
                .build()));
    }

    /**
     *
     * @param teamDao teamDao
     */
    @Inject
    public GetTeamActivity(TeamDao teamDao) {
        this.teamDao = teamDao;
    }

    /**
     *
     * @param getTeamRequest The Lambda Function input
     * @param context The Lambda execution environment context object.
     * @return
     */
    @Override
    public GetTeamResult handleRequest(GetTeamRequest getTeamRequest, Context context) {
        log.info("Received GetTeamRequest {}", getTeamRequest);
        String requestedName = getTeamRequest.getName();
        String requestedCity = getTeamRequest.getCity();

        Team teamFromDao = teamDao.getTeam(requestedName, requestedCity);

        if (teamFromDao == null) {
            throw new TeamNotFoundException("Could not find team.");
        }

        ModelConverter modelConverter = new ModelConverter();

        return GetTeamResult.builder()
                .withTeam(modelConverter.toTeamModel(teamFromDao))
                .build();
    }
}
