package game.players;

import game.input.PlayerInputForMoveLocation;

public class Player {
    private final char playerSymbol;
    private PlayerInputForMoveLocation playerInputForMoveLocation
            = new PlayerInputForMoveLocation();

    public Player(char playerSymbol) {
        this.playerSymbol = playerSymbol;
    }

    public char getPlayerSymbol() {
        return this.playerSymbol;
    }

    public int[] givePlayerInputLocation() {
        return playerInputForMoveLocation.takeInputFromPlayerForMoveLocation();
    }
}
