package test;

public class Shelter {
    private static int MAX_CAPACITY = 100;
    private static int MIN_CAPACITY = 0;

    public enum SetStatus { GOOD, OVER, UNDER };

    private int shelterOccupancy = 0;

    public SetStatus setShelterOccupancy(int newOccupancy) {
        SetStatus returnStatus = SetStatus.GOOD;

        if (newOccupancy > MAX_CAPACITY) {
            returnStatus = SetStatus.OVER;
        } else if (newOccupancy < MIN_CAPACITY) {
            returnStatus = SetStatus.UNDER;
        } else {
            shelterOccupancy = newOccupancy;            
        }

        return returnStatus;
    }

    public int getShelterOccupancy() {
        return shelterOccupancy;
    }
}
