import java.util.*;

class Duplicate{
    public void duplicate(int [] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    System.out.print( "Duplicate Elements : " + arr[i]);

                }   
            }
        }
    }
}
public class RepeatativeElement {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i =0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        Duplicate ob = new Duplicate();
         ob.duplicate(arr);
    
    }
}
