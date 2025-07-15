import java.util.Scanner;  // Import the Scanner class to read user input from the console

// Main class of the application
public class Main {

    // Main method: the entry point of any Java application
    public static void main(String[] args) {

        // Create a Scanner object to read input from the terminal (System.in)
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their name
        System.out.print("Enter name: ");
        String name = scanner.nextLine().trim();  // Read full line input and trim whitespace

        // Display the entered name
        System.out.println("Your name is: " + name);

        // Prompt the user to enter their age
        System.out.print("Enter age: ");
        int age = scanner.nextInt();  // Read an integer value

        // Display the entered age
        System.out.println("Your age is: " + age);
    }
}
