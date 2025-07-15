// Main class of the application
public class Main {

    // Main method: the entry point of any Java application
    public static void main(String[] args) {

        // Call the greetUser method with two string arguments: "Simon" and "Tom"
        // Store the returned message in the 'message' variable
        String message = greetUser("Simon", "Tom");

        // Print the greeting message to the console
        System.out.println("Greeting message from the program: " + message);
    }

    /**
     * This method greets the user with their full name.
     *
     * @param firstName  The user's first name
     * @param lastName   The user's last name
     * @return           A personalized greeting message
     *
     * - 'public' means this method can be accessed from outside this class.
     * - 'static' means it belongs to the class, not instances of it.
     * - 'String' is the return type, so this method returns a string.
     */
    public static String greetUser(String firstName, String lastName) {
        return "Hello, " + firstName + " " + lastName + "! Welcome to the Java program.";
    }
}
