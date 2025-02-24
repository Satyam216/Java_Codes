import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {

        Scanner Coff = new Scanner(System.in);
        
        System.out.println("Insert the First Cofficient=");
        double a= Coff.nextDouble();
        System.out.println("Insert the Second Cofficient=");
        double b= Coff.nextDouble();
        System.out.println("Insert the Third Cofficient=");
        double c= Coff.nextDouble();
        
        
        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            // Two distinct real roots
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("The roots are real and different: " + root1 + ", " + root2);
        } else if (discriminant == 0) {
            // One real root
            double root = -b / (2 * a);
            System.out.println("The root is real and the same: " + root);
        } else {
            // Two complex roots
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.println("The roots are complex and different: " + realPart + " + " + imaginaryPart + "i, " + realPart + " - " + imaginaryPart + "i");
            Coff.close();
        }
    }
}
