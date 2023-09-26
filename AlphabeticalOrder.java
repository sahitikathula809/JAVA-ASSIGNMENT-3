public class AlphabeticalOrder {
    public static void main(String[] args) {
        char firstChar = 's';
        char secondChar = 'e';
        if (firstChar > secondChar) {
            char temp = firstChar;
            firstChar = secondChar;
            secondChar = temp;
        }

        System.out.println(firstChar + "," + secondChar);
    }
}
