package main.java.dynamodb.models;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName = "Pitchers")
public class Pitcher {

    private Integer id;
    private String name;
    private String position;
    private String teamName;
    private String teamCity;
    private Double inningsPitched;
    private Integer runsAllowed;
    private Double earnedRunsAverage;
    private Integer strikeouts;
    private Integer walks;

    @DynamoDBHashKey(attributeName = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @DynamoDBAttribute(attributeName = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @DynamoDBAttribute(attributeName = "teamName")
    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    @DynamoDBAttribute(attributeName = "teamCity")
    public String getTeamCity() {
        return teamCity;
    }

    public void setTeamCity(String teamCity) {
        this.teamCity = teamCity;
    }

    @DynamoDBAttribute(attributeName = "inningsPitched")
    public Double getInningsPitched() {
        return inningsPitched;
    }

    public void setInningsPitched(Double inningsPitched) {
        this.inningsPitched = inningsPitched;
    }

    @DynamoDBAttribute(attributeName = "runsAllowed")
    public Integer getRunsAllowed() {
        return runsAllowed;
    }

    public void setRunsAllowed(Integer runsAllowed) {
        this.runsAllowed = runsAllowed;
    }

    @DynamoDBAttribute(attributeName = "earnedRunsAverage")
    public Double getEarnedRunsAverage() {
        return earnedRunsAverage;
    }

    public void setEarnedRunsAverage(Double earnedRunsAverage) {
        this.earnedRunsAverage = earnedRunsAverage;
    }

    @DynamoDBAttribute(attributeName = "strikeouts")
    public Integer getStrikeouts() {
        return strikeouts;
    }

    public void setStrikeouts(Integer strikeouts) {
        this.strikeouts = strikeouts;
    }

    @DynamoDBAttribute(attributeName = "walks")
    public Integer getWalks() {
        return walks;
    }

    public void setWalks(Integer walks) {
        this.walks = walks;
    }
}
