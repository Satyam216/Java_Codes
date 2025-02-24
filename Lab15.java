import java.util.Scanner;

public class Lab15 {
    private static final int MOD = 1000000007;

    public static long legoWall(int n, int m) {
        if (m == 0) return 1;

        long[] dp = new long[m + 1];

        dp[0] = 1;
        if (m >= 1) dp[1] = 1;
        if (m >= 2) dp[2] = 2;
        if (m >= 3) dp[3] = 4;
        if (m >= 4) dp[4] = 8;

        for (int j = 5; j <= m; j++) {
            dp[j] = (dp[j - 1] + dp[j - 2] + dp[j - 3] + dp[j - 4]) % MOD;
        }

        return modPow(dp[m], n, MOD);
    }

    private static long modPow(long base, long exp, long mod) {
        long result = 1;
        base %= mod;
        while (exp > 0) {
            if (exp % 2 == 1) {
                result = (result * base) % mod;
            }
            base = (base * base) % mod;
            exp /= 2;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the height (n): ");
        int n = scanner.nextInt();
        System.out.print("Enter the width (m): ");
        int m = scanner.nextInt();
        
        long result = legoWall(n, m);
        System.out.println(result);
        
        scanner.close();
    }
}