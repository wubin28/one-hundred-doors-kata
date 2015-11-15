import org.junit.*;
import static org.junit.Assert.*;

public class OneHundredDoorsTest {

    @Test
    public void after_the_last_pass_the_state_of_the_door_should_be_Open_if_only_passing_one_door() {
        // Given
        OneHundredDoors oneHundredDoors = new OneHundredDoors();

        // When
        // Then
        assertEquals({"O"}, oneHundredDoors.statesOfDoorsAfterPassingPartialDoors(1).toArray());
    }

    @Test
    public void after_the_last_pass_the_state_of_the_doors_should_be_OpenClosed_respectively_if_only_passing_two_doors() {
        // Given
        OneHundredDoors oneHundredDoors = new OneHundredDoors();

        // When
        // Then
        assertEquals({"O", "C"}, oneHundredDoors.statesOfDoorsAfterPassingPartialDoors(2).toArray());
    }

    @Test
    public void after_the_last_pass_the_state_of_the_doors_should_be_OpenClosedClosed_respectively_if_only_passing_three_doors() {
        // Given
        OneHundredDoors oneHundredDoors = new OneHundredDoors();

        // When
        // Then
        assertEquals({"O", "C", "C"}, oneHundredDoors.statesOfDoorsAfterPassingPartialDoors(3).toArray());
    }
}
