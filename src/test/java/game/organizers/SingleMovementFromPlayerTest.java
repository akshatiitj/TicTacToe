package game.organizers;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;

public class SingleMovementFromPlayerTest {
    SingleMovementFromPlayer singleMovementFromPlayer
            = new SingleMovementFromPlayer();

    @Test
    public void testSingleMovementFromPlayer() {
        Assert.assertThat(singleMovementFromPlayer,
                instanceOf(SingleMovementFromPlayer.class));
    }
}
