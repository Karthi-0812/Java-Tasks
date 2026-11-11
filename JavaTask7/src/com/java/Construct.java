
package com.java;

public class Construct {

    String name;
    int age;
    int id;

    public Construct() {
        System.out.println("No Argument constructor");
    }

    Construct(String n, int a) {
        name = n;
        age = a;
    }

    Construct(int id) {
        this.id = id;
    }

    public void display() {
        System.out.println(name + " " + age);
    }

    public static void main(String[] args) {

        Construct c = new Construct();
        System.out.println(c);

        Construct c1 = new Construct("kala", 23);
        c1.display();

        Construct c2 = new Construct(12);
        System.out.println(c2.id);
    }
}
