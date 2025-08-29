import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size  = sc.nextInt();
        int nums[] = new int[size];

        for(int i=0; i<size; i++){
            nums[i] = sc.nextInt();
        }
        for(int i=0; i<size-1; i++){
            int min = i;
            for(int j=i+1; j<size; j++){
                if(nums[j] < nums[min]){
                    min = j;
                }
            }
            if(min != i){
                int temp = nums[i];
                nums[i] = nums[min];
                nums[min] = temp;
            }
        }
         for(int i=0; i<size; i++){
            System.out.print(nums[i] + " ");
         }
    }
}
