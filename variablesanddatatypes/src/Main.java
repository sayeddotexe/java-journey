// Importing the Arrays utility class to work with array-related methods like toString().
import java.util.Arrays;

// Main class of the application
public class Main {

    // Main method: the entry point of any Java application
    public static void main(String[] args) {

        // -------------------------------
        // Primitive Types (stored directly in memory)
        // (e.g., int, boolean, double, etc.)
        // -------------------------------

        // Declaring an integer variable 'age' and assigning it the value 35
        int age = 35;

        // Declaring a double variable 'number' and assigning it the value 32.5
        double number = 32.5;

        // Declaring a boolean variable 'bool' and assigning it the value true
        boolean bool = true;

        // Printing the value of the boolean variable
        System.out.println(age + " " + number + " " + bool);


        // -------------------------------
        // Reference Types (store memory addresses that point to actual data)
        // (e.g., String, arrays, custom classes, etc.)
        // -------------------------------

        // Creating an integer array 'numArray' of size 5. All elements are initialized to 0 by default.
        int[] numArray = new int[5];

        // Assigning value 1 to the first element (index 0) of the array
        numArray[0] = 1;

        // Printing the array object directly. This will print the object's memory address (not useful for contents).
        System.out.println(numArray);

        // Printing the contents of the array using Arrays.toString() for readability
        System.out.println(Arrays.toString(numArray));  // Output: [1, 0, 0, 0, 0]

        // Declaring and initializing another integer array using an array literal
        int[] numArrayTwo = {1, 2, 3, 4, 5};

        // Printing the contents of the array using Arrays.toString() for readability
        System.out.println(Arrays.toString(numArrayTwo));

        // Declaring and initializing a String reference type
        String HelloWorld = "Hello World";

        // Printing the value of the string
        System.out.println(HelloWorld);  // Output: Hello World
    }
}
