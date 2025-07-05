import java.util.*;

public class ZigZag2dArray {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int row = 4;
        int col = 3;

        int matrix[][] = new int[row][col];

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<col; i++){
            if(i % 2 == 0){
                for(int j=0; j<row; i++){
                    System.out.println(matrix[j][i] + ",");
                }
            }else{
                for(int j=row-1; j>0; j--){
                    System.out.println(matrix[j][i] + ",");
                }
            }
        }
        sc.close();
    }
    
}
