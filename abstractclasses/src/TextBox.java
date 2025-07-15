// A simple TextBox class that holds and manages text content.
// Inherits from UIControl, gaining visibility control functionality.
public class TextBox extends UIControl {

    // Instance variable to store the text content (initialized as an empty string)
    private String text = "";

    // Constructor: initializes the TextBox and sets it to visible using the superclass constructor
//    public TextBox() {
//        super(true);  // Calls UIControl's constructor with 'isEnabled = true'
//        System.out.println("TextBox created: [default visibility = true]");
//    }


    /**
     * Overrides the render method from the UIControl superclass.
     * This method provides a specific implementation for rendering a TextBox.
     * It's an example of runtime polymorphism — when this method is called on a UIControl
     * reference that actually points to a TextBox object, this version will run.
     */
    @Override
    public void render() {
        System.out.println("Rendering a TextBox component on the screen...");
    }


    // Method Overriding: Overrides the toString() method from the Object class
    @Override
    public String toString() {
        // Returns the current text of the TextBox when the object is printed
        return text;
    }

    /**
     * Sets the content of the TextBox.
     * @param text The new text content to be set.
     */
    public void setText(String text){
        this.text = text; // 'this.text' refers to the instance variable
        System.out.println("TextBox updated with text: \"" + text + "\"");
    }

    /**
     * Clears the content of the TextBox by setting it to an empty string.
     */
    public void clear(){
        this.text = "";
        System.out.println("TextBox text cleared.");
    }

    /**
     * Returns the current text stored in the TextBox.
     * @return Current text content.
     */
    public String getText() {
        return text;
    }
}
