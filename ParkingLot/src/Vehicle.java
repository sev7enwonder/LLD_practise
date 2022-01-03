/**
 * vehicle number
 * vehicle Type
 * license
 * assign ticket
 */
public class Vehicle {
    private VehicleType type;
    private String license;
    private boolean isHandicapped;
    private ParkingTicket parkingTicket;

    public Vehicle(String license, boolean isHandicapped){
        this.license = license;
        this.isHandicapped = isHandicapped;
    }

    void assignTicket(ParkingTicket parkingTicket){
        this.parkingTicket = parkingTicket;
    }

    public boolean isHandicapped() {
        return isHandicapped;
    }

    public VehicleType getVehicleType(){
        return this.type;
    }

    public void setHandicapped(boolean handicapped) {
        isHandicapped = handicapped;
    }

    public ParkingTicket getParkingTicket() {
        return parkingTicket;
    }
}
