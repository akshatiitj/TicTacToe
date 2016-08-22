package game.display;

import game.players.Player;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;

public class PlayerTurnTest {
    PlayerTurn playerTurn = new PlayerTurn();

    @Test
    public void testPlayerTurn() {
        Assert.assertThat(playerTurn, instanceOf(PlayerTurn.class));
    }
}
