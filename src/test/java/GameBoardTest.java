import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;

public class GameBoardTest {

    GameBoard gameBoard = new GameBoard();

    @Test
    public void testGameBoard() {
        Assert.assertThat(gameBoard, instanceOf(GameBoard.class));
    }

    @Test
    public void testcheckBoundary1() {
        gameBoard.initializeGameBoard();
        int[] playerInput = {2, 1};
        Assert.assertEquals(gameBoard.checkBoundary(playerInput), true);
    }

    @Test
    public void testcheckBoundary2() {
        gameBoard.initializeGameBoard();
        int[] playerInput = {2, 4};
        Assert.assertEquals(gameBoard.checkBoundary(playerInput), false);
    }

    @Test
    public void testcheckVacancy1() {
        gameBoard.initializeGameBoard();
        int[] playerInput = {2, 1};
        Assert.assertEquals(gameBoard.checkVacancy(playerInput), true);
    }

    @Test
    public void testcheckVacancy2() {
        gameBoard.initializeGameBoard();
        int[] playerInput = {2, 1};
        gameBoard.setGameBoard(playerInput, 'X');
        Assert.assertEquals(gameBoard.checkVacancy(playerInput), false);
    }
}
