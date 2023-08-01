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
public class JavaMath {
    public static void main(String[] args) {
        // Generating random numbers
        double randomValue = Math.random(); // Random number between 0.0 (inclusive) and 1.0 (exclusive)
        int randomInteger = (int) (Math.random() * 100); // Random integer between 0 (inclusive) and 100 (exclusive)
        
        // Math functions
        double x = 25.0;
        double y = 9.0;

        double squareRoot = Math.sqrt(x); // Square root of x
        double power = Math.pow(x, y); // x raised to the power of y
        double absoluteValue = Math.abs(-x); // Absolute value of x
        double ceilingValue = Math.ceil(x); // Smallest integer greater than or equal to x
        double floorValue = Math.floor(x); // Largest integer less than or equal to x
        double roundedValue = Math.round(x); // Rounds x to the nearest integer
        
        // Trigonometric functions
        double angleInDegrees = 45.0;
        double angleInRadians = Math.toRadians(angleInDegrees);
        double sinValue = Math.sin(angleInRadians);
        double cosValue = Math.cos(angleInRadians);
        double tanValue = Math.tan(angleInRadians);
        
        // Print values
        System.out.println("Random Value: " + randomValue);
        System.out.println("Random Integer: " + randomInteger);
        System.out.println("Square Root: " + squareRoot);
        System.out.println("Power: " + power);
        System.out.println("Absolute Value: " + absoluteValue);
        System.out.println("Ceiling Value: " + ceilingValue);
        System.out.println("Floor Value: " + floorValue);
        System.out.println("Rounded Value: " + roundedValue);
        System.out.println("Sin(" + angleInDegrees + " degrees): " + sinValue);
        System.out.println("Cos(" + angleInDegrees + " degrees): " + cosValue);
        System.out.println("Tan(" + angleInDegrees + " degrees): " + tanValue);
    }
}
