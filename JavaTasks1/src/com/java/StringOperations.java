
package com.java;

public class StringOperations {
    public static void main(String[] args) {

        // StringBuffer
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" Java");
        System.out.println("StringBuffer: " + sb);

        sb.insert(5, " World");
        System.out.println("After Insert: " + sb);

        sb.replace(0, 5, "Welcome");
        System.out.println("After Replace: " + sb);

        // StringBuilder
        StringBuilder s = new StringBuilder("Hello");
        s.append(" Java");
        System.out.println("StringBuilder: " + s);

        s.insert(5, " World");
        System.out.println("After Insert: " + s);

        s.reverse();
        System.out.println("After Reverse: " + s);
    }
}