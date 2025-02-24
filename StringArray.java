import java.util.Scanner;

public class StringArray{

public static void main(String[] args) {
    
Scanner sc = new Scanner(System.in);
int rows = sc.nextInt();
int cols = sc.nextInt();

int[][] nums = new int[rows][cols];

for (int i = 0; i < rows; i++) {
    String[] input = sc.nextLine().split(" ");
    for (int j = 0; j < cols; j++) {
        nums[i][j] = Integer.parseInt(input[j]);
    }
}

for (int i = 0; i < rows; i++){
    for(int j =0; j < cols ; j++){
        System.out.print(nums[i][j] + " ");
    }
    System.out.println();
}
sc.close();
}
}