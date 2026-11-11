
package com.java;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Consumer ID: ");
        int conid = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Consumer Name: ");
        String conname = sc.nextLine();

        System.out.print("Enter Previous Unit Reading: ");
        int previousunit = sc.nextInt();

        System.out.print("Enter Current Unit Reading: ");
        int currentunit = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Type of Building (Residential/Commercial): ");
        String typeofbuilding = sc.nextLine();

        int units = currentunit - previousunit;
        double rate;
        double billamount;

        if (units < 0) {
            System.out.println("Invalid unit readings.");
        } else {
            if (typeofbuilding.equalsIgnoreCase("Residential")) {
                rate = 3.0;
            } else if (typeofbuilding.equalsIgnoreCase("Commercial")) {
                rate = 5.0;
            } else {
                System.out.println("Invalid building type.");
                sc.close();
                return;
            }

            billamount = units * rate;

            System.out.println("\n----- Electricity Bill -----");
            System.out.println("Consumer ID: " + conid);
            System.out.println("Consumer Name: " + conname);
            System.out.println("Previous Reading: " + previousunit);
            System.out.println("Current Reading: " + currentunit);
            System.out.println("Units Consumed: " + units);
            System.out.println("Building Type: " + typeofbuilding);
            System.out.println("Rate Per Unit: Rs. " + rate);
            System.out.println("Total Bill Amount: Rs. " + billamount);
        }

        sc.close();
    }
}