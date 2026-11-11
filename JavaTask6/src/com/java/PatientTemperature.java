package com.java;

import java.util.Scanner;

public class PatientTemperature {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of patients: ");
        int patients = sc.nextInt();

        double[][] temperature = new double[patients][3];

        for (int i = 0; i < patients; i++) {
            System.out.println("\nPatient " + (i + 1));

            for (int j = 0; j < 3; j++) {
                System.out.print("Enter temperature reading " + (j + 1) + ": ");
                temperature[i][j] = sc.nextDouble();
            }
        }

        for (int i = 0; i < patients; i++) {
            boolean fever = false;

            System.out.println("\nPatient " + (i + 1));

            for (int j = 0; j < 3; j++) {
                System.out.println(
                    "Reading " + (j + 1) + ": " + temperature[i][j]);

                if (temperature[i][j] > 37.0) {
                    fever = true;
                }
            }

            if (fever) {
                System.out.println("Fever detected - continue treatment");
            } else {
                System.out.println("No fever detected - continue monitoring");
            }
        }

        sc.close();
    }
}
