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
public class Loops {
    public static void main(String[] args) {
        // Example of a for loop to print numbers from 1 to 5
        for (int i = 1; i <= 5; i++) {
            System.out.println("Value of i: " + i);
        }
        
        // Example of a while loop to print numbers from 1 to 5
        int i = 1;
        while (i <= 5) {
            System.out.println("Value of i: " + i);
            i++;
        }
        
        // Example of a do-while loop to print numbers from 1 to 5
        do {
            System.out.println("Value of i: " + i);
            i++;
        } while (i <= 5);
    }
}
