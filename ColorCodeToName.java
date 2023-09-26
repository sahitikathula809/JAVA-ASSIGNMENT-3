import java.util.Scanner;

public class ColorCodeToName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a color code (R, B, G, O, Y, or W): ");
        char colorCode = scanner.next().charAt(0);
        scanner.close();

        String colorName;

        switch (colorCode) {
            case 'R':
                colorName = "Red";
                break;
            case 'B':
                colorName = "Blue";
                break;
            case 'G':
                colorName = "Green";
                break;
            case 'O':
                colorName = "Orange";
                break;
            case 'Y':
                colorName = "Yellow";
                break;
            case 'W':
                colorName = "White";
                break;
            default:
                colorName = "Invalid Code";
                break;
        }

        System.out.println("Color name: " + colorName);
    }
}
