import java.io.*;

public class Assignment5Task1 {
    public static void main(String[] args) {
        File inputfile = new File("E://Contest 1.txt");
        File outputfile = new File("E://Output.txt");

        try (BufferedReader br = new BufferedReader(new FileReader(inputfile));

                BufferedWriter bw = new BufferedWriter(new FileWriter(outputfile))) {

            String Line;
            while ((Line = br.readLine()) != null) {

                bw.write(Line);
                bw.newLine();

            }
            System.out.println("File content written to output.txt");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
