package com.java;

import java.util.Scanner;

public class ATMProgram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int customerId = 1234;
        double balance = 10000;

        System.out.print("Enter customer ID: ");
        int id = sc.nextInt();

        if (id == customerId) {

            System.out.println("1. Deposit");
            System.out.println("2. Withdrawal");
            System.out.println("3. Fund Transfer");
            System.out.println("4. Balance Enquiry");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double deposit = sc.nextDouble();

                    if (deposit > 0) {
                        balance = balance + deposit;
                        System.out.println("Deposit successful");
                        System.out.println("Balance = " + balance);
                    } else {
                        System.out.println("Invalid amount");
                    }
                    break;

                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdraw = sc.nextDouble();

                    if (withdraw > 0 && withdraw <= balance) {
                        balance = balance - withdraw;
                        System.out.println("Withdrawal successful");
                        System.out.println("Balance = " + balance);
                    } else {
                        System.out.println("Invalid amount or insufficient balance");
                    }
                    break;

                case 3:
                    System.out.print("Enter transfer amount: ");
                    double transfer = sc.nextDouble();

                    if (transfer > 0 && transfer <= balance) {
                        balance = balance - transfer;
                        System.out.println("Fund transfer successful");
                        System.out.println("Balance = " + balance);
                    } else {
                        System.out.println("Invalid amount or insufficient balance");
                    }
                    break;

                case 4:
                    System.out.println("Available balance = " + balance);
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } else {
            System.out.println("Invalid customer ID");
        }

        sc.close();
    }
}