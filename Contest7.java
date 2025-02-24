import java.util.*;

public class Contest7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input: difficulties and time limits
        int[] difficulties = Arrays.stream(scanner.nextLine().split(" "))
                                   .mapToInt(Integer::parseInt).toArray();
        int[] timeLimits = Arrays.stream(scanner.nextLine().split(" "))
                                 .mapToInt(Integer::parseInt).toArray();
        int[] queries = Arrays.stream(scanner.nextLine().split(" "))
                              .mapToInt(Integer::parseInt).toArray();

        int N = difficulties.length;  // Number of problems

        // Validate input constraints
        if (N < 1 || N > 10 || !isValid(difficulties) || !isValid(timeLimits)) {
            System.out.println("Invalid");
            return;
        }

        // Create a list of problems with their difficulty and time limit
        List<Problem> problems = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            problems.add(new Problem(difficulties[i], timeLimits[i]));
        }

        // Sort problems by their time limits in descending order
        problems.sort((p1, p2) -> Integer.compare(p2.timeLimit, p1.timeLimit));

        // Process each query
        for (int k : queries) {
            if (k < 1 || k > N) {
                System.out.println("Invalid");
                return;
            }
            // Sum the difficulties of the top 'k' problems with highest time limits
            int totalDifficulty = 0;
            for (int i = 0; i < k; i++) {
                totalDifficulty += problems.get(i).difficulty;
            }
            System.out.println(totalDifficulty);
        }

        scanner.close();
    }

    // Helper method to validate the input values
    private static boolean isValid(int[] array) {
        for (int value : array) {
            if (value < 1 || value > 50) return false;
        }
        return true;
    }

    // Class to represent a problem with difficulty and time limit
    static class Problem {
        int difficulty;
        int timeLimit;

        Problem(int difficulty, int timeLimit) {
            this.difficulty = difficulty;
            this.timeLimit = timeLimit;
        }
    }
}
