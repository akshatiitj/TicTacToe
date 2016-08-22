package game.organizers;

import game.board.Board;
import game.players.Player;

public class PlayerTurnDecider {
    private SingleMovementFromPlayer singleMovementFromPlayer = new SingleMovementFromPlayer();


    public int getPlayerToPlay(int currentNumberOfMoves, int numberOfPlayers, Board board, Player player1, Player player2) {
        switch (currentNumberOfMoves%numberOfPlayers) {
            case 0:
                return singleMovementFromPlayer.makeOneMove(currentNumberOfMoves, board, player1);
            default:
                return singleMovementFromPlayer.makeOneMove(currentNumberOfMoves, board, player1);
        }
    }
}