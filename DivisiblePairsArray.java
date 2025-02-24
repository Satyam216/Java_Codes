import java.util.Scanner;

public class DivisiblePairsArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the divisor
        System.out.print("Enter the divisor: ");
        int k = sc.nextInt();

        // Input the array
        System.out.print("Enter the array size: ");
        int n = sc.nextInt();

        int[] ar = new int[n]; //array
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt(); //input the elements
        }

        // Function to calculate the number of pairs
        int pairCount = countDivisiblePairs(ar, k);
        System.out.println("Output: " + pairCount);
        
        sc.close();
    }

    public static int countDivisiblePairs(int[] ar, int k) {
        // Array to store counts of remainders
        int[] remainderCount = new int[k];

        // Step 1: Count the occurrences of each remainder
        for (int num : ar) {
            int remainder = num % k;
            remainderCount[remainder]++;
        }

        int count = 0;

        // Step 2: Count pairs with remainder 0 (they can only pair among themselves)
        count += (remainderCount[0] * (remainderCount[0] - 1)) / 2; // nC2 pairs from remainder 0

        // Step 3: Count pairs where remainder i and k-i can form a valid pair
        for (int i = 1; i <= k / 2; i++) {
            if (i != k - i) {
                count += remainderCount[i] * remainderCount[k - i];
            } else {
                // Special case for the middle remainder when k is even (e.g., remainder 2 in k=4)
                count += (remainderCount[i] * (remainderCount[i] - 1)) / 2; // nC2 pairs from remainder i
            }
        }

        return count;
    }
}
