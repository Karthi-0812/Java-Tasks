
package com.java;

// Interface
interface CabBooking {

    void bookRide();
    double calculateFare();
}

// Base class
class CabDetails {

    protected String customerName;
    protected double distance;

    public CabDetails(String customerName, double distance) {

        if (customerName == null || customerName.trim().isEmpty()) {
            throw new IllegalArgumentException("Customer name is required");
        }

        if (distance <= 0) {
            throw new IllegalArgumentException("Distance must be positive");
        }

        this.customerName = customerName;
        this.distance = distance;
    }

    public void displayDetails() {
        System.out.println("Customer Name : " + customerName);
        System.out.println("Distance      : " + distance + " KM");
    }
}

// Mini Cab
class MiniCab extends CabDetails implements CabBooking {

    public MiniCab(String customerName, double distance) {
        super(customerName, distance);
    }

    @Override
    public void bookRide() {
        System.out.println("\n----- MINI CAB BOOKING -----");
        displayDetails();
        System.out.println("Cab Type      : Mini Cab");
        System.out.println("Ride Status   : Booked Successfully");
        System.out.println("Fare          : Rs. " + calculateFare());
    }

    @Override
    public double calculateFare() {
        return distance * 12;
    }
}

// Auto Cab
class AutoCab extends CabDetails implements CabBooking {

    public AutoCab(String customerName, double distance) {
        super(customerName, distance);
    }

    @Override
    public void bookRide() {
        System.out.println("\n----- AUTO CAB BOOKING -----");
        displayDetails();
        System.out.println("Cab Type      : Auto Cab");
        System.out.println("Ride Status   : Booked Successfully");
        System.out.println("Fare          : Rs. " + calculateFare());
    }

    @Override
    public double calculateFare() {
        return distance * 15;
    }
}

// Sedan Cab
class SedanCab extends CabDetails implements CabBooking {

    public SedanCab(String customerName, double distance) {
        super(customerName, distance);
    }

    @Override
    public void bookRide() {
        System.out.println("\n----- SEDAN CAB BOOKING -----");
        displayDetails();
        System.out.println("Cab Type      : Sedan Cab");
        System.out.println("Ride Status   : Booked Successfully");
        System.out.println("Fare          : Rs. " + calculateFare());
    }

    @Override
    public double calculateFare() {
        return distance * 20;
    }
}

// Main class
public class CabBookingSystem {

    public static void main(String[] args) {

        CabBooking mini = new MiniCab("Arun", 10);
        CabBooking auto = new AutoCab("Bala", 10);
        CabBooking sedan = new SedanCab("Kumar", 10);

        mini.bookRide();
        auto.bookRide();
        sedan.bookRide();
    }
}
