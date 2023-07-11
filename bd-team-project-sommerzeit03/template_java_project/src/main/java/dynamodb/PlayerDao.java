package main.java.dynamodb;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import main.java.dynamodb.models.Player;

public class PlayerDao {

    private final DynamoDBMapper dynamoDBMapper;

    /***
     *
     * @param dynamoDBMapper to interact with the Players table
     */
    public PlayerDao(DynamoDBMapper dynamoDBMapper) {
        this.dynamoDBMapper = dynamoDBMapper;
    }

    public Player getPlayer(String id) {
        Player player = dynamoDBMapper.load(Player.class, id);

        return player;
    }

    public Player savePlayer(Player player) {
        this.dynamoDBMapper.save(player);

        return player;
    }
}
