import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Lab8 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        // Read the input and split into an array of integers
                 String[] input = sc.nextLine().split(" ");
                 int[] sightings = new int[input.length];
                    for (int i = 0; i < input.length; i++) 
                    {
                        sightings[i] = Integer.parseInt(input[i]);
                    }

         // Find the most common plant and print the result
            System.out.println(findMostCommonPlant(sightings));
            sc.close();
    }

    public static int findMostCommonPlant(int[] sightings) 
    {
        // Map to store frequency of each plant ID
        Map<Integer, Integer> countMap = new HashMap<>();
        int mostCommonId = sightings[0];
        int maxCount = 0;

        // Count occurrences of each plant ID
        for (int plant : sightings) 
        {
            int count = countMap.getOrDefault(plant, 0) + 1;
            countMap.put(plant, count);

            // Check for new most common plant or smaller ID if frequency is the same
            if (count > maxCount || (count == maxCount && plant < mostCommonId)) 
            {
                mostCommonId = plant;
                maxCount = count;
            }
        }
        return mostCommonId;
    }
}
