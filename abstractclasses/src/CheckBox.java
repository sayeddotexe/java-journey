// Abstract class CheckBox extends UIControl, serving as a base for checkbox-type UI components.
// Being abstract means this class cannot be instantiated directly.
public abstract class CheckBox extends UIControl {

    /**
     * This class is intentionally declared abstract because:
     * - It represents a generic checkbox UI element.
     * - It may defer implementation details (like rendering) to concrete subclasses.
     *
     * Note:
     * - Abstract classes help define a common interface and shared structure, while letting subclasses
     *   customize specific behaviors.
     * - This is part of the abstraction principle: hiding implementation details and exposing only essential behavior.
     *
     * If we override the `render()` method here, it would demonstrate runtime polymorphism:
     * - For example, when a UIControl reference points to a CheckBox object,
     *   the JVM would call the overridden `render()` method at runtime.
     */

    // Example (uncomment to enable rendering behavior):
    // @Override
    // public void render() {
    //     System.out.println("Rendering a CheckBox component on the screen...");
    // }
}
