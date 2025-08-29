package Patterns;
import java.util.Scanner;

public class SolidRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of row: ");
        int row = sc.nextInt();
        System.out.println("Enter the value of col: ");
        int col = sc.nextInt();

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
