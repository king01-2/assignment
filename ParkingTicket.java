public class ParkingTicket {
    private ParkedCar parkedCar;
    private PoliceOfficer officer;
    private double fine;

    // Constructor
    public ParkingTicket(ParkedCar parkedCar, PoliceOfficer officer, double fine) {
        this.parkedCar = parkedCar;
        this.officer = officer;
        this.fine = fine;
    }

    // Generate ticket
    public String generateTicket() {
        return String.format("Ticket issued to %s %s %s with license %s.\nFine: $%.2f\nIssued by Officer %s with badge %s.",
                parkedCar.getColor(), parkedCar.getMake(), parkedCar.getModel(), parkedCar.getLicenseNumber(),
                fine, officer.getName(), officer.getBadgeNumber());
    }
}