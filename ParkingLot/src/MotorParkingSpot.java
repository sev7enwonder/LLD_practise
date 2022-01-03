public class MotorParkingSpot extends ParkingSpot{

    public MotorParkingSpot(VehicleType type, boolean isHandicapped, int spotnumber) {
        super(VehicleType.MOTORCYCLE, isHandicapped, spotnumber);
    }

    @Override
    public boolean canParkVehicle(Vehicle vehicle) {
        return (vehicle.getVehicleType() == VehicleType.MOTORCYCLE) && (vehicle.isHandicapped() == this.isHandicapped());
    }
}
