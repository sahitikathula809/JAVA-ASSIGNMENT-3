public class IsPrime {
    public static void main(String[] args) {
        System.out.println("Prime numbers between 10 and 99:");
        
        for (int number = 10; number <= 99; number++) {
            if (isPrime(number)) {
                System.out.print(number + " ");
            }
        }
    }

    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num <= 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}
