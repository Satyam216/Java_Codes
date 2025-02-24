import java.util.Scanner;

public class PostContest2 {

    // Function to count matching bits in the binary representation of two numbers
    public static int matchingBits(int x, int y) {
        // Count the number of matching bits
        int count = 0;
        for (int i = 0; i < 3; i++) {
            if ((x & (1 << i)) == (y & (1 << i))) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter numbers (0 to 7): ");
        String input = scanner.nextLine();
        
        // Split input by space and convert to an integer array
        String[] tokens = input.split(" ");
        int[] A = new int[tokens.length];

        // Check for valid input and populate the array
        for (int i = 0; i < tokens.length; i++) {
            A[i] = Integer.parseInt(tokens[i]);
            if (A[i] < 0 || A[i] > 7) {
                System.out.println("Invalid Input");
                return; // Exit if invalid input
            }
        }

        long totalSum = 0;

        // Calculate the sum of matching bits for all ordered pairs (i, j)
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                totalSum += matchingBits(A[i], A[j]);
            }
        }

        // Print the final result
        System.out.println(totalSum);
        scanner.close();
    }
}
