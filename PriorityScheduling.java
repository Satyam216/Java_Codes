import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

class Process {
    int pid;       // Process ID
    int burstTime; // Burst time of the process
    int priority;  // Priority of the process
    int waitingTime; // Waiting time of the process
    int turnAroundTime; // Turnaround time of the process

    public Process(int pid, int burstTime, int priority) {
        this.pid = pid;
        this.burstTime = burstTime;
        this.priority = priority;
    }
}

public class PriorityScheduling {

    // Function to calculate waiting time for each process
    public static void calculateWaitingTime(Process[] processes) {
        processes[0].waitingTime = 0; // First process has no waiting time

        for (int i = 1; i < processes.length; i++) {
            processes[i].waitingTime = processes[i - 1].waitingTime + processes[i - 1].burstTime;
        }
    }

    // Function to calculate turnaround time for each process
    public static void calculateTurnAroundTime(Process[] processes) {
        for (int i = 0; i < processes.length; i++) {
            processes[i].turnAroundTime = processes[i].waitingTime + processes[i].burstTime;
        }
    }

    // Function to calculate average waiting and turnaround time
    public static void calculateAvgTimes(Process[] processes) {
        int totalWaitingTime = 0, totalTurnAroundTime = 0;

        for (Process process : processes) {
            totalWaitingTime += process.waitingTime;
            totalTurnAroundTime += process.turnAroundTime;
        }

        System.out.println("Average Waiting Time: " + (float) totalWaitingTime / processes.length);
        System.out.println("Average Turnaround Time: " + (float) totalTurnAroundTime / processes.length);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the number of processes
        System.out.println("Enter the number of processes: ");
        int n = sc.nextInt();
        Process[] processes = new Process[n];

        // Input burst time and priority for each process
        for (int i = 0; i < n; i++) {
            System.out.println("Enter burst time and priority for process " + (i + 1) + ": ");
            int burstTime = sc.nextInt();
            int priority = sc.nextInt();
            processes[i] = new Process(i + 1, burstTime, priority);
        }

        // Sort processes based on priority (higher priority = lower priority number)
        Arrays.sort(processes, Comparator.comparingInt(p -> p.priority));

        // Calculate waiting time and turnaround time
        calculateWaitingTime(processes);
        calculateTurnAroundTime(processes);

        // Print process details
        System.out.println("\nProcess ID\tBurst Time\tPriority\tWaiting Time\tTurnaround Time");
        for (Process process : processes) {
            System.out.println(process.pid + "\t\t" + process.burstTime + "\t\t" + process.priority + "\t\t" + process.waitingTime + "\t\t" + process.turnAroundTime);
        }

        // Calculate and print average waiting time and turnaround time
        calculateAvgTimes(processes);
    }
}