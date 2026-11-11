
package com.java;

import java.io.FileWriter;
import java.io.IOException;

public class AppendFileExample {

    public static void main(String[] args) {

        try (FileWriter writer = new FileWriter("employees.txt", true)) {

            writer.write("104 - Meena\n");
            writer.write("105 - Ravi\n");

            System.out.println("Data appended successfully.");

        } catch (IOException e) {
            System.out.println("Error while appending data: " + e.getMessage());
        }
    }
}
