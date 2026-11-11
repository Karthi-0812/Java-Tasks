package com.java;

import java.util.Scanner;

public class ResortBooking {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Resort Booking");
        System.out.println("1. AC Room");
        System.out.println("2. Non-AC Room");
        System.out.print("Choose your room: ");
        int room = sc.nextInt();

        switch (room) {

            case 1:
                System.out.println("You selected AC Room");
                System.out.println("1. Single Bed - Rs.2000");
                System.out.println("2. Double Bed - Rs.3000");
                System.out.print("Choose your option: ");
                int ac = sc.nextInt();

                switch (ac) {
                    case 1:
                        System.out.println("AC Single Bed Room Booked");
                        System.out.println("Total Amount: Rs.2000");
                        break;

                    case 2:
                        System.out.println("AC Double Bed Room Booked");
                        System.out.println("Total Amount: Rs.3000");
                        break;

                    default:
                        System.out.println("Invalid option");
                }
                break;

            case 2:
                System.out.println("You selected Non-AC Room");
                System.out.println("1. Single Bed - Rs.1000");
                System.out.println("2. Double Bed - Rs.1500");
                System.out.print("Choose your option: ");
                int nonAc = sc.nextInt();

                switch (nonAc) {
                    case 1:
                        System.out.println("Non-AC Single Bed Room Booked");
                        System.out.println("Total Amount: Rs.1000");
                        break;

                    case 2:
                        System.out.println("Non-AC Double Bed Room Booked");
                        System.out.println("Total Amount: Rs.1500");
                        break;

                    default:
                        System.out.println("Invalid option");
                }
                break;

            default:
                System.out.println("Invalid room selection");
        }

        sc.close();
    }
}