package main.java.converters;

import main.java.dynamodb.models.Contract;
import main.java.dynamodb.models.Player;
import main.java.dynamodb.models.Team;
import main.java.models.ContractModel;
import main.java.models.PlayerModel;
import main.java.models.TeamModel;

public class ModelConverter {
    /**
     *
     * @param player
     * @return
     */
    public PlayerModel toPlayerModel(Player player) {

        return PlayerModel.builder()
                .withId(player.getId())
                .withName(player.getName())
                .withPosition(player.getPosition())
                .withTeamName(player.getTeamName())
                .withTeamCity(player.getTeamCity())
                .withAtBats(player.getAtBats())
                .withHits(player.getHits())
                .withBattingAverage(player.getBattingAverage())
                .withHomeruns(player.getHomeruns())
                .withRunsBattedIn(player.getRunsBattedIn())
                .withRunsScored(player.getRunsScored())
                .withStolenBases(player.getStolenBases())
                .build();
    }

    /**
     *
     * @param team
     * @return
     */
    public TeamModel toTeamModel(Team team) {

        return TeamModel.builder()
                .withName(team.getName())
                .withCity(team.getCity())
                .withStadium(team.getStadium())
                .withYearFounded(team.getYearFounded())
                .build();
    }

    /**
     * 
     * @param contract
     * @return
     */
    public ContractModel toContractModel(Contract contract) {

        return ContractModel.builder()
                .withId(contract.getId())
                .withPlayerId(contract.getPlayerId())
                .withSigningBonus(contract.getSigningBonus())
                .withTotalYears(contract.getTotalYears())
                .withYearlySalary(contract.getYearlySalary())
                .build();
    }

}
