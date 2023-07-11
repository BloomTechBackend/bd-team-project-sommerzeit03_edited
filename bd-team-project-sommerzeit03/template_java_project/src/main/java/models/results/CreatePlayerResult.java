package main.java.models.results;

import main.java.dynamodb.models.Player;

public class CreatePlayerResult {

    private Player player;

    public CreatePlayerResult(Builder builder) {
        this.player = builder.player;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        private Player player;

        public Builder withPlayer(Player playerToUse) {
            this.player = playerToUse;
            return this;
        }

        public CreatePlayerResult build() {
            return new CreatePlayerResult(this);
        }
    }
}
