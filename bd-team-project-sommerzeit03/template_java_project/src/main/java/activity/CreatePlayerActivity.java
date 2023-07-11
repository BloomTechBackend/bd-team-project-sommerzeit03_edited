package main.java.activity;

import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import main.java.dynamodb.PlayerDao;
import main.java.dynamodb.models.Player;
import main.java.models.requests.CreatePlayerRequest;
import main.java.models.results.CreatePlayerResult;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CreatePlayerActivity implements RequestHandler<CreatePlayerRequest, CreatePlayerResult> {

    private Logger log = LogManager.getLogger();
    private final PlayerDao playerDao;

    public CreatePlayerActivity() {
        this.playerDao = new PlayerDao(new DynamoDBMapper(AmazonDynamoDBClient.builder()
                .withRegion(Regions.US_WEST_2)
                .withCredentials(DefaultAWSCredentialsProviderChain.getInstance())
                .build()));
    }

    /**
     *
     * @param playerDao
     */
    public CreatePlayerActivity(PlayerDao playerDao) {
        this.playerDao = playerDao;
    }

    /**
     *
     * @param createPlayerRequest The Lambda Function input
     * @param context The Lambda execution environment context object.
     * @return
     */
    @Override
    public CreatePlayerResult handleRequest(CreatePlayerRequest createPlayerRequest, Context context) {
        log.info("Received CreatePlayerRequest {}", createPlayerRequest);

        Player player = new Player();
        player.setId(createPlayerRequest.getId());
        player.setName(createPlayerRequest.getName());
        player.setPosition(createPlayerRequest.getPosition());
        player.setTeamName(createPlayerRequest.getName());
        player.setTeamCity(createPlayerRequest.getTeamCity());
        player.setHits(0);
        player.setHomeruns(0);
        player.setBattingAverage(0.0);
        player.setAtBats(0);
        player.setRunsBattedIn(0);
        player.setStolenBases(0);
        player.setRunsScored(0);

        //TODO: add converter to return result

        playerDao.savePlayer(player);

        return null;
    }
}
