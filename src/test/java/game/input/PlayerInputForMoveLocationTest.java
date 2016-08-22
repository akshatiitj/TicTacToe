package game.input;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;

public class PlayerInputForMoveLocationTest {
    PlayerInputForMoveLocation playerInputForMoveLocation
            = new PlayerInputForMoveLocation();

    @Test
    public void testPlayerInputForMoveLocation() {
        Assert.assertThat(playerInputForMoveLocation,
                instanceOf(PlayerInputForMoveLocation.class));
    }
}
