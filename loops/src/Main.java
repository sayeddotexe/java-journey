import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // ----------------------------
        // For Loop (Count-controlled)
        // ----------------------------
        // Runs 3 times: i = 0, 1, 2
        for (int i = 0; i < 3; i++) {
            System.out.println("Hello " + i);
        }

        // ----------------------------
        // While Loop (Condition-controlled)
        // ----------------------------
        // Loops until i reaches 5
        int i = 0;
        while (i != 5) {
            System.out.println("World " + i);
            i++;
        }

        // ----------------------------
        // While Loop with user input and control flow (break & continue)
        // ----------------------------
        Scanner scanner = new Scanner(System.in);  // Create scanner to read input
        String input = "";

        // Infinite loop until "quit" is entered
        while (true) {
            System.out.print("Enter input: ");
            input = scanner.next().toLowerCase();  // Read input and convert to lowercase

            if (input.equals("pass")) {
                // Skip the rest of this loop and continue with the next iteration
                continue;
            }

            if (input.equals("quit")) {
                // Exit the loop if user types "quit"
                break;
            }

            // Print input unless it was "pass" or "quit"
            System.out.println("You entered: " + input);
        }

        // ----------------------------
        // Do-While Loop (Runs at least once)
        // ----------------------------
        // Executes body once before checking the condition
        do {
            System.out.print("Enter input (type 'quit' to stop): ");
            input = scanner.next().toLowerCase();
            System.out.println("You entered: " + input);
        } while (!input.equals("quit"));  // Continue until "quit" is entered

        // ----------------------------
        // For Loop - Iterating over an array using index
        // ----------------------------
        String[] fruits = {"apple", "mango", "orange"};

        // Using classic for loop with index
        for (int j = 0; j < fruits.length; j++) {
            System.out.println("Using index: " + fruits[j]);
        }

        // ----------------------------
        // For-Each Loop - Simplified array iteration
        // ----------------------------
        // Cannot access index directly
        for (String fruit : fruits) {
            System.out.println("Using for-each: " + fruit);
        }
    }
}
