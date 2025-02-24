import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CoffeeOrderQueue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Character> coffeeQueue = new LinkedList<>();
        final int MAX_SIZE = 5;
        boolean exitProgram = false;

        while (!exitProgram) {
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    if (coffeeQueue.size() == MAX_SIZE) {
                        System.out.println("Queue is full. Cannot enqueue more orders.");
                    } else {
                        char order = scanner.next().charAt(0);
                        coffeeQueue.add(order);
                        System.out.println("Order for " + order + " is enqueued.");
                    }
                    break;

                case 2:
                    if (coffeeQueue.isEmpty()) {
                        System.out.println("No orders in the queue.");
                    } else {
                        char dequeuedOrder = coffeeQueue.remove();
                        System.out.println("Dequeued Order: " + dequeuedOrder);
                    }
                    break;

                case 3:
                    if (coffeeQueue.isEmpty()) {
                        System.out.println("Queue is empty. No orders available.");
                    } else {
                        System.out.print("Orders in the queue are: ");
                        for (char order : coffeeQueue) {
                            System.out.print(order + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 4:
                    System.out.println("Exiting program");
                    exitProgram = true; // Terminate the loop
                    break;

                default:
                    System.out.println("Invalid option.");
            }
        }
        scanner.close();
    }
}
