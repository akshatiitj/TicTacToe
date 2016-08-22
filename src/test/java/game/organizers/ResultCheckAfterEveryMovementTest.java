package game.organizers;

import game.board.Board;
import game.players.Player;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;

public class ResultCheckAfterEveryMovementTest {
    ResultCheckAfterEveryMovement resultCheckAfterEveryMovement
            = new ResultCheckAfterEveryMovement();
    Board board = new Board();
    Player player1 = new Player('X');
    Player player2 = new Player('O');
    int[] row1col1Location = {0,0};
    int[] row1col2Location = {0,1};
    int[] row1col3Location = {0,2};
    int[] row2col1Location = {1,0};
    int[] row2col2Location = {1,1};
    int[] row2col3Location = {1,2};
    int[] row3col1Location = {2,0};
    int[] row3col2Location = {2,1};
    int[] row3col3Location = {2,2};


    @Test
    public void testResultCheckAfterEveryMovement() {
        Assert.assertThat(resultCheckAfterEveryMovement,
                instanceOf(ResultCheckAfterEveryMovement.class));
    }

    @Test
    public void testCheckResult1() {
        int currentNumberOfMoves = 0;
        board.setBoardTile(row1col1Location, player1.getPlayerSymbol());
        Assert.assertEquals(resultCheckAfterEveryMovement.checkResult(
                currentNumberOfMoves, board, player1), 1);
    }

    @Test
    public void testCheckResult2() {
        int currentNumberOfMoves = 5;
        board.setBoardTile(row1col1Location, player1.getPlayerSymbol());
        board.setBoardTile(row2col1Location, player2.getPlayerSymbol());
        board.setBoardTile(row2col2Location, player1.getPlayerSymbol());
        board.setBoardTile(row2col3Location, player2.getPlayerSymbol());
        board.setBoardTile(row3col3Location, player1.getPlayerSymbol());
        Assert.assertEquals(resultCheckAfterEveryMovement.checkResult(
                currentNumberOfMoves, board, player1), board.getTotalNumberOfMoves());
    }

    @Test
    public void testCheckResult3() {
        int currentNumberOfMoves = 5;
        board.setBoardTile(row3col1Location, player1.getPlayerSymbol());
        board.setBoardTile(row2col1Location, player2.getPlayerSymbol());
        board.setBoardTile(row2col2Location, player1.getPlayerSymbol());
        board.setBoardTile(row2col3Location, player2.getPlayerSymbol());
        board.setBoardTile(row1col3Location, player1.getPlayerSymbol());
        Assert.assertEquals(resultCheckAfterEveryMovement.checkResult(
                currentNumberOfMoves, board, player1), board.getTotalNumberOfMoves());
    }

    @Test
    public void testCheckResult4() {
        int currentNumberOfMoves = 5;
        board.setBoardTile(row1col1Location, player1.getPlayerSymbol());
        board.setBoardTile(row2col1Location, player2.getPlayerSymbol());
        board.setBoardTile(row1col2Location, player1.getPlayerSymbol());
        board.setBoardTile(row2col2Location, player2.getPlayerSymbol());
        board.setBoardTile(row1col3Location, player1.getPlayerSymbol());
        Assert.assertEquals(resultCheckAfterEveryMovement.checkResult(
                currentNumberOfMoves, board, player1), board.getTotalNumberOfMoves());
    }

    @Test
    public void testCheckResult5() {
        int currentNumberOfMoves = 5;
        board.setBoardTile(row2col1Location, player1.getPlayerSymbol());
        board.setBoardTile(row1col1Location, player2.getPlayerSymbol());
        board.setBoardTile(row2col2Location, player1.getPlayerSymbol());
        board.setBoardTile(row1col2Location, player2.getPlayerSymbol());
        board.setBoardTile(row2col3Location, player1.getPlayerSymbol());
        Assert.assertEquals(resultCheckAfterEveryMovement.checkResult(
                currentNumberOfMoves, board, player1), board.getTotalNumberOfMoves());
    }

    @Test
    public void testCheckResult6() {
        int currentNumberOfMoves = 5;
        board.setBoardTile(row3col1Location, player1.getPlayerSymbol());
        board.setBoardTile(row1col1Location, player2.getPlayerSymbol());
        board.setBoardTile(row3col2Location, player1.getPlayerSymbol());
        board.setBoardTile(row1col2Location, player2.getPlayerSymbol());
        board.setBoardTile(row3col3Location, player1.getPlayerSymbol());
        Assert.assertEquals(resultCheckAfterEveryMovement.checkResult(
                currentNumberOfMoves, board, player1), board.getTotalNumberOfMoves());
    }

    @Test
    public void testCheckResult7() {
        int currentNumberOfMoves = 5;
        board.setBoardTile(row1col1Location, player1.getPlayerSymbol());
        board.setBoardTile(row2col3Location, player2.getPlayerSymbol());
        board.setBoardTile(row2col1Location, player1.getPlayerSymbol());
        board.setBoardTile(row2col3Location, player2.getPlayerSymbol());
        board.setBoardTile(row3col1Location, player1.getPlayerSymbol());
        Assert.assertEquals(resultCheckAfterEveryMovement.checkResult(
                currentNumberOfMoves, board, player1), board.getTotalNumberOfMoves());
    }

    @Test
    public void testCheckResult8() {
        int currentNumberOfMoves = 5;
        board.setBoardTile(row1col2Location, player1.getPlayerSymbol());
        board.setBoardTile(row1col1Location, player2.getPlayerSymbol());
        board.setBoardTile(row2col2Location, player1.getPlayerSymbol());
        board.setBoardTile(row1col3Location, player2.getPlayerSymbol());
        board.setBoardTile(row3col2Location, player1.getPlayerSymbol());
        Assert.assertEquals(resultCheckAfterEveryMovement.checkResult(
                currentNumberOfMoves, board, player1), board.getTotalNumberOfMoves());
    }

    @Test
    public void testCheckResult9() {
        int currentNumberOfMoves = 5;
        board.setBoardTile(row1col3Location, player1.getPlayerSymbol());
        board.setBoardTile(row1col1Location, player2.getPlayerSymbol());
        board.setBoardTile(row2col3Location, player1.getPlayerSymbol());
        board.setBoardTile(row1col2Location, player2.getPlayerSymbol());
        board.setBoardTile(row3col3Location, player1.getPlayerSymbol());
        Assert.assertEquals(resultCheckAfterEveryMovement.checkResult(
                currentNumberOfMoves, board, player1), board.getTotalNumberOfMoves());
    }
}
