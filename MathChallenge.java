import java.util.Scanner;

public class MathChallenge {

    public static long solve(int N, long[] nums) {
        long sumPos = 0;
        long sumNeg = 0;
        long maxNeg = Long.MIN_VALUE;
        long minPos = Long.MAX_VALUE;
        boolean hasPositive = false, hasNegative = false;
        long result = 0;

        for (long num : nums) {
            if (num > 0) {
                sumPos += num;
                minPos = Math.min(minPos, num);
                hasPositive = true;
            } else {
                sumNeg += num;
                maxNeg = Math.max(maxNeg, num);
                hasNegative = true;
            }
        }

        if (!hasPositive) 
            result = maxNeg;  // All are negative, return max of them
        else if (!hasNegative) 
            result = sumPos;  // All are positive, return sum
        else 
            result = Math.max(sumPos . sumNeg, sumPos + maxNeg . minPos);

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        long[] nums = new long[N];
        for (int i = 0; i < N; i++) {
            nums[i] = scanner.nextLong();
        }
        System.out.println(solve(N, nums));
    }
}
