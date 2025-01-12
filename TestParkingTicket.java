/*
* name:mfitumukiza jean pierre
* regnumber:20491/2022
*
*
* */

public class TestParkingTicket {
    public void runTests() {
        // Create an officer
        PoliceOfficer officer = new PoliceOfficer("John Doe", "12345");

        // Test 1: Car within the parking time
        ParkedCar car1 = new ParkedCar("Toyota", "Camry", "Red", "ABC123", 60);
        ParkingMeter meter1 = new ParkingMeter(60);
        ParkingTicket ticket1 = officer.issueTicket(car1, meter1);
        System.out.println("Test 1: " + (ticket1 != null ? ticket1.generateTicket() : "No ticket issued"));

        // Test 2: Car over the parking time
        ParkedCar car2 = new ParkedCar("Honda", "Civic", "Blue", "XYZ456", 120);
        ParkingMeter meter2 = new ParkingMeter(60);
        ParkingTicket ticket2 = officer.issueTicket(car2, meter2);
        System.out.println("Test 2: " + (ticket2 != null ? ticket2.generateTicket() : "No ticket issued"));

        // Test 3: Car just within the parking time
        ParkedCar car3 = new ParkedCar("Ford", "Fusion", "Black", "LMN789", 59);
        ParkingMeter meter3 = new ParkingMeter(60);
        ParkingTicket ticket3 = officer.issueTicket(car3, meter3);
        System.out.println("Test 3: " + (ticket3 != null ? ticket3.generateTicket() : "No ticket issued"));

        // Test 4: Car just over the parking time
        ParkedCar car4 = new ParkedCar("Chevrolet", "Malibu", "White", "DEF321", 61);
        ParkingMeter meter4 = new ParkingMeter(60);
        ParkingTicket ticket4 = officer.issueTicket(car4, meter4);
        System.out.println("Test 4: " + (ticket4 != null ? ticket4.generateTicket() : "No ticket issued"));

        // Test 5: Car exactly at the parking time
        ParkedCar car5 = new ParkedCar("BMW", "X5", "Silver", "GHI654", 60);
        ParkingMeter meter5 = new ParkingMeter(60);
        ParkingTicket ticket5 = officer.issueTicket(car5, meter5);
        System.out.println("Test 5: " + (ticket5 != null ? ticket5.generateTicket() : "No ticket issued"));

        // Test 6: Car ticketed for less than 1 hour over time
        ParkedCar car6 = new ParkedCar("Nissan", "Altima", "Green", "JKL987", 90);
        ParkingMeter meter6 = new ParkingMeter(60);
        ParkingTicket ticket6 = officer.issueTicket(car6, meter6);
        System.out.println("Test 6: " + (ticket6 != null ? ticket6.generateTicket() : "No ticket issued"));

        // Test 7: Car ticketed for more than 1 hour over time
        ParkedCar car7 = new ParkedCar("Audi", "A4", "Yellow", "MNO654", 180);
        ParkingMeter meter7 = new ParkingMeter(60);
        ParkingTicket ticket7 = officer.issueTicket(car7, meter7);
        System.out.println("Test 7: " + (ticket7 != null ? ticket7.generateTicket() : "No ticket issued"));

        // Test 8: Car ticketed for exactly 1 hour over time
        ParkedCar car8 = new ParkedCar("Mercedes", "C-Class", "Pink", "PQR321", 120);
        ParkingMeter meter8 = new ParkingMeter(60);
        ParkingTicket ticket8 = officer.issueTicket(car8, meter8);
        System.out.println("Test 8: " + (ticket8 != null ? ticket8.generateTicket() : "No ticket issued"));
    }

    public static void main(String[] args) {
        TestParkingTicket simulator = new TestParkingTicket();
        simulator.runTests();
    }
}