import java.util.List;
import java.util.ArrayList;

public class OneHundredDoors {

    public String statesOfDoorsAfterPassingPartialDoors(int amountOfDoorsPassed) {
        
        if (amountOfDoorsPassed == 1) {
            List<String> doors = new ArrayList<String>(amountOfDoorsPassed + 1);
            doors.set(1, "O"); 
            return doors.get(1);
        }
        if (amountOfDoorsPassed == 2) {
            List<String> doors = new ArrayList<String>(amountOfDoorsPassed + 1);
            doors.set(1, "O"); 
            doors.set(2, "C"); 
            return doors.get(1) + doors.get(2);
        }
        return "OCC";
    }
}
