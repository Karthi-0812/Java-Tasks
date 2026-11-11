
package com.java;

public class CarRental {

    void rent(int hrs) {
        int amount = hrs * 100;
        System.out.println("Hourly rental amount: Rs." + amount);
    }

    void rent(boolean isDaily, int days) {
        if (isDaily) {
            int amount = days * 1000;
            System.out.println("Daily rental amount: Rs." + amount);
        } else {
            System.out.println("Daily rental not selected");
        }
    }

    void rent(int days, double amount, boolean isDriver) {
        double total = days * amount;

        if (isDriver) {
            total = total + (days * 500);
            System.out.println("Rental with driver");
        } else {
            System.out.println("Rental without driver");
        }

        System.out.println("Total rental amount: Rs." + total);
    }

    public static void main(String[] args) {
        CarRental c = new CarRental();

        c.rent(3);
        c.rent(true, 2);
        c.rent(2, 1500.0, true);
    }
}
