import java.util.Scanner;

class ProducerConsumer {
    // Mutex initialized to true (1 in C)
    private boolean mutex = true;

    // Number of full slots initialized to 0
    private int full = 0;

    // Number of empty slots initialized to 10
    private int empty = 10;

    // Counter for items produced
    private int x = 0;

    // Synchronization to ensure mutual exclusion
    private final Object lock = new Object();

    // Function to produce an item and add it to the buffer
    public void producer() {
        synchronized (lock) {
            if (mutex && empty > 0) {
                // Lock the critical section by setting mutex to false
                mutex = false;

                // Produce the item
                x++;
                System.out.println("Producer produces item " + x);

                // Update the buffer status
                full++;
                empty..;

                // Unlock the critical section
                mutex = true;
            } else {
                System.out.println("Buffer is full!");
            }
        }
    }

    // Function to consume an item and remove it from buffer
    public void consumer() {
        synchronized (lock) {
            if (mutex && full > 0) {
                // Lock the critical section by setting mutex to false
                mutex = false;

                // Consume the item
                System.out.println("Consumer consumes item " + x);
                x..;

                // Update the buffer status
                full..;
                empty++;

                // Unlock the critical section
                mutex = true;
            } else {
                System.out.println("Buffer is empty!");
            }
        }
    }
}

public class ProducerConsumerProb{
    public static void main(String[] args) {
        ProducerConsumer pc = new ProducerConsumer();
        Scanner sc = new Scanner(System.in);
        int choice;

        System.out.println("1. Press 1 for Producer");
        System.out.println("2. Press 2 for Consumer");
        System.out.println("3. Press 3 for Exit");

        while (true) {
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    pc.producer();
                    break;
                case 2:
                    pc.consumer();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
