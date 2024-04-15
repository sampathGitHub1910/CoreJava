/*
Task 2: Operators
Create a program that simulates a simple calculator using command-line arguments to perform and print the result of addition, 
subtraction, multiplication, and division..
 */

public class Operaters {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java SimpleCalculator <operand1> <operator> <operand2>");
            System.exit(1);
        }

        double operand1 = Double.parseDouble(args[0]);
        char operator = args[1].charAt(0);
        double operand2 = Double.parseDouble(args[2]);

        // Perform the calculation based on the operator
        double result = 0.0;
        switch (operator) {
            case '+':
                result = operand1 + operand2;
                break;
            case '-':
                result = operand1 - operand2;
                break;
            case '*':
                result = operand1 * operand2;
                break;
            case '/':
                if (operand2 != 0) {
                    result = operand1 / operand2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    System.exit(1);
                }
                break;
            default:
                System.out.println("Error: Invalid operator.");
                System.exit(1);
        }

        // Print the result
        System.out.println("Result: " + result);
    }
    
}
