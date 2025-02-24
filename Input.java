import java.util.Scanner;

public class Input {
    public static void main (String args[])
    {
        Scanner obj = new Scanner (System.in);

        System.out.println("Enter your name ");
        
        String name = obj.nextLine();
        
        System.out.println("My name is "+name);
    }
}