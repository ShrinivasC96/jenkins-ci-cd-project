package com.example;

public class App {

    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("Jenkins CI/CD Pipeline Project Running...");
        System.out.println("Addition Result: " + add(5, 3));
    }
}
