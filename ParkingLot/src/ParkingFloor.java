import java.util.ArrayList;
import java.util.List;

/**
 * floor Id
 * is this floor full
 * is this floor full with particular vehicle
 * add parking spot
 * park Vehicle
 * free Spot
 */

public class ParkingFloor {
    private int floorId;
    private List<MotorParkingSpot> availablemotorParkingSlotList;
    private List<CompactParkingSpot> availableCompactParkingSpot;

    private List<MotorParkingSpot> availablemotorParkingSlotList_hc;
    private List<CompactParkingSpot> availableCompactParkingSpot_hc;

    public ParkingFloor(int id) {
        this.floorId = id;
        this.availablemotorParkingSlotList = new ArrayList<>();
        this.availableCompactParkingSpot = new ArrayList<>();
        this.availableCompactParkingSpot_hc = new ArrayList<>();
        this.availablemotorParkingSlotList_hc = new ArrayList<>();
    }

    public void addParkingSpot(ParkingSpot spot) throws Exception {
        VehicleType spotType = spot.getType();
        switch (spotType){
            case COMPACT:
                    if(spot.isHandicapped()){
                         availableCompactParkingSpot_hc.add((CompactParkingSpot) spot);
                    }else{
                         availableCompactParkingSpot.add((CompactParkingSpot) spot);
                    }
                    break;
            case MOTORCYCLE:
                if(spot.isHandicapped()){
                    availablemotorParkingSlotList_hc.add((MotorParkingSpot) spot);
                }else{
                    availablemotorParkingSlotList.add((MotorParkingSpot) spot);
                }
                break;
            default:
                throw new Exception("wrong input");
        }
        spot.setParkingFloor(this);
    }

    public boolean isFull(){
        return availablemotorParkingSlotList.isEmpty() && availableCompactParkingSpot.isEmpty()
                && availablemotorParkingSlotList_hc.isEmpty() && availableCompactParkingSpot_hc.isEmpty();
    }

    public boolean isFull(Vehicle vehicle){
        VehicleType spotType = vehicle.getVehicleType();
        switch (spotType){
            case MOTORCYCLE:
                    if(vehicle.isHandicapped()){
                        return availablemotorParkingSlotList_hc.isEmpty();
                    }else {
                        return availablemotorParkingSlotList.isEmpty();
                    }
            default : return false;
        }
    }

    public void searchAvailableSpot(Vehicle vehicle){
        //search avaialable spot for same type
    }

    public void parkVehicle(Vehicle vehicle,ParkingSpot spot){
        spot.assignVehicle(vehicle);
    }


    public void freeSpot(ParkingSpot spot){
        // add in available spot
        spot.removeVehicle();
    }






}
