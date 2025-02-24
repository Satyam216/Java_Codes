import java.util.Scanner;

public class Lab2 {         //TestingNumberOfDevices

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Read available time and number of devices
        int availableTime = input.nextInt();
        int totalDevices = input.nextInt();
        
        // Close the scanner
        input.close();
        
        // Calculate the result using the doSomething method
        int[] result = doSomething(availableTime, totalDevices);
        
        // If the result is null, it means invalid input
        if (result == null) {
            System.out.println("Invalid Input");
        } else {
            // Print the number of devices tested and the remaining devices
            System.out.println(result[0]);  // Devices tested
            System.out.println(result[1]);  // Remaining devices
        }
    }

    public static int[] doSomething(int availableTime, int totalDevices) {
        // Check if available time is less than 4
        if (availableTime < 4) {
            return null;  // Invalid input
        }

        // Calculate the number of devices that can be tested
        int devicesTested = availableTime / 4;

        // Calculate remaining devices
        int remainingDevices = totalDevices - devicesTested;

        // Return both values as an array
        return new int[]{devicesTested, remainingDevices};
    }
}



//one more method

/*import java.util.*;

public class Lab2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // inputs
        int availableHours = input.nextInt();
        int devicesToBeTested = input.nextInt();
        
        // Check if available hours are less than 4
        if (availableHours < 4) {
            System.out.println("Invalid Input");
        } else {
            // Call the method to calculate tested devices
            int testedDevices = doSomething(availableHours, devicesToBeTested);
            // Calculate remaining devices
            int remainingDevices = devicesToBeTested - testedDevices;
            
            // Output the results
            System.out.println(testedDevices);
            System.out.println(remainingDevices);
        }
     
        input.close();
    }
    
    // Method to calculate the number of devices that can be tested
    public static int doSomething(int availableHours, int devicesToBeTested) {
      
        int devicesTested = availableHours / 4;
        
        if (devicesTested > devicesToBeTested) {
            devicesTested = devicesToBeTested;
        }
        
        return devicesTested;
    }
} */