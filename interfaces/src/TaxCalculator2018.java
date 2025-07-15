// TaxCalculator2018 class provides tax calculation logic specific to the year 2018.
// It implements the TaxCalculator interface, demonstrating interface-based inheritance.
public class TaxCalculator2018 implements TaxCalculator {

    // Private field to store the taxable income
    private double taxableIncome;

    /**
     * Constructor with dependency injection.
     * Initializes the object with the taxable income provided from outside (e.g., from the Main class).
     *
     * @param taxableIncome The income on which tax is to be calculated.
     */
    public TaxCalculator2018(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    /**
     * Calculates tax based on a flat rate (30%) for the 2018 tax year.
     * Overrides the method defined in the TaxCalculator interface.
     *
     * @return The calculated tax.
     */
    @Override
    public double calculateTax() {
        return taxableIncome * 0.3;  // 30% tax rate
    }
}
