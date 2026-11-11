
package com.java;

public class OddEvenArray {
    public static void main(String[] args) {

        int[] arr = {10, 15, 20, 25, 30, 35};

        System.out.println("Even numbers:");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);
            }
        }

        System.out.println("Odd numbers:");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.println(arr[i]);
            }
        }
    }
}
