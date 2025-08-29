import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];

        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }

        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(nums[i] > nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
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
