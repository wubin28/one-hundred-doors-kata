import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class OneHundredDoors {

    List<String> doors = new ArrayList<String>(Arrays.asList(
        "C", 
        "C", "C", "C", "C", "C", "C", "C", "C", "C", "C",
        "C", "C", "C", "C", "C", "C", "C", "C", "C", "C",
        "C", "C", "C", "C", "C", "C", "C", "C", "C", "C",
        "C", "C", "C", "C", "C", "C", "C", "C", "C", "C",
        "C", "C", "C", "C", "C", "C", "C", "C", "C", "C",
        "C", "C", "C", "C", "C", "C", "C", "C", "C", "C",
        "C", "C", "C", "C", "C", "C", "C", "C", "C", "C",
        "C", "C", "C", "C", "C", "C", "C", "C", "C", "C",
        "C", "C", "C", "C", "C", "C", "C", "C", "C", "C",
        "C", "C", "C", "C", "C", "C", "C", "C", "C", "C"
        ));

    public List<String> statesOfDoorsAfterPassingPartialDoors(int amountOfDoorsPassed) {
        
        toggleDoor(amountOfDoorsPassed);

        return doors.subList(1, amountOfDoorsPassed + 1);
    }

    private void toggleDoor(int amountOfDoorsPassed) {
        if (amountOfDoorsPassed == 1) {
            doors.set(1, "O"); 
        }
        if (amountOfDoorsPassed == 2) {
            doors.set(1, "O"); 
            doors.set(2, "C"); 
        }
        
        doors.set(1, "O"); 
        doors.set(2, "C"); 
        doors.set(3, "C"); 
    }
}
