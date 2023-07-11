package main.java.activity;

import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import main.java.converters.ModelConverter;
import main.java.dynamodb.PlayerDao;
import main.java.dynamodb.models.Player;
import main.java.exceptions.PlayerNotFoundException;
import main.java.models.requests.GetPlayerRequest;
import main.java.models.results.GetPlayerResult;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class GetPlayerActivity implements RequestHandler<GetPlayerRequest, GetPlayerResult> {

    private final Logger log = LogManager.getLogger();
    private final PlayerDao playerDao;

    public GetPlayerActivity() {
        this.playerDao = new PlayerDao(new DynamoDBMapper(AmazonDynamoDBClient.builder()
                .withRegion(Regions.US_WEST_2)
                .withCredentials(DefaultAWSCredentialsProviderChain.getInstance())
                .build()));
    }

    public GetPlayerActivity(PlayerDao playerDao) {
        this.playerDao = playerDao;
    }

    /**
     *
     * @param getPlayerRequest The Lambda Function input
     * @param context The Lambda execution environment context object.
     * @return
     */
    @Override
    public GetPlayerResult handleRequest(GetPlayerRequest getPlayerRequest, Context context) {
        log.info("Received GetPlayerRequest {}", getPlayerRequest);
        String requestedId = getPlayerRequest.getId();
        Player player = playerDao.getPlayer(requestedId);
        if (player == null) {
            throw new PlayerNotFoundException();
        }
        // TODO: player model to return result
        ModelConverter modelConverter = new ModelConverter();

        return GetPlayerResult.builder()
                .withPlayer(modelConverter.toPlayerModel(player))
                .build();
    }
}
