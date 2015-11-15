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

    public List<String> statesOfDoorsAfterPassingDoors(int amountOfDoorsPassed) {
        
        toggleDoor(amountOfDoorsPassed);

        return doors.subList(1, amountOfDoorsPassed + 1);
    }

    private void toggleDoor(int amountOfDoorsPassed) {
        for (int pass = 1; pass <= amountOfDoorsPassed; pass++) {
            for (int door = 1; door <= amountOfDoorsPassed; door++) {
                if (door % pass == 0) {
                    if ("C".equals(doors.get(door))){ 
                        doors.set(door, "O");
                    } else if ("O".equals(doors.get(door))) {
                        doors.set(door, "C");
                    }
                }
            }
        }
    }

    public String idsOfOpenedDoorsAfterPassingDoors(int amountOfDoorsPassed) {
        toggleDoor(amountOfDoorsPassed);
        return convertDoorListToIdsOfOpenedDoors(amountOfDoorsPassed);
    }

    private String convertDoorListToIdsOfOpenedDoors(int amountOfDoorsPassed) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int door = 1; door <= amountOfDoorsPassed; door++) {
            if ("O".equals(doors.get(door)) {
                stringBuilder.append(Integer.toString(door));
                stringBuilder.append("-");
            }
        }
    }
}










