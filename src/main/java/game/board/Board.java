package game.board;

public class Board {

    private int row = 3, col = 3;
    private Tile[][] tiles = new Tile[row][col];
    private game.display.Board board = new game.display.Board();

    public Board() {
        for (int ii = 0; ii < row; ii ++)
            for (int jj = 0; jj < col; jj++)
                tiles[ii][jj] = new Tile();
    }

    public boolean checkVacancy(int[] playerInput) {
        return (this.tiles[playerInput[0]][playerInput[1]].getBoardTile()
                == '_');
    }

    public boolean checkBoundary(int[] playerInput) {
        return (playerInput[0] >= 0 && playerInput[0]
                <= 2 && playerInput[1] >= 0 && playerInput[1] <= 2);
    }

    public void setBoardTile(int[] playerInput, char playerSymbol) {
        this.tiles[playerInput[0]][playerInput[1]].setBoardTile(playerSymbol);
    }

    public void showGameBoard() {
        board.showGameBoard(tiles);
    }

    public int getTotalNumberOfMoves() {
        return (this.row * this.col);
    }

    public Tile[][] getTiles() {
        return this.tiles;
    }
}