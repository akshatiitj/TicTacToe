package game.display;

import game.players.Player;

public class Result {

    public void declareResult(Player player) {
        System.out.println(player.getPlayerSymbol() + "is Victorious");
    }
}
