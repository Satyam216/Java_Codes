package Patterns;

import java.util.Scanner;

public class SquareThroughTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //above part
        for(int i=1; i<=n; i++){
            for(int j=i; j<=n; j++){
                System.out.print("*");
            }
            for(int k=1; k<i; k++){
                System.out.print(" ");
            }
            for(int k=1; k<i; k++){
                System.out.print(" ");
            }
            for(int j=i; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //below part
        for(int i =2; i<=n; i++){
            for(int m=1; m<=i; m++){
                 System.out.print("*");
            }
            for(int j=n-1; j>=i; j--){
                System.out.print(" ");
            }
            for(int j=i; j<=n-1; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
