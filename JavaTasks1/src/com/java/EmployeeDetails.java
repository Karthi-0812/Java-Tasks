
package com.java;

import java.util.Scanner;

public class EmployeeDetails {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        String empname = sc.nextLine();

        System.out.print("Enter Employee ID: ");
        int empid = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Department: ");
        String empdept = sc.nextLine();

        System.out.print("Enter Years of Experience: ");
        int empyoe = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Designation: ");
        String empdesign = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        double basicsalary = sc.nextDouble();

        double gpa = basicsalary * 0.20;
        double hra = basicsalary * 0.10;
        double grosspay = basicsalary + gpa + hra;
        double pf = basicsalary * 0.12;
        double netpay = grosspay - pf;

        System.out.println("\n----- Employee Details -----");

        System.out.printf("Employee Name: %s%n", empname);
        System.out.printf("Employee ID: %d%n", empid);
        System.out.printf("Department: %s%n", empdept);
        System.out.printf("Experience: %d years%n", empyoe);
        System.out.printf("Designation: %s%n", empdesign);

        System.out.printf("Basic Salary: %.2f%n", basicsalary);
        System.out.printf("Grade Pay Allowance: %.2f%n", gpa);
        System.out.printf("House Rent Allowance: %.2f%n", hra);
        System.out.printf("Gross Pay: %.2f%n", grosspay);
        System.out.printf("Provident Fund: %.2f%n", pf);
        System.out.printf("Net Pay: %.2f%n", netpay);

        sc.close();
    }
}