
package com.java;

import java.util.Scanner;

public class LoginValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String correctUsername = "admin";
        String correctPassword = "java123";

        System.out.print("Enter Username: ");
        String username = sc.nextLine();

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        System.out.print("Enter Mobile Number: ");
        String mobile = sc.nextLine();

        if (username.equals(correctUsername)) {
            if (password.equals(correctPassword)) {
                if (mobile.length() == 10 && mobile.matches("[0-9]+")) {
                    System.out.println("Login Successful");
                    System.out.println("Mobile Number: " + mobile);
                } else {
                    System.out.println("Error: Mobile number must contain 10 digits.");
                }
            } else {
                System.out.println("Error: Incorrect password.");
            }
        } else {
            System.out.println("Error: Incorrect username.");
        }

        sc.close();
    }
}