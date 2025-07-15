// The Employee class models an employee's salary and wage calculation logic.
// It follows the principle of encapsulation to protect and control access to its internal data.
public class Employee {

    // Private fields (encapsulated) — cannot be accessed directly from outside the class
    private int baseSalary;
    private int hourlyRate;

    // Static field to track how many Employee objects have been created
    public static int numberOfEmployees;

    /**
     * Constructor to initialize an employee's base salary and hourly rate.
     * Uses setter methods to validate input values.
     *
     * @param baseSalary  The fixed base monthly salary.
     * @param hourlyRate  The rate per hour for extra hours worked.
     */
    public Employee(int baseSalary, int hourlyRate) {
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
        numberOfEmployees++;  // Increments when a new employee is created
    }

    /**
     * Prints the current total number of Employee instances created.
     */
    public static void printNumberOfEmployees() {
        System.out.println("Total number of employees created: " + numberOfEmployees);
    }

    /**
     * Calculates the total wage by adding the base salary to the compensation for extra hours.
     *
     * @param extraHours The number of additional hours worked.
     * @return The total wage.
     */
    public int calculateWage(int extraHours) {
        return baseSalary + (hourlyRate * extraHours);
    }

    /**
     * Overloaded method: Calculates wage assuming no extra hours worked.
     * Calls the main `calculateWage(int extraHours)` method with 0 extra hours.
     *
     * @return Base salary without any overtime.
     */
    public int calculateWage() {
        return calculateWage(0); // Delegates to the main method with 0 extra hours
    }

    /**
     * Sets the employee's base salary.
     * Ensures the salary is a valid positive number.
     *
     * @param baseSalary Base salary amount.
     */
    private void setBaseSalary(int baseSalary) {
        if (baseSalary <= 0) {
            throw new IllegalArgumentException("Base salary must be greater than 0.");
        }
        this.baseSalary = baseSalary;
    }

    /**
     * Retrieves the base salary (private — used internally or can be exposed via public getter if needed).
     *
     * @return The base salary.
     */
    private int getBaseSalary() {
        return baseSalary;
    }

    /**
     * Sets the hourly rate for overtime.
     * Ensures the hourly rate is a valid positive number.
     *
     * @param hourlyRate Hourly rate for extra hours worked.
     */
    private void setHourlyRate(int hourlyRate) {
        if (hourlyRate <= 0) {
            throw new IllegalArgumentException("Hourly rate must be greater than 0.");
        }
        this.hourlyRate = hourlyRate;
    }

    /**
     * Retrieves the hourly rate (private — used internally or can be exposed via public getter if needed).
     *
     * @return The hourly rate.
     */
    private int getHourlyRate() {
        return hourlyRate;
    }

    // NOTES:
    // ➤ Encapsulation ensures internal class details (like baseSalary and hourlyRate) are hidden from direct access.
    // ➤ Only controlled methods (setters) allow updates, enforcing validation rules.
    // ➤ Static fields like numberOfEmployees track class-level data shared by all instances.
}
