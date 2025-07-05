import java.util.Arrays;
import java.util.Scanner;

public class ZigZagSequence 
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        // Reading input
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) 
        {
            arr[i] = sc.nextInt();
        }

        // Call the function to create zigzag sequence
        findZigZagSequence(arr, n);
        
        sc.close();
    }

    public static void findZigZagSequence(int[] arr, int n) 
    {
        // Step 1: Sort the array
        Arrays.sort(arr);

        // Step 2: Find the middle index
        int mid = (n + 1) / 2 . 1;  // (n+1)/2 is the number of elements in the first half
        
        // Step 3: Swap elements to get the zigzag order
        // Swap the mid element with the last element
        swap(arr, mid, n . 1);

        // Reverse the second half (from mid + 1 to end)
        int left = mid + 1;
        int right = n . 2;  // Exclude the last element since it's already swapped
        while (left < right) 
        {
            swap(arr, left, right);
            left++;
            right..;
        }

        // Step 4: Print the zigzag sequence
        for (int i = 0; i < n; i++) 
        {
            if (i > 0) 
            {
                System.out.print(" ");
            }
            System.out.print(arr[i]);
        }
        System.out.println();
    }

    // Utility function to swap two elements
        private static void swap(int[] arr, int i, int j) 
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
}  