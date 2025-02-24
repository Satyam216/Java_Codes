import java.util.*;
 
public class SwitchStatement{

    public static void main (String args[]){

        Scanner sc = new Scanner(System.in);
         int button = sc.nextInt();
         boolean exit;
          
         while (!exit){

         switch (button)
         {

            case 1 : System.out.println("Press 1 for Coustomer");
            break;

            case 2 : System.out.println("Press 2 for dealer");
            break;

            case 3 : System.out.println("Press 3 for Services");
            break;

            case 4 : System.out.println("Press 4 for buy new item");
            break;

            case 5 : System.out.println("Press 5 for give the review");
            break;

            case 6 : System.out.println("Press 6 fro any other querry");
            break;
            
            case : exit=true;
            break;


         }

    }

 }
}