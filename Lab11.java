/*You are given three arrays that are sorted in non-decreasing order. Your task is to find and print all the
 elements that are present in all three arrays. If there are no common elements, you should print the message 
 "NO Elements".

Important Note: Ensure that you save your solution before progressing to the next question and before submitting 
your answer.

**Example: **

3 5
1 3 5
3 5 7
should return 3 5 */





import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input size of the arrays
        System.out.print("Enter size of first Array: ");
        int size1 = scanner.nextInt();
        System.out.print("Enter size of Second Array: ");
        int size2 = scanner.nextInt();
        System.out.print("Enter size of Third Array: ");
        int size3 = scanner.nextInt();

        // Input first array
        System.out.println("Enter elements of the first array:");
        int[] arr1 = new int[size1];
        for (int i = 0; i < size1; i++) {
            arr1[i] = scanner.nextInt();
        }

        // Input second array
        System.out.println("Enter elements of the second array:");
        int[] arr2 = new int[size2];
        for (int i = 0; i < size2; i++) {
            arr2[i] = scanner.nextInt();
        }

        // Input third array
        System.out.println("Enter elements of the third array:");
        int[] arr3 = new int[size3];
        for (int i = 0; i < size3; i++) {
            arr3[i] = scanner.nextInt();
        }

        // Find common elements
        List<Integer> commonElements = findCommonElements(arr1, arr2, arr3);

        // Print result
        if (commonElements.isEmpty()) {
            System.out.println("NO Elements");
        } else {
            for (int element : commonElements) {
                System.out.print(element + " ");
            }
        }

        scanner.close();
    }

    // Function to find common elements in three sorted arrays
    public static List<Integer> findCommonElements(int[] arr1, int[] arr2, int[] arr3) {
        List<Integer> common = new ArrayList<>();
        int i = 0, j = 0, k = 0;

        // Traverse all arrays with three pointers
        while (i < arr1.length && j < arr2.length && k < arr3.length) {
            if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
                // Common element found
                common.add(arr1[i]);
                i++;
                j++;
                k++;
            } else if (arr1[i] < arr2[j]) {
                i++; // Increment the pointer of the smallest element
            } else if (arr2[j] < arr3[k]) {
                j++;
            } else {
                k++;
            }
        }
        return common;
    }
}


        