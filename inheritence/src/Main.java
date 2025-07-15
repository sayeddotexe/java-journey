
// Main class of the application
public class Main {

    // Main method: Entry point of any Java application
    public static void main(String[] args) {

        // Create a TextBox instance (which inherits from UIControl)
        var box1 = new TextBox();

        // Disable the TextBox (inherited behavior from UIControl)
        box1.disable();

        // Set text of TextBox
        box1.setText("Hello World");

        // Print the current enabled state of the TextBox
        System.out.println("Is TextBox enabled? " + box1.isEnabled());
        System.out.println(box1);

        // comparing objects

        var point1 = new Point(1,2);
        var point2 = new Point(1,2);
        System.out.println( point1 == point2);
        System.out.println(point1.equals(point2));
        System.out.println(point1.hashCode());
        System.out.println(point2.hashCode());

        // upcasting / downcasting
        // Creating a UIControl object directly
        var control = new UIControl(true);

        // Creating a TextBox object (a subclass of UIControl)
        var textBox = new TextBox();

        // Passing a TextBox object to a method expecting a UIControl parameter
        // This is called "upcasting" (TextBox → UIControl) and is always safe
        show(control);
        show(textBox);
    }

    /**
     * Accepts a UIControl object and tries to treat it as a TextBox.
     * This demonstrates *downcasting* — converting a superclass reference (UIControl)
     * back to a subclass reference (TextBox), after checking its type.
     *
     * @param control A reference to a UIControl object (could be a subclass like TextBox)
     */
    public static void show(UIControl control) {

        // Use instanceof to safely check if 'control' is actually a TextBox before downcasting
        if (control instanceof TextBox) {
            var textBox = (TextBox) control;

            // Now it's safe to call TextBox-specific methods
            textBox.setText("Hello World");
        }

        // This will call the overridden toString() method if available (like in TextBox)
        System.out.println(control);
    }



}
