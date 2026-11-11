
package com.java;

class Product {
    int productId;
    String productName;
    double price;

    Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    void display() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: Rs." + price);
    }
}

class Electronics extends Product {
    int warranty;

    Electronics(int id, String name, double price, int warranty) {
        super(id, name, price);
        this.warranty = warranty;
    }

    void displayElectronics() {
        display();
        System.out.println("Warranty: " + warranty + " years");
        System.out.println("--------------------");
    }
}

class Clothing extends Product {
    String size;

    Clothing(int id, String name, double price, String size) {
        super(id, name, price);
        this.size = size;
    }

    void displayClothing() {
        display();
        System.out.println("Size: " + size);
        System.out.println("--------------------");
    }
}

class Food extends Product {
    String expiryDate;

    Food(int id, String name, double price, String expiryDate) {
        super(id, name, price);
        this.expiryDate = expiryDate;
    }

    void displayFood() {
        display();
        System.out.println("Expiry Date: " + expiryDate);
        System.out.println("--------------------");
    }
}

public class OnlineShopping {
    public static void main(String[] args) {
        Electronics e = new Electronics(101, "Laptop", 50000, 2);
        Clothing c = new Clothing(102, "Shirt", 800, "L");
        Food f = new Food(103, "Rice", 1200, "31-12-2026");

        e.displayElectronics();
        c.displayClothing();
        f.displayFood();
    }
}
