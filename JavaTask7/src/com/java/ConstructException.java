
package com.java;

class InvalidAge extends Exception {

    public InvalidAge(String message) {
        super(message);
    }
}

public class ConstructException {

    public static void main(String[] args) {

        int age = 20;

        try {
            if (age < 18) {
                throw new InvalidAge("Not eligible");
            }

            System.out.println("Eligible");
        }
        catch (InvalidAge ex) {
            ex.printStackTrace();
        }
    }
}
