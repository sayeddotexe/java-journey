import java.util.Scanner; // Importing Scanner to read user input

// Main class of the application
public class Main {
    public static void main(String[] args) {

        // ----------------------------
        // Relational Operators (Boolean comparisons)
        // ----------------------------
        int x = 1;
        int y = 2;

        // Comparing values and printing results
        System.out.println("Is x equal to y? " + (x == y));        // false
        System.out.println("Is x not equal to y? " + (x != y));    // true
        System.out.println("Is x greater than or equal to y? " + (x >= y)); // false
        System.out.println("Is x less than y? " + (x < y));        // true

        // ----------------------------
        // Logical Operators (AND / OR)
        // ----------------------------
        int temperature = 22;

        // Using AND (&&): true only if both conditions are true
        boolean isWarm = temperature > 20 && temperature <= 30;

        // Using OR (||): true if at least one condition is true
        boolean isCold = temperature < 20 || temperature < 15;

        System.out.println("Is the temperature warm? " + isWarm); // true
        System.out.println("Is the temperature cold? " + isCold); // false

        // ----------------------------
        // If-Else Conditional Statements
        // ----------------------------
        if (temperature > 25) {
            System.out.println("The weather is hot.");
        } else if (temperature > 10 && temperature <= 25) {
            System.out.println("The weather is okay.");
        } else {
            System.out.println("The weather is cold.");
        }

        // ----------------------------
        // Ternary Operator Example
        // ----------------------------
        int income = 120_000; // Underscores improve readability of large numbers

        // Assigns "First" if income > 30_000, otherwise "Economy"
        String band = income > 30_000 ? "First" : "Economy";
        System.out.println("Income category: " + band);

        // ----------------------------
        // Switch Statement
        // ----------------------------
        String role = "admin";

        System.out.print("Role check: ");
        switch (role) {
            case "admin": {
                System.out.println("User is Admin.");
                break;
            }
            case "user": {
                System.out.println("User is User.");
                break;
            }
            default: {
                System.out.println("User is Guest.");
                break;
            }
        }

        // ----------------------------
        // FizzBuzz Example
        // ----------------------------
        /*
            Logic:
            - If divisible by both 3 and 5 → print "fizzbuzz"
            - If divisible only by 5 → print "fizz"
            - If divisible only by 3 → print "buzz"
            - Else → print the number itself
        */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number for FizzBuzz test: ");
        int number = scanner.nextInt();

        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("Result: fizzbuzz");
        } else if (number % 5 == 0) {
            System.out.println("Result: fizz");
        } else if (number % 3 == 0) {
            System.out.println("Result: buzz");
        } else {
            System.out.println("Result: " + number);
        }

    }
}
