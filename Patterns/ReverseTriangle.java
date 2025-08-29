package Patterns;
import java.util.Scanner;

public class ReverseTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of row: ");
        int row = sc.nextInt();
        // System.out.println("Enter the value of col: ");
        // int col = sc.nextInt();

        // for(int i=row; i>0; i--){
        //     for(int j=0; j<i; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        for(int i=1; i<=row; i++){
            for(int k=1; k<i; k++){
                System.out.print(" ");
            }
            for(int j=i;j<=row; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
