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
import main.java.models.PlayerModel;
import main.java.models.requests.UpdatePlayerRequest;
import main.java.models.results.UpdatePlayerResult;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.inject.Inject;

public class UpdatePlayerActivity implements RequestHandler<UpdatePlayerRequest, UpdatePlayerResult> {

    private final Logger log = LogManager.getLogger();
    private final PlayerDao playerDao;

    public UpdatePlayerActivity() {
        this.playerDao = new PlayerDao(new DynamoDBMapper(AmazonDynamoDBClient.builder()
                .withRegion(Regions.US_WEST_2)
                .withCredentials(DefaultAWSCredentialsProviderChain.getInstance())
                .build()));
    }

    /**
     *
     * @param playerDao
     */
    @Inject
    public UpdatePlayerActivity(PlayerDao playerDao) {
        this.playerDao = playerDao;
    }

    /**
     *
     * @param updatePlayerRequest The Lambda Function input
     * @param context The Lambda execution environment context object.
     * @return
     */
    @Override
    public UpdatePlayerResult handleRequest(UpdatePlayerRequest updatePlayerRequest, Context context) {
        log.info("Received updatePlayerRequest {}", updatePlayerRequest);
        Player player = playerDao.getPlayer(updatePlayerRequest.getId());

        if (player == null) {
            throw new PlayerNotFoundException();
        }

        player.setAtBats(updatePlayerRequest.getAtBats() + player.getAtBats());
        player.setHomeruns(player.getHomeruns() + player.getHomeruns());
        player.setRunsBattedIn(updatePlayerRequest.getRunsBattedIn() + player.getRunsBattedIn());
        player.setHits(updatePlayerRequest.getHits() + player.getHits());
        player.setRunsScored(updatePlayerRequest.getRunsScored() + player.getRunsScored());
        player.setStolenBases(updatePlayerRequest.getStolenBases() + player.getStolenBases());
        // batting average is calculated dividing hits by at bats
        String battingAvg = String.format("%.3f", (double) player.getHits() / player.getAtBats());
        player.setBattingAverage(Double.valueOf(battingAvg));

        playerDao.savePlayer(player);

        ModelConverter modelConverter = new ModelConverter();

        return UpdatePlayerResult.builder()
                .withPlayer(modelConverter.toPlayerModel(player))
                .build();
    }
}
