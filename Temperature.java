import java.util.Scanner;

public class Temperature {

    public static void main(String[] args) {
        Scanner temp = new Scanner(System.in);
        System.out.println("Temperature Convert");
        System.out.println("Choose:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Enter 1 or 2: ");
        
        int choice = temp.nextInt();
        
        if (choice == 1) {
            System.out.print("Enter temperature in Celsius: ");
            double celsius = temp.nextDouble();
            double fahrenheit = (celsius * 9 / 5) + 32;
            System.out.println(celsius+"C is equal to "+fahrenheit +"F");
        } else if (choice == 2) {
            System.out.print("Enter temperature in Fahrenheit: ");
            double fahrenheit = temp.nextDouble();
            double celsius = (fahrenheit - 32) / 1.8;
            System.out.println(fahrenheit+"F is equal to "+celsius +"C");
        } else {
            System.out.println("Invalid choice");
        }
        temp.close();
}
}