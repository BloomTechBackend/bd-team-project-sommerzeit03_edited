package main.java.dynamodb.models;


import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;

public class Player {

    @DynamoDBHashKey(attributeName = "id")
    private Integer id;

    @DynamoDBAttribute(attributeName = "name")
    private String name;

    @DynamoDBAttribute(attributeName = "position")
    private String position;

    @DynamoDBAttribute(attributeName = "teamName")
    private String teamName;

    @DynamoDBAttribute(attributeName = "teamCity")
    private String teamCity;

    @DynamoDBAttribute(attributeName = "atBats")
    private Integer atBats;

    @DynamoDBAttribute(attributeName = "hits")
    private Integer hits;

    @DynamoDBAttribute(attributeName = "battingAverage")
    private Double battingAverage;

    @DynamoDBAttribute(attributeName = "homeruns")
    private Integer homeruns;

    @DynamoDBAttribute(attributeName = "runsBattedIn")
    private Integer runsBattedIn;

    @DynamoDBAttribute(attributeName = "runsScored")
    private Integer runsScored;

    @DynamoDBAttribute(attributeName = "stolenBases")
    private Integer stolenBases;

    @DynamoDBAttribute(attributeName = "inningsPitched")
    private Double inningsPitched;

    @DynamoDBAttribute(attributeName = "runsAllowed")
    private Integer runsAllowed;

    @DynamoDBAttribute(attributeName = "earnedRunsAverage")
    private Double earnedRunsAverage;

    @DynamoDBAttribute(attributeName = "strikeouts")
    private Integer strikeouts;

    @DynamoDBAttribute(attributeName = "walks")
    private Integer walks;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamCity() {
        return teamCity;
    }

    public void setTeamCity(String teamCity) {
        this.teamCity = teamCity;
    }

    public Integer getAtBats() {
        return atBats;
    }

    public void setAtBats(Integer atBats) {
        this.atBats = atBats;
    }

    public Integer getHits() {
        return hits;
    }

    public void setHits(Integer hits) {
        this.hits = hits;
    }

    public Double getBattingAverage() {
        return battingAverage;
    }

    public void setBattingAverage(Double battingAverage) {
        this.battingAverage = battingAverage;
    }

    public Integer getHomeruns() {
        return homeruns;
    }

    public void setHomeruns(Integer homeruns) {
        this.homeruns = homeruns;
    }

    public Integer getRunsBattedIn() {
        return runsBattedIn;
    }

    public void setRunsBattedIn(Integer runsBattedIn) {
        this.runsBattedIn = runsBattedIn;
    }

    public Integer getRunsScored() {
        return runsScored;
    }

    public void setRunsScored(Integer runsScored) {
        this.runsScored = runsScored;
    }

    public Integer getStolenBases() {
        return stolenBases;
    }

    public void setStolenBases(Integer stolenBases) {
        this.stolenBases = stolenBases;
    }

    public Double getInningsPitched() {
        return inningsPitched;
    }

    public void setInningsPitched(Double inningsPitched) {
        this.inningsPitched = inningsPitched;
    }

    public Integer getRunsAllowed() {
        return runsAllowed;
    }

    public void setRunsAllowed(Integer runsAllowed) {
        this.runsAllowed = runsAllowed;
    }

    public Double getEarnedRunsAverage() {
        return earnedRunsAverage;
    }

    public void setEarnedRunsAverage(Double earnedRunsAverage) {
        this.earnedRunsAverage = earnedRunsAverage;
    }

    public Integer getStrikeouts() {
        return strikeouts;
    }

    public void setStrikeouts(Integer strikeouts) {
        this.strikeouts = strikeouts;
    }

    public Integer getWalks() {
        return walks;
    }

    public void setWalks(Integer walks) {
        this.walks = walks;
    }



}