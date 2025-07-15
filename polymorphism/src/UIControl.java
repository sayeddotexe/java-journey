// UIControl is a base class that represents a generic UI component with enable/disable functionality.
public class UIControl {

    // Private field to track whether the control is enabled or not
    private boolean isEnabled = true;

    /**
     * Constructor that initializes the UI control's enabled state.
     * @param isEnabled Determines whether the control starts as enabled or disabled.
     */
//    public UIControl(boolean isEnabled) {
//        this.isEnabled = isEnabled;
//        System.out.println("UIControl created. Initial state: " + (isEnabled ? "Enabled" : "Disabled"));
//    }

    /**
     * This is a placeholder method meant to be overridden by subclasses.
     *
     * In object-oriented design, this method demonstrates polymorphism.
     * Specific UI elements like TextBox or CheckBox will provide their own
     * implementations of this method, defining how they are rendered.
     *
     * If a subclass doesn't override this method, this default version will be called.
     */
    public void render() {
        System.out.println("Rendering a generic UIControl component...");
    }


    /**
     * Enables the UI control.
     */
    public void enable() {
        isEnabled = true;
        System.out.println("UIControl has been enabled.");
    }

    /**
     * Disables the UI control.
     */
    public void disable() {
        isEnabled = false;
        System.out.println("UIControl has been disabled.");
    }

    /**
     * Checks whether the UI control is currently enabled.
     * @return true if the control is enabled, false otherwise.
     */
    public boolean isEnabled() {
        return isEnabled;
    }
}
