/* Task 3: Using Multiple Catch Blocks

Statement: Write a program that accepts two user inputs: an integer and a divisor. Handle two
types of exceptions:
1. InputMismatchException if the user enters invalid input (non.integer data).
2. ArithmeticException if there is an attempt to divide by zero.
Use multiple catch blocks to manage both exceptions, ensuring the program doesn't crash in
either case.*/

//code

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatchBlocks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Accepting the first input (an integer)
            System.out.print("Enter an integer: ");
            int number = scanner.nextInt();

            // Accepting the divisor
            System.out.print("Enter a divisor: ");
            int divisor = scanner.nextInt();

            // Check for division by zero and throw an exception if divisor is zero
            if (divisor == 0) {
                throw new ArithmeticException("Error: Division by zero is not allowed.");
            }

            // Perform the division
            int result = number / divisor;
            System.out.println("Result of division: " + result);

        } catch (InputMismatchException e) {
            // Catch and handle invalid input (non.integer input)
            System.out.println("Error: Invalid input. Please enter valid integers.");
        } catch (ArithmeticException e) {
            // Catch and handle division by zero
            System.out.println(e.getMessage()); // This will display the custom error message
        } finally {
            // Close the scanner resource
            scanner.close();
            System.out.println("Program execution completed.");
        }
    }
}