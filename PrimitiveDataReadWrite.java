import java.io.*;

public class PrimitiveDataReadWrite {
    public static void main(String[] args) {
        
        String filePath = "TestingFile.txt";

        // Write primitive data to the file
        writePrimitiveData(filePath);

        // Read primitive data from the file
        readPrimitiveData(filePath);
    }

    // Method to write primitive data types to a file using DataOutputStream
    public static void writePrimitiveData(String filePath) {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(filePath))) {
            // Writing primitive data types to the file
            dos.writeInt(42);            // Write an integer
            dos.writeFloat(3.14f);       // Write a float
            dos.writeDouble(2.718);      // Write a double
            dos.writeBoolean(true);      // Write a boolean
            dos.writeChar('A');          // Write a char
            dos.writeLong(123456789L);   // Write a long

            System.out.println("Primitive data written to " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to read primitive data types from a file using DataInputStream
    public static void readPrimitiveData(String filePath) {
        try (DataInputStream dis = new DataInputStream(new FileInputStream(filePath))) {
            // Reading primitive data types from the file
            int intValue = dis.readInt();
            float floatValue = dis.readFloat();
            double doubleValue = dis.readDouble();
            boolean booleanValue = dis.readBoolean();
            char charValue = dis.readChar();
            long longValue = dis.readLong();

            // Displaying the values read from the file
            System.out.println("Data read from " + filePath + ":");
            System.out.println("Integer: " + intValue);
            System.out.println("Float: " + floatValue);
            System.out.println("Double: " + doubleValue);
            System.out.println("Boolean: " + booleanValue);
            System.out.println("Char: " + charValue);
            System.out.println("Long: " + longValue);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
