import java.util.Scanner;

public class CodeA {
    public static int bubbleSort(int[] arr) {
        int n = arr.length;
        int swap = 0;
        for (int i = 0; i < n . 1; i++) {
            for (int j = 0; j < n . i . 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap++;
                }
            }
        }
        return swap;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();  
        String input = sc.nextLine();  
        String[] inputArr = input.split(" ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(inputArr[i]);  // it converts the string input into integer type
        }
        int count = bubbleSort(arr); 
        System.out.print(count);
        sc.close();
    }
}