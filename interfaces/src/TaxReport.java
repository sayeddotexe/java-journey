// The TaxReport class is responsible for generating and displaying tax reports.
// It depends on the TaxCalculator interface, allowing it to work with any implementation of tax calculation logic.
public class TaxReport {


    // Field to hold a reference to a TaxCalculator implementation
    private TaxCalculator calculator;

    /**
     * Constructor with dependency injection.
     * Accepts any object that implements the TaxCalculator interface.
     * This promotes loose coupling and flexibility.
     *
     * @param calculator A TaxCalculator implementation (e.g., TaxCalculator2018)
     */
    public TaxReport(TaxCalculator calculator) {
        this.calculator = calculator;
    }

    /**
     * Displays the calculated tax by delegating the logic to the injected calculator.
     */
    public void show() {
        var tax = calculator.calculateTax();  // Polymorphic call
        System.out.println("Calculated tax: $" + tax);
    }


    /**
     * Allows the injection of a different TaxCalculator implementation at runtime.
     * This is known as **setter injection** — an alternative to constructor injection.
     *
     * It enables changing the calculator used by the TaxReport object without needing to
     * recreate the object. This is useful for testing, switching between different versions,
     * or applying different tax strategies dynamically.
     *
     * @param calculator A concrete implementation of the TaxCalculator interface (e.g., TaxCalculator2018 or TaxCalculator2019)
     */
    public void setCalculator(TaxCalculator calculator) {
        this.calculator = calculator;
    }

}
