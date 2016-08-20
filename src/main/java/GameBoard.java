public class GameBoard {

    private int row = 3, col = 3;
    private char[][] gameBoard = new char[row][col];

    public boolean checkVacancy(int[] playerInput) {
        return (gameBoard[playerInput[0]][playerInput[1]] == '_');
    }

    public boolean checkBoundary(int[] playerInput) {
        return (playerInput[0] >= 0 && playerInput[0] <= 2 && playerInput[1] >= 0 && playerInput[1] <= 2);
    }

    public void initializeGameBoard() {
        for (int ii = 0; ii < row; ii++) {
            for (int jj = 0; jj < col; jj++) {
                int[] playerInput = {ii, jj};
                this.setGameBoard( playerInput, '_');
            }
        }
    }

    public void setGameBoard(int[] playerInput, char gameCharacter) {
        this.gameBoard[playerInput[0]][playerInput[1]] = gameCharacter;
    }

    public void showGameBoard() {
        for (int ii = 0; ii < 3; ii++) {
            for (int jj = 0; jj < 3; jj++) {
                System.out.print(this.gameBoard[ii][jj]);
            }
            System.out.print('\n');
        }
    }
}