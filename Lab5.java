import java.util.Scanner;

public class Lab5{

    // Method to get cumulative sum until a single digit
    public static int getCumulativeSum(int num) {
        while (num >= 10) {  // Keep reducing until a single digit is obtained
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }

    // Method to decode the PIN based on the input array
    public static String decodePin(String input) {
        StringBuilder pin = new StringBuilder(); // To store the final pin
        String[] numbers = input.split(" "); // Split input by space

        // Step 1: Process each number in the input array
        for (String number : numbers) {
            int num = Integer.parseInt(number);
            int cumulativeSum = getCumulativeSum(num);  // Get single-digit cumulative sum

            // Step 2: Replace odd numbers with their respective alphabet, even numbers remain as is
            if (cumulativeSum % 2 == 0) { // Even numbers stay as is
                pin.append(cumulativeSum);
            } else { // Odd numbers are replaced with corresponding letters
                pin.append((char) ('a' + (cumulativeSum - 1)));  // Convert 1=a, 3=c, 5=e, etc.
            }
        }

        // Step 3: Ensure the output is exactly 6 characters long (truncate or pad if necessary)
        if (pin.length() > 6) {
            return pin.substring(0, 6); // Truncate if it's more than 6 characters
        } else {
            while (pin.length() < 6) {
                pin.append('0'); // Pad with zeros if less than 6 characters
            }
        }

        return pin.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Exercise 1
        
        String input1 = scanner.nextLine();
        String output1 = decodePin(input1);
        System.out.println("Output for Exercise 1: " + output1);

        

        scanner.close();
    }
}
