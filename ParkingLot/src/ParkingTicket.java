/**
 * number
 * vehicle
 * price
 * Status
 * assign vehicle
 */
public class ParkingTicket {
    private TicketStatus status;
    private String number;
    private Vehicle vehicle;

    public ParkingTicket(TicketStatus status, String number) {
        this.status = TicketStatus.ACTIVE;
        this.number = number;
    }

    public void markPaid(){
        this.status = TicketStatus.PAID;
    }

    private void assignVehicle(Vehicle vehicle){
        this.vehicle = vehicle;
    }
}
