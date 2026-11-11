
package com.java;

import java.util.Scanner;

public class ElectricityBillTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Consumer ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Consumer Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Previous Reading: ");
        int previous = sc.nextInt();

        System.out.print("Enter Current Reading: ");
        int current = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Building Type (Home/Commercial): ");
        String type = sc.nextLine();

        int units = current - previous;
        double rate;

        if (units < 0) {
            System.out.println("Invalid unit readings.");
        } else if (type.equalsIgnoreCase("Home")) {
            rate = 3.0;
            double bill = units * rate;

            System.out.println("\n----- EB Bill -----");
            System.out.printf("Consumer ID: %d%n", id);
            System.out.printf("Consumer Name: %s%n", name);
            System.out.printf("Units Consumed: %d%n", units);
            System.out.printf("Rate Per Unit: %.2f%n", rate);
            System.out.printf("Total Bill: %.2f%n", bill);

        } else if (type.equalsIgnoreCase("Commercial")) {
            rate = 5.0;
            double bill = units * rate;

            System.out.println("\n----- EB Bill -----");
            System.out.printf("Consumer ID: %d%n", id);
            System.out.printf("Consumer Name: %s%n", name);
            System.out.printf("Units Consumed: %d%n", units);
            System.out.printf("Rate Per Unit: %.2f%n", rate);
            System.out.printf("Total Bill: %.2f%n", bill);

        } else {
            System.out.println("Invalid building type.");
        }

        sc.close();
    }
}