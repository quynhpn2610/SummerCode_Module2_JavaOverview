import java.util.Scanner;
public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = Integer.parseInt(sc.nextLine());
        isPrime(number);
    }
    // Check if a number is prime
    public static boolean isPrime(int number) {
        if (number == 2) {
            System.out.println(number + " is a prime.");
            return true;
        }
        else if (number < 2) {
            System.out.println(number + " is not a prime.");
            return false;
        }
        else { //number > 2
            for (int i = 2; i < Math.sqrt(number); i++) {
                if (number % i == 0) {
                    System.out.println(number + " is not a prime.");
                    return false;
                }
            }
            return true;
        }
    }
    // Add a new value to an array
}

