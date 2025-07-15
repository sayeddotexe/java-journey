// The TaxCalculator interface defines a contract for tax calculation behavior.
// It provides abstraction by specifying *what* should be done, not *how*.
public interface TaxCalculator {

    /**
     * Calculates tax based on an implementation-specific strategy.
     *
     * @return The calculated tax as a double.
     */
    double calculateTax();
}
