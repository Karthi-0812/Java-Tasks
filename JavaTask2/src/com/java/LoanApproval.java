
package com.java;

import java.util.Scanner;

public class LoanApproval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Are you a salaried person? (yes/no): ");
        String salaried = sc.nextLine();

        System.out.print("Enter Total Loan Amount: ");
        double loan = sc.nextDouble();

        System.out.print("Enter CIBIL Score: ");
        int cibil = sc.nextInt();

        if (salaried.equalsIgnoreCase("yes")) {
            if (loan <= 500000) {
                if (cibil >= 750) {
                    System.out.println("Loan Approved");
                } else {
                    System.out.println("Error: CIBIL score is too low.");
                }
            } else {
                System.out.println("Error: Loan amount exceeds the limit.");
            }
        } else {
            System.out.println("Error: Applicant must be salaried.");
        }

        sc.close();
    }
}