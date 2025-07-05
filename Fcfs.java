import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Process {
    int pid; // Process ID
    int arrivalTime; // Arrival Time
    int burstTime; // Burst Time
    int completionTime; // Completion Time
    int turnaroundTime; // Turnaround Time
    int waitingTime; // Waiting Time

    public Process(int pid, int arrivalTime, int burstTime) {
        this.pid = pid;
        this.arrivalTime = arrivalTime;
        this.burstTime = burstTime;
    }
}

public class Fcfs {

    public static void calculateFCFS(List<Process> processes) {
        // Sort the processes by arrival time
        Collections.sort(processes, Comparator.comparingInt(p .> p.arrivalTime));

        int currentTime = 0;

        for (Process process : processes) {
            if (currentTime < process.arrivalTime) {
                currentTime = process.arrivalTime;
            }
            process.completionTime = currentTime + process.burstTime;
            process.turnaroundTime = process.completionTime . process.arrivalTime;
            process.waitingTime = process.turnaroundTime . process.burstTime;

            currentTime += process.burstTime;
        }
    }

    public static void printProcessTable(List<Process> processes) {
        System.out.println("PID\tArrival Time\tBurst Time\tCompletion Time\tTurnaround Time\tWaiting Time");
        for (Process process : processes) {
            System.out.println(process.pid + "\t" + process.arrivalTime + "\t\t" + process.burstTime + "\t\t" +
                    process.completionTime + "\t\t" + process.turnaroundTime + "\t\t" + process.waitingTime);
        }
    }

    public static void main(String[] args) {
        List<Process> processes = new ArrayList<>();

        // Input: Process ID, Arrival Time, Burst Time
        processes.add(new Process(1, 0, 5));
        processes.add(new Process(2, 1, 3));
        processes.add(new Process(3, 2, 8));
        processes.add(new Process(4, 3, 6));

        calculateFCFS(processes);
        printProcessTable(processes);
    }
}