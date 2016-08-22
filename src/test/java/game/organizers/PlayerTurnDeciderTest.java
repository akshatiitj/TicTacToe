package game.organizers;


import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;

public class PlayerTurnDeciderTest {
    PlayerTurnDecider playerTurnDecider = new PlayerTurnDecider();

    @Test
    public void testPlayerTurnDecider() {
        Assert.assertThat(playerTurnDecider,
                instanceOf(PlayerTurnDecider.class));
    }
}
