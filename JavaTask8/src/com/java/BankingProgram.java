
package com.java;

public class BankingProgram {

    void deposit(double amount) {
        System.out.println("Cash deposit amount: Rs." + amount);
    }

    void deposit(double amount, int chequeNo) {
        System.out.println("Cheque deposit amount: Rs." + amount);
        System.out.println("Cheque number: " + chequeNo);
    }

    void deposit(double amount, String upiId, String bankName) {
        System.out.println("UPI deposit amount: Rs." + amount);
        System.out.println("UPI ID: " + upiId);
        System.out.println("Bank name: " + bankName);
    }

    public static void main(String[] args) {
        BankingProgram b = new BankingProgram();

        b.deposit(5000.0);
        b.deposit(7500.0, 123456);
        b.deposit(2500.0, "karthi@upi", "SBI");
    }
}
