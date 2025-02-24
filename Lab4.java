import java.util.*;


public class Lab4 {         //EncryptionSwap

    public static void main(String[] args) {
     Scanner input = new Scanner(System.in); 

     //insert the digits
        
    try{
        int a = input.nextInt();    //thousand place digit
        int b = input.nextInt();    //hundred place digtit
	    int c = input.nextInt();    //ten olace digit
        int d = input.nextInt();    //once place digit

        int number = 1000*a + 100*b + 10*c + d;  //4 digit number
    
        //error messages
        
        if (a<0 || b<0 || c<0 || d<0){
            System.out.println("Negative Value is not allowed");
            return;
        }
        
        else if(a<1) //if thousand place digit is not present
        {
	        System.out.println("Provided inputs is less than 4, enter four positive integers");
            return;
        }
        else if(number>9999) {
	            System.out.println("Provided inputs is more than 4, enter four digit integers");
                return;
            } else{
                        System.out.println("Entery is Correct");
                    }
                    
                    System.out.println("4 Digit Number ="+number);


                    //System.out.println("4 Digit Number ="+number);
                    int result = doSomething(a,b,c,d);        
                    System.out.println("Number after all operations and  Swapping:"+result); //final result
                    
                }
                catch (InputMismatchException e) {
                        System.out.println("Enter only integer value."+e.getMessage());
                    } //exception for string value
                    
        }
    
                 public static int doSomething(int a ,int b, int c , int d) {
                                //add 5 in each digit and modulo(For Remainder) by 10
		                            a= (a+5)%10;
		                            b= (b+5)%10;
		                            c= (c+5)%10;
		                            d= (d+5)%10;

                                    //swapping the digits
                                     //a with c
                                    a=a+c;
                                    c=a-c;
                                    a=a-c;

                                    //b with d
                                    b=b+d;
                                    d=b-d;
                                    b=b-d;

        int number = 1000*a + 100*b + 10*c + d;

        return(number);

    }
}
