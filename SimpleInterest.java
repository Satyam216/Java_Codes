
    import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
    Scanner simp = new Scanner(System.in);
    System.out.println("Enter the principal amount");
    int p=simp.nextInt();
    System.out.println("Enter the amount of time");
    int t=simp.nextInt();
    System.out.println("Enter the Rate of interest");
    int roi=simp.nextInt();
    int interest;
    interest=(p*roi*t)/100;
    System.out.println("Simple Interest is : "+interest);
    simp.close();
}
}
    

