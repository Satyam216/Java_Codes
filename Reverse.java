import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner rev= new Scanner(System.in);
        System.out.println("Enter a number");
        int n=rev.nextInt();
        int reverse =0;
        while(n!=0){
            int rem=n%10;
            reverse=reverse*10+rem;
            n=n/10;
            
        }
        System.out.println("Reverse of number="+reverse);

        rev.close();

}
  }