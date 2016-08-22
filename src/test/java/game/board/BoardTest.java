package game.board;

import org.junit.Assert;
import org.junit.Test;


import static org.hamcrest.CoreMatchers.instanceOf;

public class BoardTest {

    Board gameBoard = new Board();

    @Test
    public void testGameBoard() {
        Assert.assertThat(gameBoard, instanceOf(Board.class));
    }

    @Test
    public void testcheckBoundary1() {
        int[] playerInput = {2, 1};
        Assert.assertEquals(gameBoard.checkBoundary(playerInput), true);
    }

    @Test
    public void testcheckBoundary2() {
        int[] playerInput = {2, 4};
        Assert.assertEquals(gameBoard.checkBoundary(playerInput), false);
    }

    @Test
    public void testcheckVacancy1() {
        int[] playerInput = {0, 0};
        Assert.assertEquals(gameBoard.checkVacancy(playerInput), true);
    }

    @Test
    public void testcheckVacancy2() {
        int[] playerInput = {0, 0};
        gameBoard.setBoardTile(playerInput, 'X');
        Assert.assertEquals(gameBoard.checkVacancy(playerInput), false);
    }
}
