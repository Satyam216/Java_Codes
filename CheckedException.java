import java.util.Scanner;

class NotEligibleToVoteException extends Exception {
    public NotEligibleToVoteException(String message) {
        super(message);
    }
}
public class CheckedException {
    public static void checkEligibility(int age) throws NotEligibleToVoteException {
        if (age < 18) {
            throw new NotEligibleToVoteException("You are not eligible to vote. Minimum age is 18.");
        }
        System.out.println("You are eligible to vote!");
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        try {
            System.out.print("Enter your age: ");
            int age = sc.nextInt();

            // Calling method that may throw an exception
            checkEligibility(age);
        } catch (NotEligibleToVoteException e) {
            System.out.println("Custom Error: " + e.getMessage());
        } 
        System.out.println("Remaining Part");
    }
}
