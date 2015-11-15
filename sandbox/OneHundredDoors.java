import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import static Door.*;

public class OneHundredDoors {
    enum Door { OPEN, CLOSED };

    List<Door> doors = new ArrayList<Door>(Arrays.asList(
        CLOSED, 
        CLOSED, CLOSED, CLOSED, CLOSED, CLOSED, CLOSED, CLOSED, CLOSED, CLOSED, CLOSED,
        CLOSED, CLOSED, CLOSED, CLOSED, CLOSED, CLOSED, CLOSED, CLOSED, CLOSED, CLOSED,
        CLOSED, CLOSED, CLOSED, CLOSED, CLOSED, CLOSED, CLOSED, CLOSED, CLOSED, CLOSED,
        CLOSED, CLOSED, CLOSED, CLOSED, CLOSED, CLOSED, CLOSED, CLOSED, CLOSED, CLOSED,
        CLOSED, CLOSED, CLOSED, CLOSED, CLOSED, CLOSED, CLOSED, CLOSED, CLOSED, CLOSED,
        CLOSED, CLOSED, CLOSED, CLOSED, CLOSED, CLOSED, CLOSED, CLOSED, CLOSED, CLOSED,
        CLOSED, CLOSED, CLOSED, CLOSED, CLOSED, CLOSED, CLOSED, CLOSED, CLOSED, CLOSED,
        CLOSED, CLOSED, CLOSED, CLOSED, CLOSED, CLOSED, CLOSED, CLOSED, CLOSED, CLOSED,
        CLOSED, CLOSED, CLOSED, CLOSED, CLOSED, CLOSED, CLOSED, CLOSED, CLOSED, CLOSED,
        CLOSED, CLOSED, CLOSED, CLOSED, CLOSED, CLOSED, CLOSED, CLOSED, CLOSED, CLOSED
        ));

    public List<Door> statesOfDoorsAfterPassingDoors(int amountOfDoorsPassed) {
        
        toggleDoor(amountOfDoorsPassed);

        return doors.subList(1, amountOfDoorsPassed + 1);
    }

    private void toggleDoor(int amountOfDoorsPassed) {
        for (int pass = 1; pass <= amountOfDoorsPassed; pass++) {
            for (int door = 1; door <= amountOfDoorsPassed; door++) {
                if (door % pass == 0) {
                    if (CLOSED.equals(doors.get(door))){ 
                        doors.set(door, OPEN);
                    } else if (OPEN.equals(doors.get(door))) {
                        doors.set(door, CLOSED);
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
            if (OPEN.equals(doors.get(door))) {
                stringBuilder.append(Integer.toString(door));
                stringBuilder.append("-");
            }
        }
        String result = stringBuilder.toString();
        return result.substring(0, result.length() - 1);
    }
}










