import java.util.Arrays;

public class AllPossibleSubArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        System.out.println("All possible subarrays:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int[] subarray = Arrays.copyOfRange(arr, i, j + 1);
                System.out.println(Arrays.toString(subarray));
            }
        }
    }
}
