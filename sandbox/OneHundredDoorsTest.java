import org.junit.*;
import static org.junit.Assert.*;

public class OneHundredDoorsTest {

    @Test
    public void after_the_last_pass_the_state_of_the_door_should_be_Open_if_only_passing_1_door() {
        // Given
        OneHundredDoors oneHundredDoors = new OneHundredDoors();

        // When
        // Then
        assertArrayEquals(new String[]{"O"}, oneHundredDoors.statesOfDoorsAfterPassingPartialDoors(1).toArray());
    }

    @Test
    public void after_the_last_pass_the_state_of_the_doors_should_be_OpenClosed_respectively_if_only_passing_2_doors() {
        // Given
        OneHundredDoors oneHundredDoors = new OneHundredDoors();

        // When
        // Then
        assertArrayEquals(new String[]{"O", "C"}, oneHundredDoors.statesOfDoorsAfterPassingPartialDoors(2).toArray());
    }

    @Test
    public void after_the_last_pass_the_state_of_the_doors_should_be_OpenClosedClosed_respectively_if_only_passing_3_doors() {
        // Given
        OneHundredDoors oneHundredDoors = new OneHundredDoors();

        // When
        // Then
        assertArrayEquals(new String[]{"O", "C", "C"}, oneHundredDoors.statesOfDoorsAfterPassingPartialDoors(3).toArray());
    }

    @Test
    public void after_the_last_pass_the_state_of_the_doors_should_be_XXX_respectively_if_passing_100_doors() {
        // Given
        OneHundredDoors oneHundredDoors = new OneHundredDoors();

        // When
        // Then
        assertArrayEquals(null, oneHundredDoors.statesOfDoorsAfterPassingPartialDoors(100).toArray());
    }
}
