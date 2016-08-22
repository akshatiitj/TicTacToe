package game.players;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;

public class PlayerTest {
    Player player = new Player('X');

    @Test
    public void testGamePlayer() {
        Assert.assertThat(player, instanceOf(Player.class));
    }
}
