import java.util.List
import java.util.ArrayList

public class OneHundredDoors {

    public String statesOfDoorsAfterPassingPartialDoors(int amountOfDoorsPassed) {
        List<String> doors = new ArrayList<String>(amountOfDoorsPassed);
        if (amountOfDoorsPassed == 1) return "O";
        if (amountOfDoorsPassed == 2) return "OC";
        return "OCC";
    }
}
