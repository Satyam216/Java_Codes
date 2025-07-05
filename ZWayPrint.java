import java.util.Scanner;

public class ZWayPrint {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int col=sc.nextInt();
        int sum =0;

        int matrix[][] = new int[row][col];

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<row; i++){  
            sum += matrix[0][i];
            sum += matrix[row-1][i];
        }

        for(int i=1; i<row-1; i++){
            sum += matrix[i][row-1-i];
        }

        System.out.println(sum);
        sc.close();
    }
    
}
