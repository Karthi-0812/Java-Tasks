
package com.java;

// Interface
interface PaymentGateway {

    void processPayment(double amount);
}

// UPI Payment
class UpiPayment implements PaymentGateway {

    private String upiId;

    public UpiPayment(String upiId) {
        this.upiId = upiId;
    }

    @Override
    public void processPayment(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid payment amount");
            return;
        }

        System.out.println("\n----- UPI PAYMENT -----");
        System.out.println("UPI ID          : " + upiId);
        System.out.println("Payment Amount  : Rs. " + amount);
        System.out.println("Payment Status  : Successful");
    }
}

// Card Payment
class CardPayment implements PaymentGateway {

    private String cardHolderName;
    private String cardNumber;

    public CardPayment(String cardHolderName, String cardNumber) {
        this.cardHolderName = cardHolderName;
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid payment amount");
            return;
        }

        System.out.println("\n----- CARD PAYMENT -----");
        System.out.println("Card Holder     : " + cardHolderName);
        System.out.println("Card Number     : XXXX-XXXX-XXXX-"
                + cardNumber.substring(cardNumber.length() - 4));
        System.out.println("Payment Amount  : Rs. " + amount);
        System.out.println("Payment Status  : Successful");
    }
}

// Net Banking Payment
class NetBankingPayment implements PaymentGateway {

    private String bankName;

    public NetBankingPayment(String bankName) {
        this.bankName = bankName;
    }

    @Override
    public void processPayment(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid payment amount");
            return;
        }

        System.out.println("\n----- NET BANKING PAYMENT -----");
        System.out.println("Bank Name       : " + bankName);
        System.out.println("Payment Amount  : Rs. " + amount);
        System.out.println("Payment Status  : Successful");
    }
}

// Main class
public class PaymentGatewayDemo {

    public static void main(String[] args) {

        PaymentGateway payment;

        payment = new UpiPayment("arun@upi");
        payment.processPayment(1500);

        payment = new CardPayment("Arun", "1234567812345678");
        payment.processPayment(2500);

        payment = new NetBankingPayment("SBI");
        payment.processPayment(3000);
    }
}
