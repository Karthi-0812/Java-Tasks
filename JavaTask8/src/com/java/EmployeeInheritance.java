
package com.java;

class Employee {
    int empid;
    String empname;
    double basicSalary;

    Employee(int empid, String empname, double basicSalary) {
        this.empid = empid;
        this.empname = empname;
        this.basicSalary = basicSalary;
    }

    void display(String role, double salary) {
        System.out.println("Employee ID: " + empid);
        System.out.println("Employee Name: " + empname);
        System.out.println("Role: " + role);
        System.out.println("Basic Salary: Rs." + basicSalary);
        System.out.println("Total Salary: Rs." + salary);
        System.out.println("--------------------");
    }
}

class Manager extends Employee {
    Manager(int id, String name, double salary) {
        super(id, name, salary);
    }

    void calculateSalary() {
        double total = basicSalary + (basicSalary * 0.20);
        display("Manager", total);
    }
}

class Developer extends Employee {
    Developer(int id, String name, double salary) {
        super(id, name, salary);
    }

    void calculateSalary() {
        double total = basicSalary + (basicSalary * 0.15);
        display("Developer", total);
    }
}

class Intern extends Employee {
    Intern(int id, String name, double salary) {
        super(id, name, salary);
    }

    void calculateSalary() {
        double total = basicSalary + (basicSalary * 0.05);
        display("Intern", total);
    }
}

public class EmployeeInheritance {
    public static void main(String[] args) {
        Manager m = new Manager(101, "Arun", 50000);
        Developer d = new Developer(102, "Bala", 40000);
        Intern i = new Intern(103, "Kumar", 15000);

        m.calculateSalary();
        d.calculateSalary();
        i.calculateSalary();
    }
}
