import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Contest6 {
    // Memoization map to store already computed states
    private static Map<String, Integer> memo = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: number of items, number of variations, and the target sum
        int m = scanner.nextInt();  // Number of items
        int r = scanner.nextInt();  // Number of variations (range: 1 to r)
        int target = scanner.nextInt();  // Target sum

        // Calculate the total number of unique combinations to achieve the target sum
        int result = countCombinations(m, r, target);

        // Output the result
        System.out.println(result);

        scanner.close();
    }

    // Recursive function with memoization to count the combinations
    private static int countCombinations(int m, int r, int target) {
        // Base case: if all items are used and target is exactly 0, we found a valid combination
        if (m == 0) return target == 0 ? 1 : 0;

        // If we have items left but the target is negative, it's not a valid path
        if (target < 0) return 0;

        // Generate a unique key for memoization
        String key = m + "," + target;

        // If the result for this state is already computed, return it from the memo map
        if (memo.containsKey(key)) {
            return memo.get(key);
        }

        int totalWays = 0;

        // Try all variations for the current item (from 1 to r)
        for (int i = 1; i <= r; i++) {
            totalWays += countCombinations(m - 1, r, target - i);
        }

        // Store the result in memo map to avoid recalculating
        memo.put(key, totalWays);

        return totalWays;
    }
}
