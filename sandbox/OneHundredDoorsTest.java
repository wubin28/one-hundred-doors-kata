import org.junit.*;
import static org.junit.Assert.*;

public class OneHundredDoorsTest {

    @Test
    public void life_the_universe_and_everything() {
        int expected = 42;
        int actual = OneHundredDoors.answer();
        assertEquals(expected, actual);
    }

    // TODO: after_the_last_pass_the_state_of_the_door_should_be_Open_if_there_is_only_one_door
    // TODO: after_the_last_pass_the_state_of_the_doors_should_be_OpenClosed_respectively_if_there_are_two_doors
    // TODO: after_the_last_pass_the_state_of_the_doors_should_be_OpenClosedClosed_respectively_if_there_are_three_doors
}
