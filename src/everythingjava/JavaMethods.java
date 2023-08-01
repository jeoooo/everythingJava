/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package everythingjava;

/**
 *
 * @author Legion
 */
public class JavaMethods {
        public static void main(String[] args) {
        // Calling non-returning method
        greet(); // This method does not return any value, so we simply call it.

        // Calling returning method and printing the result
        int sum = add(5, 10);
        System.out.println("Sum: " + sum);

        // Calling returning method with multiple parameters and printing the result
        double result = calculateArea(5, 7);
        System.out.println("Area: " + result);
    }

    // Non-returning (void) method
    public static void greet() {
        System.out.println("Hello, World!");
    }

    // Returning method with parameters
    public static int add(int a, int b) {
        return a + b;
    }

    // Returning method with multiple parameters
    public static double calculateArea(double length, double width) {
        return length * width;
    }
}
