package game.display;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;

public class BoardTest {
    Board board = new Board();

    @Test
    public void testBoardDisplay() {
        Assert.assertThat(board, instanceOf(Board.class));
    }
}
