/**
 * Admin can add new Parking floor
 * Admin can add new Slot to specific floor
 * Admin can add new extrance and exit
 */
public class ParkingLotAdmin extends User{
    public ParkingLotAdmin(String name,String email) {
        super(name,email);
    }

    void addParkingFloor(ParkingFloor floor){

    }

    void addParkingSlot(ParkingFloor floor,ParkingSpot slot){
        //add
    }

    void addEntrance(Entrance entrance){
        //add
    }

    void addExit(Exit exit){
        //add
    }
}
