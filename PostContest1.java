import java.util.Scanner;

public class PostContest1 {

    public static String encrypt(String input, int rotation) {
        StringBuilder encrypted = new StringBuilder();

        for (char ch : input.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                // Encrypt uppercase letters
                char encryptedChar = (char) (((ch - 'A' + rotation) % 26) + 'A');
                encrypted.append(encryptedChar);
            } else if (Character.isLowerCase(ch)) {
                // Encrypt lowercase letters
                char encryptedChar = (char) (((ch - 'a' + rotation) % 26) + 'a');
                encrypted.append(encryptedChar);
            } else {
                // If the character is not a letter, keep it unchanged
                encrypted.append(ch);
            }
        }

        return encrypted.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the string to encrypt: ");
        String input = scanner.nextLine(); // Read input string

        int rotation = 4; // Set rotation value for Caesar cipher
        String encryptedOutput = encrypt(input, rotation);
        
        System.out.println("Encrypted output: " + encryptedOutput);
        
        scanner.close();
    }
}
