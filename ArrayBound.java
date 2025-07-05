
/*Task 2: Handling Array Index Out of Bounds Exception
Statement: Create a program that attempts to access an element in an array beyond its valid
index range. Use a try.catch block to catch the ArrayIndexOutOfBoundsException and
display an appropriate error message. Ensure that the program continues execution smoothly
even after encountering this error.*/

import java.lang.reflect.Array;
import java.util.Scanner;

public class ArrayBound {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
            //for Handling Array Index Out of Bounds Exception
    
            try {
                System.out.println("Enter the size of an array");
                int size = scanner.nextInt();
                int array[] = new int[size];
                
                for(int i=0;i<size;i++){
                    array[i]=scanner.nextInt();
                }
//enter the finding the index
                System.out.println("Enetr the finding index");
                int X= scanner.nextInt();
     //handling the exception if finding index greater than size of an array           
                for(int i=0;i<size;i++){
            System.out.println("Find the Element "+array[X]);
           }
            } catch ( ArrayIndexOutOfBoundsException e) {
                
                // Catching and handling array bound exception
            System.out.println("Error: An array Index Out Of Boundation.");
                }
                catch (Exception e) {
                    // Catching any other unexpected exceptions
                    System.out.println("An unexpected error occurred: " + e.getMessage());
                }
            
        
            scanner.close();

        System.out.println("Rest of the code...");
    }
}

