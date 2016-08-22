package game.display;

import game.board.Tile;

public class Board {

    public void showGameBoard(Tile[][] tiles) {
        for (int ii = 0; ii < 3; ii++) {
            for (int jj = 0; jj < 3; jj++) {
                System.out.print(tiles[ii][jj].getBoardTile());
            }
            System.out.print('\n');
        }
    }
}