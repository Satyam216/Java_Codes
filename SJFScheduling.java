import java.util.*;

class Process {
    int pid; // Process ID
    int arrivalTime; // Arrival time of the process
    int burstTime; // Burst time of the process
    int completionTime; // Completion time of the process
    int turnaroundTime; // Turnaround time of the process
    int waitingTime; // Waiting time of the process

    public Process(int pid, int arrivalTime, int burstTime) {
        this.pid = pid;
        this.arrivalTime = arrivalTime;
        this.burstTime = burstTime;
        this.completionTime = 0;
        this.turnaroundTime = 0;
        this.waitingTime = 0;
    }
}

public class SJFScheduling {
    
    public static void sjfScheduling(List<Process> processes) {
        int currentTime = 0;
        int completed = 0;
        int n = processes.size();

        // Sort processes by arrival time, then burst time
        processes.sort(Comparator.comparingInt((Process p) -> p.arrivalTime)
                                 .thenComparingInt(p -> p.burstTime));

        while (completed < n) {
            // Get the ready processes
            List<Process> readyQueue = new ArrayList<>();
            for (Process p : processes) {
                if (p.arrivalTime <= currentTime && p.completionTime == 0) {
                    readyQueue.add(p);
                }
            }

            if (!readyQueue.isEmpty()) {
                // Select process with the shortest burst time
                readyQueue.sort(Comparator.comparingInt(p -> p.burstTime));
                Process currentProcess = readyQueue.get(0);

                currentTime += currentProcess.burstTime;
                currentProcess.completionTime = currentTime;
                currentProcess.turnaroundTime = currentProcess.completionTime - currentProcess.arrivalTime;
                currentProcess.waitingTime = currentProcess.turnaroundTime - currentProcess.burstTime;

                completed++;
            } else {
                currentTime++; // Increment time if no process is ready
            }
        }

        // Display results
        System.out.println("PID\tArrival\tBurst\tCompletion\tTurnaround\tWaiting");
        for (Process p : processes) {
            System.out.println(p.pid + "\t" + p.arrivalTime + "\t" + p.burstTime + "\t" +
                               p.completionTime + "\t\t" + p.turnaroundTime + "\t\t" + p.waitingTime);
        }
    }

    public static void main(String[] args) {
        List<Process> processes = new ArrayList<>();
        processes.add(new Process(1, 0, 6));
        processes.add(new Process(2, 1, 8));
        processes.add(new Process(3, 2, 7));
        processes.add(new Process(4, 3, 3));

        sjfScheduling(processes);
    }
}
