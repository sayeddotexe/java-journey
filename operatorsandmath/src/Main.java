import java.text.NumberFormat;

// Main class of the application
public class Main {

    // Main method: the entry point of any Java application
    public static void main(String[] args) {

        // ----------------------------
        // Arithmetic Operations
        // ----------------------------

        int result = 10 + 3;
        System.out.println("Addition of 10 + 3 = " + result);  // Output: 13

        int division = 10 / 3;
        System.out.println("Integer division of 10 / 3 = " + division);  // Output: 3

        double divisionDouble = (double) 10 / (double) 3;
        System.out.println("Floating-point division of 10 / 3 = " + divisionDouble);  // Output: 3.333...

        // ----------------------------
        // Increment Operators
        // ----------------------------

        int x = 1;
        int y = x++;  // Post-increment
        System.out.println("After post-increment (x = 1; y = x++): x = " + x + ", y = " + y);  // x=2, y=1

        int a = 1;
        int b = ++a;  // Pre-increment
        System.out.println("After pre-increment (a = 1; b = ++a): a = " + a + ", b = " + b);  // a=2, b=2

        // ----------------------------
        // Math Class Methods
        // ----------------------------

        int round = Math.round(3.2F);
        System.out.println("Math.round(3.2F) = " + round);  // Output: 3

        int ceil = (int) Math.ceil(3.25F);
        System.out.println("Math.ceil(3.25F) = " + ceil);  // Output: 4

        int floor = (int) Math.floor(3.25F);
        System.out.println("Math.floor(3.25F) = " + floor);  // Output: 3

        int max = Math.max(31, 36);
        System.out.println("Math.max(31, 36) = " + max);  // Output: 36

        int random = (int) Math.round(Math.random() * 100);
        System.out.println("Random number between 0 and 100 = " + random);

        // ----------------------------
        // Number Formatting
        // ----------------------------

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String money = currency.format(123456.891);
        System.out.println("Formatted as currency: " + money);  // e.g., "$123,456.89"

        NumberFormat percentage = NumberFormat.getPercentInstance();
        String percent = percentage.format(0.98);
        System.out.println("Formatted as percentage (0.98): " + percent);  // Output: 98%

        // Method chaining example
        percent = NumberFormat.getPercentInstance().format(0.56);
        System.out.println("Formatted as percentage using method chaining (0.56): " + percent);  // Output: 56%
    }
}
