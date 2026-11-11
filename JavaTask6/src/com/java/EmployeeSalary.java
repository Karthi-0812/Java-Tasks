package com.java;

import java.util.Scanner;

public class EmployeeSalary {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int employees = sc.nextInt();

        System.out.print("Enter number of months: ");
        int months = sc.nextInt();

        String[] names = new String[employees];
        int[][] salary = new int[employees][months];
        int[] totalSalary = new int[employees];

        for (int i = 0; i < employees; i++) {
            System.out.print("Enter employee name: ");
            names[i] = sc.next();

            for (int j = 0; j < months; j++) {
                System.out.print("Enter salary for month " + (j + 1) + ": ");
                salary[i][j] = sc.nextInt();

                totalSalary[i] += salary[i][j];
            }
        }

        int highestIndex = 0;
        int lowestIndex = 0;

        for (int i = 1; i < employees; i++) {
            if (totalSalary[i] > totalSalary[highestIndex]) {
                highestIndex = i;
            }

            if (totalSalary[i] < totalSalary[lowestIndex]) {
                lowestIndex = i;
            }
        }

        System.out.println("\n===== EMPLOYEE SALARY REPORT =====");

        for (int i = 0; i < employees; i++) {
            System.out.println("Employee: " + names[i]);
            System.out.println("Total salary: " + totalSalary[i]);
        }

        System.out.println("\nHighest paid employee: " + names[highestIndex]);
        System.out.println("Total salary: " + totalSalary[highestIndex]);

        System.out.println("\nLowest paid employee: " + names[lowestIndex]);
        System.out.println("Total salary: " + totalSalary[lowestIndex]);

        sc.close();
    }
}
