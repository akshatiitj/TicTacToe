package game;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;

public class TicTacToeTest {
    char player1Symbol = 'X', player2Symbol = 'O';
    TicTacToe ticTacToe = new TicTacToe(player1Symbol, player2Symbol);

    @Test
    public void testTicTacToe() {
        Assert.assertThat(ticTacToe, instanceOf(TicTacToe.class));
    }



}
