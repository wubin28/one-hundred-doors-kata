import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class OneHundredDoors {

    List<D> doors = new ArrayList<D>(Arrays.asList(
        D.C, 
        D.C, D.C, D.C, D.C, D.C,         D.C, D.C, D.C, D.C, D.C,
        D.C, D.C, D.C, D.C, D.C,         D.C, D.C, D.C, D.C, D.C,
        D.C, D.C, D.C, D.C, D.C,         D.C, D.C, D.C, D.C, D.C,
        D.C, D.C, D.C, D.C, D.C,         D.C, D.C, D.C, D.C, D.C,
        D.C, D.C, D.C, D.C, D.C,         D.C, D.C, D.C, D.C, D.C,
        D.C, D.C, D.C, D.C, D.C,         D.C, D.C, D.C, D.C, D.C,
        D.C, D.C, D.C, D.C, D.C,         D.C, D.C, D.C, D.C, D.C,
        D.C, D.C, D.C, D.C, D.C,         D.C, D.C, D.C, D.C, D.C,
        D.C, D.C, D.C, D.C, D.C,         D.C, D.C, D.C, D.C, D.C,
        D.C, D.C, D.C, D.C, D.C,         D.C, D.C, D.C, D.C, D.C
        ));

    public List<D> statesOfDoorsAfterPassingDoors(int amountOfDoorsPassed) {
        
        toggleDoor(amountOfDoorsPassed);

        return doors.subList(1, amountOfDoorsPassed + 1);
    }

    private void toggleDoor(int amountOfDoorsPassed) {
        for (int pass = 1; pass <= amountOfDoorsPassed; pass++) {
            for (int door = 1; door <= amountOfDoorsPassed; door++) {
                if (door % pass == 0) {
                    if (D.C.equals(doors.get(door))){ 
                        doors.set(door, D.OPEN);
                    } else if (D.OPEN.equals(doors.get(door))) {
                        doors.set(door, D.C);
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
            if (D.OPEN.equals(doors.get(door))) {
                stringBuilder.append(Integer.toString(door));
                stringBuilder.append("-");
            }
        }
        String result = stringBuilder.toString();
        return result.substring(0, result.length() - 1);
    }
}










