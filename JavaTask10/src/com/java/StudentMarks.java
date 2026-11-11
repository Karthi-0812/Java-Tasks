
package com.java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class StudentMarks {

    public static void main(String[] args) {

        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;
        int total = 0;
        int count = 0;
        int above80 = 0;

        String highestStudent = "";
        String lowestStudent = "";

        try (BufferedReader br =
                 new BufferedReader(new FileReader("students.txt"))) {

            String line;

            System.out.println("ID   Name   Marks");

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                if (data.length != 3) {
                    System.out.println("Invalid record: " + line);
                    continue;
                }

                int id = Integer.parseInt(data[0].trim());
                String name = data[1].trim();
                int marks = Integer.parseInt(data[2].trim());

                if (marks < 0 || marks > 100) {
                    System.out.println("Invalid marks for " + name);
                    continue;
                }

                System.out.println(id + "   " + name + "   " + marks);

                total += marks;
                count++;

                if (marks > highest) {
                    highest = marks;
                    highestStudent = name;
                }

                if (marks < lowest) {
                    lowest = marks;
                    lowestStudent = name;
                }

                if (marks > 80) {
                    above80++;
                }
            }

            if (count > 0) {

                double average = (double) total / count;

                System.out.println("\nHighest: "
                        + highestStudent + " - " + highest);

                System.out.println("Lowest: "
                        + lowestStudent + " - " + lowest);

                System.out.printf("Average: %.2f%n", average);

                System.out.println("Students above 80: " + above80);

            } else {
                System.out.println("No valid student records found.");
            }

        } catch (IOException | NumberFormatException e) {
            System.out.println("Error processing file: " + e.getMessage());
        }
    }
}
