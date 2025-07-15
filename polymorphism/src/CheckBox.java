public class CheckBox extends UIControl{

    /**
     * Overrides the render method from the UIControl superclass.
     * This implementation provides rendering logic specific to CheckBox UI elements.
     * Demonstrates runtime polymorphism — the JVM will call this method at runtime
     * when a UIControl reference actually points to a CheckBox object.
     */
    @Override
    public void render() {
        System.out.println("Rendering a CheckBox component on the screen...");
    }

}
