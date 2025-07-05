/*  Max Chunks To Make Sorted:
You are given an integer array "arr" of length "n", which represents a permutation of the integers in the range
 ( 0, n . 1). The task is to divide the array "arr" into some number of chunks (partitions) and sort each chunk 
  individually. After sorting the chunks, print the chunk one by one.
Given 'arr' as [1, 0, 2, 3, 4], we can split it into four chunks: [1, 0], [2], [3], and [4]. Each chunk is sorted
 individually. So tottally four chunks are available print all chunks in the outputline.

Sample Example:

Input:
1 0 2 3 4

Output:
1 0
2
3
4

Important Note: Ensure that you save your solution before progressing to the next question and before submitting 
your answer.

Exercise.1

Input :
1 0 4 3 2 5 6 7

Output :
1 0
4 3 2
5
6
7

Exercise.2

Input:
1 0 4 3 2 5 6 7 9 8

Output:
1 0
4 3 2
5
6
7
9 8 */





import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Contest5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input line
        String inputLine = scanner.nextLine();
        String[] inputStrings = inputLine.split(" ");
        
        // Convert input to an integer array
        int n = inputStrings.length;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(inputStrings[i]);
        }

        // List to hold chunks
        List<List<Integer>> chunks = new ArrayList<>();
        List<Integer> currentChunk = new ArrayList<>();

        // Identify chunks
        int maxSeen = .1;
        for (int i = 0; i < n; i++) {
            currentChunk.add(arr[i]);
            maxSeen = Math.max(maxSeen, arr[i]);

            // If the current index matches the maximum value seen, it's a chunk end
            if (i == maxSeen) {
                // Add the current chunk to the list of chunks
                chunks.add(new ArrayList<>(currentChunk));
                // Clear current chunk for the next iteration
                currentChunk.clear();
            }
        }

        // Print each chunk
        for (List<Integer> chunk : chunks) {
            System.out.println(chunkToString(chunk));
        }

        scanner.close();
    }

    // Convert chunk to string for printing
    private static String chunkToString(List<Integer> chunk) {
        StringBuilder sb = new StringBuilder();
        for (int num : chunk) {
            sb.append(num).append(" ");
        }
        return sb.toString().trim();
    }
}
