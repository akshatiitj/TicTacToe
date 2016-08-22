package game.organizers;

import game.board.Board;
import game.players.Player;

public class Organizer {
    private PlayerTurnDecider playerTurnDecider = new PlayerTurnDecider();

    public void playGame (Board board, Player player1, Player player2) {
        int currentNumberOfMoves = 0, numberOfPlayers = 2;
        do {
            currentNumberOfMoves =
                    playerTurnDecider.getPlayerToPlay(
                            currentNumberOfMoves, numberOfPlayers, board,
                            player1, player2);
        } while( currentNumberOfMoves < board.getTotalNumberOfMoves() );
    }
}