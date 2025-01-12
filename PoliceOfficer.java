public class PoliceOfficer {
    private String name;
    private String badgeNumber;

    // Constructor
    public PoliceOfficer(String name, String badgeNumber) {
        this.name = name;
        this.badgeNumber = badgeNumber;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBadgeNumber() {
        return badgeNumber;
    }

    public void setBadgeNumber(String badgeNumber) {
        this.badgeNumber = badgeNumber;
    }

    // Examine the car to see if it's over the parking time
    public boolean examineCar(ParkedCar parkedCar, ParkingMeter parkingMeter) {
        return parkedCar.getMinutesParked() > parkingMeter.getMinutesPurchased();
    }

    // Issue a parking ticket if the car is over the parking time
    public ParkingTicket issueTicket(ParkedCar parkedCar, ParkingMeter parkingMeter) {
        if (examineCar(parkedCar, parkingMeter)) {
            int timeOver = parkedCar.getMinutesParked() - parkingMeter.getMinutesPurchased();
            double fine = 25.00;  // Fine for the first hour
            if (timeOver > 60) {
                fine += (timeOver / 60) * 10;  // $10 for each additional hour
            } else if (timeOver > 0) {
                fine += 10;  // $10 for less than an hour over
            }
            return new ParkingTicket(parkedCar, this, fine);
        }
        return null;
    }
}