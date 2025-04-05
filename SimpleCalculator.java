import java.util.Scanner;

// Parent class - BasicCalculator
class BasicCalculator {
    // Method to perform basic arithmetic operations
    public double calculate(double num1, double num2, char operation) {
        switch (operation) {
            case '+':
                return num1 + num2;
            case '-':













                
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    System.out.println("Error! Division by zero.");
                    return Double.NaN; // Not a Number (Invalid result)
                }
            default:
                System.out.println("Invalid operation!");
                return Double.NaN;
        }
    }
}

// Child class - AdvancedCalculator (inherits from BasicCalculator)
class AdvancedCalculator extends BasicCalculator {
    // Method to calculate square root
    public double squareRoot(double num) {
        if (num >= 0) {
            return Math.sqrt(num);
        } else {
            System.out.println("Error! Cannot calculate square root of a negative number.");
            return Double.NaN;
        }
    }

    // Method to calculate power
    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }
}

// Main class to run the calculator
public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AdvancedCalculator calculator = new AdvancedCalculator(); // Creating an object of AdvancedCalculator

        while (true) {
            System.out.println("\nChoose operation:");
            System.out.println("1. Basic Calculator (+, -, *, /)");
            System.out.println("2. Square Root");
            System.out.println("3. Power Function");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("Enter first number: ");
                double num1 = scanner.nextDouble();
                System.out.println("Enter second number: ");
                double num2 = scanner.nextDouble();
                System.out.println("Choose operation (+, -, *, /): ");
                char operation = scanner.next().charAt(0);

                double result = calculator.calculate(num1, num2, operation);
                System.out.println("Result: " + result);
            } 
            else if (choice == 2) {
                System.out.println("Enter number for square root: ");
                double num = scanner.nextDouble();
                double result = calculator.squareRoot(num);
                System.out.println("Square root of " + num + " is: " + result);
            } 
            else if (choice == 3) {
                System.out.println("Enter base number: ");
                double base = scanner.nextDouble();
                System.out.println("Enter exponent: ");
                double exponent = scanner.nextDouble();
                double result = calculator.power(base, exponent);
                System.out.println(base + " raised to the power " + exponent + " is: " + result);
            } 
            else if (choice == 4) {
                System.out.println("Exiting the calculator. Goodbye!");
                break;
            } 
            else {
                System.out.println("Invalid choice! Please select a valid option.");
            }
        }

        scanner.close();
    }
}
