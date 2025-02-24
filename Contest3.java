import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Contest3 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        // Reading input array
        String[] input = sc.nextLine().split(" ");
        int n = input.length;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        
        // Call the method to chunk the array and print the chunks
        List<List<Integer>> chunks = getChunks(arr);
        
        // Print each chunk
        for (List<Integer> chunk : chunks) 
        {
            for (int num : chunk) 
            {
                System.out.print(num + " ");
            }
            System.out.println(); // New line after each chunk
        }
        
        sc.close();
    }

    public static List<List<Integer>> getChunks(int[] arr) 
    {
        List<List<Integer>> chunks = new ArrayList<>();
        int maxInChunk = 0;
        List<Integer> currentChunk = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) 
        {
            maxInChunk = Math.max(maxInChunk, arr[i]);
            currentChunk.add(arr[i]);

            // If the maximum value in the current chunk matches the index, we can split
            if (maxInChunk == i) 
            {
                // Add the current chunk to the list of chunks
                chunks.add(new ArrayList<>(currentChunk));
                // Reset current chunk for the next possible partition
                currentChunk.clear();
            }
        }
        return chunks;
    }
}
