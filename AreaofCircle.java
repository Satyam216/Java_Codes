import java.util.Scanner;
public class AreaofCircle {
    public static void main(String[] args) {
        Scanner circle= new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        int r=circle.nextInt();
        float area;
        float pie=3.14f;
        area=pie*(r*r);
        System.out.println("Area of Circle is : "+area);
        circle.close();
    }
}