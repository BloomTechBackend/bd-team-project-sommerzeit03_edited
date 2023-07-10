package main.java.dynamodb;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import main.java.dynamodb.models.Pitcher;

public class PitcherDao {

    private final DynamoDBMapper dynamoDBMapper;

    /**
     *
     * @param dynamoDBMapper to interact with the Pitchers table
     */
    public PitcherDao(DynamoDBMapper dynamoDBMapper) {
        this.dynamoDBMapper = dynamoDBMapper;
    }

    public Pitcher getPitcher(String id) {
        Pitcher pitcher = dynamoDBMapper.load(Pitcher.class, id);

        return pitcher;
    }

}
