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
public class StringManipulation {
        public static void main(String[] args) {
        // Initializing a string
        String originalString = "Hello, World!";
        
        // Length of the string
        int length = originalString.length();
        System.out.println("Length: " + length); // Output: Length: 13
        
        // Converting to lowercase and uppercase
        String lowercaseString = originalString.toLowerCase();
        String uppercaseString = originalString.toUpperCase();
        System.out.println("Lowercase: " + lowercaseString); // Output: Lowercase: hello, world!
        System.out.println("Uppercase: " + uppercaseString); // Output: Uppercase: HELLO, WORLD!
        
        // Substring
        String substring = originalString.substring(0, 5);
        System.out.println("Substring: " + substring); // Output: Substring: Hello
        
        // Concatenation
        String additionalString = " How are you?";
        String concatenatedString = originalString + additionalString;
        System.out.println("Concatenated: " + concatenatedString); // Output: Concatenated: Hello, World! How are you?
        
        // Replace
        String replacedString = originalString.replace('o', 'x');
        System.out.println("Replaced: " + replacedString); // Output: Replaced: Hellx, Wxrld!
        
        // Split
        String[] words = originalString.split(", ");
        System.out.println("Split words: ");
        for (String word : words) {
            System.out.println(word);
        }
        // Output:
        // Split words:
        // Hello
        // World!
        
        // Trimming
        String paddedString = "   \t   Hello, World!   \n   ";
        String trimmedString = paddedString.trim();
        System.out.println("Trimmed: " + trimmedString); // Output: Trimmed: Hello, World!
        
        // Checking if a string starts or ends with a specific substring
        boolean startsWithHello = originalString.startsWith("Hello");
        boolean endsWithWorld = originalString.endsWith("World!");
        System.out.println("Starts with 'Hello': " + startsWithHello); // Output: Starts with 'Hello': true
        System.out.println("Ends with 'World!': " + endsWithWorld); // Output: Ends with 'World!': true
    }
}
