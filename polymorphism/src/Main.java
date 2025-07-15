// Main class to demonstrate polymorphism using UIControl and its subclasses
public class Main {
    public static void main(String[] args) {

        // Create an array of UIControl references, but store different subclass objects
        UIControl[] controls = {
                new TextBox(),     // TextBox is a UIControl
                new CheckBox()     // CheckBox is also a UIControl
        };

        // Loop through each control and call the render method
        // This demonstrates polymorphism: the same method call behaves differently
        // depending on the actual object's class
        for (var control : controls) {
            control.render();  // Dynamic method dispatch
        }
    }
}
