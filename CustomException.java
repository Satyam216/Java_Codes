/*Task 4: Throwing Custom Exceptions
Statement: Define a custom exception class called InvalidAgeException to handle invalid
user input for age. Write a program that prompts the user to enter their age and throws the
custom exception if the age is less than 18. Catch and handle this exception by displaying a
meaningful message to the user.*/


//code

import java.util.InputMismatchException;
import java.util.Scanner;

// Define a custom exception class
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
} 

public class CustomException {
    // Method to check age and throw custom exception
    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            // Throwing custom exception if age is less than 18
            throw new InvalidAgeException("Age must be 18 or older to proceed.");
        } else {
            System.out.println("You are eligible.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Prompt the user to enter their age
            System.out.print("Enter your age: ");
            int age = sc.nextInt();

            // Call method to check age
            checkAge(age);
            
        } catch (InvalidAgeException e) {
            // Catch custom exception and display a meaningful message
            System.out.println("Error: " + e.getMessage());
        } catch (InputMismatchException e) {
            // Catch invalid input (non.integer input)
            System.out.println("Error: Please enter a valid number for age.");
        } finally {
            // Close the scanner
            sc.close();
            System.out.println("Program execution completed.");
        }
    }
}
