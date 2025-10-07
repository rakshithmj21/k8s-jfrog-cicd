package com.demo;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World from Kubernetes!");
        // Keep the app alive for demonstration (optional)
        try {
            Thread.sleep(600000); // sleeps for 10 minutes
        } catch (InterruptedException e) {
            System.out.println("Interrupted: " + e.getMessage());
            Thread.currentThread().interrupt();
        }
    }
}
