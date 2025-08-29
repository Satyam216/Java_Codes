import java.util.Scanner;

public class BubbleSort {
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];

        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }

        for(int i=0; i<n-1; i++){
            int flag = 0;
            for(int j=0; j<n-i-1; j++){
                if(nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    flag = 1;
                }
            }
            if(flag == 0){
                break;
            }
        }
        for(int i=0; i<n; i++){
            System.out.print(nums[i]);
            if(i < n-1){
                System.out.print(" ");
            }
        }
    }
    
}
