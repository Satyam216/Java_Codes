import java.util.*;

public class Hashmap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array elements separated by space:");
        String series = sc.nextLine();
        String[] number = series.split(" ");
        int size = number.length;
        int[] nums = new int[size];
        
        for (int i = 0; i < size; i++) {
            nums[i] = Integer.parseInt(number[i]);
        }
        
        System.out.println("Enter the target:");
        int target = sc.nextInt();

        // Using HashMap for efficient lookup
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                System.out.println("Target matched at [" + map.get(complement) + ", " + i + "]");
                sc.close();
                return;
            }
            map.put(nums[i], i);
        }
        
        System.out.println("No two numbers add up to the target.");
        sc.close();
    }
}
