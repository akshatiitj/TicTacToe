package game.organizers;

import game.board.Board;
import game.display.PlayerTurn;
import game.players.Player;

public class SingleMovementFromPlayer {
    private static int[] playerInput = new int[2];
    private PlayerTurn playerTurn = new PlayerTurn();
    private ResultCheckAfterEveryMovement resultCheckAfterEveryMovement
            = new ResultCheckAfterEveryMovement();

    public int makeOneMove(int numberOfMoves, Board board, Player player) {
        do
        {
            board.showGameBoard();
            playerTurn.showPlayerTurn(player);
            playerInput = player.givePlayerInputLocation();
        } while (board.checkBoundary(playerInput)
                && board.checkVacancy(playerInput));
        board.setBoardTile(playerInput, player.getPlayerSymbol());
        return resultCheckAfterEveryMovement.checkResult(numberOfMoves, board, player);
    }
}