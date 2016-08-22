package game.organizers;

import game.organizers.Organizer;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;

public class OrganizerTest {
    Organizer gameOrganizer = new Organizer();

    @Test
    public void testGameOrganizer() {
        Assert.assertThat(gameOrganizer, instanceOf(Organizer.class));
    }
}