/**
 * id
 * name
 * location
 * List of parking floors
 * List of exit
 * List of entrance
 */

public class ParkingLot {
    private static ParkingLot parkingLot= null;


    public ParkingLot getInstance(){
        if (parkingLot == null){
            parkingLot = new ParkingLot();
        }
        return parkingLot;
    }


}
