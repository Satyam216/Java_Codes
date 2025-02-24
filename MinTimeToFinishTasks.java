import java.util.Scanner;

public class MinTimeToFinishTasks {

    // Function to check if the current maxTime is feasible with K workers
    public static boolean canCompleteInTime(int[] tasks, int n, int k, int maxTime) {
        int workerCount = 1;  // Start with one worker
        int currentTime = 0;  // Current workload for this worker

        for (int i = 0; i < n; i++) {
            // If adding this task exceeds maxTime, assign it to the next worker
            if (currentTime + tasks[i] > maxTime) {
                workerCount++;
                currentTime = tasks[i];  // Assign current task to the next worker
                // If we need more workers than available, it's not feasible
                if (workerCount > k) {
                    return false;
                }
            } else {
                currentTime += tasks[i];  // Assign this task to the current worker
            }
        }

        return true;  // If within the limit, return true
    }

    // Function to find the minimum time to complete all tasks
    public static int findMinTime(int[] tasks, int n, int k) {
        int maxTaskTime = 0;  // Maximum single task time
        int sumTaskTime = 0;  // Sum of all task times

        // Calculate the max task time and the sum of all task times
        for (int task : tasks) {
            maxTaskTime = Math.max(maxTaskTime, task);
            sumTaskTime += task;
        }

        // Binary search between maxTaskTime and sumTaskTime
        int left = maxTaskTime;
        int right = sumTaskTime;
        int result = right;  // Initialize result to upper bound (sum of all tasks)

        while (left <= right) {
            int mid = left + (right - left) / 2;  // Midpoint of binary search

            // If it's possible to complete tasks in `mid` time, search for a smaller time
            if (canCompleteInTime(tasks, n, k, mid)) {
                result = mid;  // Update result with the current mid
                right = mid - 1;  // Try to find a smaller feasible time
            } else {
                left = mid + 1;  // Increase the time limit
            }
        }

        return result;  // The minimum time to finish all tasks
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Reading input
        int n = input.nextInt();  // Number of tasks
        int[] tasks = new int[n];

        // Read task durations
        for (int i = 0; i < n; i++) {
            tasks[i] = input.nextInt();
        }

        int k = input.nextInt();  // Number of workers

        // Find and print the minimum time to finish all tasks
        System.out.println(findMinTime(tasks, n, k));
    }
}
