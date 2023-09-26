import java.util.Scanner;

public class CaseConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        
        char userInput = scanner.next().charAt(0);
        scanner.close();

        char convertedChar;

        if (Character.isUpperCase(userInput)) {
            convertedChar = Character.toLowerCase(userInput);
        } else if (Character.isLowerCase(userInput)) {
            convertedChar = Character.toUpperCase(userInput);
        } else {
            convertedChar = userInput;
        }

        System.out.println("Original character: " + userInput);
        System.out.println("Converted character: " + convertedChar);
    }
}
