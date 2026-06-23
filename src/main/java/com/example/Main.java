package com.example;

public class Main {

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int divisor = 2;
        int result = calc.divide(10, divisor);
        System.out.println("Result: " + result);
    }
}