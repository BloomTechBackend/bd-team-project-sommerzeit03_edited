package main.java.models.results;

import main.java.dynamodb.models.Player;

public class GetPlayerResult {

    private Player player;

    public GetPlayerResult(Builder builder) {
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

        public GetPlayerResult build() {
            return new GetPlayerResult(this);
        }
    }
}
