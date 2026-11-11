
package com.java;

import java.util.Scanner;

public class StudentResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Mark 1: ");
        int mark1 = sc.nextInt();

        System.out.print("Enter Mark 2: ");
        int mark2 = sc.nextInt();

        System.out.print("Enter Mark 3: ");
        int mark3 = sc.nextInt();

        int total = mark1 + mark2 + mark3;
        double avg = total / 3.0;
        String grade;

        if (avg >= 90) {
            grade = "A";
        } else if (avg >= 75) {
            grade = "B";
        } else if (avg >= 60) {
            grade = "C";
        } else if (avg >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("\n---------------- STUDENT RESULT ----------------");
        System.out.printf("%-15s %-7s %-7s %-7s %-7s %-8s %-7s%n",
                "Name", "Mark1", "Mark2", "Mark3", "Total", "Average", "Grade");

        System.out.printf("%-15s %-7d %-7d %-7d %-7d %-8.2f %-7s%n",
                name, mark1, mark2, mark3, total, avg, grade);

        sc.close();
    }
}