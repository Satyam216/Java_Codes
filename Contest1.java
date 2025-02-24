import java.util.Scanner;

public class Contest1 {

    public static String Duplicate(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j <= i + k && j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return "Yes";
                }
            }
        }
        return "No";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the value of k (distance): ");
        int k = scanner.nextInt();

        String result = Duplicate(arr, k);
        System.out.println(result);

        scanner.close();
    }
}