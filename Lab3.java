import java.util.Scanner;


public class Lab3 {         //FindingSubArray

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //size of the array
        System.err.println("Enter the Size of an array:");
        int size = input.nextInt();

 //checking if the size is not between 1 to 10
        if(size<1 || size>10)
        {
            System.out.println("Array size must be between 1 and 10");
        }
    
   //make an array
        int arrayList[] = new int[size];
        
        //insert the elements of an arrays
        for (int i=0;i<size;i++){
            arrayList[i]= input.nextInt();
        }
//checking the elements of array lie between -10 to 10
        for (int i=0;i<size;i++){
           if(arrayList[i]<-10 || arrayList[i]>10)
           {
            System.out.println("Array elements must be from -10 to 10");
            return;
           }
    
           else if(arrayList[i]==0)
            {
             System.out.println("“Array elements must be integers");
             return;
            }
           /*  else {
                System.out.println("Requirements are not full filled");
            }
            break; */
        }

    int[] cumulativeSum  = doSomething(arrayList);   

    //check the subarray is present or not
    if (cumulativeSum[0]==0){
        System.err.println("True"); //subarray is founded
    } else{
        System.err.println("False"); //subarray is not founded
    }
        System.out.println(arrayList.length);
        //System.out.println("sum="+cumulativeSum[0]);

    }
    
    public static int[] doSomething(int[]arrayList) {
        int sum = 0;
        int total= arrayList.length;

        for (int i=0;i<total;i++){ 
          sum=sum+arrayList[i];
     
        }
           return new int[] {sum};
    }
}