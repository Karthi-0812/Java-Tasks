
package com.java;

import java.util.Scanner;

public class NumberGuessing {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int secretNumber = 7;
        int guess;
        int attempts = 0;

        do {
            System.out.print("Guess the number (1-10): ");
            guess = sc.nextInt();
            attempts++;

            if (guess == secretNumber) {
                System.out.println("Correct! You guessed the number.");
                break;
            } else {
                System.out.println("Wrong guess!");
            }

        } while (attempts < 3);

        if (guess != secretNumber) {
            System.out.println("Attempts over! The number was " + secretNumber);
        }

        sc.close();
    }
}
