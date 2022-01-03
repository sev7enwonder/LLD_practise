/**
 * type
 * price
 * vehicle parked
 * isAvailable
 * can Park vehicle
 * add vehicle
 * remove vehicle
 */
public abstract class ParkingSpot {
   private VehicleType type;
   private int spotnumber;
   private boolean isHandicapped;
   private boolean isAvailable;
   private ParkingFloor parkingFloor;
   private Vehicle vehicleParked;

   public ParkingSpot(VehicleType type, boolean isHandicapped,int spotnumber) {
      this.type = type;
      this.spotnumber = spotnumber;
      this.isAvailable = true;
      this.isHandicapped = isHandicapped;
   }

   public ParkingSpot(VehicleType type, boolean isHandicapped,int spotnumber,ParkingFloor parkingfloor) {
      this(type,isHandicapped,spotnumber);
      this.parkingFloor = parkingfloor;
   }

   public abstract boolean canParkVehicle(Vehicle vehicle);


   public void assignVehicle(Vehicle vehicle){
      this.vehicleParked = vehicle;
      this.isAvailable = false;
   }

   public VehicleType getType() {
      return type;
   }

   public void setParkingFloor(ParkingFloor parkingFloor) {
      this.parkingFloor = parkingFloor;
   }

   public void removeVehicle(){
      this.vehicleParked = null;
      this.isAvailable = true;
   }

   public boolean isAvailable(){
      return this.isAvailable;
   }

   public boolean isHandicapped() {
      return isHandicapped;
   }
}
