
package com.java;

import java.util.Scanner;

public class EmployeeIncrement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Department: ");
        String dept = sc.nextLine();

        System.out.print("Enter Years of Experience: ");
        int years = sc.nextInt();

        System.out.print("Enter Basic Salary: ");
        double salary = sc.nextDouble();

        double percentage;

        if (dept.equalsIgnoreCase("IT")) {
            if (years >= 5) {
                percentage = 15;
            } else {
                percentage = 10;
            }
        } else if (dept.equalsIgnoreCase("HR")) {
            if (years >= 5) {
                percentage = 12;
            } else {
                percentage = 8;
            }
        } else {
            if (years >= 5) {
                percentage = 10;
            } else {
                percentage = 5;
            }
        }

        double increment = salary * percentage / 100;
        double newSalary = salary + increment;

        System.out.println("\n-------- Employee Details --------");
        System.out.printf("Employee Name: %s%n", name);
        System.out.printf("Employee ID: %d%n", id);
        System.out.printf("Department: %s%n", dept);
        System.out.printf("Experience: %d years%n", years);
        System.out.printf("Basic Salary: %.2f%n", salary);
        System.out.printf("Increment: %.2f%n", increment);
        System.out.printf("New Salary: %.2f%n", newSalary);

        sc.close();
    }
}