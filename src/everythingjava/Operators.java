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
public class Operators {

    public static void main(String[] args) {
        // addition
        int sum = 256 + 64;
        float floatSum = 25.645f + 25.001f;

        // subtraction
        int difference = 256 - 64;
        float floatDifference = 25.645f - 25.001f;

        // multiplication
        int product = 256 * 64;
        float floatProduct = 25.645f * 25.001f;

        // division
        int quotient = 256 / 64;
        float floatQuotient = 25.645f / 25.001f;

        // Print values
        System.out.println("Sum: " + sum); // Output: Sum: 320
        System.out.println("Float Sum: " + floatSum); // Output: Float Sum: 50.646
        System.out.println("Difference: " + difference); // Output: Difference: 192
        System.out.println("Float Difference: " + floatDifference); // Output: Float Difference: 0.644
        System.out.println("Product: " + product); // Output: Product: 16384
        System.out.println("Float Product: " + floatProduct); // Output: Float Product: 641.1563
        System.out.println("Quotient: " + quotient); // Output: Quotient: 4
        System.out.println("Float Quotient: " + floatQuotient); // Output: Float Quotient: 1.0259796

        // Operator precedence
        int a = 10;
        int b = 5;
        int c = 3;
        int result = (a + b) / c; // The addition inside the parentheses has higher precedence than division
       
        System.out.println("Result: " + result); // Output: Result: 5
    }

}
