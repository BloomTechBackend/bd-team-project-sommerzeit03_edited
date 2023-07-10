package main.java.dynamodb.models;


import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName = "FieldPlayers")
public class FieldPlayer {

    private Integer id;
    private String name;
    private String position;
    private String teamName;
    private String teamCity;
    private Integer atBats;
    private Integer hits;
    private Double battingAverage;
    private Integer homeruns;
    private Integer runsBattedIn;
    private Integer runsScored;
    private Integer stolenBases;

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

    @DynamoDBAttribute(attributeName = "position")
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
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

    @DynamoDBAttribute(attributeName = "atBats")
    public Integer getAtBats() {
        return atBats;
    }

    public void setAtBats(Integer atBats) {
        this.atBats = atBats;
    }

    @DynamoDBAttribute(attributeName = "hits")
    public Integer getHits() {
        return hits;
    }

    public void setHits(Integer hits) {
        this.hits = hits;
    }

    @DynamoDBAttribute(attributeName = "battingAverage")
    public Double getBattingAverage() {
        return battingAverage;
    }

    public void setBattingAverage(Double battingAverage) {
        this.battingAverage = battingAverage;
    }

    @DynamoDBAttribute(attributeName = "homeruns")
    public Integer getHomeruns() {
        return homeruns;
    }

    public void setHomeruns(Integer homeruns) {
        this.homeruns = homeruns;
    }

    @DynamoDBAttribute(attributeName = "runsBattedIn")
    public Integer getRunsBattedIn() {
        return runsBattedIn;
    }

    public void setRunsBattedIn(Integer runsBattedIn) {
        this.runsBattedIn = runsBattedIn;
    }

    @DynamoDBAttribute(attributeName = "runsScored")
    public Integer getRunsScored() {
        return runsScored;
    }

    public void setRunsScored(Integer runsScored) {
        this.runsScored = runsScored;
    }

    @DynamoDBAttribute(attributeName = "stolenBases")
    public Integer getStolenBases() {
        return stolenBases;
    }

    public void setStolenBases(Integer stolenBases) {
        this.stolenBases = stolenBases;
    }




}