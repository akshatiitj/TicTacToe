import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;

public class GamePlayerClass {
    GamePlayer gamePlayer = new GamePlayer();

    @Test
    public void testGamePlayer() {
        Assert.assertThat(gamePlayer, instanceOf(GamePlayer.class));
    }
}
