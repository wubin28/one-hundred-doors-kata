import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class OneHundredDoors {

    public List<String> statesOfDoorsAfterPassingPartialDoors(int amountOfDoorsPassed) {
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
        
        if (amountOfDoorsPassed == 1) {
            doors.set(1, "O"); 
            return doors.subList(1, 2);
        }
        if (amountOfDoorsPassed == 2) {
            doors.set(1, "O"); 
            doors.set(2, "C"); 
            return doors.subList(1, 3);
        }
        
        return doors.subList(1, 4);
    }
}
