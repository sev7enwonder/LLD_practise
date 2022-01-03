public class CompactParkingSpot extends ParkingSpot{
    public CompactParkingSpot(VehicleType type, boolean isHandicapped, int spotnumber) {
        super(type, isHandicapped, spotnumber);
    }

    @Override
    public boolean canParkVehicle(Vehicle vehicle) {
        return (vehicle.getVehicleType() == VehicleType.COMPACT) && (vehicle.isHandicapped() == this.isHandicapped());
    }
}
