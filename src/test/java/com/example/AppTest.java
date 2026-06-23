package com.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AppTest extends TestCase {

    public AppTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        return new TestSuite(AppTest.class);
    }

    // Tests App methods
    public void testRun() {
        App app = new App();
        try {
            app.run(); // covers run(), calculateSum(), printMessage()
            assertTrue(true);
        } catch (Exception e) {
            fail("run() threw an exception: " + e.getMessage());
        }
    }

    // Tests Calculator divide
    public void testDivide() {
        Calculator calc = new Calculator();
        int result = calc.divide(10, 2);
        assertEquals(5, result);
    }

    // Tests divide with negative numbers
    public void testDivideNegative() {
        Calculator calc = new Calculator();
        int result = calc.divide(-10, 2);
        assertEquals(-5, result);
    }
}