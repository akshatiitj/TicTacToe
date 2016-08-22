package game;

import game.board.Board;
import game.organizers.Organizer;
import game.players.Player;

public class TicTacToe {
    private Board board = new Board();
    private Player player1, player2;
    private Organizer organizer = new Organizer();

    public TicTacToe(char player1Symbol, char player2Symbol) {
        player1 = new Player(player1Symbol);
        player2 = new Player(player2Symbol);
    }

    public void playTicTacToe() {
        organizer.playGame(board, player1, player2);
    }
}
