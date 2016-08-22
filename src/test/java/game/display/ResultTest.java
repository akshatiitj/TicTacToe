package game.display;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;

public class ResultTest {
    Result result = new Result();

    @Test
    public void testResult() {
        Assert.assertThat(result, instanceOf(Result.class));
    }
}
