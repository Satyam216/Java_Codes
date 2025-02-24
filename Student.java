import java.util.Scanner;

public class Student{

    private int roll;
    private char grade;
    private float per;

    public void setData(){
        Scanner kb = new Scanner (System.in);
        System.out.println("Enter roll,grade,and percentage");
        roll = kb.nextInt();
        grade= kb.next().charAt(0);
        per= kb.nextFloat();
    }

    public void displayData(){
        System.out.println("Roll:"+roll);
        System.out.println("Grade:"+grade);
        System.out.println("Percentage:"+per);

    }
public static void main(String args[]){

Student s1=new Student();

s1.setData();
s1.displayData();

}
}