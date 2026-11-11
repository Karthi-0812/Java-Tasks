
package com.java;

public class LoginProgram {

    void login(String username, String password) {
        System.out.println("Login using username and password");
        System.out.println("Username: " + username);
    }

    void login(int id, String password) {
        System.out.println("Login using ID and password");
        System.out.println("ID: " + id);
    }

    void login(long mobile, String password) {
        System.out.println("Login using mobile number and password");
        System.out.println("Mobile number: " + mobile);
    }

    public static void main(String[] args) {
        LoginProgram l = new LoginProgram();

        l.login("karthi", "abc123");
        l.login(101, "pass123");
        l.login(9876543210L, "mobile123");
    }
}
