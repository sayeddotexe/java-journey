// Main class of the application
public class Main {

    // Main method: Entry point of any Java application
    public static void main(String[] args) {

        // Create the first TextBox object and set its text
        var textBox1 = new TextBox();
        textBox1.setText("Hello!");
        // Display the content of textBox1
        System.out.println("TextBox 1 contains: " + textBox1.text);

        // Create the second TextBox object and set its text
        var textBox2 = new TextBox();
        textBox2.setText("World!");
        // Display the content of textBox2
        System.out.println("TextBox 2 contains: " + textBox2.text);

        // Create an Employee object with base salary and hourly rate
        var employee1 = new Employee(50000, 20);

        // Calculate and display the total wage for 10 extra hours worked
        int wage = employee1.calculateWage(10);
        System.out.println("Total wage for 10 extra hours: $" + wage);

        // Calculate and display the total wage assuming no extra hours (method overloading)
        int wage2 = employee1.calculateWage(0);
        System.out.println("Total wage for no extra hours: $" + wage2);

        // Display the total number of Employee instances created
        Employee.printNumberOfEmployees();
    }
}
