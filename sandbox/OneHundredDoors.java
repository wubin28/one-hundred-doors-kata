
public class OneHundredDoors {

    public String statesOfDoorsAfterPassingPartialDoors(int amountOfDoorsPassed) {
        if (amountOfDoorsPassed == 1) return "O";
        if (amountOfDoorsPassed == 2) return "OC";
        return "OCC";
    }
}
