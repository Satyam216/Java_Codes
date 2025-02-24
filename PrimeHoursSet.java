import java.util.Scanner;

public class PrimeHoursSet {

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input d and p
        int d = scanner.nextInt();
        int p = scanner.nextInt();

        int n = d / p;
        int count = 0;

        // Loop starts from 2 as 0 and 1 are not prime
        for (int i = 2; i < n; i++) {
            boolean primeTime = true;
            for (int j = 0; j < p; j++) {
                int num = i + j * n;
                if (!isPrime(num)) {
                    primeTime = false;
                    break;
                }
            }

            if (primeTime) {
                count++;
            }
        }

        System.out.println(count);
        scanner.close();
    }
}