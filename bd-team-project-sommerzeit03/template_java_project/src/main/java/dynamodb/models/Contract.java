package main.java.dynamodb.models;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import com.amazonaws.services.dynamodbv2.xspec.S;

import java.time.ZonedDateTime;

@DynamoDBTable(tableName = "Contracts")
public class Contract {

    private String id;
    private String playerId;
    private Integer yearlySalary;
    private Integer totalYears;
    private Integer signingBonus;

    @DynamoDBAttribute(attributeName = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @DynamoDBAttribute(attributeName = "playerId")
    public String getPlayerId() {
        return playerId;
    }

    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    @DynamoDBAttribute(attributeName = "yearlySalary")
    public Integer getYearlySalary() {
        return yearlySalary;
    }

    public void setYearlySalary(Integer yearlySalary) {
        this.yearlySalary = yearlySalary;
    }

    @DynamoDBAttribute(attributeName = "totalYears")
    public Integer getTotalYears() {
        return totalYears;
    }

    public void setTotalYears(Integer totalYears) {
        this.totalYears = totalYears;
    }

    @DynamoDBAttribute(attributeName = "signingBonus")
    public Integer getSigningBonus() {
        return signingBonus;
    }

    public void setSigningBonus(Integer signingBonus) {
        this.signingBonus = signingBonus;
    }
    
}
