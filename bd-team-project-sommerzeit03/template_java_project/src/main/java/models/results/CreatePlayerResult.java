package main.java.models.results;

import main.java.dynamodb.models.Player;
import main.java.models.PlayerModel;

public class CreatePlayerResult {

    private PlayerModel player;

    public CreatePlayerResult(Builder builder) {
        this.player = builder.player;
    }

    public PlayerModel getPlayer() {
        return player;
    }

    public void setPlayer(PlayerModel player) {
        this.player = player;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        private PlayerModel player;

        public Builder withPlayer(PlayerModel playerToUse) {
            this.player = playerToUse;
            return this;
        }

        public CreatePlayerResult build() {
            return new CreatePlayerResult(this);
        }
    }
}
