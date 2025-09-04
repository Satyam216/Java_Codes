import java.util.Scanner;

public class QuickSort {

    //lb = lower bound = 0 // up = upper bound = n-1;
    public static int partition(int arr[], int lb, int up){
        int pivot = arr[lb];
        int start = lb;
        int end = up;
        while(start < end){
            while(start <= up && arr[start] <= pivot){
                start++;
            }
            while(end >=lb && arr[end] > pivot){
                end--;
            }

            if(start<end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }
        }
        //swap the pivot element agr end start se chota ho jaye
        int temp = arr[lb];
        arr[lb] = arr[end];
        arr[end] = temp;

        return end;
    }

    public static void quickSort(int arr[], int lb, int up){
        if(lb < up){
            int loc = partition(arr, lb, up);
            quickSort(arr, lb, loc-1);  //up = loc -1 ,(loc = end)
            quickSort(arr, loc+1, up);  //lb = loc+1
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
         quickSort(arr, 0, n-1);

         for(int res : arr){
            System.out.print(res + " ");
         }


    }
}
