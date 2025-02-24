import java.util.Scanner;

public class LAB{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str[] = sc.nextLine().split(" ");
        int [] array = new int[str.length];
        for (int i = 0; i<str.length ; i++){
            array[i] = Integer.parseInt(str[i]);
        }  
        for (int i = 0; i<str.length ; i++){
            System.out.print(array[i]+" ");  
    }
}
}
