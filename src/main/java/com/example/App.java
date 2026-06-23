package com.example;

public class App {

    public static void main(String[] args) {
        App app = new App();
        app.run();
    }

    public void run() {
        System.out.println("Starting Application...");

        int result = calculateSum(10, 20);
        System.out.println("Result: " + result);

        printMessage("SonarQube Analysis Ready!");
    }

    private int calculateSum(int a, int b) {
        return a + b;
    }

    private void printMessage(String message) {
        System.out.println("Message: " + message);
    }
}