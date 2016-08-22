package game.board;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;

public class TileTest {
    Tile tile = new Tile();

    @Test
    public void testTile() {
        Assert.assertThat(tile, instanceOf(Tile.class));
    }
}
