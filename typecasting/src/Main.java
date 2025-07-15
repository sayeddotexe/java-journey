// Main class of the application
public class Main {

    // Main method: the entry point of any Java application
    public static void main(String[] args) {

        // ----------------------------
        // Implicit Casting (Widening Conversion)
        // ----------------------------
        // Implicit casting happens when a smaller type is automatically converted to a larger type.
        short x = 1;            // 'x' is a short (2 bytes)
        int y = x + 2;          // 'x' is implicitly cast to int (4 bytes) before addition
        System.out.println(y);  // Output: 3

        double a = 1.1;         // 'a' is a double
        double b = a + 2;       // 2 is implicitly cast to double before addition
        System.out.println(b);  // Output: 3.1


        // ----------------------------
        // Explicit Casting (Narrowing Conversion)
        // ----------------------------
        // Explicit casting is required when converting from a larger type to a smaller type.
        double c = 1.1;         // 'c' is a double
        int d = (int) c + 2;    // 'c' is explicitly cast to int (1), then added to 2
        System.out.println(d);  // Output: 3

        // ----------------------------
        // String to Integer Conversion
        // ----------------------------
        // Converting a String to an int using Integer.parseInt()
        String str = "1";                   // A string that holds numeric characters
        int num = Integer.parseInt(str);    // Converts the string to an integer
        System.out.println(num);            // Output: 1
    }
}
