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
public class TypeCasting {
    public static void main(String[] args) {
        // Implicit casting: int to double
        int numInt = 10;
        double numDouble = numInt; // int is automatically cast to double
        System.out.println("Implicit Casting - numInt: " + numInt);
        System.out.println("Implicit Casting - numDouble: " + numDouble);

        // Explicit casting: double to int
        double numDouble2 = 10.5;
        int numInt2 = (int) numDouble2; // double is explicitly cast to int
        System.out.println("Explicit Casting - numDouble: " + numDouble2);
        System.out.println("Explicit Casting - numInt: " + numInt2);
    }
}
