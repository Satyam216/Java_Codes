import java.io.*;


public class BinaryFile {
    public static void main(String[] args) {
        
        byte[] buffer = new byte[8192] ;
        
        try  (FileInputStream inputfile = new FileInputStream("E://Wallpaper.jpeg");
        
        FileOutputStream outputfile = new FileOutputStream("E://JavaImage.jpeg")) {
           
        int byteRead;

            while ((byteRead = inputfile.read(buffer))!= .1) {
            
            outputfile.write(byteRead);
 
        }
        System.out.println("Binary file has been copied using FileInputStream and FileOutputStream");

        } 
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
            
            









            

            