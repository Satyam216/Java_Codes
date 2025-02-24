import java.util.Scanner;

public class Lab6 {

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num == 2 || num == 3) return true;
        if (num % 2 == 0 || num % 3 == 0) return false;
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) return false;
        }
        return true;
    }

    // Method to check if all concatenations of digits are prime
    public static boolean isSpecialPrime(int num) {
        String numStr = Integer.toString(num);

        // Check for each possible concatenation from the digits of the number
        for (int i = 1; i <= numStr.length(); i++) {
            int prefix = Integer.parseInt(numStr.substring(0, i));
            if (!isPrime(prefix)) {
                return false; // Not a special prime if any concatenation is not prime
            }
        }

        return true;
    }

    // Method to find the largest special prime less than the given number
    public static int findLargestSpecialPrime(int n) {
        // Start searching from the number just less than n
        for (int i = n - 1; i > 1; i--) {
            if (isPrime(i) && isSpecialPrime(i)) {
                return i;  // Return the first special prime found
            }
        }
        return -1;  // If no special prime is found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter the input number: ");
        int n = scanner.nextInt();

        // Find and display the largest special prime less than n
        int result = findLargestSpecialPrime(n);
        System.out.println("Largest Special Prime less than " + n + ": " + result);

        scanner.close();
    }
}

