package Patterns;

import java.util.Scanner;

public class RightAngleTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of row: ");
        int row = sc.nextInt();
        // System.out.println("Enter the value of col: ");
        // int col = sc.nextInt();
         
        //first type

        // for(int i=0; i<row; i++){
        //     for(int j=0; j<=i; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        //second type

        for(int i =1; i<=row; i++){
            for(int m=1; m<=i; m++){
                 System.out.print("*");
            }
            for(int n=row-1; n>=i; n--){
                System.out.print(" ");
            }
            for(int j=i; j<=row-1; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
