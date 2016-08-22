package game.display;

import game.players.Player;

public class PlayerTurn {
    public void showPlayerTurn(Player player) {
        System.out.println(player.getPlayerSymbol() + "to play:");
    }
}