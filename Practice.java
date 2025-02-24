import java.io.File;
import java.io.IOException;

public class Practice{
    public static void main(String args[]){

        File obj = new File("E://Practice.text");
    try{
        if (obj.createNewFile()){
            System.out.println(obj.getName());
            System.out.println("File has been created successfully");

        } 
        else {
            System.out.println("File is already exist");
        }
    }
        catch(IOException e){
            System.out.println("Some Error occured"+ e);
            e.getStackTrace();
        }

    }
}