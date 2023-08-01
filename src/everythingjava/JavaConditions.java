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
public class JavaConditions {

    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        boolean condition1 = (a == b); // Equal to
        boolean condition2 = (a != b); // Not equal to
        boolean condition3 = (a < b); // Less than
        boolean condition4 = (a > b); // Greater than
        boolean condition5 = (a <= b); // Less than or equal to
        boolean condition6 = (a >= b); // Greater than or equal to

        boolean condition7 = (a > 0 && b > 0); // Logical AND
        boolean condition8 = (a > 0 || b > 0); // Logical OR
        boolean condition9 = !(a > 0); // Logical NOT

        System.out.println("Condition 1: " + condition1); // Output: Condition 1: false
        System.out.println("Condition 2: " + condition2); // Output: Condition 2: true
        System.out.println("Condition 3: " + condition3); // Output: Condition 3: true
        System.out.println("Condition 4: " + condition4); // Output: Condition 4: false
        System.out.println("Condition 5: " + condition5); // Output: Condition 5: true
        System.out.println("Condition 6: " + condition6); // Output: Condition 6: false
        System.out.println("Condition 7: " + condition7); // Output: Condition 7: true
        System.out.println("Condition 8: " + condition8); // Output: Condition 8: true
        System.out.println("Condition 9: " + condition9); // Output: Condition 9: false

        // Simple if condition
        if (a < b) {
            System.out.println("a is less than b.");
        }

        // If-else condition
        if (a > b) {
            System.out.println("a is greater than b.");
        } else {
            System.out.println("a is not greater than b.");
        }

        // Else-if ladder
        if (a > b) {
            System.out.println("a is greater than b.");
        } else if (a < b) {
            System.out.println("a is less than b.");
        } else {
            System.out.println("a is equal to b.");
        }

        // Nested if condition
        if (a > 0) {
            if (b > 0) {
                System.out.println("Both a and b are positive.");
            } else {
                System.out.println("a is positive, but b is not.");
            }
        } else {
            System.out.println("a is not positive.");
        }
        
        
        // Simple if condition without brackets (One-line if statement)
        if (a < b) System.out.println("a is less than b.");

        // If-else condition without brackets (One-line if-else statement)
        if (a > b) System.out.println("a is greater than b."); else System.out.println("a is not greater than b.");

        /* Else-if ladder without brackets: Single statements allowed without brackets
         * Checks if a is greater than b, less than b, or equal to b, and prints a
         * corresponding message.
         */
        if (a > b) System.out.println("a is greater than b."); else if (a < b) System.out.println("a is less than b."); else System.out.println("a is equal to b.");

        /* Nested if condition without brackets: Single statements allowed without
         * brackets. Checks if a is greater than 0, and if true,
         * checks if b is greater than 0 and prints a message accordingly.
         * If a is not greater than 0, it prints a message indicating that a is not positive.
         */
        if (a > 0)
            if (b > 0)
                System.out.println("Both a and b are positive.");
            else
                System.out.println("a is positive, but b is not.");
        else
            System.out.println("a is not positive.");
        
         // Shorthand if-else to check if a is less than b
        String result = (a < b) ? "a is less than b." : "a is not less than b.";
        System.out.println(result); // Output: a is less than b.

        // Shorthand if-else to check if a is even or odd
        String evenOdd = (a % 2 == 0) ? "a is even." : "a is odd.";
        System.out.println(evenOdd); // Output: a is even.
        
        
        // switch statement
        int dayOfWeek = 4;

        switch (dayOfWeek) {
            case 1:
                System.out.println("It's Monday.");
                break;
            case 2:
                System.out.println("It's Tuesday.");
                break;
            case 3:
                System.out.println("It's Wednesday.");
                break;
            case 4:
                System.out.println("It's Thursday.");
                break;
            case 5:
                System.out.println("It's Friday.");
                break;
            case 6:
                System.out.println("It's Saturday.");
                break;
            case 7:
                System.out.println("It's Sunday.");
                break;
            default:
                System.out.println("Invalid day of the week.");
                break;
        }
    }

}
