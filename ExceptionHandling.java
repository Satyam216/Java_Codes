
/*Task 1: Handling Arithmetic Exceptions
Statement: Write a program that performs division between two integers. Handle the
ArithmeticException that occurs if the denominator is zero, ensuring the program does not
crash but instead prints an error message. Use a try-catch block to catch the exception and a
finally block to ensure cleanup or final messages are printed.*/

import java.lang.reflect.Array;
import java.util.Scanner;

public class ExceptionHandling {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
            try {
            // Taking two inputs from the user
            System.out.print("Enter the dividend: ");
            int dividend = scanner.nextInt();

            System.out.print("Enter the divisor: ");
            int divisor = scanner.nextInt();

            // Attempting to divide the two numbers
            int result = dividend / divisor;
            System.out.println("Result: " + result);

            } catch (ArithmeticException e) {
            // Catching and handling division by zero;
            System.out.println("Error: Cannot divide by zero.");
        } catch (Exception e) {
            // Catching any other unexpected exceptions
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }

         scanner.close();

        System.out.println("Rest of the code...");
    }
}

