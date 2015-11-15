import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;

public class OneHundredDoorsTest {

    @Test
    public void after_the_last_pass_the_state_of_the_door_should_be_Open_if_only_passing_1_door() {
        // Given
        OneHundredDoors oneHundredDoors = new OneHundredDoors();

        // When
        // Then
        assertArrayEquals(new D[]{D.OPEN}, oneHundredDoors.statesOfDoorsAfterPassingDoors(1).toArray());
    }

    @Test
    public void after_the_last_pass_the_state_of_the_doors_should_be_OpenClosed_respectively_if_only_passing_2_doors() {
        // Given
        OneHundredDoors oneHundredDoors = new OneHundredDoors();

        // When
        // Then
        assertArrayEquals(new D[]{D.OPEN, D.C}, oneHundredDoors.statesOfDoorsAfterPassingDoors(2).toArray());
    }

    @Test
    public void after_the_last_pass_the_state_of_the_doors_should_be_OpenClosedClosed_respectively_if_only_passing_3_doors() {
        // Given
        OneHundredDoors oneHundredDoors = new OneHundredDoors();

        // When
        // Then
        assertArrayEquals(new D[]{D.OPEN, D.C, D.C}, oneHundredDoors.statesOfDoorsAfterPassingDoors(3).toArray());
    }

    @Test
    public void after_the_last_pass_the_state_of_the_doors_should_be_right_if_passing_100_doors() {
        // Given
        OneHundredDoors oneHundredDoors = new OneHundredDoors();

        // When
        // Then
        assertArrayEquals(
            new D[]{
                D.OPEN, D.C, D.C, D.OPEN, D.C,       D.C, D.C, D.C, D.OPEN, D.C,
                D.C, D.C, D.C, D.C, D.C,             D.OPEN, D.C, D.C, D.C, D.C,
                D.C, D.C, D.C, D.C, D.OPEN,             D.C, D.C, D.C, D.C, D.C,
                D.C, D.C, D.C, D.C, D.C,             D.OPEN, D.C, D.C, D.C, D.C,
                D.C, D.C, D.C, D.C, D.C,             D.C, D.C, D.C, D.OPEN, D.C,
                D.C, D.C, D.C, D.C, D.C,             D.C, D.C, D.C, D.C, D.C,
                D.C, D.C, D.C, D.OPEN, D.C,             D.C, D.C, D.C, D.C, D.C,
                D.C, D.C, D.C, D.C, D.C,             D.C, D.C, D.C, D.C, D.C,
                D.C, D.C, D.C, D.C, D.C,             D.C, D.C, D.C, D.C, D.C,
                D.C, D.C, D.C, D.C, D.C,             D.C, D.C, D.C, D.C, D.C
            }, oneHundredDoors.statesOfDoorsAfterPassingDoors(100).toArray());
    }

    @Test
    public void after_the_last_pass_the_door_ids_of_the_opened_doors_should_be_1_4_9_16_25_36_49_64_81_100_if_passing_100_doors() {
        // Given
        OneHundredDoors oneHundredDoors = new OneHundredDoors();

        // When
        // Then
        assertEquals("1-4-9-16-25-36-49-64-81-100", oneHundredDoors.idsOfOpenedDoorsAfterPassingDoors(100));
    }
}

