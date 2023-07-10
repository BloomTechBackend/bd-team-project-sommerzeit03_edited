package main.java.dynamodb;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import main.java.dynamodb.models.FieldPlayer;

public class FieldPlayerDao {

    private final DynamoDBMapper dynamoDBMapper;

    /***
     *
     * @param dynamoDBMapper to interact with the Players table
     */
    public FieldPlayerDao(DynamoDBMapper dynamoDBMapper) {
        this.dynamoDBMapper = dynamoDBMapper;
    }

    public FieldPlayer getPlayer(String id) {
        FieldPlayer player = dynamoDBMapper.load(FieldPlayer.class, id);

        return player;
    }
}
