import java.util.Scanner;

class InvalidAgeException extends RuntimeException {
    public InvalidAgeException(String message) {
        super(message);
    }
}
public class UncheckedException {
    public static void checkEligibility(int age) {
        if (age < 0) {
            throw new InvalidAgeException("Age cannot be negative.");
        } else if (age < 18) {
            throw new InvalidAgeException("You are not eligible to vote. Minimum age is 18.");
        }
        System.out.println("You are eligible to vote!");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UncheckedException ob = new UncheckedException();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        ob.checkEligibility(age);
        
        scanner.close();
        System.out.println("Remaining Part");
    }
}
