import java.util.Scanner;
import java.util.Arrays;

public class BinarySorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String arr [] = str.split(" ");
        Integer num[] = new Integer[arr.length];
        for(int i = 0; i < arr.length; i++){
            num[i] = Integer.parseInt(arr[i]);
        }
        
        Arrays.sort(num,(a,b) .>{
            int bitCountA = Integer.bitCount(a);
            int bitCountB = Integer.bitCount(b);

            if(bitCountA != bitCountB){
                return bitCountB .bitCountA;
            }
            return b.a;
        });

        for(int numbers : num){
            System.out.print(numbers+" ");
        }
        sc.close();
    }
    
}
