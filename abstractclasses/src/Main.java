// Main class to demonstrate polymorphism using UIControl and its subclasses
public class Main {
    public static void main(String[] args) {

        // Create an array of UIControl references, storing different subclass objects
        UIControl[] controls = {
                new TextBox(),     // TextBox is a concrete subclass of UIControl
                // new CheckBox()  // CheckBox is abstract — cannot be instantiated directly
        };

        // Loop through each control and invoke the render method
        // This showcases runtime polymorphism:
        // - Each object in the array may have a different implementation of render()
        // - The JVM decides at runtime which version to call based on the actual object type
        for (var control : controls) {
            control.render();  // Dynamic method dispatch
        }
    }
}
