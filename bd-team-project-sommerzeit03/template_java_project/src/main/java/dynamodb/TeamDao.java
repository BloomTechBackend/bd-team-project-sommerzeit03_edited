package main.java.dynamodb;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import main.java.dynamodb.models.Team;

import javax.inject.Inject;

public class TeamDao {

    private final DynamoDBMapper dynamoDBMapper;

    /**
     *
     * @param dynamoDBMapper to interact with the Teams table
     */
    @Inject
    public TeamDao(DynamoDBMapper dynamoDBMapper) {
        this.dynamoDBMapper = dynamoDBMapper;
    }

    public Team getTeam(String name, String city) {
        Team team = dynamoDBMapper.load(Team.class, name, city);

        return team;
    }
}
