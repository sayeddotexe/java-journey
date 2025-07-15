// Main class to demonstrate inheritance and constructor injection
public class Main {
    public static void main(String[] args) {

        // Create a TaxCalculator for the year 2018
        // 'TaxCalculator2018' is assumed to be a subclass of a TaxCalculator interface or abstract class
        // It uses inheritance to provide a specific tax calculation strategy for 2018
        var calculator = new TaxCalculator2018(100_000);  // Constructor Injection: income is passed in via constructor

        // Create a TaxReport object and inject the TaxCalculator dependency through the constructor
        // This is known as constructor injection — a form of Dependency Injection (DI)
        var report = new TaxReport(calculator);
        report.show();

        // This approach improves flexibility, testability, and separation of concerns

        // Setter Injection:
        // Dynamically changing the tax calculation strategy by injecting a new implementation
        // This allows us to change behavior at runtime without creating a new TaxReport object
        report.setCalculator(new TaxCalculator2019());

        // Now the TaxReport uses TaxCalculator2019 to calculate and display the tax
        report.show();



    }
}
