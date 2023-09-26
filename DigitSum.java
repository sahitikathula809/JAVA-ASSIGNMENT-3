public class DigitSum {
    public static void main(String[] args) {
        int number = 1234; // Change this number as needed
        int sum = 0;

        // Loop through each digit in the number
        while (number > 0) {
            int digit = number % 10; // Extract the last digit
            sum += digit; // Add the digit to the sum
            number /= 10; // Remove the last digit
        }

        System.out.println("Sum of digits: " + sum);
    }
}
